/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.ICRUD;
import Models.Municipios;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Clase mediante la que realizamos las operaciones de CRUD a la tabla de los
 * Municipios
 * @author rsilvente
 */
public class MunicipiosDAO extends CRUDBasico<Municipios> {

    /**
     * Método con el cual generamos un nuevo Municipio en la Base de Datos
     * @param element Instancia de la clase Municipio.
     */
    public void addElemet(Municipios element) {
        create(element);
    }

    /**
     * Método con el cual Actualizamos un Municipio en la Base de Datos.
     * @param element Instancia de la clase Municipio.
     */
    public void updateElement(Municipios element) {
        update(element);
    }

    /**
     * Método mediante el cual Eliminaremos un Municipio de la Base de Datos.
     * @param element Instancia de la clase Municipio.
     */
    public void deleteElement(Municipios element) {
        delete(element);
    }

    /**
     * Método con el que obtenemos un listado de los Municipios presentes 
     * en la Base de Datos.
     * @return Listado de los Municipios presentes en la Base de Datos.
     */
    public List<Municipios> getAllElements() {
        return readAllElements();
    }

    /**
     * Método con el que obtendremos los datos de un Municipio en concreto.
     * @param id Identificador único del Muncipio que queremos obtener.
     * @return Devuelve el Municipio cuyo ID coincide con el ID indicado 
     * como parámetro de entrada.
     */
    public Municipios getElementById(int id) {
        return readElementById(id, "Municipios");
    }
    
}
