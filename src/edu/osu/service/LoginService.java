package edu.osu.service;

import edu.osu.model.User;

public class LoginService {

    public boolean verifyLogin(User user){
        if(user.getUserID().equals("userID") && user.getPassword().equals("password")){
            return true;
        }
        return false;
    }
}
