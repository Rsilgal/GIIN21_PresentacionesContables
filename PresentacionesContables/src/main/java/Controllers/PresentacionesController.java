/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Presentaciones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramon
 */
public class PresentacionesController {

    private static PresentacionesController myController;

    private List<Presentaciones> presentaciones;
    private PresentacionesDAO dao;

    public static PresentacionesController getPresentacionesController() {
        if (myController == null) {
            myController = new PresentacionesController();
        }
        return myController;
    }

    private PresentacionesController() {
        presentaciones = new ArrayList();
        presentaciones = dao.getAllElements();
    }

    public void crearPresentacion() {
        Presentaciones presentacion = new Presentaciones();
        presentaciones.add(presentacion);
        dao.addElemet(presentacion);
    }

    public void eliminarPresentacion(Presentaciones presentacion) {
        dao.deleteElement(presentacion);
        presentaciones.remove(presentacion);
    }

    public Presentaciones buscarPresentacion(Presentaciones presentacion) {
        return new Presentaciones();
    }

    public void actualizarPresentacion(Presentaciones presentacion) {
        dao.updateElement(presentacion);
        presentaciones.set(presentaciones.indexOf(presentacion),
                presentacion);
    }
}
