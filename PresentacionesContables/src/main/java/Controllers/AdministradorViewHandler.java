/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Views.AdministradorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsilvente
 */
public class AdministradorViewHandler implements ActionListener {

    AdministradorView view;

    public AdministradorViewHandler(AdministradorView view) {
        this.view = view;

        // Usuarios Buttons
        for (var elem : this.view.botonesUsuario) {
            elem.addActionListener(this);
        }

        for (var elem : this.view.botonesMunicipio) {
            elem.addActionListener(this);
        }

        for (var elem : this.view.botonesConvocatoria) {
            elem.addActionListener(this);
        }

        for (var elem : this.view.botonesPresentacion) {
            elem.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.botonesUsuario[0]) {
            this.view.setVisible(false);
            Views.Usuarios.Create create_User_View = new Views.Usuarios.Create();
        } else if (e.getSource() == this.view.botonesUsuario[1]) {
            Views.Usuarios.Delete delete_User_View = new Views.Usuarios.Delete();
        } else if (e.getSource() == this.view.botonesUsuario[2]) {
            Views.Usuarios.Update update_User_View = new Views.Usuarios.Update();
        } else if (e.getSource() == this.view.botonesUsuario[3]) {
            Views.Usuarios.Read read_User_View = new Views.Usuarios.Read();
        } else if (e.getSource() == this.view.botonesMunicipio[0]) {
            Views.Municipios.Create create_Mun_View = new Views.Municipios.Create();
        } else if (e.getSource() == this.view.botonesMunicipio[1]) {
            Views.Municipios.Delete delete_Mun_View = new Views.Municipios.Delete();
        } else if (e.getSource() == this.view.botonesMunicipio[2]) {
            Views.Municipios.Update update_Mun_View = new Views.Municipios.Update();
        } else if (e.getSource() == this.view.botonesMunicipio[3]) {
            Views.Municipios.Read read_Mun_View = new Views.Municipios.Read();
        } else if (e.getSource() == this.view.botonesConvocatoria[0]) {
            Views.Convocatorias.Create create_Conv_View = new Views.Convocatorias.Create();
        } else if (e.getSource() == this.view.botonesConvocatoria[1]) {
            Views.Convocatorias.Delete delete_Conv_View = new Views.Convocatorias.Delete();
        } else if (e.getSource() == this.view.botonesConvocatoria[2]) {
            Views.Convocatorias.Update update_Conv_View = new Views.Convocatorias.Update();
        } else if (e.getSource() == this.view.botonesConvocatoria[3]) {
            Views.Convocatorias.Read read_Conv_View = new Views.Convocatorias.Read();
        } else if (e.getSource() == this.view.botonesPresentacion[0]) {
            Views.Presentaciones.Create create_Pre_View = new Views.Presentaciones.Create();
        } else if (e.getSource() == this.view.botonesPresentacion[1]) {
            Views.Presentaciones.Delete delete_Pre_View = new Views.Presentaciones.Delete();
        } else if (e.getSource() == this.view.botonesPresentacion[2]) {
            Views.Presentaciones.Update update_Pre_View = new Views.Presentaciones.Update();
        } else if (e.getSource() == this.view.botonesPresentacion[3]) {
            Views.Presentaciones.Read read_Pre_View = new Views.Presentaciones.Read();
        }
    }

}
