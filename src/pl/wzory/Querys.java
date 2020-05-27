package pl.wzory;

import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;



public class Querys {
    public Querys() throws FileNotFoundException, SQLException, NoSuchAlgorithmException {
    }

    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    public MySQLConn connLM = new MySQLConn();


    public ResultSet machines = connLM.connectToDatabase("SELECT * FROM maszyny");
    public ResultSet sizes = connLM.connectToDatabase("SELECT * FROM rozmiary");


    public String[][] aList = (connLM.getMultiArray(machines));


    public void listData(String[][] arr) throws SQLException {

     for(String[] a:arr)
    {
        System.out.println(Arrays.toString(a));
    }
        connLM.conn.close();
    }

public void hashMe(String str){
        byte[] hash = digest.digest(str.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
    for (byte b : hash) {
sb.append(String.format("$02X",b));
    }
    System.out.println(sb.toString());
    }



}



