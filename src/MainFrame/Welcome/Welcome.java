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

        //======== this ========
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
        button1.addActionListener(e -> button1(e));
        add(button1);
        button1.setBounds(470, 355, 158, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText(bundle.getString("Welcome.button2.text"));
        add(button2);
        button2.setBounds(465, 415, 183, button2.getPreferredSize().height);

        //---- label1 ----
        label1.setText(bundle.getString("Welcome.label1.text"));
        add(label1);
        label1.setBounds(new Rectangle(new Point(285, 185), label1.getPreferredSize()));

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
