package global;

import MainFrame.MainFrame;
import User.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;

public class global {
    public static Locale LOCALE;//默认语言
    public static ResourceBundle CONFIG ;
    public static String URL;
    public static ResourceBundle BUNDLE;

    // 添加被吞卡条件
    public final static int Failed_Three_Times=1;
    public final static int AFK=2;
    public final  static  int SAFE=0;
    public static MainFrame MF;


    public final static int Savings = 1;
    public final static int Check  = 2;
    public final static int Credits = 3;

    public final static int Income = 1;
    public final static int Outcome = 2;
    public final static int Saving = 1;
    public final static int Taken = 2;
    public final static int Transer_in = 3;
    public final static int Transer_out = 4;
    public static String ID;
    public static Connection CNN;
    public static User USER;
    public static Statement ST;
    public static Calendar calendar= Calendar.getInstance();
    public static SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    public static JLabel T;
    public static JLabel NM;
    public global(){

        LOCALE=Locale.getDefault();
        CONFIG = ResourceBundle.getBundle("config.cfg");
        URL=CONFIG.getString("url");
        //BUNDLE=ResourceBundle.getBundle("",LOCALE);

        java.util.Timer counter = new java.util.Timer();

        counter.schedule(new TimerTask() {
            public void run() {

                //System.out.print(1);
                if(T!=null) T.setText(dateFormat.format(new Date()));
//                if(NM!=null&&USER!=null){
//                    NM.setText("name");
//                }

            }
        },0,33);
    }
    public static void Disable(JPanel p){
        p.setVisible(false);
        p.setEnabled(false);
    }
    public static void Enable(JPanel p){
        p.setEnabled(true);
        p.setVisible(true);
    }
    public static void Change(){
        MF.dispose();
        MF=new MainFrame();
        MF.setVisible(true);
    }


}
