/*
 * Created by JFormDesigner on Fri Dec 22 20:26:17 CST 2023
 */

package MainFrame.ChangePwd;

import java.awt.event.*;
import java.util.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Change_success extends JPanel {
    MainFrame FATHER;
    public Change_success(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void Continue(ActionEvent e) {
        FATHER.toBussinessSelect(this);
    }

    private void TakeCard(ActionEvent e) {
        FATHER.toTakeCard(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang");
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setLayout(null);

        //---- label1 ----
        label1.setText(bundle.getString("Change_success.label1.text"));
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 36));
        label1.setForeground(Color.white);
        add(label1);
        label1.setBounds(160, 180, 390, label1.getPreferredSize().height);

        //---- button1 ----
        button1.setText(bundle.getString("Change_success.button1.text"));
        button1.addActionListener(e -> Continue(e));
        add(button1);
        button1.setBounds(558, 290, 80, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText(bundle.getString("Change_success.button2.text"));
        button2.addActionListener(e -> TakeCard(e));
        add(button2);
        button2.setBounds(558, 330, 80, button2.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Change_success.JL_Timer.text"));
        JL_Timer.setForeground(Color.white);
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        add(JL_Timer);
        JL_Timer.setBounds(470, 0, 170, 25);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("Change_success.JL_Name.text"));
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
        JL_Name.setForeground(Color.white);
        JL_Name.setHorizontalAlignment(SwingConstants.RIGHT);
        add(JL_Name);
        JL_Name.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("Change_success.JL_Code.text"));
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
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
