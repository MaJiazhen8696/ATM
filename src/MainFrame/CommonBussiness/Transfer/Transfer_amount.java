/*
 * Created by JFormDesigner on Fri Dec 22 19:27:34 CST 2023
 */

package MainFrame.CommonBussiness.Transfer;

import java.awt.event.*;
import MainFrame.MainFrame;
import User.User;
import global.global;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Transfer_amount extends JPanel {
    MainFrame FATHER;
    public static double amount;
    public Transfer_amount(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void BT_Confirm(ActionEvent e) {
        amount=Double.parseDouble(textField1.getText());
        amount=Double.parseDouble(textField1.getText());
        if(global.USER.CurrentAccount.Money>=amount){
            User other= new User(Transfer_admin.admin);
            other.SwitchAccount(global.Savings);
            System.out.println(other.CurrentAccount.ID);
            other.CurrentAccount.ChangeMoney(global.Income,other.CurrentAccount.getAccountID(),global.USER.CurrentAccount.getAccountID(),amount);
            global.USER.CurrentAccount.ChangeMoney(global.Outcome,global.USER.CurrentAccount.getAccountID(),other.CurrentAccount.getAccountID(),amount);
            FATHER.toTransfer_success(this);
        }
        else{
            FATHER.toTransfer_failed(this);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u8bf7\u8f93\u5165\u8f6c\u8d26\u91d1\u989d");
        add(label1);
        label1.setBounds(new Rectangle(new Point(150, 70), label1.getPreferredSize()));
        add(textField1);
        textField1.setBounds(155, 120, 165, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> BT_Confirm(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(395, 255), button1.getPreferredSize()));

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
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
