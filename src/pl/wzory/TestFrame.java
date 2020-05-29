package pl.wzory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class TestFrame extends JFrame {
Querys que = new Querys();
Object[][] test = {{"Jacek", "Placek"}};
String[] columnNames = {"Imię","Nazwisko"};
String[] y = que.cNames;
String[][] x = que.aList;

    public TestFrame() throws SQLException {
        super("TEST");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(0,0);
        setSize(500,288);
        setLayout(null);

        JTable tb = new JTable(x, y);


        JScrollPane sc = new JScrollPane(tb);
        sc.setBounds(0,0,485,180);

        add(sc);

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
                new LoginFrame();
            }
        });


    }
}
