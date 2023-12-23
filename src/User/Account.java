package User;

import global.global;

import java.util.Date;
import java.util.List;

public class Account {
    public double Money;
    private String Name,ID;
    private List<Record> record;
    public Account(){




    }
    public boolean ChangeMoney(int op,double num,String id,int Source,String... S){
        if(op== global.Income){
            this.Money+=num;
            if(Source==global.FromCash){
                record.add(new Record(op,num,id,Source));
            }
            if(Source==global.FromTransfer){

            }

            return true;

        }
        if(op==global.Outcome){
            this.Money-=num;
            SetRecord();
            return true;
        }
        return false;
    }
    public double getMoney(){
        return Money;
    }
    private void SetRecord(){

    }
    public void getRecord(Date st){


    }
    public void getRecord(Date st,Date ed){


    }

    public boolean Payable(double cost){
        return Money>cost;
    }


}
