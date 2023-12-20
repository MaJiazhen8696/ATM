package global;

import User.User;

import javax.swing.*;
import java.sql.Connection;
import java.util.Locale;
import java.util.ResourceBundle;

public class global {
    public static Locale LOCALE;//默认语言
    public static ResourceBundle CONFIG ;
    public static String URL;
    public static ResourceBundle BUNDLE;

    // 添加被吞卡条件
    public final static int Failed_Three_Times=1;
    public final static int AFK=2;
    public final  static  int SAFE=0;



    public final static int Savings = 1;
    public final static int Check  = 2;
    public final static int Credits = 3;

    public static String ID;
    public static Connection CNN;
    public static User USER;
    public global(){
        LOCALE=Locale.getDefault();
        CONFIG = ResourceBundle.getBundle("config.cfg");
        URL=CONFIG.getString("url");
        BUNDLE=ResourceBundle.getBundle("",LOCALE);
    }
    public static void Disable(JPanel p){
        p.setVisible(false);
        p.setEnabled(false);
    }
    public static void Enable(JPanel p){
        p.setEnabled(true);
        p.setVisible(true);
    }



}
