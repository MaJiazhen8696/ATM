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
        ResourceBundle bundle = ResourceBundle.getBundle("lang.AccountSelect");
        JL_Hint = new JLabel();
        JB_SavingsAccount = new JButton();
        JB_CheckAccount = new JButton();
        JB_CreditsAccount = new JButton();
        JB_Quit = new JButton();

        //======== this ========
        setOpaque(false);
        setLayout(null);

        //---- JL_Hint ----
        JL_Hint.setText(bundle.getString("JL_Hint.text"));
        JL_Hint.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 28));
        add(JL_Hint);
        JL_Hint.setBounds(280, 80, 165, JL_Hint.getPreferredSize().height);

        //---- JB_SavingsAccount ----
        JB_SavingsAccount.setText(bundle.getString("JB_SavingsAccount.text"));
        JB_SavingsAccount.setPreferredSize(new Dimension(120, 30));
        JB_SavingsAccount.addActionListener(e -> JB_SavingsAccount(e));
        add(JB_SavingsAccount);
        JB_SavingsAccount.setBounds(new Rectangle(new Point(40, 180), JB_SavingsAccount.getPreferredSize()));

        //---- JB_CheckAccount ----
        JB_CheckAccount.setText(bundle.getString("JB_CheckAccount.text"));
        JB_CheckAccount.setPreferredSize(new Dimension(120, 30));
        JB_CheckAccount.addActionListener(e -> JB_CheckAccount(e));
        add(JB_CheckAccount);
        JB_CheckAccount.setBounds(new Rectangle(new Point(40, 245), JB_CheckAccount.getPreferredSize()));

        //---- JB_CreditsAccount ----
        JB_CreditsAccount.setText(bundle.getString("JB_CreditsAccount.text"));
        JB_CreditsAccount.addActionListener(e -> JB_CreditsAccount(e));
        add(JB_CreditsAccount);
        JB_CreditsAccount.setBounds(545, 200, 120, 30);

        //---- JB_Quit ----
        JB_Quit.setText(bundle.getString("JB_Quit.text"));
        JB_Quit.addActionListener(e -> JB_Quit(e));
        add(JB_Quit);
        JB_Quit.setBounds(new Rectangle(new Point(580, 370), JB_Quit.getPreferredSize()));

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
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
