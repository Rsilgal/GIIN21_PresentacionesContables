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
            Views.Municipios.Read read_Mun_View = new Views.Municipios.Read();
        } else if (e.getSource() == this.view.botonesConvocatoria[0]) {
            Views.Convocatorias.Read read_Con_View = new Views.Convocatorias.Read();
        } else if (e.getSource() == this.view.botonesPresentacion[0]) {
            Views.Presentaciones.Create create_Pre_View = new Views.Presentaciones.Create();
        } else if (e.getSource() == this.view.botonesPresentacion[1]) {
            Views.Presentaciones.Update update_Pre_View = new Views.Presentaciones.Update();
        }
    }

}
