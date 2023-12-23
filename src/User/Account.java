package User;

import global.global;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    public double Money;
    public String Name,ID;
    private List<Record> record=new ArrayList<>();
    public Account(String id,double money){
        ID=id;
        Money=money;
        Name=null;
    }
    public String getAccountID(){
        return ID;
    }
    public boolean ChangeMoney(int op, String op1, String op2, double amount){

        //存钱和取钱 op2==null
        String flag=null;
        char qt='\'';

        if(ID.startsWith("SA"))
            flag="Savings_Account";
        if(ID.startsWith("CA"))
            flag="Credits_Account";
        if(ID.startsWith("CB"))
            flag="Check_Account";


        java.sql.Date currentdate=new java.sql.Date(System.currentTimeMillis());
        if(op== global.Income){
            this.Money+=amount;
            if(op2==null){
                record.add(new Record(global.Saving, op1,null,amount,currentdate,Money));
            }
            else{
                //转入 op1被op2转入
                record.add(new Record(global.Transer_in, op1,op2,amount,currentdate,Money));
            }
            String sql="update useraccounts " +
                    "set "+ flag+"_money ="+Money+" " +
                    "where ID="+qt+ID.substring(2)+qt+";";

            System.out.println(sql);
            try{
                global.ST.execute(sql);

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            return true;

        }
        if(op==global.Outcome){
            this.Money-=amount;
            if(op2==null){
                record.add(new Record(global.Taken, op1,null,amount,currentdate,Money));
            }
            else{//op1转入op2 Money钱
                record.add(new Record(global.Transer_out, op1,op2,amount,currentdate,Money));
            }
            String sql="update useraccounts " +
                    "set "+ flag+"_money ="+Money+" " +
                    "where ID="+qt+ ID.substring(2)+qt+";";

            System.out.println(sql);
            try{
                global.ST.execute(sql);

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            return true;
        }
        return false;
    }


}
