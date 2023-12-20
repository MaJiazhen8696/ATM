/*
 * Created by JFormDesigner on Wed Dec 20 17:30:12 CST 2023
 */

package MainFrame.CommonBussiness;

import java.awt.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

/**
 * @author MJZ
 */
public class Saving extends JPanel {
    Timer timer;
    int cnt=31;
    ResourceBundle bundle;
    public Saving() {
        initComponents();
        timer = new Timer();
        bundle= ResourceBundle.getBundle("lang.Saving");
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                JL_Timer.setText(bundle.getString("Saving.JL_Timer.text")+(--cnt)+bundle.getString("Saving.JL_Timer.text_2"));
                if(cnt==0){


                }
            }
        },1000,1000);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Saving");
        JL_Hint = new JLabel();
        JL_Timer = new JLabel();
        JB_Confirm = new JButton();
        JB_Back = new JButton();
        JP_TEST = new JPanel();

        //======== this ========
        setLayout(null);

        //---- JL_Hint ----
        JL_Hint.setText(bundle.getString("Saving.JL_Hint.text"));
        add(JL_Hint);
        JL_Hint.setBounds(170, 125, 265, JL_Hint.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Saving.JL_Timer.text"));
        add(JL_Timer);
        JL_Timer.setBounds(130, 260, 120, JL_Timer.getPreferredSize().height);

        //---- JB_Confirm ----
        JB_Confirm.setText(bundle.getString("Saving.JB_Confirm.text"));
        add(JB_Confirm);
        JB_Confirm.setBounds(460, 320, 118, JB_Confirm.getPreferredSize().height);

        //---- JB_Back ----
        JB_Back.setText(bundle.getString("Saving.JB_Back.text"));
        add(JB_Back);
        JB_Back.setBounds(465, 380, 110, JB_Back.getPreferredSize().height);

        //======== JP_TEST ========
        {
            JP_TEST.setPreferredSize(new Dimension(400, 300));
            JP_TEST.setLayout(null);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < JP_TEST.getComponentCount(); i++) {
                    Rectangle bounds = JP_TEST.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = JP_TEST.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                JP_TEST.setMinimumSize(preferredSize);
                JP_TEST.setPreferredSize(preferredSize);
            }
        }
        add(JP_TEST);
        JP_TEST.setBounds(100, 110, JP_TEST.getPreferredSize().width, 235);

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
    private JLabel JL_Hint;
    private JLabel JL_Timer;
    private JButton JB_Confirm;
    private JButton JB_Back;
    private JPanel JP_TEST;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
