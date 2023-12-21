/*
 * Created by JFormDesigner on Fri Dec 15 15:29:42 CST 2023
 */

package MainFrame;

import MainFrame.BussinessSelect.BussinessSelect;
import MainFrame.CommonBussiness.Saving.Saving;
import MainFrame.Login.Login;
import MainFrame.RetainCard.RetainCard;
import MainFrame.Welcome.Welcome;
import global.global;

import java.awt.*;
import java.util.ResourceBundle;
import javax.swing.*;

/**
 * @author MJZ
 */
public class MainFrame extends JFrame {
    public static int ST;
    private ResourceBundle bundle ;
    Welcome wel=new Welcome(this);
    Login login=new Login(this);
    RetainCard retainCard = new RetainCard(this);
    BussinessSelect bussinessSelect= new BussinessSelect(this);
    Saving saving = new Saving(this);
    public MainFrame() {
        bundle = global.BUNDLE;
        initComponents();
        add(wel);add(login);
        add(retainCard);add(bussinessSelect);
        add(saving);
        global.Disable(bussinessSelect);
        global.Disable(login);
        global.Disable(retainCard);
        global.Disable(saving);


        global.Enable(wel);

    }
    public void toLogin(JPanel p){
        global.Disable(p);
        global.Enable(login);
    }
    public void toSaving(JPanel p){
        global.Disable(p);
        global.Enable(saving);
        saving.Timer_Start();
    }
    public void RetainCard(JPanel p,int ERROR_CODE){
        if(ERROR_CODE!=global.SAFE){
            global.Disable(p);
            global.Enable(retainCard);
            retainCard.Show(ERROR_CODE);
        }
    }
    public void toWelcome(){

    }
    public void Quit(JPanel p){

    }
    public void toBussinessSelect(JPanel p){
        global.Disable(p);
        global.Enable(bussinessSelect);
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        //======== this ========
        setPreferredSize(new Dimension(800, 600));
        var contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}