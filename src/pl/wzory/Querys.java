package pl.wzory;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;


//TODO I don't now if this class is necessary...


public class Querys{

    public Querys() throws SQLException {
    }



    public MySQLConn connLM = new MySQLConn();

    public ResultSet fason = connLM.connectToDatabase("SELECT * FROM gg");
    //public ResultSet sizes = connLM.connectToDatabase("SELECT * FROM rozmiary");
    //public ResultSet checkUserQuery = connLM.connectToDatabase("SELECT * FROM users WHERE user_login = 'rafik73' LIMIT 1");
    public String[][] aList = (connLM.getMultiArray(fason));
    public String[] cNames = (connLM.getColumnNames(fason));
    public void listData(String[][] arr) throws SQLException {

     for(String[] a:arr)
    {
        System.out.println(Arrays.toString(a));
    }
        connLM.conn.close();
    }


}



