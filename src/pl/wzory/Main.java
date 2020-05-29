package pl.wzory;


import java.awt.EventQueue;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {
    EventQueue.invokeLater(LoginFrame::new);
        new TestFrame();
new XML().createXML();
    }
}
