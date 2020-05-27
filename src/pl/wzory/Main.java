package pl.wzory;

import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.awt.EventQueue;



public class Main {

    static Querys querys;
static {
        try {

            querys = new Querys();
            } catch (FileNotFoundException | SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
    EventQueue.invokeLater(new Runnable() {
          public void run() {

              try {
                  new LoginFrame();
              } catch (FileNotFoundException | NoSuchAlgorithmException | SQLException e) {
                  e.printStackTrace();
              }

          }
    });

    querys.listData(querys.aList);
querys.hashMe("Rafaello73");
    }
}
