/*
 * Created by JFormDesigner on Fri Dec 15 15:29:42 CST 2023
 */

package MainFrame;

import MainFrame.BussinessSelect.BussinessSelect;
import MainFrame.CommonBussiness.Saving.Saving;
import MainFrame.CommonBussiness.Withdraw.Withdraw;
import MainFrame.CommonBussiness.Withdraw.Withdraw_failed;
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
    Withdraw_failed withdraw_failed = new Withdraw_failed(this);
    RetainCard retainCard = new RetainCard(this);
    BussinessSelect bussinessSelect= new BussinessSelect(this);
    Saving saving = new Saving(this);
    Withdraw withdraw = new Withdraw(this);
    public MainFrame() {
        bundle = global.BUNDLE;
        initComponents();
        add(wel);add(login);
        add(retainCard);add(bussinessSelect);
        add(saving);
        add(withdraw);
        add(withdraw_failed);
        global.Disable(bussinessSelect);
        global.Disable(login);
        global.Disable(retainCard);
        global.Disable(saving);
        global.Disable(withdraw);
        global.Disable(withdraw_failed);
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
    public void toWithdraw(JPanel p){
        global.Disable(p);
        global.Enable(withdraw);
    }
    public void toWithdraw_failed(JPanel p){
        global.Disable(p);
        global.Enable(withdraw_failed);
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
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
