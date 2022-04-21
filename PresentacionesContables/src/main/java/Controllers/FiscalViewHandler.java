/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Views.FiscalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsilvente
 */
public class FiscalViewHandler implements ActionListener {

    FiscalView view;

    public FiscalViewHandler(FiscalView view) {
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
            Views.Municipios.Read read_Mun_Views = new Views.Municipios.Read();
        } else if (e.getSource() == this.view.botonesConvocatoria[0]) {
            Views.Convocatorias.Read read_Con_Views = new Views.Convocatorias.Read();
        } else if (e.getSource() == this.view.botonesPresentacion[0]) {
            Views.Presentaciones.Read read_Pre_Views = new Views.Presentaciones.Read();
        }
    }

}
