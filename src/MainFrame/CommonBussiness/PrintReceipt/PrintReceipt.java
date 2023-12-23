/*
 * Created by JFormDesigner on Sat Dec 23 23:11:08 CST 2023
 */

package MainFrame.CommonBussiness.PrintReceipt;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author m'm
 */
public class PrintReceipt extends JPanel {
    MainFrame FATHER;
    public PrintReceipt(MainFrame fa) {
        FATHER=fa;
        initComponents();
        L_success.setVisible(false);
        L_wait.setVisible(true);
        JB_Back.setVisible(false);
    }


    private void JB_Back(ActionEvent e) {

        FATHER.toBussinessSelect(this);
        L_success.setVisible(false);
        L_wait.setVisible(true);
        JB_Back.setVisible(false);
    }

    private void clicked(MouseEvent e) {
        Timer counter1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L_success.setVisible(true);
                L_wait.setVisible(false);
                JB_Back.setVisible(true);
                ((Timer)e.getSource()).stop();
            }
        });
        counter1.start();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        L_wait = new JLabel();
        L_success = new JLabel();
        JB_Back = new JButton();

        //======== this ========
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clicked(e);
            }
        });
        setLayout(null);

        //---- L_wait ----
        L_wait.setText("\u6b63\u5728\u6253\u5370\u51ed\u6761\uff0c\u8bf7\u7a0d\u7b49!!!!!");
        add(L_wait);
        L_wait.setBounds(130, 80, 250, L_wait.getPreferredSize().height);

        //---- L_success ----
        L_success.setText("\u6253\u5370\u6210\u529f!!!!!");
        add(L_success);
        L_success.setBounds(130, 100, 220, L_success.getPreferredSize().height);

        //---- JB_Back ----
        JB_Back.setText("\u8fd4\u56de");
        JB_Back.addActionListener(e -> JB_Back(e));
        add(JB_Back);
        JB_Back.setBounds(new Rectangle(new Point(375, 265), JB_Back.getPreferredSize()));

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
    private JLabel L_wait;
    private JLabel L_success;
    private JButton JB_Back;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
