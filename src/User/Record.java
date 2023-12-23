package User;

import java.sql.Date;

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
    }

}
