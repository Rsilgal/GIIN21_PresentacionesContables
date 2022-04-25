/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Convocatorias;
import Interfaces.ICRUD;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rsilvente
 */
public class ConvocatoriasDAO implements ICRUD<Convocatorias> {

    @Override
    public void addElemet(Convocatorias element) {
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(element);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public void updateElement(Convocatorias element) {
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();

        try {
            trns = session.getTransaction();
            session.update(element);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public void deleteElement(int id) {
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        
        try{
            trns = session.getTransaction();
            Convocatorias convocatoria = (Convocatorias) session.load(Convocatorias.class, id);
            session.delete(convocatoria);
            session.getTransaction().commit();
        } catch(RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public List<Convocatorias> getAllElements() {
        List<Convocatorias> convocatorias = new ArrayList<Convocatorias>();
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        
        try {
            trns = session.getTransaction();
            convocatorias = session.createQuery("from Convocatorias").list();
        } catch(RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return convocatorias;
    }

    @Override
    public Convocatorias getElementById(int id) {
        Convocatorias convocatoria = null;
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        
        try {
            trns = session.getTransaction();
            String queryString = "from Municipios where id = :Id";
            Query query = session.createQuery(queryString);
            query.setInteger("Id", id);
            convocatoria = (Convocatorias) query.uniqueResult();
        }catch(RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return convocatoria;
    }
    
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
