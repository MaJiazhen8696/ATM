/*
 * Created by JFormDesigner on Fri Dec 22 20:25:54 CST 2023
 */

package MainFrame.ChangePwd;

import java.awt.event.*;
import java.util.*;
import MainFrame.MainFrame;
import global.global;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class ReConfirm_pwd extends JPanel {
    MainFrame FATHER;
    public static String secondPwd;
    public ReConfirm_pwd(MainFrame fa) {
        FATHER=fa;
        initComponents();
        textField1.setText(null);
    }

    private void Confirm(ActionEvent e) {
        secondPwd=textField1.getText();
        if(Confirm_pwd.firstPwd.equals(ReConfirm_pwd.secondPwd)){
            global.USER.changePWD(secondPwd);
            FATHER.toChange_success(this);
        }
        else{
            FATHER.toChange_failed(this);
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang");
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setLayout(null);

        //---- label1 ----
        label1.setText(bundle.getString("ReConfirm_pwd.label1.text"));
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        label1.setForeground(Color.white);
        add(label1);
        label1.setBounds(125, 160, 385, label1.getPreferredSize().height);
        add(textField1);
        textField1.setBounds(190, 225, 220, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText(bundle.getString("ReConfirm_pwd.button1.text"));
        button1.addActionListener(e -> Confirm(e));
        add(button1);
        button1.setBounds(558, 290, 80, button1.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("ReConfirm_pwd.JL_Timer.text"));
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 0, 170, 25);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("ReConfirm_pwd.JL_Name.text"));
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
        JL_Name.setForeground(Color.white);
        JL_Name.setHorizontalAlignment(SwingConstants.RIGHT);
        add(JL_Name);
        JL_Name.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("ReConfirm_pwd.JL_Code.text"));
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
    private JTextField textField1;
    private JButton button1;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
