package User;

import global.global;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class User {

    private List<String> record;
    public Account CurrentAccount;
    private Account Savings_Account, Credits_Account, Check_Account;
    public User(String id, Connection cnn){
        global.ID=id;
        global.CNN=cnn;
        try {
            Statement st = cnn.createStatement();
            String sql = "SELECT * FROM users where ID =" +id;
            ResultSet result = st.executeQuery(sql);
            if (result.next()) {
                //
            }
        }catch(Exception e){
            ;
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
    public boolean Refresh(){

        return true;
    }


}
