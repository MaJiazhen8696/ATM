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
        button1 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u53d6\u6b3e\u6210\u529f!!!!!");
        add(label1);
        label1.setBounds(165, 75, 170, label1.getPreferredSize().height);

        //---- JB_Back ----
        JB_Back.setText("\u8fd4\u56de");
        JB_Back.addActionListener(e -> JB_Back(e));
        add(JB_Back);
        JB_Back.setBounds(new Rectangle(new Point(385, 275), JB_Back.getPreferredSize()));

        //---- JB_Print ----
        JB_Print.setText("\u6253\u5370\u51ed\u6761");
        JB_Print.addActionListener(e -> JB_Print(e));
        add(JB_Print);
        JB_Print.setBounds(new Rectangle(new Point(380, 220), JB_Print.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText("text");
        add(JL_Timer);
        JL_Timer.setBounds(430, 70, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText("text");
        add(JL_Name);
        JL_Name.setBounds(430, 100, 125, JL_Name.getPreferredSize().height);

        //---- JL_Code ----
        JL_Code.setText("\u673a\u5668\u53f7\uff1aCUMT2023");
        add(JL_Code);
        JL_Code.setBounds(420, 130, 125, JL_Code.getPreferredSize().height);

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
    private JButton button1;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
