/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Views.LoginView;
import Controllers.LoginController;
/**
 *
 * @author rsilvente
 */
public class main {
    public static void main(String[] args) {
        LoginView login_View = new LoginView();
        LoginController login_Controller = new LoginController(login_View);
    }
}
