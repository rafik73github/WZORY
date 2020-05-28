package pl.wzory;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.awt.EventQueue;



public class Main {

    static Querys querys;
static {

    querys = new Querys();
}

    public static void main(String[] args) throws SQLException {
    EventQueue.invokeLater(new Runnable() {
          public void run() {

              try {
                  new LoginFrame();
              } catch (FileNotFoundException | SQLException e) {
                  e.printStackTrace();
              }

          }
    });

    //querys.listData(querys.aList);

    }
}
