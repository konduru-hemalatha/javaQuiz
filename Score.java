package quiz.ap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.util.jar.jarFile;
public class Score extends JFrame {

    Score(String name,int score){

        JLabel heading = new JLabel("Thankyou" + name +"for playing Quiz test");
        heading.setBounds(100,80,700,30);
        heading.setFont(new Font("Tahome", Font.BOLD,26));
        add(heading);

        JLabel Score = new JLabel("your score is " + score);
        Score.setBounds(350,200,300,30);
        Score.setFont(new Font("Tahome", Font.BOLD,26));
        add(Score);

        JButton exit = new JButton("TEXT");
        exit.setBounds(380,270,120,30);
        exit.setBackground(new Color(22,99,54));
        exit.setForeground(Color.WHITE);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });


        setSize(1000,500);
        setLocation(200,150);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }
    public static void main(String[] args){
        new Score("Users",0);
    }
}
