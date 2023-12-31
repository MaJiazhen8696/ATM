import javax.swing.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import MainFrame.MainFrame;
import global.global;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static {
        new global();
        Locale.setDefault(new Locale("en"));
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            ResourceBundle cfg=global.CONFIG;
            java.sql.Connection cnn = DriverManager.getConnection(cfg.getString("url"),cfg.getString("user"),cfg.getString("password"));
            global.CNN=cnn;
//            Statement st =  cnn.createStatement();
//            String sql="SELECT * FROM users";
//            ResultSet result = st.executeQuery(sql);
//            while(result.next()){
//                System.out.println(result.getObject("ID"));
//            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
    public static void main(String[] args) throws Exception {

        //通过mysql读入用户数据
        //会抛出异常记得处理
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        global.MF=new MainFrame();

        global.MF.setVisible(true);

    }

}