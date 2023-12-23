/*
 * Created by JFormDesigner on Sat Dec 23 22:26:07 CST 2023
 */

package Interval;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * @author MJZ
 */
public class Interval extends JPanel {
    public Interval() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Saving");
        JL_waiting = new JLabel();
        JL_Time = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setLayout(null);

        //---- JL_waiting ----
        JL_waiting.setText(bundle.getString("Interval.JL_waiting.text"));
        add(JL_waiting);
        JL_waiting.setBounds(new Rectangle(new Point(140, 145), JL_waiting.getPreferredSize()));

        //---- JL_Time ----
        JL_Time.setText(bundle.getString("Interval.JL_Time.text"));
        add(JL_Time);
        JL_Time.setBounds(280, 15, 75, JL_Time.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("Interval.JL_Name.text"));
        add(JL_Name);
        JL_Name.setBounds(new Rectangle(new Point(280, 45), JL_Name.getPreferredSize()));

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("Interval.JL_Code.text"));
        add(JL_Code);
        JL_Code.setBounds(250, 75, 125, JL_Code.getPreferredSize().height);

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
    private JLabel JL_waiting;
    private JLabel JL_Time;
    private JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
