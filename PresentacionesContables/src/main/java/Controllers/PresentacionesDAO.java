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
 *
 * @author rsilvente
 */
public class PresentacionesDAO implements ICRUD<Presentaciones>{

    @Override
    public void addElemet(Presentaciones element) {
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
    public void updateElement(Presentaciones element) {
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
            Presentaciones presentacion = (Presentaciones) session.load(Presentaciones.class, id);
            session.delete(presentacion);
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
    public List<Presentaciones> getAllElements() {
        List<Presentaciones> presentaciones = new ArrayList<Presentaciones>();
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        
        try {
            trns = session.getTransaction();
            presentaciones = session.createQuery("from Convocatorias").list();
        } catch(RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return presentaciones;
    }

    @Override
    public Presentaciones getElementById(int id) {
        Presentaciones presentacion = null;
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        
        try {
            trns = session.getTransaction();
            String queryString = "from Municipios where id = :Id";
            Query query = session.createQuery(queryString);
            query.setInteger("Id", id);
            presentacion = (Presentaciones) query.uniqueResult();
        }catch(RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return presentacion;
    }
    
}
