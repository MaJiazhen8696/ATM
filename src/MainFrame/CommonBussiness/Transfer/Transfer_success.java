/*
 * Created by JFormDesigner on Fri Dec 22 19:27:44 CST 2023
 */

package MainFrame.CommonBussiness.Transfer;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Transfer_success extends JPanel {
    MainFrame FATHER;
    public Transfer_success(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void JB_Back(ActionEvent e) {
        FATHER.toBussinessSelect(this);
    }

    private void JB_Print(ActionEvent e) {
        FATHER.toPrintReceipt(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        JB_Back = new JButton();
        JB_Print = new JButton();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u8f6c\u8d26\u6210\u529f!!!!!");
        add(label1);
        label1.setBounds(150, 100, 205, label1.getPreferredSize().height);

        //---- JB_Back ----
        JB_Back.setText("\u8fd4\u56de");
        JB_Back.addActionListener(e -> JB_Back(e));
        add(JB_Back);
        JB_Back.setBounds(new Rectangle(new Point(375, 290), JB_Back.getPreferredSize()));

        //---- JB_Print ----
        JB_Print.setText("\u6253\u5370\u51ed\u6761");
        JB_Print.addActionListener(e -> JB_Print(e));
        add(JB_Print);
        JB_Print.setBounds(new Rectangle(new Point(370, 220), JB_Print.getPreferredSize()));

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
    private JButton JB_Back;
    private JButton JB_Print;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
