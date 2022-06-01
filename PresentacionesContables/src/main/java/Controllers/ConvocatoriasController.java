/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Convocatorias;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramon
 */
public class ConvocatoriasController {

    private static ConvocatoriasController myController;

    private List<Convocatorias> convocatorias;
    private ConvocatoriasDAO dao;

    public static ConvocatoriasController getConvocatoriasController() {
        if (myController == null) {
            myController = new ConvocatoriasController();
        }
        return myController;
    }

    private ConvocatoriasController() {
        convocatorias = new ArrayList();
        convocatorias = dao.getAllElements();
    }

    public void crearConvocatoria() {
        Convocatorias convocatoria = new Convocatorias();
        convocatorias.add(convocatoria);
        dao.addElemet(convocatoria);
    }
    
    public void eliminarConvocatoria(Convocatorias convocatoria) {
        dao.deleteElement(convocatoria);
        convocatorias.remove(convocatoria);
    }
    
    public Convocatorias buscarConvocatoria(Convocatorias convocatoria){
        return new Convocatorias();
    }
    
    public void actualizarConvocatorias(Convocatorias convocatoria){
        dao.update(convocatoria);
        convocatorias.set(convocatorias.indexOf(convocatoria),
                convocatoria);
    }
}
