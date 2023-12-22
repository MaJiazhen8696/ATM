/*
 * Created by JFormDesigner on Fri Dec 15 15:29:42 CST 2023
 */

package MainFrame;

import java.awt.*;
import javax.swing.*;

/**
 * @author MJZ
 */
public class MainFrame extends JFrame {

    Welcome wel=new Welcome(this);
    Login login=new Login(this);
    Login test;
    public MainFrame() {
        initComponents();
        add(wel);add(login);
        wel.setEnabled(true);
        login.setEnabled(false);
    }
    public void toLogin(JPanel p){
        p.setEnabled(false);
        login.setEnabled(true);
    }
    public void RetainCard(){

    }
    public void toWelcome(){

    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        //======== this ========
        setPreferredSize(new Dimension(800, 600));
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on


    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
