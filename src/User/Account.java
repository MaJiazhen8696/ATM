package User;

import global.global;

public class Account {
    public double Money;
    private String Name,ID;
    public Account(){




    }
    public boolean ChangeMoney(int op,double num,String id,int Source){
        if(op== global.Income){
            this.Money+=num;
            SetRecord();
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
    public void get_PayRecord(){


    }
    public boolean Payable(double cost){
        return Money>cost;
    }

    public boolean Cost(double cost){
        if(Payable(cost)){
            Money-=cost;
            return true;
        }
        return false;
    }

}
