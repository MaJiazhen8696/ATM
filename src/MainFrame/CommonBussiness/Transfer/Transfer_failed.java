/*
 * Created by JFormDesigner on Fri Dec 22 19:40:50 CST 2023
 */

package MainFrame.CommonBussiness.Transfer;

import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Transfer_failed extends JPanel {
    MainFrame FATHER;
    public Transfer_failed(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u8f6c\u8d26\u5931\u8d25!!!!!");
        add(label1);
        label1.setBounds(110, 80, 160, label1.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText("text");
        add(JL_Timer);
        JL_Timer.setBounds(365, 40, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText("text");
        add(JL_Name);
        JL_Name.setBounds(365, 70, 125, JL_Name.getPreferredSize().height);

        //---- JL_Code ----
        JL_Code.setText("\u673a\u5668\u53f7\uff1aCUMT2023");
        add(JL_Code);
        JL_Code.setBounds(355, 100, 125, JL_Code.getPreferredSize().height);

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
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
