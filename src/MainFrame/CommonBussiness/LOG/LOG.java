/*
 * Created by JFormDesigner on Sat Dec 23 21:06:42 CST 2023
 */

package MainFrame.CommonBussiness.LOG;

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import MainFrame.MainFrame;
import User.Record;
import global.global;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author MJZ
 */
public class LOG extends JPanel {
    MainFrame Father ;
    List<Record>records=new ArrayList<>();
    String[][] val=new String[10][3];

    ResourceBundle bundle=ResourceBundle.getBundle("lang.Saving");
    String[] Names={bundle.getString("LOG.JT_COL1.text"),
            bundle.getString("LOG.JT_COL2.text"),
            bundle.getString("LOG.JT_COL3.text")
    };
    public LOG(MainFrame fa) {
        Father=fa;

    }
    public void Show(){
        char qt='\'';
        String sql="Select * from record where op1 = '"+global.USER.CurrentAccount.getAccountID()+"'  "+
                "order by currentDate DESC";
        System.out.println(sql);
        try{
            ResultSet res= global.ST.executeQuery(sql);

            for(int i=0;i<10;i++){
                if(res.next()){
                    //日期 金额 余
                    val[i][0]=String.valueOf(res.getDate("currentDate"));
                    val[i][1]= String.valueOf(res.getDouble("amount"));
                    val[i][2]= String.valueOf(res.getDouble("balance"));
                }
                else break;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        initComponents();


    }

    private void JB_Back(ActionEvent e) {
        Father.toBussinessSelect(this);
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Saving");
        SP = new JScrollPane();
        JT = new JTable();
        JB_Card = new JButton();
        JB_Back = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setLayout(null);

        //======== SP ========
        {
            SP.setViewportView(JT);
        }
        add(SP);
        SP.setBounds(90, 110, 295, 145);

        //---- JB_Card ----
        JB_Card.setText(bundle.getString("LOG.JB_Card.text"));
        add(JB_Card);
        JB_Card.setBounds(new Rectangle(new Point(5, 320), JB_Card.getPreferredSize()));

        //---- JB_Back ----
        JB_Back.setText(bundle.getString("LOG.JB_Back.text"));
        JB_Back.addActionListener(e -> JB_Back(e));
        add(JB_Back);
        JB_Back.setBounds(new Rectangle(new Point(440, 315), JB_Back.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("LOG.JL_Timer.text"));
        add(JL_Timer);
        JL_Timer.setBounds(530, 30, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("LOG.JL_Name.text"));
        add(JL_Name);
        JL_Name.setBounds(530, 60, 125, JL_Name.getPreferredSize().height);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("LOG.JL_Code.text"));
        add(JL_Code);
        JL_Code.setBounds(520, 90, 125, JL_Code.getPreferredSize().height);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < getComponentCount(); i++) {
                Rectangle bounds = getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            setMinimumSize(preferredSize);
            setPreferredSize(preferredSize);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane SP;
    private JTable JT;
    private JButton JB_Card;
    private JButton JB_Back;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
