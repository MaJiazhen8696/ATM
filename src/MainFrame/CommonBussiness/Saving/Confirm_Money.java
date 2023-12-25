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
import javax.swing.Timer;

/**
 * @author MJZ
 */
public class Confirm_Money extends JPanel {
    MainFrame Father ;
    JPanel THIS;
    ResourceBundle bundle=ResourceBundle.getBundle("lang");
    private int MoneyCount=0,MoneyTotal=0;
    public Confirm_Money(MainFrame fa) {

        initComponents();
        Father = fa;
        THIS=this;

    }

    private void JB_Confirm(ActionEvent e) {
        global.USER.CurrentAccount.ChangeMoney(global.Income,global.USER.CurrentAccount.getAccountID(),null,MoneyTotal);
        MoneyCount=0;MoneyTotal=0;
        Timer counter = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JL_Success.setVisible(true);
                Father.toBussinessSelect(THIS);
                ((Timer)e.getSource()).stop();

            }
        });
        counter.start();

    }
    public void SetMoney(int cnt){
        MoneyCount=cnt;
        MoneyTotal=cnt*100;
        JL_Count.setText(MoneyCount+bundle.getString("Saving.Confirm_Money.JL_Count.text"));
        JL_Total.setText(MoneyTotal+bundle.getString("Saving.Confirm_Money.JL_Total.text"));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang");
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
        JL_Success = new JLabel();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(638, 422));
        setOpaque(false);
        setLayout(null);

        //---- label1 ----
        label1.setText(bundle.getString("Saving.Confirm_Money.label1.text"));
        label1.setForeground(Color.white);
        label1.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 28));
        add(label1);
        label1.setBounds(200, 30, 230, label1.getPreferredSize().height);

        //======== JP_Table ========
        {
            JP_Table.setPreferredSize(new Dimension(200, 100));
            JP_Table.setOpaque(false);
            JP_Table.setLayout(new GridLayout(2, 3));

            //---- JL_MoneyValue ----
            JL_MoneyValue.setText(bundle.getString("Saving.Confirm_Money.JL_MoneyValue.text"));
            JL_MoneyValue.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_MoneyValue.setHorizontalAlignment(SwingConstants.CENTER);
            JL_MoneyValue.setForeground(Color.white);
            JL_MoneyValue.setBackground(Color.white);
            JP_Table.add(JL_MoneyValue);

            //---- JL_MoneyCount ----
            JL_MoneyCount.setText(bundle.getString("Saving.Confirm_Money.JL_MoneyCount.text"));
            JL_MoneyCount.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_MoneyCount.setHorizontalAlignment(SwingConstants.CENTER);
            JL_MoneyCount.setForeground(Color.white);
            JL_MoneyCount.setBackground(Color.white);
            JP_Table.add(JL_MoneyCount);

            //---- JL_MoneyTotal ----
            JL_MoneyTotal.setText(bundle.getString("Saving.Confirm_Money.JL_MoneyTotal.text"));
            JL_MoneyTotal.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_MoneyTotal.setHorizontalAlignment(SwingConstants.CENTER);
            JL_MoneyTotal.setForeground(Color.white);
            JL_MoneyTotal.setBackground(Color.white);
            JP_Table.add(JL_MoneyTotal);

            //---- JL_Value ----
            JL_Value.setText(bundle.getString("Saving.Confirm_Money.JL_Value.text"));
            JL_Value.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 19));
            JL_Value.setHorizontalAlignment(SwingConstants.CENTER);
            JL_Value.setForeground(Color.white);
            JL_Value.setBackground(Color.white);
            JP_Table.add(JL_Value);

            //---- JL_Count ----
            JL_Count.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_Count.setHorizontalAlignment(SwingConstants.CENTER);
            JL_Count.setForeground(Color.white);
            JL_Count.setBackground(Color.white);
            JP_Table.add(JL_Count);

            //---- JL_Total ----
            JL_Total.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
            JL_Total.setHorizontalAlignment(SwingConstants.CENTER);
            JL_Total.setForeground(Color.white);
            JL_Total.setBackground(Color.white);
            JP_Table.add(JL_Total);
        }
        add(JP_Table);
        JP_Table.setBounds(135, 125, 335, 170);

        //---- JB_Confirm ----
        JB_Confirm.setText(bundle.getString("Saving.Confirm_Money.JB_Confirm.text"));
        JB_Confirm.addActionListener(e -> JB_Confirm(e));
        add(JB_Confirm);
        JB_Confirm.setBounds(new Rectangle(new Point(540, 290), JB_Confirm.getPreferredSize()));

        //---- JB_Cancel ----
        JB_Cancel.setText(bundle.getString("Saving.Confirm_Money.JB_Cancel.text"));
        add(JB_Cancel);
        JB_Cancel.setBounds(new Rectangle(new Point(540, 330), JB_Cancel.getPreferredSize()));

        //---- JL_Success ----
        JL_Success.setText(bundle.getString("Saving.Confirm_Money.JL_Success.text"));
        JL_Success.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 28));
        JL_Success.setForeground(Color.white);
        JL_Success.setHorizontalAlignment(SwingConstants.CENTER);
        add(JL_Success);
        JL_Success.setBounds(240, 360, 145, JL_Success.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Saving.Confirm_Money.JL_Timer.text"));
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 0, 170, 25);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("Saving.Confirm_Money.JL_Name.text"));
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Name.setForeground(Color.white);
        add(JL_Name);
        JL_Name.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("Saving.Confirm_Money.JL_Code.text"));
        JL_Code.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 21));
        JL_Code.setForeground(Color.white);
        add(JL_Code);
        JL_Code.setBounds(460, 80, 195, JL_Code.getPreferredSize().height);

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
    private JLabel JL_Success;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}