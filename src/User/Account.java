package User;

public class Account {
    public double Money;
    public String Name,ID;
    public Account(){
        this.Money=200;
        this.Name="cfs";
        this.ID="01210013";

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
