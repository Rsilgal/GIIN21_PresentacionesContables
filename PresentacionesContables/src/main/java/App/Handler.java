/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import Controllers.AdministradorViewHandler;
import Controllers.ConvocatoriasViewHandler;
import Controllers.CuentadanteViewHandler;
import Controllers.FiscalGeneralViewHandler;
import Controllers.FiscalViewHandler;
import Controllers.LoginController;
import Controllers.MunicipiosViewHandler;
import Controllers.PresentacionesViewHandler;
import Controllers.UsuariosViewHandler;

/**
 *
 * @author rsilvente
 */
public class Handler {

    private Controllers.AdministradorViewHandler admin = null;
    private Controllers.ConvocatoriasViewHandler conv = null;
    private Controllers.CuentadanteViewHandler cuent = null;
    private Controllers.FiscalGeneralViewHandler fisGen = null;
    private Controllers.FiscalViewHandler fis = null;
    private Controllers.MunicipiosViewHandler mun = null;
    private Controllers.PresentacionesViewHandler pres = null;
    private Controllers.UsuariosViewHandler user = null;
    private Controllers.LoginController login = null;

    private static Handler miHandler;

    public static Handler getHandler() {
        if (miHandler == null) {
            miHandler = new Handler();
        }
        return miHandler;
    }

    private Handler() {
        conv = new Controllers.ConvocatoriasViewHandler();
        mun = new Controllers.MunicipiosViewHandler();
        pres = new Controllers.PresentacionesViewHandler();
        user = new Controllers.UsuariosViewHandler();
    }

    public void createAdministradorHandler(Views.AdministradorView view) {
        admin = new Controllers.AdministradorViewHandler(view);
    }

    public void createCuentadanteHandler(Views.CuentadanteView view) {
        cuent = new Controllers.CuentadanteViewHandler(view);
    }

    public void createFiscalGeneralHandler(Views.FiscalGeneralView view) {
        fisGen = new Controllers.FiscalGeneralViewHandler(view);
    }

    public void createFiscal(Views.FiscalView view) {
        fis = new Controllers.FiscalViewHandler(view);
    }

    public void createLogin(Views.LoginView view) {
        login = new Controllers.LoginController(view);
    }

    public void createConvocatorias_C(Views.Convocatorias.Create view) {
        conv.setCreate(view);
    }
    
    public void createConvocatorias_D(Views.Convocatorias.Delete view) {
        conv.setDelete(view);
    }
    
    public void createConvocatorias_R(Views.Convocatorias.Read view) {
        conv.setRead(view);
    }
    
    public void createConvocatorias_U(Views.Convocatorias.Update view) {
        conv.setUpdate(view);
    }
    
    public void createMunicipios_C(Views.Municipios.Create view) {
        mun.setCreate(view);
    }
    
    public void createMunicipios_D(Views.Municipios.Delete view) {
        mun.setDelete(view);
    }
    
    public void createMunicipios_R(Views.Municipios.Read view) {
        mun.setRead(view);
    }
    
    public void createMunicipios_U(Views.Municipios.Update view) {
        mun.setUpdate(view);
    }
    
    public void createPresentaciones_C(Views.Presentaciones.Create view) {
        pres.setCreate(view);
    }
    
    public void createPresentaciones_D(Views.Presentaciones.Delete view) {
        pres.setDelete(view);
    }
    
    public void createPresentaciones_R(Views.Presentaciones.Read view) {
        pres.setRead(view);
    }
    
    public void createPresentaciones_U(Views.Presentaciones.Update view) {
        pres.setUpdate(view);
    }
    
    public void createUsuarios_C(Views.Usuarios.Create view) {
        user.setCreate(view);
    }
    
    public void createUsuarios_D(Views.Usuarios.Delete view) {
        user.setDelete(view);
    }
    
    public void createUsuarios_R(Views.Usuarios.Read view) {
        user.setRead(view);
    }
    
    public void createUsuarios_U(Views.Usuarios.Update view) {
        user.setUpdate(view);
    }

}
