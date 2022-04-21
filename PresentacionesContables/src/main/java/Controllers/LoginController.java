/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Views.*;

/**
 *
 * @author rsilvente
 */
public class LoginController implements ActionListener {

    LoginView login;
    Usuarios user;

    public LoginController(LoginView login) {
        user = null;

        this.login = login;

        this.login.btnLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.login.btnLogin) {
            if (checkCredencials(this.login.txtUsername.getText(),
                    new String(this.login.txtPassword.getPassword()))
                    ) {
                
                this.login.setVisible(false);
                
                switch (user.getTipoUsuario().getNombre()) {
                    case "Administrador":
                        AdministradorView admin_View = new AdministradorView();
                        AdministradorViewHandler admin_Handler = new AdministradorViewHandler(admin_View);
                        break;
                    case "FiscalGeneral":
                        FiscalGeneralView fiscalGen_View = new FiscalGeneralView();
                        FiscalGeneralViewHandler fiscalGen_Handler = new FiscalGeneralViewHandler(fiscalGen_View);
                        break;
                    case "Fiscal":
                        FiscalView fiscal_View = new FiscalView();
                        FiscalViewHandler fiscal_Handler = new FiscalViewHandler(fiscal_View);
                        break;
                    default:
                        CuentadanteView cuentadante_View = new CuentadanteView();
                        CuentadanteViewHandler cuentadante_Handler = new CuentadanteViewHandler(cuentadante_View);
                        break;
                }
            }
        }
    }

    private boolean checkCredencials(String username, String password) {
        user = UsuariosDAO.getElementByUsername(username);

        if (user == null) {
            return false;
        }

        if (username.equals(user.getNombre()) && password.equals(user.getClave())) {
            System.out.println("Las credenciales son correctas.");
            return true;
        }

        return false;
    }

}
