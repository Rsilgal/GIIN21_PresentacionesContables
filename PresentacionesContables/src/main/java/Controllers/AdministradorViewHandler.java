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
            
        } else if (e.getSource() == this.view.botonesUsuario[1]) {

        } else if (e.getSource() == this.view.botonesUsuario[2]) {

        } else if (e.getSource() == this.view.botonesUsuario[3]) {

        } else if (e.getSource() == this.view.botonesMunicipio[0]) {

        } else if (e.getSource() == this.view.botonesMunicipio[1]) {

        } else if (e.getSource() == this.view.botonesMunicipio[2]) {

        } else if (e.getSource() == this.view.botonesMunicipio[3]) {

        } else if (e.getSource() == this.view.botonesConvocatoria[0]) {

        } else if (e.getSource() == this.view.botonesConvocatoria[1]) {

        } else if (e.getSource() == this.view.botonesConvocatoria[2]) {

        } else if (e.getSource() == this.view.botonesConvocatoria[3]) {

        } else if (e.getSource() == this.view.botonesPresentacion[0]) {
            
        } else if (e.getSource() == this.view.botonesPresentacion[1]) {
            
        } else if (e.getSource() == this.view.botonesPresentacion[2]) {
            
        } else if (e.getSource() == this.view.botonesPresentacion[3]) {
            
        }
    }

}
