/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareeng;

import java.security.*;
import javax.xml.bind.DatatypeConverter;
/**
 *
 * @author Jason
 */
public class Hashing {

    public Hashing() {
    }
    
    //Function to return hashed password
    public static String getHash(byte[] inputBytes){
        String hashValue = "";
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(inputBytes);
            byte[] digestedBytes = messageDigest.digest();
            hashValue = DatatypeConverter.printHexBinary(digestedBytes)
                    .toLowerCase();
        }
        catch(Exception e)
        {
            //TODO: add exception
        }
        return hashValue;
    }
}
