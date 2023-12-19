package global;

import java.util.Locale;
import java.util.ResourceBundle;

public class global {
    public static Locale LOCALE;//默认语言
    public static ResourceBundle CONFIG ;;
    public static String URL;
    public static ResourceBundle BUNDLE;
    public global(){
        LOCALE=Locale.getDefault();
        CONFIG = ResourceBundle.getBundle("config.cfg");
        URL=CONFIG.getString("url");
        BUNDLE=ResourceBundle.getBundle("lang.Login",LOCALE);
    }
    /*
    #
# Created by JFormDesigner on Fri Dec 15 15:30:25 CST 2023
#

Login.BT_Confirm.text=确认
Login.BT_Modify.text=更正
Login.label1.text=请输入密码
Login.JL_Failed.text=密码错误，
Login.JL_Failed.text2=次机会
Login.JL_Success=\u767B\u5F55\u6210\u529F





     */


}
