/*
 * Created by JFormDesigner on Wed Dec 20 15:57:47 CST 2023
 */

package MainFrame.AccountSelect;

import MainFrame.MainFrame;
import com.sun.tools.javac.Main;
import global.global;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * @author MJZ
 */
public class AccountSelect extends JPanel {
    private MainFrame Father ;

    public AccountSelect(MainFrame fa) {
        Father = fa;
        initComponents();
    }
    private void JB_Quit(ActionEvent e) {
        // TODO add your code here
        Father.Quit(this);
    }

    private void JB_CreditsAccount(ActionEvent e) {
        // TODO add your code here
        global.USER.SwitchAccount(global.Credits);
        Father.toBussinessSelect(this);
    }

    private void JB_SavingsAccount(ActionEvent e) {
        // TODO add your code here
        global.USER.SwitchAccount(global.Savings);
        Father.toBussinessSelect(this);
    }

    private void JB_CheckAccount(ActionEvent e) {
        // TODO add your code here
        global.USER.SwitchAccount(global.Check);
        Father.toBussinessSelect(this);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang");
        JL_Hint = new JLabel();
        JB_SavingsAccount = new JButton();
        JB_CheckAccount = new JButton();
        JB_CreditsAccount = new JButton();
        JB_Quit = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        setLayout(null);

        //---- JL_Hint ----
        JL_Hint.setText(bundle.getString("AccountSelect.JL_Hint.text"));
        JL_Hint.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        JL_Hint.setForeground(Color.white);
        JL_Hint.setHorizontalAlignment(SwingConstants.CENTER);
        add(JL_Hint);
        JL_Hint.setBounds(100, 30, 400, JL_Hint.getPreferredSize().height);

        //---- JB_SavingsAccount ----
        JB_SavingsAccount.setText(bundle.getString("AccountSelect.JB_SavingsAccount.text"));
        JB_SavingsAccount.addActionListener(e -> JB_SavingsAccount(e));
        add(JB_SavingsAccount);
        JB_SavingsAccount.setBounds(0, 180, 100, JB_SavingsAccount.getPreferredSize().height);

        //---- JB_CheckAccount ----
        JB_CheckAccount.setText(bundle.getString("AccountSelect.JB_CheckAccount.text"));
        JB_CheckAccount.addActionListener(e -> JB_CheckAccount(e));
        add(JB_CheckAccount);
        JB_CheckAccount.setBounds(0, 245, 100, JB_CheckAccount.getPreferredSize().height);

        //---- JB_CreditsAccount ----
        JB_CreditsAccount.setText(bundle.getString("AccountSelect.JB_CreditsAccount.text"));
        JB_CreditsAccount.addActionListener(e -> JB_CreditsAccount(e));
        add(JB_CreditsAccount);
        JB_CreditsAccount.setBounds(538, 200, 100, JB_CreditsAccount.getPreferredSize().height);

        //---- JB_Quit ----
        JB_Quit.setText(bundle.getString("AccountSelect.JB_Quit.text"));
        JB_Quit.addActionListener(e -> JB_Quit(e));
        add(JB_Quit);
        JB_Quit.setBounds(558, 370, 80, JB_Quit.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("AccountSelect.JL_Timer.text"));
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 0, 170, 25);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("AccountSelect.JL_Name.text"));
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
        JL_Name.setForeground(Color.white);
        JL_Name.setHorizontalAlignment(SwingConstants.RIGHT);
        add(JL_Name);
        JL_Name.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("AccountSelect.JL_Code.text"));
        JL_Code.setForeground(Color.white);
        JL_Code.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 21));
        add(JL_Code);
        JL_Code.setBounds(0, 395, 195, JL_Code.getPreferredSize().height);

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
    private JButton JB_SavingsAccount;
    private JButton JB_CheckAccount;
    private JButton JB_CreditsAccount;
    private JButton JB_Quit;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
