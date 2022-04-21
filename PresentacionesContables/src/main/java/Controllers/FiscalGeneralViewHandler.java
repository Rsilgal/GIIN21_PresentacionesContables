/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Views.FiscalGeneralView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsilvente
 */
public class FiscalGeneralViewHandler implements ActionListener {

    FiscalGeneralView view;

    public FiscalGeneralViewHandler(FiscalGeneralView view) {
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
            Views.Convocatorias.Create create_Con_View = new Views.Convocatorias.Create();
        } else if (e.getSource() == this.view.botonesConvocatoria[1]) {
            Views.Convocatorias.Delete delete_Con_View = new Views.Convocatorias.Delete();
        } else if (e.getSource() == this.view.botonesConvocatoria[2]) {
            Views.Convocatorias.Update update_Con_View = new Views.Convocatorias.Update();
        } else if (e.getSource() == this.view.botonesConvocatoria[3]) {
            Views.Convocatorias.Read read_Con_View = new Views.Convocatorias.Read();
        } else if (e.getSource() == this.view.botonesPresentacion[0]) {
            Views.Presentaciones.Update update_Pre_View = new Views.Presentaciones.Update();
        } else if (e.getSource() == this.view.botonesPresentacion[1]) {
            Views.Presentaciones.Read read_Pre_View = new Views.Presentaciones.Read();
        }
    }

}
