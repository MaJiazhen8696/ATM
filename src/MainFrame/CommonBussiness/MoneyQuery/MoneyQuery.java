/*
 * Created by JFormDesigner on Fri Dec 22 17:02:39 CST 2023
 */

package MainFrame.CommonBussiness.MoneyQuery;

import java.awt.event.*;
import MainFrame.MainFrame;
import global.global;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class MoneyQuery extends JPanel {
    MainFrame FATHER;
    public MoneyQuery(MainFrame fa) {
        FATHER=fa;
        initComponents();
    }
    public void setMoney(){
        label2.setText(Double.toString(global.USER.CurrentAccount.Money));
    }

    private void BT_Back(ActionEvent e) {
        FATHER.toBussinessSelect(this);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u8d26\u6237\u4f59\u989d\uff1a");
        add(label1);
        label1.setBounds(new Rectangle(new Point(85, 130), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("text");
        add(label2);
        label2.setBounds(190, 130, 90, label2.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u8fd4\u56de");
        button1.addActionListener(e -> BT_Back(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(105, 265), button1.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText("text");
        add(JL_Timer);
        JL_Timer.setBounds(465, 20, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText("text");
        add(JL_Name);
        JL_Name.setBounds(465, 50, 125, JL_Name.getPreferredSize().height);

        //---- JL_Code ----
        JL_Code.setText("\u673a\u5668\u53f7\uff1aCUMT2023");
        add(JL_Code);
        JL_Code.setBounds(455, 80, 125, JL_Code.getPreferredSize().height);

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
    private JLabel label2;
    private JButton button1;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
