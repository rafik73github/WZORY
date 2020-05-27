package pl.wzory;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class MySQLConn {

    Scanner openFile = new Scanner(new File("database.txt"));
    String connAuth = openFile.nextLine();
    String connectionURL = connAuth;

    Connection conn = null;
    ResultSet rs;

    public MySQLConn() throws FileNotFoundException {
    }

    public ResultSet connectToDatabase(String query) {
        try {
    conn = DriverManager.getConnection(connectionURL);
    Class.forName("com.mysql.cj.jdbc.Driver");
    Statement stmt = conn.createStatement();
    rs = stmt.executeQuery(query);

            return rs;
        }
        catch (ClassNotFoundException exception) {
            System.out.println("Driver error");
        } catch (SQLException exception) {
            System.out.println("SQLException: " + exception.getMessage());
            System.out.println("SQLState: " + exception.getSQLState());
            System.out.println("VendorError: " + exception.getErrorCode());
        }
        return null;
    }


    public String[][] getMultiArray(ResultSet rs) throws SQLException {
        rs.last();
        int lenRs = rs.getRow();
        rs.beforeFirst();
        int len = rs.getMetaData().getColumnCount();

        System.out.println("Columns: " + len + ", Rows: " + lenRs);

        String[][] dataE = new String[lenRs][len];
        try {
          for(int j = 0; j< lenRs; j++){
              if(rs.isLast()){break;}
              rs.next();
              for(int i = 0;i < len;i++){
                  dataE[j][i] = rs.getString((rs.getMetaData().getColumnName(i+1)));
              }
          }
          conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataE;
    }
}
