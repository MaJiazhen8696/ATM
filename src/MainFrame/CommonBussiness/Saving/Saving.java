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
        bundle= ResourceBundle.getBundle("lang.Saving");

        //JP_TEST.setOpaque(true);

    }
    public void Timer_Start(){
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                JL_Timer.setText(bundle.getString("Saving.JL_Timer.text")+(--cnt)+bundle.getString("Saving.JL_Timer.text_2"));
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
        ResourceBundle bundle = ResourceBundle.getBundle("lang.Saving");
        JL_Hint = new JLabel();
        JL_Time = new JLabel();
        JB_Confirm = new JButton();
        JB_Back = new JButton();
        JL_Timer = new JLabel();
        JL_Name = new JLabel();
        JL_Code = new JLabel();

        //======== this ========
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MouseClicked(e);
            }
        });
        setLayout(null);

        //---- JL_Hint ----
        JL_Hint.setText(bundle.getString("Saving.JL_Hint.text"));
        add(JL_Hint);
        JL_Hint.setBounds(170, 125, 265, JL_Hint.getPreferredSize().height);

        //---- JL_Time ----
        JL_Time.setText(bundle.getString("Saving.JL_Time.text"));
        add(JL_Time);
        JL_Time.setBounds(130, 260, 120, JL_Time.getPreferredSize().height);

        //---- JB_Confirm ----
        JB_Confirm.setText(bundle.getString("Saving.JB_Confirm.text"));
        JB_Confirm.addActionListener(e -> JB_Confirm(e));
        add(JB_Confirm);
        JB_Confirm.setBounds(460, 320, 118, JB_Confirm.getPreferredSize().height);

        //---- JB_Back ----
        JB_Back.setText(bundle.getString("Saving.JB_Back.text"));
        JB_Back.addActionListener(e -> JB_Back(e));
        add(JB_Back);
        JB_Back.setBounds(465, 380, 110, JB_Back.getPreferredSize().height);

        //---- JL_Timer ----
        JL_Timer.setText(bundle.getString("JL_Timer.text"));
        add(JL_Timer);
        JL_Timer.setBounds(455, 80, 95, JL_Timer.getPreferredSize().height);

        //---- JL_Name ----
        JL_Name.setText(bundle.getString("JL_Name.text"));
        add(JL_Name);
        JL_Name.setBounds(455, 110, 125, JL_Name.getPreferredSize().height);

        //---- JL_Code ----
        JL_Code.setText(bundle.getString("JL_Code.text"));
        add(JL_Code);
        JL_Code.setBounds(445, 140, 125, JL_Code.getPreferredSize().height);

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
