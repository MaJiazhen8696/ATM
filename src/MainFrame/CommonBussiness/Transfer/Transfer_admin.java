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
    public Transfer_admin(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void BT_Confirm(ActionEvent e) {
        FATHER.toTransfer_amount(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setLayout(null);
        add(label1);
        label1.setBounds(new Rectangle(new Point(150, 65), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("\u8bf7\u8f93\u5165\u8f6c\u8d26\u8d26\u53f7");
        add(label2);
        label2.setBounds(new Rectangle(new Point(125, 70), label2.getPreferredSize()));
        add(textField1);
        textField1.setBounds(115, 125, 220, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> BT_Confirm(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(385, 230), button1.getPreferredSize()));

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}