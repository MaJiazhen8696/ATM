/*
 * Created by JFormDesigner on Fri Dec 22 16:32:06 CST 2023
 */

package MainFrame.CommonBussiness.Withdraw;

import java.util.*;
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
            global.USER.CurrentAccount.ChangeMoney(global.Taken,global.USER.getID(),null,sum);
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
        ResourceBundle bundle = ResourceBundle.getBundle("lang");
        textField1 = new JTextField();
        label1 = new JLabel();
        button1 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setLayout(null);
        add(textField1);
        textField1.setBounds(315, 185, 125, textField1.getPreferredSize().height);

        //---- label1 ----
        label1.setText(bundle.getString("Withdraw_custom.label1.text"));
        label1.setForeground(Color.white);
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        add(label1);
        label1.setBounds(150, 185, 135, label1.getPreferredSize().height);

        //---- button1 ----
        button1.setText(bundle.getString("Withdraw_custom.button1.text"));
        button1.addActionListener(e -> Withdraw_custom(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(540, 330), button1.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Withdraw_custom.JL_Timer.text"));
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 0, 170, 25);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("Withdraw_custom.JL_Name.text"));
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Name.setForeground(Color.white);
        add(JL_Name);
        JL_Name.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("Withdraw_custom.JL_Code.text"));
        JL_Code.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 21));
        JL_Code.setForeground(Color.white);
        add(JL_Code);
        JL_Code.setBounds(460, 80, 195, JL_Code.getPreferredSize().height);

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
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
