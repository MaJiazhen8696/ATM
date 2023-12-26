package User;

import global.global;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class User {

    private List<String> record;
    public Account CurrentAccount;
    private Account Savings_Account, Credits_Account, Check_Account;
    private String ID;
    public  String Name;
    public User(String id){
        ID=id;
        try {

            String sql = "SELECT * FROM useraccounts where ID =" + id;
            ResultSet result = global.ST.executeQuery(sql);
            if(result.next()){
                Savings_Account= new Account(
                        result.getString("Savings_Account"),
                        result.getDouble("Savings_Account_money"));
                Credits_Account= new Account(
                        result.getString("Credits_Account"),
                        result.getDouble("Credits_Account_money"));
                Check_Account= new Account(
                        result.getString("Check_Account"),
                        result.getDouble("Check_Account_money"));
                }
                Name=result.getString("Name");
            }catch (Exception e){

        }


    }
    public void SwitchAccount(int op){
        switch (op){
            case global.Savings :{
                CurrentAccount=Savings_Account;
                break;
            }
            case global.Check:{
                CurrentAccount=Check_Account;
                break;
            }
            case global.Credits:{
                CurrentAccount=Credits_Account;
                break;
            }
            default: break;
        }
    }
    public String getID(){
        return ID;
    }
    public void changePWD(String s){
        char qt='\'';
        String sql="update useraccounts set password ="+qt+s+qt+"where ID="+ID;
        try{
            global.ST.execute(sql);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
