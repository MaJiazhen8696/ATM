/*
 * Created by JFormDesigner on Fri Dec 22 19:53:20 CST 2023
 */

package MainFrame.CommonBussiness.Other;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Other_page1 extends JPanel {
    MainFrame FATHER;
    public Other_page1(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void BT_Back(ActionEvent e) {
        FATHER.toBussinessSelect(this);
    }

    private void getNextPage(ActionEvent e) {
        FATHER.toOther_page2(this);
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
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setLayout(null);

        //---- button1 ----
        button1.setText("\u4ee3\u7406\u4e1a\u52a11");
        add(button1);
        button1.setBounds(new Rectangle(new Point(25, 150), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u4ee3\u7406\u4e1a\u52a12");
        add(button2);
        button2.setBounds(new Rectangle(new Point(25, 205), button2.getPreferredSize()));

        //---- button3 ----
        button3.setText("\u4ee3\u7406\u4e1a\u52a13");
        add(button3);
        button3.setBounds(new Rectangle(new Point(25, 260), button3.getPreferredSize()));

        //---- button4 ----
        button4.setText("\u4ee3\u7406\u4e1a\u52a14");
        add(button4);
        button4.setBounds(new Rectangle(new Point(505, 150), button4.getPreferredSize()));

        //---- button5 ----
        button5.setText("\u4ee3\u7406\u4e1a\u52a15");
        add(button5);
        button5.setBounds(new Rectangle(new Point(505, 205), button5.getPreferredSize()));

        //---- button6 ----
        button6.setText("\u4ee3\u7406\u4e1a\u52a16");
        add(button6);
        button6.setBounds(new Rectangle(new Point(505, 260), button6.getPreferredSize()));

        //---- button7 ----
        button7.setText("\u8fd4\u56de");
        button7.addActionListener(e -> BT_Back(e));
        add(button7);
        button7.setBounds(new Rectangle(new Point(15, 330), button7.getPreferredSize()));

        //---- button8 ----
        button8.setText("\u4e0b\u4e00\u9875");
        button8.addActionListener(e -> getNextPage(e));
        add(button8);
        button8.setBounds(new Rectangle(new Point(540, 330), button8.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText("text");
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 40, 170, 25);

        //---- JL_Name ----
        JL_Name.setText("text");
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Name.setForeground(Color.white);
        add(JL_Name);
        JL_Name.setBounds(470, 80, 170, 25);

        //---- JL_Code ----
        JL_Code.setText("\u673a\u5668\u53f7\uff1aCUMT2023");
        JL_Code.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 21));
        JL_Code.setForeground(Color.white);
        add(JL_Code);
        JL_Code.setBounds(460, 120, 195, JL_Code.getPreferredSize().height);

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
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
