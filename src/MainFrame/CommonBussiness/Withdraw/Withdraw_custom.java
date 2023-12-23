/*
 * Created by JFormDesigner on Fri Dec 22 16:32:06 CST 2023
 */

package MainFrame.CommonBussiness.Withdraw;

import MainFrame.MainFrame;
import global.global;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Withdraw_custom extends JPanel {
    MainFrame FATHER;
    public Withdraw_custom(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void confirm(ActionEvent e) {
        int sum;
        sum=Integer.parseInt(textField1.getText());
        if(global.USER.CurrentAccount.Money>=sum){
            global.USER.CurrentAccount.ChangeMoney(global.Taken,global.USER.CurrentAccount.getAccountID(),null,sum);
            FATHER.toWithdraw_success(this);
        }
        else{
            FATHER.toWithdraw_failed(this);
        }
    }

    private void Withdraw_custom(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        textField1 = new JTextField();
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setLayout(null);
        add(textField1);
        textField1.setBounds(155, 160, 125, textField1.getPreferredSize().height);

        //---- label1 ----
        label1.setText("\u53d6\u6b3e\u91d1\u989d");
        add(label1);
        label1.setBounds(new Rectangle(new Point(65, 170), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("Confirm");
        button1.addActionListener(e -> Withdraw_custom(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(405, 300), button1.getPreferredSize()));

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
    private JTextField textField1;
    private JLabel label1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
