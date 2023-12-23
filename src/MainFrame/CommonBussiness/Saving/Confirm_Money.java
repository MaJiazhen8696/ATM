/*
 * Created by JFormDesigner on Thu Dec 21 13:29:41 CST 2023
 */

package MainFrame.CommonBussiness.Saving;

import java.awt.event.*;
import MainFrame.MainFrame;
import global.global;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * @author MJZ
 */
public class Confirm_Money extends JPanel {
    MainFrame Father ;
    ResourceBundle bundle=ResourceBundle.getBundle("lang.Saving");
    private int MoneyCount=0,MoneyTotal=0;
    public Confirm_Money(MainFrame fa) {

        initComponents();
        Father = fa;

        
    }

    private void JB_Confirm(ActionEvent e) {
        global.USER.CurrentAccount.Money+=MoneyTotal;
    }
    public void SetMoney(int cnt){
        MoneyCount=cnt;
        MoneyTotal=cnt*100;
        JL_Count.setText(MoneyCount+bundle.getString("Saving.Confirm_Money.JL_Count.text"));
        JL_Total.setText(MoneyTotal+bundle.getString("Saving.Confirm_Money.JL_Total.text"));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Saving");
        label1 = new JLabel();
        JP_Table = new JPanel();
        JL_MoneyValue = new JLabel();
        JL_MoneyCount = new JLabel();
        JL_MoneyTotal = new JLabel();
        JL_Value = new JLabel();
        JL_Count = new JLabel();
        JL_Total = new JLabel();
        JB_Confirm = new JButton();
        JB_Cancel = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(638, 422));
        setOpaque(false);
        setForeground(Color.black);
        setLayout(null);

        //---- label1 ----
        label1.setText(bundle.getString("Saving.Confirm_Money.label1.text"));
        label1.setForeground(Color.white);
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 28));
        add(label1);
        label1.setBounds(180, 55, 230, label1.getPreferredSize().height);

        //======== JP_Table ========
        {
            JP_Table.setPreferredSize(new Dimension(200, 100));
            JP_Table.setLayout(new GridLayout(2, 3));

            //---- JL_MoneyValue ----
            JL_MoneyValue.setText(bundle.getString("Saving.Confirm_Money.JL_MoneyValue.text"));
            JL_MoneyValue.setHorizontalAlignment(SwingConstants.CENTER);
            JL_MoneyValue.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_MoneyValue.setForeground(Color.black);
            JP_Table.add(JL_MoneyValue);

            //---- JL_MoneyCount ----
            JL_MoneyCount.setText(bundle.getString("Saving.Confirm_Money.JL_MoneyCount.text"));
            JL_MoneyCount.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_MoneyCount.setHorizontalAlignment(SwingConstants.CENTER);
            JL_MoneyCount.setForeground(Color.black);
            JP_Table.add(JL_MoneyCount);

            //---- JL_MoneyTotal ----
            JL_MoneyTotal.setText(bundle.getString("Saving.Confirm_Money.JL_MoneyTotal.text"));
            JL_MoneyTotal.setHorizontalAlignment(SwingConstants.CENTER);
            JL_MoneyTotal.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_MoneyTotal.setForeground(Color.black);
            JP_Table.add(JL_MoneyTotal);

            //---- JL_Value ----
            JL_Value.setText(bundle.getString("Saving.Confirm_Money.JL_Value.text"));
            JL_Value.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 19));
            JL_Value.setForeground(Color.black);
            JP_Table.add(JL_Value);

            //---- JL_Count ----
            JL_Count.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_Count.setForeground(Color.black);
            JL_Count.setHorizontalAlignment(SwingConstants.CENTER);
            JP_Table.add(JL_Count);

            //---- JL_Total ----
            JL_Total.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_Total.setForeground(Color.black);
            JL_Total.setHorizontalAlignment(SwingConstants.CENTER);
            JP_Table.add(JL_Total);
        }
        add(JP_Table);
        JP_Table.setBounds(120, 120, 345, 165);

        //---- JB_Confirm ----
        JB_Confirm.setText(bundle.getString("Saving.Confirm_Money.JB_Confirm.text"));
        JB_Confirm.addActionListener(e -> JB_Confirm(e));
        add(JB_Confirm);
        JB_Confirm.setBounds(new Rectangle(new Point(540, 305), JB_Confirm.getPreferredSize()));

        //---- JB_Cancel ----
        JB_Cancel.setText(bundle.getString("Saving.Confirm_Money.JB_Cancel.text"));
        add(JB_Cancel);
        JB_Cancel.setBounds(new Rectangle(new Point(540, 345), JB_Cancel.getPreferredSize()));

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
    private JPanel JP_Table;
    private JLabel JL_MoneyValue;
    private JLabel JL_MoneyCount;
    private JLabel JL_MoneyTotal;
    private JLabel JL_Value;
    private JLabel JL_Count;
    private JLabel JL_Total;
    private JButton JB_Confirm;
    private JButton JB_Cancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
