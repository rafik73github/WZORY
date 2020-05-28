package pl.wzory;



import java.sql.SQLException;
import java.util.Arrays;



public class Querys{

    public Querys() {
    }



    public MySQLConn connLM = new MySQLConn();

    //public ResultSet machines = connLM.connectToDatabase("SELECT * FROM maszyny");
    //public ResultSet sizes = connLM.connectToDatabase("SELECT * FROM rozmiary");
    //public ResultSet checkUserQuery = connLM.connectToDatabase("SELECT * FROM users WHERE user_login = 'rafik73' LIMIT 1");
    //public String[][] aList = (connLM.getMultiArray(checkUserQuery));
    public void listData(String[][] arr) throws SQLException {

     for(String[] a:arr)
    {
        System.out.println(Arrays.toString(a));
    }
        connLM.conn.close();
    }


}



