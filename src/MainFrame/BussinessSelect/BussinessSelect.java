/*
 * Created by JFormDesigner on Wed Dec 20 10:41:38 CST 2023
 */

package MainFrame.BussinessSelect;

import java.awt.event.*;
import java.util.*;
import MainFrame.MainFrame;

import java.awt.*;
import java.util.Timer;
import javax.swing.*;

/**
 * @author MJZ
 */
public class BussinessSelect extends JPanel {
    MainFrame FATHER;
    public BussinessSelect(MainFrame fa) {

        initComponents();

        FATHER=fa;
    }

    private void JB_Save(ActionEvent e) {
        // TODO add your code here
        FATHER.toSaving(this);
    }

    private void JB_Withdraw(ActionEvent e) {
        FATHER.toWithdraw(this);
    }

    private void JB_MoneyQuery(ActionEvent e) {
        FATHER.toQuery(this);

    }

    private void JB_RecordQuery(ActionEvent e) {
        FATHER.tolog(this);
    }

    private void JB_Transfer(ActionEvent e) {
        FATHER.toTransfer_admin(this);
    }

    private void JB_Other(ActionEvent e) {
        FATHER.toOther_page1(this);
    }

    private void JB_Password(ActionEvent e) {
        FATHER.toConfirm_pwd(this);
    }

    private void JB_Back(ActionEvent e) {
        FATHER.toAccountSelect(this);
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.BussinessSelect");
        JL_Hint = new JLabel();
        JB_Save = new JButton();
        JB_Withdraw = new JButton();
        JB_MoneyQuery = new JButton();
        JB_RecordQuery = new JButton();
        JB_Password = new JButton();
        JB_Transfer = new JButton();
        JB_Other = new JButton();
        JB_Back = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setPreferredSize(new Dimension(638, 422));
        setOpaque(false);
        setLayout(null);

        //---- JL_Hint ----
        JL_Hint.setText(bundle.getString("JL_Hint.text"));
        JL_Hint.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        JL_Hint.setForeground(Color.white);
        add(JL_Hint);
        JL_Hint.setBounds(225, 35, 215, JL_Hint.getPreferredSize().height);

        //---- JB_Save ----
        JB_Save.setText(bundle.getString("JB_Save.text"));
        JB_Save.addActionListener(e -> JB_Save(e));
        add(JB_Save);
        JB_Save.setBounds(new Rectangle(new Point(25, 95), JB_Save.getPreferredSize()));

        //---- JB_Withdraw ----
        JB_Withdraw.setText(bundle.getString("JB_Withdraw.text"));
        JB_Withdraw.addActionListener(e -> JB_Withdraw(e));
        add(JB_Withdraw);
        JB_Withdraw.setBounds(new Rectangle(new Point(25, 150), JB_Withdraw.getPreferredSize()));

        //---- JB_MoneyQuery ----
        JB_MoneyQuery.setText(bundle.getString("JB_MoneyQuery.text"));
        JB_MoneyQuery.addActionListener(e -> JB_MoneyQuery(e));
        add(JB_MoneyQuery);
        JB_MoneyQuery.setBounds(new Rectangle(new Point(25, 205), JB_MoneyQuery.getPreferredSize()));

        //---- JB_RecordQuery ----
        JB_RecordQuery.setText(bundle.getString("JB_RecordQuery.text"));
        JB_RecordQuery.addActionListener(e -> JB_RecordQuery(e));
        add(JB_RecordQuery);
        JB_RecordQuery.setBounds(new Rectangle(new Point(25, 260), JB_RecordQuery.getPreferredSize()));

        //---- JB_Password ----
        JB_Password.setText(bundle.getString("JB_Password.text"));
        JB_Password.addActionListener(e -> JB_Password(e));
        add(JB_Password);
        JB_Password.setBounds(new Rectangle(new Point(505, 260), JB_Password.getPreferredSize()));

        //---- JB_Transfer ----
        JB_Transfer.setText(bundle.getString("JB_Transfer.text"));
        JB_Transfer.addActionListener(e -> JB_Transfer(e));
        add(JB_Transfer);
        JB_Transfer.setBounds(new Rectangle(new Point(505, 150), JB_Transfer.getPreferredSize()));

        //---- JB_Other ----
        JB_Other.setText(bundle.getString("JB_Other.text"));
        JB_Other.addActionListener(e -> JB_Other(e));
        add(JB_Other);
        JB_Other.setBounds(new Rectangle(new Point(505, 205), JB_Other.getPreferredSize()));

        //---- JB_Back ----
        JB_Back.setText(bundle.getString("JB_Back.text"));
        JB_Back.addActionListener(e -> JB_Back(e));
        add(JB_Back);
        JB_Back.setBounds(new Rectangle(new Point(545, 320), JB_Back.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("JL_Timer.text"));
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 40, 170, 25);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("JL_Name.text"));
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Name.setForeground(Color.white);
        add(JL_Name);
        JL_Name.setBounds(470, 80, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("JL_Code.text"));
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
    private JLabel JL_Hint;
    private JButton JB_Save;
    private JButton JB_Withdraw;
    private JButton JB_MoneyQuery;
    private JButton JB_RecordQuery;
    private JButton JB_Password;
    private JButton JB_Transfer;
    private JButton JB_Other;
    private JButton JB_Back;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
