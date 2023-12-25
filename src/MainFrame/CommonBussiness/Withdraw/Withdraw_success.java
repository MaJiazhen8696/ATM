/*
 * Created by JFormDesigner on Fri Dec 22 16:42:44 CST 2023
 */

package MainFrame.CommonBussiness.Withdraw;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class Withdraw_success extends JPanel {
    MainFrame FATHER;
    public Withdraw_success(MainFrame fa) {
        initComponents();
        FATHER=fa;
    }

    private void JB_Back(ActionEvent e) {
        FATHER.toBussinessSelect(this);
    }

    private void JB_Print(ActionEvent e) {
        FATHER.toPrintReceipt(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        JB_Back = new JButton();
        JB_Print = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setLayout(null);

        //---- label1 ----
        label1.setText("\u53d6\u6b3e\u6210\u529f!!!!!");
        label1.setForeground(Color.white);
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 36));
        add(label1);
        label1.setBounds(180, 170, 265, label1.getPreferredSize().height);

        //---- JB_Back ----
        JB_Back.setText("\u8fd4\u56de");
        JB_Back.addActionListener(e -> JB_Back(e));
        add(JB_Back);
        JB_Back.setBounds(540, 330, 80, JB_Back.getPreferredSize().height);

        //---- JB_Print ----
        JB_Print.setText("\u6253\u5370\u51ed\u6761");
        JB_Print.addActionListener(e -> JB_Print(e));
        add(JB_Print);
        JB_Print.setBounds(540, 290, 80, JB_Print.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText("text");
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
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
    private JLabel label1;
    private JButton JB_Back;
    private JButton JB_Print;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
