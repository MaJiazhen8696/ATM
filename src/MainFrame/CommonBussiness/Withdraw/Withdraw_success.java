/*
 * Created by JFormDesigner on Fri Dec 22 16:42:44 CST 2023
 */

package MainFrame.CommonBussiness.Withdraw;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Withdraw_success extends JPanel {
    MainFrame FATHER;
    public Withdraw_success(MainFrame fa) {
        initComponents();
        FATHER=fa;
    }

    private void JB_Back(ActionEvent e) {
        FATHER.toBussinessSelect(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u53d6\u6b3e\u6210\u529f!!!!!");
        add(label1);
        label1.setBounds(165, 75, 170, label1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u8fd4\u56de");
        button1.addActionListener(e -> JB_Back(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(390, 275), button1.getPreferredSize()));

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
