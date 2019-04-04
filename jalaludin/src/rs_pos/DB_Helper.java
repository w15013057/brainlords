/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs_pos;

/**
 *
 * @author w15015051
 */
public class DB_Helper {
    public void reactivateUser(String id){
        //TODO: Reactivate user
    }
    public void deleteUser(String id){
        //TODO: Delete user
    }
    public boolean checkLogin( String username, String passwordHashed){
        boolean valid = true;        
        //TODO: Check if login is valid       
        return valid;
    }
    public boolean checkUserType( String username, String passwordHashed){
        boolean isAdmin = true;
        //TODO: Check if user is admin
        return isAdmin;
    }
}
