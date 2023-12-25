/*
 * Created by JFormDesigner on Fri Dec 15 15:30:10 CST 2023
 */

package MainFrame.Welcome;

import MainFrame.MainFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * @author MJZ
 */
public class Welcome extends JPanel {
    MainFrame Father=null;
    public Welcome(MainFrame fa) {
        initComponents();

        Father=fa;
    }
    

    private void thisMouseClicked(MouseEvent e) {
        setVisible(false);
        Father.toLogin(this);
    }


    private void button1(ActionEvent e) {
        // TODO add your code here
    }

    private void Active(KeyEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Welcome");
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();
        JL_Timer = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setMinimumSize(new Dimension(634, 422));
        setMaximumSize(new Dimension(638, 422));
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                Active(e);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                thisMouseClicked(e);
            }
        });
        setLayout(null);

        //---- button1 ----
        button1.setText(bundle.getString("Welcome.button1.text"));
        button1.setAlignmentY(0.0F);
        button1.addActionListener(e -> button1(e));
        add(button1);
        button1.setBounds(570, 285, 80, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText(bundle.getString("Welcome.button2.text"));
        button2.setAlignmentY(0.0F);
        add(button2);
        button2.setBounds(570, 325, 80, button2.getPreferredSize().height);

        //---- label1 ----
        label1.setText(bundle.getString("Welcome.label1.text"));
        label1.setForeground(Color.white);
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 36));
        add(label1);
        label1.setBounds(new Rectangle(new Point(245, 185), label1.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Welcome.JL_Timer.text"));
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(480, 15, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("Welcome.JL_Code.text"));
        JL_Code.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 21));
        JL_Code.setForeground(Color.white);
        add(JL_Code);
        JL_Code.setBounds(455, 45, 195, JL_Code.getPreferredSize().height);

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
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    public JLabel JL_Timer;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
