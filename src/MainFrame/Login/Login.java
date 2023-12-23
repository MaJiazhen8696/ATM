/*
 * Created by JFormDesigner on Fri Dec 15 15:30:27 CST 2023
 */

package MainFrame.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
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
        Father=fa;
    }
    private boolean Sign_In(String User,String Password){
        try {
            global.ST = global.CNN.createStatement();
            String sql="SELECT * FROM useraccounts where id="+User;
            ResultSet result=global.ST.executeQuery(sql);
            String tmp=null;
            if(result.next()){
                tmp=result.getString("password");
                if( tmp.equals(Password) ){
                    global.USER=new User(User);
                    return true;
                }
                return false;
            }
        }catch (Exception e){
            ;
        }
        return false;
    }

    private void Modify_Password(ActionEvent e) {
        JT_Password.setText("");
    }
    private void BT_Confirm(ActionEvent e) {
        // TODO add your code here

        String Password=String.copyValueOf(JT_Password.getPassword()) ;
        // 登录
        String User= JT_User.getText();
        if( Sign_In(User,Password) ){
            //登陆成功
            Error_Counter=0;
            JL_Failed.setVisible(false);
            JL_Hint.setVisible(false);
            Father.toInterval(this);


            //愚蠢，不会提示就不要提示




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
        JL_Hint = new JLabel();
        BT_Confirm = new JButton();
        BT_Modify = new JButton();
        JT_Password = new JPasswordField();
        JL_Failed = new JLabel();
        JT_User = new JTextField();
        label1 = new JLabel();

        //======== this ========
        setLayout(null);

        //---- JL_Hint ----
        JL_Hint.setText(bundle.getString("Login.JL_Hint.text"));
        add(JL_Hint);
        JL_Hint.setBounds(60, 265, 219, JL_Hint.getPreferredSize().height);

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
        JT_Password.setBounds(175, 255, 130, 30);

        //---- JL_Failed ----
        JL_Failed.setText(bundle.getString("Login.JL_Failed.text"));
        add(JL_Failed);
        JL_Failed.setBounds(180, 335, 175, JL_Failed.getPreferredSize().height);
        add(JT_User);
        JT_User.setBounds(180, 205, 120, 33);

        //---- label1 ----
        label1.setText(bundle.getString("Login.label1.text"));
        add(label1);
        label1.setBounds(60, 210, 110, label1.getPreferredSize().height);

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
    private JLabel JL_Hint;
    private JButton BT_Confirm;
    private JButton BT_Modify;
    private JPasswordField JT_Password;
    private JLabel JL_Failed;
    private JTextField JT_User;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
