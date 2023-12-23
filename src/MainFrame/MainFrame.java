/*
 * Created by JFormDesigner on Fri Dec 15 15:29:42 CST 2023
 */

package MainFrame;

import Interval.Interval;
import MainFrame.AccountSelect.AccountSelect;
import MainFrame.BussinessSelect.BussinessSelect;
import MainFrame.ChangePwd.Change_failed;
import MainFrame.ChangePwd.Change_success;
import MainFrame.ChangePwd.Confirm_pwd;
import MainFrame.ChangePwd.ReConfirm_pwd;
import MainFrame.CommonBussiness.LOG.LOG;
import MainFrame.CommonBussiness.MoneyQuery.MoneyQuery;
import MainFrame.CommonBussiness.PrintReceipt.PrintReceipt;
import MainFrame.CommonBussiness.Saving.Confirm_Money;
import MainFrame.CommonBussiness.Saving.Saving;
import MainFrame.CommonBussiness.Withdraw.Withdraw;
import MainFrame.CommonBussiness.Withdraw.Withdraw_custom;
import MainFrame.CommonBussiness.Withdraw.Withdraw_failed;
import MainFrame.CommonBussiness.Withdraw.Withdraw_success;
import MainFrame.Login.Login;
import MainFrame.CommonBussiness.Other.Other_page1;
import MainFrame.CommonBussiness.Other.Other_page2;
import MainFrame.CommonBussiness.Other.Other_page3;
import MainFrame.RetainCard.RetainCard;
import MainFrame.CommonBussiness.Transfer.Transfer_admin;
import MainFrame.CommonBussiness.Transfer.Transfer_failed;
import MainFrame.CommonBussiness.Transfer.Transfer_amount;
import MainFrame.CommonBussiness.Transfer.Transfer_success;
import MainFrame.Welcome.Welcome;
import MainFrame.takeCard.TakeCard;
import global.global;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    Withdraw_success withdraw_success = new Withdraw_success(this);
    Withdraw_custom withdraw_custom= new Withdraw_custom(this);
    MoneyQuery query = new MoneyQuery(this);
    Transfer_admin transfer_admin=new Transfer_admin(this);
    Transfer_amount transfer_amount =new Transfer_amount(this);
    Transfer_success transfer_success= new Transfer_success(this);
    Transfer_failed transfer_failed = new Transfer_failed(this);
    Other_page1 other_page1 = new Other_page1(this);
    Other_page2 other_page2 = new Other_page2(this);
    Other_page3 other_page3 = new Other_page3(this);
    Change_failed change_failed = new Change_failed(this);
    Change_success change_success = new Change_success(this);
    Confirm_pwd confirm_pwd = new Confirm_pwd(this);
    ReConfirm_pwd reConfirm_pwd=new ReConfirm_pwd(this);
    TakeCard takeCard= new TakeCard(this);
    RetainCard retainCard = new RetainCard(this);
    BussinessSelect bussinessSelect= new BussinessSelect(this);
    Saving saving = new Saving(this);
    Withdraw withdraw = new Withdraw(this);
    Confirm_Money confirmMoney=new Confirm_Money(this);
    PrintReceipt printReceipt = new PrintReceipt(this);
    AccountSelect accountSelect=new AccountSelect(this);
    LOG log=new LOG(this);
    Interval interval=new Interval(this);
    public MainFrame() {
        bundle = global.BUNDLE;
        initComponents();
        add(wel);add(login);
        add(retainCard);add(bussinessSelect);
        add(saving);add(accountSelect);add(confirmMoney);
        add(saving);
        add(withdraw);
        add(withdraw_failed);
        add(withdraw_success);
        add(withdraw_custom);
        add(query);
        add(transfer_admin);
        add(transfer_amount);
        add(transfer_success);
        add(transfer_failed);
        add(other_page1);
        add(other_page2);
        add(other_page3);
        add(confirm_pwd);
        add(reConfirm_pwd);
        add(change_success);
        add(change_failed);
        add(printReceipt);
        add(takeCard);
        add(saving);add(accountSelect);
        add(log);add(interval);

        add(saving);add(accountSelect);add(confirmMoney);
        global.Disable(bussinessSelect);
        global.Disable(login);
        global.Disable(retainCard);
        global.Disable(saving);
        global.Disable(withdraw);
        global.Disable(withdraw_failed);
        global.Disable(withdraw_success);
        global.Disable(withdraw_custom);
        global.Disable(query);
        global.Disable(transfer_admin);
        global.Disable(transfer_amount);
        global.Disable(transfer_success);
        global.Disable(transfer_failed);
        global.Disable(other_page1);
        global.Disable(other_page2);
        global.Disable(other_page3);
        global.Disable(accountSelect);
        global.Disable(confirmMoney);
        global.Disable(withdraw);
        global.Disable(withdraw_failed);
        global.Disable(confirm_pwd);
        global.Disable(reConfirm_pwd);
        global.Disable(change_failed);
        global.Disable(change_success);
        global.Disable(takeCard);
        global.Disable(log);
        global.Disable(interval);
        global.Disable(printReceipt);


        global.Enable(wel);


    }
    public void toLogin(JPanel p){
        global.Disable(p);
        global.Enable(login);
    }
    public void toInterval(JPanel p){
        global.Disable(p);
        global.Enable(interval);
        global.T=interval.JL_Time;
        interval.ST();

    }
    public void toSaving(JPanel p){
        global.Disable(p);
        global.Enable(saving);
        saving.Timer_Start();
    }
    public void toWithdraw_custom(JPanel p){
        global.Disable(p);
        global.Enable(withdraw_custom);


//        Timer counter = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                global.Enable(xxxx);
//                ((Timer)e.getSource()).stop();
//
//            }
//        });
//        counter.start();





    }
    public void toWithdraw(JPanel p){
        global.Disable(p);
        global.Enable(withdraw);
    }
    public void toWithdraw_failed(JPanel p){
        global.Disable(p);
        global.Enable(withdraw_failed);
    }
    public void tolog(JPanel p){
        global.Disable(p);
        global.Enable(log);
        log.Show();
    }
    public void toWithdraw_success(JPanel p){
        global.Disable(p);
        global.Enable(withdraw_success);
    }
    public void toSavingConfirm(JPanel p,int money){
        global.Disable(p);
        global.Enable(confirmMoney);
        confirmMoney.SetMoney(money);
    }
    public void toQuery(JPanel p){
        global.Disable(p);
        global.Enable(query);
        query.setMoney();
    }
    public void toTransfer_admin(JPanel p){
        global.Disable(p);
        global.Enable(transfer_admin);
    }
    public void toTransfer_amount(JPanel p){
        global.Disable(p);
        global.Enable(transfer_amount);
    }
    public void toTransfer_success(JPanel p){
        global.Disable(p);
        global.Enable(transfer_success);
    }

    public void toTransfer_failed(JPanel p){
        global.Disable(p);
        global.Enable(transfer_failed);
    }
    public void toOther_page1(JPanel p){
        global.Disable(p);
        global.Enable(other_page1);
    }
    public void toOther_page2(JPanel p){
        global.Disable(p);
        global.Enable(other_page2);
    }
    public void toOther_page3(JPanel p){
        global.Disable(p);
        global.Enable(other_page3);
    }
    public void toChange_failed(JPanel p){
        global.Disable(p);
        global.Enable(change_failed);
    }
    public void toChange_success(JPanel p){
        global.Disable(p);
        global.Enable(change_success);
    }
    public void toConfirm_pwd(JPanel p){
        global.Disable(p);
        global.Enable(confirm_pwd);
    }
    public void toReConfirm_pwd(JPanel p){
        global.Disable(p);
        global.Enable(reConfirm_pwd);
    }
    public void toTakeCard(JPanel p){
        global.Disable(p);
        global.Enable(takeCard);
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
    public void toAccountSelect(JPanel p){
        global.Disable(p);
        global.Enable(accountSelect);
    }
    public void toBussinessSelect(JPanel p){
        global.Disable(p);
        global.Enable(bussinessSelect);
    }
    public void toPrintReceipt(JPanel p){
        global.Disable(p);
        global.Enable(printReceipt);
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
