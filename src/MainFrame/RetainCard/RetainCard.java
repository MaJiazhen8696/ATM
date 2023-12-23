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
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Image image = new ImageIcon("E:\\JavaProject\\ATM\\background.png").getImage();
//        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
//    }
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
        JL_Hint = new JLabel();
        JL_Retain = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(638, 422));
        setMinimumSize(new Dimension(0, 0));
        setOpaque(false);
        setLayout(null);
        add(JL_Hint);
        JL_Hint.setBounds(125, 190, 125, JL_Hint.getPreferredSize().height);

        //---- JL_Retain ----
        JL_Retain.setText(bundle.getString("RetainCard.JL_Retain.text"));
        JL_Retain.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 36));
        JL_Retain.setHorizontalAlignment(SwingConstants.CENTER);
        JL_Retain.setForeground(Color.white);
        add(JL_Retain);
        JL_Retain.setBounds(40, 160, 585, 110);

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
    private JLabel JL_Retain;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
