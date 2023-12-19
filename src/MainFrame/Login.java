/*
 * Created by JFormDesigner on Fri Dec 15 15:30:27 CST 2023
 */

package MainFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * @author MJZ
 */
public class Login extends JPanel {
    MainFrame Father=null;
    private int cnt=0;
    public Login(MainFrame fa) {
        initComponents();
        Father=fa;
    }

    private void Confirm_Password(ActionEvent e) {
        String Password=JT_Password.getText();
        // 登录

        if(cnt==3){
            Father.RetainCard();
        }

    }

    private void Modify_Password(ActionEvent e) {
        JT_Password.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Login");
        label1 = new JLabel();
        JT_Password = new JTextField();
        button1 = new JButton();
        BT_Modify = new JButton();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText(bundle.getString("Login.label1.text"));
        add(label1);
        label1.setBounds(185, 215, 219, label1.getPreferredSize().height);
        add(JT_Password);
        JT_Password.setBounds(160, 290, 134, JT_Password.getPreferredSize().height);

        //---- button1 ----
        button1.setText(bundle.getString("Login.button1.text"));
        button1.addActionListener(e -> Confirm_Password(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(550, 410), button1.getPreferredSize()));

        //---- BT_Modify ----
        BT_Modify.setText(bundle.getString("Login.BT_Modify.text"));
        BT_Modify.addActionListener(e -> Modify_Password(e));
        add(BT_Modify);
        BT_Modify.setBounds(new Rectangle(new Point(550, 450), BT_Modify.getPreferredSize()));

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
    private JLabel label1;
    private JTextField JT_Password;
    private JButton button1;
    private JButton BT_Modify;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
