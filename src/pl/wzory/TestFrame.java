package pl.wzory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TestFrame extends JFrame {

    public TestFrame(){
        super("TEST");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(0,0);
        setSize(500,288);

        JButton buttonToLoginPanel = new JButton("WRÓC");
        buttonToLoginPanel.setBounds(0,190,243,60);
        buttonToLoginPanel.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        buttonToLoginPanel.setBackground(new Color(70,130,180));
        buttonToLoginPanel.setForeground(new Color(255,255,255));
        add(buttonToLoginPanel);


        buttonToLoginPanel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    new LoginFrame();
                } catch (FileNotFoundException | SQLException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        });


    }
}
