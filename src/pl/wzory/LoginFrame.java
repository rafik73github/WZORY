package pl.wzory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.sql.Array;
import java.sql.SQLException;
import java.util.Arrays;

public class LoginFrame extends JFrame {

    public LoginFrame() throws FileNotFoundException, SQLException, NoSuchAlgorithmException {

    super("LOGOWANIE");

    Querys dataQuery = new Querys();

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    //setLocation(700,300);
    setSize(500,288);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    setLayout(null);


    JPanel loginPanel = new JPanel();
    loginPanel.setBounds(0,0,485,190);
    loginPanel.setOpaque(true);
    loginPanel.setBackground(new Color(70,70,70));
    loginPanel.setLayout(null);
    add(loginPanel);

    JLabel titleLabel = new JLabel("LOGOWANIE DO BAZY DANYCH",SwingConstants.CENTER);
    titleLabel.setBounds(0,0,485,60);
    titleLabel.setFont(new Font(Font.SERIF, Font.BOLD, 20));
    titleLabel.setForeground(new Color(255,255,255));
    loginPanel.add(titleLabel);

    JLabel loginLabel = new JLabel("LOGIN:");
    loginLabel.setBounds(40,65,80,30);
    loginLabel.setFont(new Font(Font.SERIF, Font.BOLD, 14));
    loginLabel.setForeground(new Color(255,110,0));
    loginPanel.add(loginLabel);

        JLabel passLabel = new JLabel("HASŁO:");
        passLabel.setBounds(40,120,80,30);
        passLabel.setFont(new Font(Font.SERIF, Font.BOLD, 14));
        passLabel.setForeground(new Color(255,110,0));
        loginPanel.add(passLabel);

    JTextArea loginText= new JTextArea();
    loginText.setBounds(110,69,285,25);
    loginText.setFont(new Font(Font.SERIF, Font.PLAIN, 16));
    loginPanel.add(loginText);

        JPasswordField passText= new JPasswordField();
        passText.setBounds(110,124,285,25);
        passText.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        loginPanel.add(passText);

    JButton logOK = new JButton("ZALOGUJ");
        logOK.setBounds(0,190,243,60);
        logOK.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        logOK.setBackground(new Color(70,130,180));
        logOK.setForeground(new Color(255,255,255));
    add(logOK);

        JButton logCancel = new JButton("CANCEL");
        logCancel.setBounds(243,190,242,60);
        logCancel.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        logCancel.setBackground(new Color(220,20,60));
        logCancel.setForeground(new Color(255,255,255));
        add(logCancel);

    }
}
