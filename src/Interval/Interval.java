/*
 * Created by JFormDesigner on Sat Dec 23 22:26:07 CST 2023
 */

package Interval;

import MainFrame.MainFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

import global.global;
/**
 * @author MJZ
 */
public class Interval extends JPanel {
    MainFrame Father;
    JPanel THIS;
    public  Calendar calendar= global.calendar;
    public  SimpleDateFormat dateFormat=global.dateFormat;
    public Interval( MainFrame fa) {
        Father=fa;
        THIS=this;
        initComponents();


    }
    public void ST(){
        //播片
        Timer counter = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Father.toAccountSelect(THIS);
                ((Timer)e.getSource()).stop();

            }
        });
        counter.start();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Saving");
        JL_waiting = new JLabel();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setLayout(null);

        //---- JL_waiting ----
        JL_waiting.setText(bundle.getString("Interval.JL_waiting.text"));
        add(JL_waiting);
        JL_waiting.setBounds(new Rectangle(new Point(140, 145), JL_waiting.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Interval.JL_Timer.text"));
        add(JL_Timer);
        JL_Timer.setBounds(260, 15, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("Interval.JL_Name.text"));
        add(JL_Name);
        JL_Name.setBounds(260, 45, 125, JL_Name.getPreferredSize().height);

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
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
