package pl.wzory;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Security {

    MySQLConn connLM = new MySQLConn();

    public Security() {
    }

    public String hashMeString(String str) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(str.getBytes(StandardCharsets.UTF_8));

        BigInteger number = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder((number.toString(16)));
        while(hexString.length() < 32){
            hexString.insert(0, '0');
        }
        return hexString.toString();
    }

    public boolean userValidated(String userLoginFromForm, char[] userPassFromForm) throws NoSuchAlgorithmException, SQLException {
        String userPassFromFormSHA256 = hashMeString(new String(userPassFromForm));

        ResultSet checkUserQuery = connLM.connectToDatabase("SELECT * FROM users WHERE" +
                " user_login = '" + userLoginFromForm + "'AND user_pass = '" + userPassFromFormSHA256 + "' LIMIT 1");

        String[][] aList = (connLM.getMultiArray(checkUserQuery));
        boolean result = false;

        if(aList.length != 0) {
            //String userLoginFromQuery = aList[0][1];
            //String userPassFromQuery = aList[0][2];
            result = true;
                 }

        return result;
    }
}
