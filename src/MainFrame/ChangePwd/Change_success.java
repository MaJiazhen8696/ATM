/*
 * Created by JFormDesigner on Fri Dec 22 20:26:17 CST 2023
 */

package MainFrame.ChangePwd;

import java.awt.event.*;
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
        label1.setText("\u4fee\u6539\u5bc6\u7801\u6210\u529f!!!!!");
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 36));
        label1.setForeground(Color.white);
        add(label1);
        label1.setBounds(160, 180, 390, label1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u7ee7\u7eed");
        button1.addActionListener(e -> Continue(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(540, 290), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("\u53d6\u5361");
        button2.addActionListener(e -> TakeCard(e));
        add(button2);
        button2.setBounds(new Rectangle(new Point(540, 330), button2.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText("text");
        JL_Timer.setForeground(Color.white);
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        add(JL_Timer);
        JL_Timer.setBounds(470, 0, 170, 25);

        //---- JL_Name ----
        JL_Name.setText("text");
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Name.setForeground(Color.white);
        add(JL_Name);
        JL_Name.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText("\u673a\u5668\u53f7\uff1aCUMT2023");
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
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
