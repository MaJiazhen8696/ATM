/*
 * Created by JFormDesigner on Fri Dec 15 16:30:20 CST 2023
 */

package MainFrame.RetainCard;

import java.util.*;

import MainFrame.MainFrame;
import global.global;

import java.awt.*;
import javax.swing.*;

/**
 * @author MJZ
 */
public class RetainCard extends JPanel {
    private ResourceBundle bundle = global.BUNDLE;
    private MainFrame Father;
    public RetainCard(MainFrame fa) {

        initComponents();
        Father = fa;
        bundle = ResourceBundle.getBundle("lang.RetainCard",global.LOCALE);

    }
    public void Show(int ERROR_CODE){
        switch(ERROR_CODE){
            case global.Failed_Three_Times :{
                JL_Retain.setText(bundle.getString("Failed_Three_Times"));
                break;
            }
            case global.AFK:{
                JL_Retain.setText(bundle.getString("AFK"));
                break;
            }
            case global.SAFE:{
                return;
            }
            default: break;
        }
        JL_Hint.setText(bundle.getString("JL_Hint.text"));
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.RetainCard");
        JL_Retain = new JLabel();
        JL_Hint = new JLabel();
        JL_Timer = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setLayout(null);
        add(JL_Retain);
        JL_Retain.setBounds(85, 80, 160, 50);
        add(JL_Hint);
        JL_Hint.setBounds(125, 190, 125, JL_Hint.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("RetainCard.JL_Timer.text"));
        add(JL_Timer);
        JL_Timer.setBounds(265, 30, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("RetainCard.JL_Code.text"));
        add(JL_Code);
        JL_Code.setBounds(255, 90, 125, JL_Code.getPreferredSize().height);

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
    private JLabel JL_Retain;
    private JLabel JL_Hint;
    public JLabel JL_Timer;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
