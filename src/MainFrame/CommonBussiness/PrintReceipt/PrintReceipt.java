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
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clicked(e);
            }
        });
        setLayout(null);

        //---- L_wait ----
        L_wait.setText("\u6b63\u5728\u6253\u5370\u51ed\u6761\uff0c\u8bf7\u7a0d\u7b49...");
        L_wait.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        L_wait.setForeground(Color.white);
        add(L_wait);
        L_wait.setBounds(85, 140, 400, L_wait.getPreferredSize().height);

        //---- L_success ----
        L_success.setText("\u6253\u5370\u6210\u529f!!!!!");
        L_success.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        L_success.setForeground(Color.white);
        add(L_success);
        L_success.setBounds(150, 210, 220, L_success.getPreferredSize().height);

        //---- JB_Back ----
        JB_Back.setText("\u8fd4\u56de");
        JB_Back.addActionListener(e -> JB_Back(e));
        add(JB_Back);
        JB_Back.setBounds(new Rectangle(new Point(540, 330), JB_Back.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText("text");
        JL_Timer.setForeground(Color.white);
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        add(JL_Timer);
        JL_Timer.setBounds(470, 40, 170, 25);

        //---- JL_Name ----
        JL_Name.setText("text");
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Name.setForeground(Color.white);
        add(JL_Name);
        JL_Name.setBounds(470, 80, 170, 25);

        //---- JL_Code ----
        JL_Code.setText("\u673a\u5668\u53f7\uff1aCUMT2023");
        JL_Code.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 21));
        JL_Code.setForeground(Color.white);
        add(JL_Code);
        JL_Code.setBounds(460, 120, 195, JL_Code.getPreferredSize().height);

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
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
