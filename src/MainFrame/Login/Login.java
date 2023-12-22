/*
 * Created by JFormDesigner on Fri Dec 15 15:30:27 CST 2023
 */

package MainFrame.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import MainFrame.MainFrame;
import global.global;
import User.User;
/**
 * @author MJZ
 */
public class Login extends JPanel {
    MainFrame Father=null;
    Login THIS;
    private int cnt=0;
    private static  int Error_Counter=0;
    private ActionEvent e;
    ResourceBundle bundle ;
    public Login(MainFrame fa) {
        THIS=this;
        bundle = ResourceBundle.getBundle("lang.Login",global.LOCALE);
        initComponents();

        JL_Failed.setVisible(false);
        JL_Success.setVisible(false);
        Father=fa;
    }
    private boolean Sign_In(String User,String Password){
        LOAD(User,null);
        return true;
//        try {
//            java.sql.Connection cnn = DriverManager.getConnection(global.URL, User, Password);
//            LOAD(User,cnn);
//        }catch (SQLException e){
//            return false;
//        }
//        return true;
    }

    private void LOAD(String id, Connection cnn){

        global.USER=new User(id,cnn);
    }
    private void Modify_Password(ActionEvent e) {
        JT_Password.setText("");
    }
    private void BT_Confirm(ActionEvent e) {
        // TODO add your code here
        String Password=String.copyValueOf(JT_Password.getPassword()) ;
        // 登录
        String User= global.CONFIG.getString("user");
        if( Sign_In(User,Password) ){
            //登陆成功
            Error_Counter=0;
            JL_Failed.setVisible(false);
            JL_Hint.setVisible(false);

            JL_Success.setVisible(true);

            //愚蠢，不会提示就不要提示

            Timer counter = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JL_Success.setVisible(false);
                    Father.toAccountSelect(THIS);
                    ((Timer)e.getSource()).stop();

                }
            });
            counter.start();


        }
        else{

            if(++Error_Counter==3){
                Error_Counter=0;

                Father.RetainCard(this,global.Failed_Three_Times);

            }
            else if(Error_Counter>0){
                JL_Failed.setVisible(true);
                JL_Failed.setText(bundle.getString("Login.JL_Failed.text")+" "+(3-Error_Counter)+" "+bundle.getString("Login.JL_Failed.text2"));
                JT_Password.setText("");
            }
        }


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Login");
        JL_Success = new JLabel();
        JL_Hint = new JLabel();
        BT_Confirm = new JButton();
        BT_Modify = new JButton();
        JT_Password = new JPasswordField();
        JL_Failed = new JLabel();

        //======== this ========
        setLayout(null);

        //---- JL_Success ----
        JL_Success.setHorizontalAlignment(SwingConstants.CENTER);
        JL_Success.setText(bundle.getString("Login.JL_Success.text"));
        add(JL_Success);
        JL_Success.setBounds(155, 170, 235, 155);

        //---- JL_Hint ----
        JL_Hint.setText(bundle.getString("Login.JL_Hint.text"));
        add(JL_Hint);
        JL_Hint.setBounds(185, 215, 219, JL_Hint.getPreferredSize().height);

        //---- BT_Confirm ----
        BT_Confirm.setText(bundle.getString("Login.BT_Confirm.text"));
        BT_Confirm.addActionListener(e -> BT_Confirm(e));
        add(BT_Confirm);
        BT_Confirm.setBounds(new Rectangle(new Point(550, 410), BT_Confirm.getPreferredSize()));

        //---- BT_Modify ----
        BT_Modify.setText(bundle.getString("Login.BT_Modify.text"));
        BT_Modify.addActionListener(e -> Modify_Password(e));
        add(BT_Modify);
        BT_Modify.setBounds(new Rectangle(new Point(550, 450), BT_Modify.getPreferredSize()));
        add(JT_Password);
        JT_Password.setBounds(170, 270, 130, 30);

        //---- JL_Failed ----
        JL_Failed.setText(bundle.getString("Login.JL_Failed.text"));
        add(JL_Failed);
        JL_Failed.setBounds(180, 305, 175, JL_Failed.getPreferredSize().height);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel JL_Success;
    private JLabel JL_Hint;
    private JButton BT_Confirm;
    private JButton BT_Modify;
    private JPasswordField JT_Password;
    private JLabel JL_Failed;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
