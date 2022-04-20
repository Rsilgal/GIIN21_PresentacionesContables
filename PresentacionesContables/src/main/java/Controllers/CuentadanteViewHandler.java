/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Views.CuentadanteView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsilvente
 */
public class CuentadanteViewHandler implements ActionListener {

    CuentadanteView view;

    public CuentadanteViewHandler(CuentadanteView view) {
        this.view = view;

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
        if (e.getSource() == this.view.botonesMunicipio[0]) {

        } else if (e.getSource() == this.view.botonesConvocatoria[0]) {

        } else if (e.getSource() == this.view.botonesPresentacion[0]) {
            
        } else if (e.getSource() == this.view.botonesPresentacion[1]) {
            
        }
    }

}
