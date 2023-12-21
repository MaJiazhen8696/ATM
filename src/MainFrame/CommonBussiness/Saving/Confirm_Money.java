/*
 * Created by JFormDesigner on Thu Dec 21 13:29:41 CST 2023
 */

package MainFrame.CommonBussiness.Saving;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * @author MJZ
 */
public class Confirm_Money extends JPanel {
    public Confirm_Money() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Saving");
        label1 = new JLabel();
        JT = new JTable();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText(bundle.getString("Saving.Confirm_Money.label1.text"));
        add(label1);
        label1.setBounds(180, 55, 105, label1.getPreferredSize().height);
        add(JT);
        JT.setBounds(130, 160, 275, 60);

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
    private JTable JT;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
