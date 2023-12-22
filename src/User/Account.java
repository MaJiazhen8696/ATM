package User;

public class Account {
    public double Money;
    private String Name,ID;
    public Account(){




    }
    public double getMoney(){
        return Money;
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
