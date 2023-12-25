/*
 * Created by JFormDesigner on Fri Dec 22 20:06:21 CST 2023
 */

package MainFrame.CommonBussiness.Other;

import java.awt.event.*;
import java.util.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Other_page3 extends JPanel {
    MainFrame FATHER;
    public Other_page3(MainFrame fa){
        FATHER=fa;
        initComponents();
    }

    private void getPriorPage(ActionEvent e) {
        FATHER.toOther_page2(this);
    }

    private void BT_Back(ActionEvent e) {
        FATHER.toBussinessSelect(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang");
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setLayout(null);

        //---- button1 ----
        button1.setText(bundle.getString("Other_page3.button1.text"));
        add(button1);
        button1.setBounds(new Rectangle(new Point(25, 150), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText(bundle.getString("Other_page3.button2.text"));
        add(button2);
        button2.setBounds(new Rectangle(new Point(25, 205), button2.getPreferredSize()));

        //---- button3 ----
        button3.setText(bundle.getString("Other_page3.button3.text"));
        button3.addActionListener(e -> getPriorPage(e));
        add(button3);
        button3.setBounds(new Rectangle(new Point(15, 330), button3.getPreferredSize()));

        //---- button4 ----
        button4.setText(bundle.getString("Other_page3.button4.text"));
        button4.addActionListener(e -> BT_Back(e));
        add(button4);
        button4.setBounds(new Rectangle(new Point(540, 330), button4.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Other_page3.JL_Timer.text"));
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 0, 170, 25);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("Other_page3.JL_Name.text"));
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Name.setForeground(Color.white);
        add(JL_Name);
        JL_Name.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("Other_page3.JL_Code.text"));
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
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
