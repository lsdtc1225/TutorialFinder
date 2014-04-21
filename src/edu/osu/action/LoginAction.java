package edu.osu.action;

import org.apache.commons.lang3.StringUtils;




//import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.osu.model.User;
import edu.osu.service.LoginService;

public class LoginAction /*implements Action*/ extends ActionSupport implements ModelDriven<User>{

    //private String userID;
    //private String password;
    
    private User user = new User();
    //private static String SUCCESS = "success";
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void validate(){
        if (StringUtils.isEmpty(user.getUserID())){ //userID is blank
            addFieldError("userID", "user ID cannot be blank");
        }
        if (StringUtils.isEmpty(user.getPassword())){  //password is blank
            addFieldError("password", "password cannot be blank");
        }
    }
    
    public String execute(){
        LoginService loginService = new LoginService();
        if(loginService.verifyLogin(user)){
            return SUCCESS;
        }
        return LOGIN;
    }

    @Override
    public User getModel() {
        // TODO Auto-generated method stub
        return user;
    }
    
    

//    public String getUserID() {
//        return userID;
//    }
//
//    public void setUserID(String userID) {
//        this.userID = userID;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
