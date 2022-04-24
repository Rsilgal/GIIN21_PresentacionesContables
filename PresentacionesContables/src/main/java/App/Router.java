/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import javax.swing.JFrame;

/**
 *
 * @author rsilvente
 */
public class Router {

    // Views de Usuarios
    private Views.AdministradorView admin = null;
    private Views.CuentadanteView cuentadante = null;
    private Views.FiscalGeneralView fiscalGeneral = null;
    private Views.FiscalView fiscal = null;
    private Views.LoginView login = null;

    // Views de Control
    private Views.Convocatorias.Create conv_create = null;
    private Views.Convocatorias.Delete conv_delete = null;
    private Views.Convocatorias.Read conv_read = null;
    private Views.Convocatorias.Update conv_update = null;
    private Views.Municipios.Create mun_create = null;
    private Views.Municipios.Delete mun_delete = null;
    private Views.Municipios.Read mun_read = null;
    private Views.Municipios.Update mun_update = null;
    private Views.Presentaciones.Create pres_create = null;
    private Views.Presentaciones.Delete pres_delete = null;
    private Views.Presentaciones.Read pres_read = null;
    private Views.Presentaciones.Update pres_update = null;
    private Views.Usuarios.Create user_create = null;
    private Views.Usuarios.Delete user_delete = null;
    private Views.Usuarios.Read user_read = null;
    private Views.Usuarios.Update user_update = null;
    
    private JFrame lastFrame = null;
    
    private static Router miRouter;

    public static Router getRouter() {
        if (miRouter == null) {
            miRouter = new Router();
        }
        
        return miRouter;
    }
    
    private Router() {
        this.login = new Views.LoginView();
        this.login.setVisible(true);
        this.login.setLocationRelativeTo(null);
    }

    public void generatedViewsForAdmin() {
        this.admin = new Views.AdministradorView();

        // Convocatorias
        this.conv_create = new Views.Convocatorias.Create();
        this.conv_delete = new Views.Convocatorias.Delete();
        this.conv_read = new Views.Convocatorias.Read();
        this.conv_update = new Views.Convocatorias.Update();

        // Municipios
        this.mun_create = new Views.Municipios.Create();
        this.mun_delete = new Views.Municipios.Delete();
        this.mun_read = new Views.Municipios.Read();
        this.mun_update = new Views.Municipios.Update();

        // Presentaciones
        this.pres_create = new Views.Presentaciones.Create();
        this.pres_delete = new Views.Presentaciones.Delete();
        this.pres_read = new Views.Presentaciones.Read();
        this.pres_update = new Views.Presentaciones.Update();

        // Usuarios
        this.user_create = new Views.Usuarios.Create();
        this.user_delete = new Views.Usuarios.Delete();
        this.user_read = new Views.Usuarios.Read();
        this.user_update = new Views.Usuarios.Update();
    }

    public void generatedViewsForCuentadante() {
        this.cuentadante = new Views.CuentadanteView();

        this.mun_read = new Views.Municipios.Read();

        this.conv_read = new Views.Convocatorias.Read();

        this.pres_read = new Views.Presentaciones.Read();
    }

    public void generatedViewsForFiscalGeneral() {
        this.fiscalGeneral = new Views.FiscalGeneralView();

        this.conv_create = new Views.Convocatorias.Create();
        this.conv_delete = new Views.Convocatorias.Delete();
        this.conv_read = new Views.Convocatorias.Read();
        this.conv_update = new Views.Convocatorias.Update();

        this.mun_read = new Views.Municipios.Read();

        this.pres_read = new Views.Presentaciones.Read();
        this.pres_update = new Views.Presentaciones.Update();
    }

    public void generatedViewsForFiscal() {
        this.fiscal = new Views.FiscalView();

        this.mun_read = new Views.Municipios.Read();

        this.conv_read = new Views.Convocatorias.Read();

        this.pres_read = new Views.Presentaciones.Read();

    }

    public void navigateTo(JFrame actual, JFrame destino) {
        actual.setVisible(false);
        lastFrame = actual;
        destino.setVisible(true);
    }

    public Views.AdministradorView getAdmin() {
        return admin;
    }

    public Views.CuentadanteView getCuentadante() {
        return cuentadante;
    }

    public Views.FiscalGeneralView getFiscalGeneral() {
        return fiscalGeneral;
    }

    public Views.FiscalView getFiscal() {
        return fiscal;
    }

    public Views.LoginView getLogin() {
        return login;
    }

    public Views.Convocatorias.Create getConv_create() {
        return conv_create;
    }

    public Views.Convocatorias.Delete getConv_delete() {
        return conv_delete;
    }

    public Views.Convocatorias.Read getConv_read() {
        return conv_read;
    }

    public Views.Convocatorias.Update getConv_update() {
        return conv_update;
    }

    public Views.Municipios.Create getMun_create() {
        return mun_create;
    }

    public Views.Municipios.Delete getMun_delete() {
        return mun_delete;
    }

    public Views.Municipios.Read getMun_read() {
        return mun_read;
    }

    public Views.Municipios.Update getMun_update() {
        return mun_update;
    }

    public Views.Presentaciones.Create getPres_create() {
        return pres_create;
    }

    public Views.Presentaciones.Delete getPres_delete() {
        return pres_delete;
    }

    public Views.Presentaciones.Read getPres_read() {
        return pres_read;
    }

    public Views.Presentaciones.Update getPres_update() {
        return pres_update;
    }

    public Views.Usuarios.Create getUser_create() {
        return user_create;
    }

    public Views.Usuarios.Delete getUser_delete() {
        return user_delete;
    }

    public Views.Usuarios.Read getUser_read() {
        return user_read;
    }

    public Views.Usuarios.Update getUser_update() {
        return user_update;
    }

    public JFrame getLastFrame() {
        return lastFrame;
    }

}
