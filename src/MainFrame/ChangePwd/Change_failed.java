/*
 * Created by JFormDesigner on Fri Dec 22 20:26:25 CST 2023
 */

package MainFrame.ChangePwd;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Change_failed extends JPanel {
    MainFrame FATHER;
    public Change_failed(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void Continue(ActionEvent e) {
        FATHER.toBussinessSelect(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u4e24\u6b21\u5bc6\u7801\u4e0d\u540c\uff0c\u4fee\u6539\u5931\u8d25!!!!!");
        add(label1);
        label1.setBounds(160, 90, 270, label1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u7ee7\u7eed");
        button1.addActionListener(e -> Continue(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(390, 240), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u53d6\u5361");
        add(button2);
        button2.setBounds(new Rectangle(new Point(390, 310), button2.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText("text");
        add(JL_Timer);
        JL_Timer.setBounds(475, 35, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText("text");
        add(JL_Name);
        JL_Name.setBounds(475, 65, 125, JL_Name.getPreferredSize().height);

        //---- JL_Code ----
        JL_Code.setText("\u673a\u5668\u53f7\uff1aCUMT2023");
        add(JL_Code);
        JL_Code.setBounds(465, 95, 125, JL_Code.getPreferredSize().height);

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
