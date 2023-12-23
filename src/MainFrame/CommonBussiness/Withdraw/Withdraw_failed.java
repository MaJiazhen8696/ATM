/*
 * Created by JFormDesigner on Fri Dec 22 15:02:50 CST 2023
 */

package MainFrame.CommonBussiness.Withdraw;

import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Withdraw_failed extends JPanel {
    MainFrame FATHER;
    public Withdraw_failed(MainFrame fa) {
        initComponents();
        FATHER=fa;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(638, 422));
        setOpaque(false);
        setLayout(null);

        //---- label1 ----
        label1.setText("\u4f59\u989d\u4e0d\u8db3!!!!!");
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        label1.setForeground(Color.white);
        add(label1);
        label1.setBounds(180, 170, 240, label1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u8fd4\u56de");
        add(button1);
        button1.setBounds(new Rectangle(new Point(545, 320), button1.getPreferredSize()));

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
