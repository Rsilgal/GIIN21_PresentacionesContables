/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Convocatorias;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Clase mediante la que realizaremos las operaciones CRUD a la tabla de las 
 * Convocatorias.
 * @author rsilvente
 */
public class ConvocatoriasDAO extends CRUDBasico<Convocatorias> {

    /**
     * Metodo con el cual generamos una nueva Convocatoria en la Base de Datos.
     * @param element Instancia de la clase Convocatorias.
     */
    public void addElemet(Convocatorias element) {
        create(element);
    }

    /**
     * Metodo con el cual Actualizamos una Convocatoria en la Base de Datos.
     * @param element Instancia de la clase Convocatorias.
     */
    public void updateElement(Convocatorias element) {
        update(element);
    }

    /**
     * Método mediante el cual eliminaremos una Convocatoria de la Base de 
     * Datos.
     * @param element Instancia de la clase Convocatorias.
     */
    public void deleteElement(Convocatorias element) {
        delete(element);
    }

    /**
     * Método con el que obtenemos un listado de las Convocatorias presentes 
     * en la Base de Datos.
     * @return Listado de las Convocatorias presentes en la Base de Datos.
     */
    public List<Convocatorias> getAllElements() {
        return readAllElements();
    }

    /**
     * Método con el que obtendremos los datos de una Convocatoria en concreto.
     * @param id Identificador único de la Convocatoria que queremos obtener.
     * @return Devuelve la COnvocatoria cuyo ID coincide con el ID indicado 
     * como parámetro de entrada.
     */
    public Convocatorias getElementById(int id) {
        return readElementById(id, "Convocatorias");
    }
    
    /**
     * Obtenemos el Id de una Convocatoria por su Nombre
     * @param nombre Nombre de la Convocatoria
     * @return Devuelve el identificador (ID) de la Convocatoria.
     */
    public int getElementIdByNombre(String nombre) {
        int convocatoria = 0;
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        
        try {
            trns = session.getTransaction();
            String queryString = "from Municipios where Nombre = :nombre";
            Query query = session.createQuery(queryString);
            query.setString("nombre", nombre);
            convocatoria = (int) query.uniqueResult();
        }catch(RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return convocatoria;
    }

}
