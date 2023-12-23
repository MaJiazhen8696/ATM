package User;

public class Record {
    private String ID,Source_1;

    private double Num;
    private int OP,Source;
    Record(int op,double num,String id,int source){
        OP=op;
        Num=num;
        ID=id;
        Source=source;
    }
    Record(int op,double num,String id,int source,String S){
        OP=op;
        Num=num;
        ID=id;
        Source=source;
    }
}
