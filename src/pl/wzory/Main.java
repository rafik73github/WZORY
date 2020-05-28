package pl.wzory;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.awt.EventQueue;



public class Main {

    public static void main(String[] args) {
    EventQueue.invokeLater(() -> {

        try {
            new LoginFrame();
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    });

    }
}
