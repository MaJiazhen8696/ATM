/*
 * Created by JFormDesigner on Fri Dec 22 20:06:21 CST 2023
 */

package MainFrame.CommonBussiness.Other;

import java.awt.event.*;
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
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setLayout(null);

        //---- button1 ----
        button1.setText("\u4ee3\u7406\u4e1a\u52a113");
        add(button1);
        button1.setBounds(new Rectangle(new Point(56, 65), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u4ee3\u7406\u4e1a\u52a114");
        add(button2);
        button2.setBounds(new Rectangle(new Point(60, 165), button2.getPreferredSize()));

        //---- button3 ----
        button3.setText("\u4e0a\u4e00\u9875");
        button3.addActionListener(e -> getPriorPage(e));
        add(button3);
        button3.setBounds(new Rectangle(new Point(65, 285), button3.getPreferredSize()));

        //---- button4 ----
        button4.setText("\u8fd4\u56de");
        button4.addActionListener(e -> BT_Back(e));
        add(button4);
        button4.setBounds(new Rectangle(new Point(380, 295), button4.getPreferredSize()));

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
