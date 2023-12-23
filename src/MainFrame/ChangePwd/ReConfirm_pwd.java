/*
 * Created by JFormDesigner on Fri Dec 22 20:25:54 CST 2023
 */

package MainFrame.ChangePwd;

import java.awt.event.*;
import MainFrame.MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author m'm
 */
public class ReConfirm_pwd extends JPanel {
    MainFrame FATHER;
    public static String secondPwd;
    public ReConfirm_pwd(MainFrame fa) {
        FATHER=fa;
        initComponents();
        textField1.setText(null);
    }

    private void Confirm(ActionEvent e) {
        ReConfirm_pwd.secondPwd=textField1.getText();
        if(Confirm_pwd.firstPwd.equals(ReConfirm_pwd.secondPwd)){
            FATHER.toChange_success(this);
        }
        else{
            FATHER.toChange_failed(this);
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();

        //======== this ========
        setLayout(null);

        //---- label1 ----
        label1.setText("\u8bf7\u518d\u6b21\u8f93\u5165\u60a8\u7684\u65b0\u4e2a\u4eba\u5bc6\u7801");
        add(label1);
        label1.setBounds(135, 80, 255, label1.getPreferredSize().height);
        add(textField1);
        textField1.setBounds(135, 135, 185, textField1.getPreferredSize().height);

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> Confirm(e));
        add(button1);
        button1.setBounds(new Rectangle(new Point(390, 245), button1.getPreferredSize()));

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
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
