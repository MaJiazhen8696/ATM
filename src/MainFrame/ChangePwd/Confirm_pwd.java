/*
 * Created by JFormDesigner on Fri Dec 22 20:25:37 CST 2023
 */

package MainFrame.ChangePwd;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Confirm_pwd extends JPanel {
    MainFrame FATHER;
    public static String firstPwd;

    public Confirm_pwd(MainFrame fa) {
        FATHER=fa;
        initComponents();
        textField1.setText(null);
    }

    private void Confirm(ActionEvent e) {
        Confirm_pwd.firstPwd=textField1.getText();
        FATHER.toReConfirm_pwd(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u8bf7\u8f93\u5165\u60a8\u7684\u65b0\u4e2a\u4eba\u5bc6\u7801");
        add(label1);
        label1.setBounds(150, 80, 260, label1.getPreferredSize().height);
        add(textField1);
        textField1.setBounds(130, 140, 190, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> Confirm(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(375, 270), button1.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText("text");
        add(JL_Timer);
        JL_Timer.setBounds(435, 30, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText("text");
        add(JL_Name);
        JL_Name.setBounds(435, 60, 125, JL_Name.getPreferredSize().height);

        //---- JL_Code ----
        JL_Code.setText("\u673a\u5668\u53f7\uff1aCUMT2023");
        add(JL_Code);
        JL_Code.setBounds(425, 90, 125, JL_Code.getPreferredSize().height);

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
