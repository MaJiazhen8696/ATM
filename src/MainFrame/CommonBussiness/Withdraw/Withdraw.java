/*
 * Created by JFormDesigner on Fri Dec 22 14:39:34 CST 2023
 */

package MainFrame.CommonBussiness.Withdraw;

import java.awt.event.*;
import MainFrame.MainFrame;
import global.global;

import java.awt.*;
import java.util.ResourceBundle;
import java.util.Timer;
import javax.swing.*;

/**
 * @author m'm
 */
public class Withdraw extends JPanel {
    MainFrame Father;
    public Withdraw(MainFrame fa) {
        initComponents();
        Father=fa;
    }

    private void Withdraw_100(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=100){
            global.USER.CurrentAccount.Money -=100;
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void Withdraw_200(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=200){
            global.USER.CurrentAccount.Money -=200;
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void button3(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=500){
            global.USER.CurrentAccount.Money -=500;
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void Withdraw_800(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=800){
            global.USER.CurrentAccount.Money -=800;
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void Withdraw_1000(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=1000){
            global.USER.CurrentAccount.Money -=1000;
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void Withdraw_1500(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=1500){
            global.USER.CurrentAccount.Money -=1500;
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u8bf7\u8f93\u5165\u53d6\u6b3e\u91d1\u989d");
        add(label1);
        label1.setBounds(240, 60, 135, label1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("100");
        button1.addActionListener(e -> Withdraw_100(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(40, 120), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("200");
        button2.addActionListener(e -> Withdraw_200(e));
        add(button2);
        button2.setBounds(new Rectangle(new Point(45, 185), button2.getPreferredSize()));

        //---- button3 ----
        button3.setText("500");
        button3.addActionListener(e -> button3(e));
        add(button3);
        button3.setBounds(new Rectangle(new Point(45, 255), button3.getPreferredSize()));

        //---- button4 ----
        button4.setText("800");
        button4.addActionListener(e -> Withdraw_800(e));
        add(button4);
        button4.setBounds(new Rectangle(new Point(45, 340), button4.getPreferredSize()));

        //---- button5 ----
        button5.setText("1000");
        button5.addActionListener(e -> Withdraw_1000(e));
        add(button5);
        button5.setBounds(new Rectangle(new Point(490, 135), button5.getPreferredSize()));

        //---- button6 ----
        button6.setText("1500");
        button6.addActionListener(e -> Withdraw_1500(e));
        add(button6);
        button6.setBounds(new Rectangle(new Point(495, 215), button6.getPreferredSize()));

        //---- button7 ----
        button7.setText("\u8f93\u5165\u91d1\u989d");
        add(button7);
        button7.setBounds(new Rectangle(new Point(490, 310), button7.getPreferredSize()));

        //---- button8 ----
        button8.setText("\u53d6\u5361");
        add(button8);
        button8.setBounds(new Rectangle(new Point(495, 440), button8.getPreferredSize()));

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
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
