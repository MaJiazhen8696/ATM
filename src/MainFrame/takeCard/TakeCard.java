/*
 * Created by JFormDesigner on Fri Dec 22 21:46:51 CST 2023
 */

package MainFrame.takeCard;

import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class TakeCard extends JPanel {
    MainFrame FATHER;
    public TakeCard(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        JL_Timer = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(638, 422));
        setOpaque(false);
        setLayout(null);

        //---- label1 ----
        label1.setText("\u5361\u5df2\u53d6\u51fa!!!!!");
        label1.setForeground(Color.white);
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 36));
        add(label1);
        label1.setBounds(190, 185, 285, label1.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText("text");
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText("\u673a\u5668\u53f7\uff1aCUMT2023");
        JL_Code.setForeground(Color.white);
        JL_Code.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 21));
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
    public JLabel JL_Timer;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
