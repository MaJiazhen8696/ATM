/*
 * Created by JFormDesigner on Fri Dec 22 20:01:33 CST 2023
 */

package MainFrame.CommonBussiness.Other;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Other_page2 extends JPanel {
    MainFrame FATHER;
    public Other_page2(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void getPriorPage(ActionEvent e) {
        FATHER.toOther_page1(this);
    }

    private void getNextPage(ActionEvent e) {
        FATHER.toOther_page3(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
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

        //---- button1 ----
        button1.setText("\u4ee3\u7406\u4e1a\u52a17");
        add(button1);
        button1.setBounds(new Rectangle(new Point(60, 50), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u4ee3\u7406\u4e1a\u52a18");
        add(button2);
        button2.setBounds(new Rectangle(new Point(60, 125), button2.getPreferredSize()));

        //---- button3 ----
        button3.setText("\u4ee3\u7406\u4e1a\u52a19");
        add(button3);
        button3.setBounds(new Rectangle(new Point(60, 205), button3.getPreferredSize()));

        //---- button4 ----
        button4.setText("\u4e0a\u4e00\u9875");
        button4.addActionListener(e -> getPriorPage(e));
        add(button4);
        button4.setBounds(new Rectangle(new Point(65, 295), button4.getPreferredSize()));

        //---- button5 ----
        button5.setText("\u4ee3\u7406\u4e1a\u52a110");
        add(button5);
        button5.setBounds(new Rectangle(new Point(375, 55), button5.getPreferredSize()));

        //---- button6 ----
        button6.setText("\u4ee3\u7406\u4e1a\u52a111");
        add(button6);
        button6.setBounds(new Rectangle(new Point(380, 135), button6.getPreferredSize()));

        //---- button7 ----
        button7.setText("\u4ee3\u7406\u4e1a\u52a112");
        add(button7);
        button7.setBounds(new Rectangle(new Point(375, 210), button7.getPreferredSize()));

        //---- button8 ----
        button8.setText("\u4e0b\u4e00\u9875");
        button8.addActionListener(e -> getNextPage(e));
        add(button8);
        button8.setBounds(new Rectangle(new Point(375, 295), button8.getPreferredSize()));

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
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}