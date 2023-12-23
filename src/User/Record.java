package User;

import global.global;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class Record {
    private String From,To;
    private int Op;
    private double Amount,Balance;
    Date CurrentDate;
    Record(int op, String op1, String op2, double amount, java.sql.Date currentdate,double balance){
        Op=op;
        From=op1;
        To=op2;
        Amount=amount;
        CurrentDate=currentdate;
        Balance=balance;
        String sql="Select * from record";

        //String sql="Insert into record (op,op1,op2,amount,currentDate,balance) values(?,?,?,?,?,?)";
        try{
            Statement st=global.CNN.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet res=st.executeQuery(sql);
            res.moveToInsertRow();
            res.updateInt("op",op);
            res.updateString("op1",op1);
            res.updateString("op2",op2);
            res.updateDouble("amount",amount);
            res.updateDate("currentDate",currentdate);
            res.updateDouble("balance",balance);
            res.insertRow();
            st.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
