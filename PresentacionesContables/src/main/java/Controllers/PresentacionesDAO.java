/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.ICRUD;
import Models.Presentaciones;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Clase mediante la que realizamos las operaciones de CRUD a la tabla de las 
 * Presentaciones.
 * @author rsilvente
 */
public class PresentacionesDAO extends CRUDBasico<Presentaciones> {

    /**
     * Método con el cual generamos una nueva Presentacion en la Base de Datos.
     * @param element Instancia de la clase Presentacion
     */
    public void addElemet(Presentaciones element) {
        create(element);
    }

    /**
     * Método con el cual Actualizamos una Presentacion en la Base de Datos.
     * @param element Instancia de la clase Presentacion.
     */
    public void updateElement(Presentaciones element) {
        update(element);
    }

    /**
     * Método mediante el cual Eliminaremos una Presentacion de la Base de 
     * Datos.
     * @param element Instancia de la clase Presentacion.
     */
    public void deleteElement(Presentaciones element) {
        delete(element);
    }

    /**
     * Método con el que obtendremos un listado de las Presentaciones presentes 
     * en la Base de Datos.
     * @return Listado de las Presentaciones presentes en la Base de Datos.
     */
    public List<Presentaciones> getAllElements() {
        return readAllElements();
    }

    /**
     * Método con el que obtendremos los datos de una Presentación en concreto.
     * @param id Identificador único de la Presentación que queremos obtener.
     * @return Devuelve la Presentación cuyo ID coincide con el ID indicado 
     * como parámetro de entrada.
     */
    public Presentaciones getElementById(int id) {
        return readElementById(id, "Presentaciones");
    }
    
}
