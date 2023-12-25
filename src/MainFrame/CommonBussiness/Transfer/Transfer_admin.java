/*
 * Created by JFormDesigner on Fri Dec 22 19:27:26 CST 2023
 */

package MainFrame.CommonBussiness.Transfer;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Transfer_admin extends JPanel {
    MainFrame FATHER;
    public static String admin;
    public Transfer_admin(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void BT_Confirm(ActionEvent e) {
        admin=textField1.getText();
        FATHER.toTransfer_amount(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setLayout(null);
        add(label1);
        label1.setBounds(new Rectangle(new Point(150, 65), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u8bf7\u8f93\u5165\u8f6c\u8d26\u8d26\u53f7");
        label2.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        label2.setForeground(Color.white);
        add(label2);
        label2.setBounds(190, 155, 225, label2.getPreferredSize().height);
        add(textField1);
        textField1.setBounds(190, 210, 220, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> BT_Confirm(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(540, 330), button1.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText("text");
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
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
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
