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
    ResourceBundle bundle=ResourceBundle.getBundle("lang.Saving");
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
        JL_Success = new JLabel();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(800, 600));
        setLayout(null);

        //---- label1 ----
        label1.setText(bundle.getString("Saving.Confirm_Money.label1.text"));
        add(label1);
        label1.setBounds(180, 55, 105, label1.getPreferredSize().height);

        //======== JP_Table ========
        {
            JP_Table.setPreferredSize(new Dimension(200, 100));
            JP_Table.setLayout(new GridLayout(2, 3));

            //---- JL_MoneyValue ----
            JL_MoneyValue.setText(bundle.getString("Saving.Confirm_Money.JL_MoneyValue.text"));
            JP_Table.add(JL_MoneyValue);

            //---- JL_MoneyCount ----
            JL_MoneyCount.setText(bundle.getString("Saving.Confirm_Money.JL_MoneyCount.text"));
            JP_Table.add(JL_MoneyCount);

            //---- JL_MoneyTotal ----
            JL_MoneyTotal.setText(bundle.getString("Saving.Confirm_Money.JL_MoneyTotal.text"));
            JP_Table.add(JL_MoneyTotal);

            //---- JL_Value ----
            JL_Value.setText(bundle.getString("Saving.Confirm_Money.JL_Value.text"));
            JP_Table.add(JL_Value);
            JP_Table.add(JL_Count);
            JP_Table.add(JL_Total);
        }
        add(JP_Table);
        JP_Table.setBounds(120, 120, 265, JP_Table.getPreferredSize().height);

        //---- JB_Confirm ----
        JB_Confirm.setText(bundle.getString("Saving.Confirm_Money.JB_Confirm.text"));
        JB_Confirm.addActionListener(e -> JB_Confirm(e));
        add(JB_Confirm);
        JB_Confirm.setBounds(new Rectangle(new Point(415, 215), JB_Confirm.getPreferredSize()));

        //---- JB_Cancel ----
        JB_Cancel.setText(bundle.getString("Saving.Confirm_Money.JB_Cancel.text"));
        add(JB_Cancel);
        JB_Cancel.setBounds(new Rectangle(new Point(415, 255), JB_Cancel.getPreferredSize()));

        //---- JL_Success ----
        JL_Success.setText(bundle.getString("Saving.Confirm_Money.JL_Success.text"));
        add(JL_Success);
        JL_Success.setBounds(150, 240, 70, JL_Success.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Saving.Confirm_Money.JL_Timer.text"));
        add(JL_Timer);
        JL_Timer.setBounds(445, 20, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("Saving.Confirm_Money.JL_Name.text"));
        add(JL_Name);
        JL_Name.setBounds(445, 50, 125, JL_Name.getPreferredSize().height);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("Saving.Confirm_Money.JL_Code.text"));
        add(JL_Code);
        JL_Code.setBounds(435, 80, 125, JL_Code.getPreferredSize().height);

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