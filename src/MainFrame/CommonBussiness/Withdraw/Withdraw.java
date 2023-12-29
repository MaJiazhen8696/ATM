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
            global.USER.CurrentAccount.ChangeMoney(global.Taken,global.USER.CurrentAccount.getAccountID(),null,100);
            System.out.println(global.USER.CurrentAccount.Money);
            Father.toWithdraw_success(this);
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void Withdraw_200(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=200){
            global.USER.CurrentAccount.ChangeMoney(global.Taken,global.USER.getID(),null,200);
            Father.toWithdraw_success(this);
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void button3(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=500){
            global.USER.CurrentAccount.ChangeMoney(global.Taken,global.USER.getID(),null,500);
            Father.toWithdraw_success(this);
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void Withdraw_800(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=800){
            global.USER.CurrentAccount.ChangeMoney(global.Taken,global.USER.getID(),null,800);
            Father.toWithdraw_success(this);
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void Withdraw_1000(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=1000){
            global.USER.CurrentAccount.ChangeMoney(global.Taken,global.USER.getID(),null,1000);
            Father.toWithdraw_success(this);
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void Withdraw_1500(ActionEvent e) {
        if(global.USER.CurrentAccount.Money>=1500){
            global.USER.CurrentAccount.ChangeMoney(global.Taken,global.USER.getID(),null,1500);
            Father.toWithdraw_success(this);
        }
        else{
            Father.toWithdraw_failed(this);
        }
    }

    private void Withdraw_custom(ActionEvent e) {
        Father.toWithdraw_custom(this);
    }

    private void JB_Back(ActionEvent e) {
        Father.toBussinessSelect(this);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang");
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setLayout(null);

        //---- label1 ----
        label1.setText(bundle.getString("Withdraw.label1.text"));
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        label1.setForeground(Color.white);
        add(label1);
        label1.setBounds(210, 15, 230, label1.getPreferredSize().height);

        //---- button1 ----
        button1.setText(bundle.getString("Withdraw.button1.text"));
        button1.addActionListener(e -> Withdraw_100(e));
        add(button1);
        button1.setBounds(0, 95, 85, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText(bundle.getString("Withdraw.button2.text"));
        button2.addActionListener(e -> Withdraw_200(e));
        add(button2);
        button2.setBounds(0, 150, 85, button2.getPreferredSize().height);

        //---- button3 ----
        button3.setText(bundle.getString("Withdraw.button3.text"));
        button3.addActionListener(e -> button3(e));
        add(button3);
        button3.setBounds(0, 205, 85, button3.getPreferredSize().height);

        //---- button4 ----
        button4.setText(bundle.getString("Withdraw.button4.text"));
        button4.addActionListener(e -> Withdraw_800(e));
        add(button4);
        button4.setBounds(0, 260, 85, button4.getPreferredSize().height);

        //---- button5 ----
        button5.setText(bundle.getString("Withdraw.button5.text"));
        button5.addActionListener(e -> Withdraw_1000(e));
        add(button5);
        button5.setBounds(553, 95, 85, button5.getPreferredSize().height);

        //---- button6 ----
        button6.setText(bundle.getString("Withdraw.button6.text"));
        button6.addActionListener(e -> Withdraw_1500(e));
        add(button6);
        button6.setBounds(553, 150, 85, button6.getPreferredSize().height);

        //---- button7 ----
        button7.setText(bundle.getString("Withdraw.button7.text"));
        button7.addActionListener(e -> Withdraw_custom(e));
        add(button7);
        button7.setBounds(553, 205, 85, button7.getPreferredSize().height);

        //---- button8 ----
        button8.setText(bundle.getString("Withdraw.button8.text"));
        button8.addActionListener(e -> JB_Back(e));
        add(button8);
        button8.setBounds(new Rectangle(new Point(495, 440), button8.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Withdraw.JL_Timer.text"));
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 0, 170, 25);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("Withdraw.JL_Name.text"));
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
        JL_Name.setForeground(Color.white);
        JL_Name.setHorizontalAlignment(SwingConstants.RIGHT);
        add(JL_Name);
        JL_Name.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("Withdraw.JL_Code.text"));
        JL_Code.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 21));
        JL_Code.setForeground(Color.white);
        add(JL_Code);
        JL_Code.setBounds(0, 395, 195, JL_Code.getPreferredSize().height);

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
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
