/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.struts2;

import com.opensymphony.xwork2.ActionContext;

/**
 *
 * @author HP
 */
public class LoginAction {
    private String username;
    private String password;
    private final String FAIL = "fail";
    private final String SUCCESS = "success";
    
    public LoginAction() {
    }
    public String execute() throws Exception {
        RegistrationDAO dao = new RegistrationDAO();
        boolean result = dao.checkLogin(username, password);
        
        String url = FALL;
        
        if (result) {
            Map session = ActionContext.getContext().getSession();
            session.put("USERNAME", getUsername());
            
            url = SUCCESS;
        }
        
        return url;    
    }
    
    public String getUsername() {
         }
            
    public String setUsername(String username) {
    }
    
    public String getPassword() {
        }
    
    public void setPassword(String password) {
        }
}
