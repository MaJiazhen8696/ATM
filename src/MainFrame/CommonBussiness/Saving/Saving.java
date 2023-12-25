/*
 * Created by JFormDesigner on Wed Dec 20 17:30:12 CST 2023
 */

package MainFrame.CommonBussiness.Saving;

import java.awt.event.*;
import MainFrame.MainFrame;
import global.global;

import java.awt.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

/**
 * @author MJZ
 */
public class Saving extends JPanel {
    Timer timer;
    MainFrame Father;
    int cnt=31;
    int MoneyCNT=0,MoneyTotal=0;
    ResourceBundle bundle;
    Saving THIS;
    public Saving(MainFrame fa) {
        initComponents();
        timer = new Timer();
        Father = fa;
        THIS=this;
        bundle= ResourceBundle.getBundle("lang");

        //JP_TEST.setOpaque(true);

    }
    public void Timer_Start(){
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                JL_Time.setText(bundle.getString("Saving.JL_Time.text")+(--cnt)+bundle.getString("Saving.JL_Time.text_2"));
                if(cnt==0){
                    timer.cancel();
                    //Father.RetainCard(THIS,);
                }
            }
        },0,1000);
    }
    private void JB_Confirm(ActionEvent e) {
        // TODO add your code here
        //JP_TEST.setVisible(true);
        timer.cancel();
        Father.toSavingConfirm(this,MoneyCNT);

    }

    private void JB_Back(ActionEvent e) {
        Father.toBussinessSelect(this);
    }

    private void MouseClicked(MouseEvent e) {

        MoneyCNT++;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("lang");
        JL_Hint = new JLabel();
        JL_Time = new JLabel();
        JB_Confirm = new JButton();
        JB_Back = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        setOpaque(false);
        setPreferredSize(new Dimension(638, 422));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MouseClicked(e);
            }
        });
        setLayout(null);

        //---- JL_Hint ----
        JL_Hint.setText(bundle.getString("Saving.JL_Hint.text"));
        JL_Hint.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 30));
        JL_Hint.setForeground(Color.white);
        add(JL_Hint);
        JL_Hint.setBounds(105, 150, 390, JL_Hint.getPreferredSize().height);

        //---- JL_Time ----
        JL_Time.setText(bundle.getString("Saving.JL_Time.text"));
        JL_Time.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 22));
        JL_Time.setForeground(Color.white);
        add(JL_Time);
        JL_Time.setBounds(56, 260, 210, JL_Time.getPreferredSize().height);

        //---- JB_Confirm ----
        JB_Confirm.setText(bundle.getString("Saving.JB_Confirm.text"));
        JB_Confirm.addActionListener(e -> JB_Confirm(e));
        add(JB_Confirm);
        JB_Confirm.setBounds(new Rectangle(new Point(540, 290), JB_Confirm.getPreferredSize()));

        //---- JB_Back ----
        JB_Back.setText(bundle.getString("Saving.JB_Back.text"));
        JB_Back.addActionListener(e -> JB_Back(e));
        add(JB_Back);
        JB_Back.setBounds(new Rectangle(new Point(540, 330), JB_Back.getPreferredSize()));

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("Saving.JL_Timer.text"));
        JL_Timer.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        JL_Timer.setForeground(Color.white);
        add(JL_Timer);
        JL_Timer.setBounds(470, 0, 170, 25);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("Saving.JL_Name.text"));
        JL_Name.setForeground(Color.white);
        JL_Name.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 16));
        add(JL_Name);
        JL_Name.setBounds(470, 40, 170, 25);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("Saving.JL_Code.text"));
        JL_Code.setFont(new Font("\u5b8b\u4f53", Font.BOLD, 21));
        JL_Code.setForeground(Color.white);
        add(JL_Code);
        JL_Code.setBounds(460, 80, 195, JL_Code.getPreferredSize().height);

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
    private JLabel JL_Hint;
    private JLabel JL_Time;
    private JButton JB_Confirm;
    private JButton JB_Back;
    public JLabel JL_Timer;
    public JLabel JL_Name;
    private JLabel JL_Code;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
