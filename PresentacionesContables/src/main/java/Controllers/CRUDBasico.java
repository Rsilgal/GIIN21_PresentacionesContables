/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ramon
 */
public abstract class CRUDBasico<T> {

    public void create(T t) {
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(t);
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

    public void update(T t) {
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();

        try {
            trns = session.getTransaction();
            session.update(t);
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

    public void delete(T t) {
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();

        try {
            trns = session.getTransaction();
            session.delete(t);
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

    public List<T> readAllElements() {
        List<T> convocatorias = new ArrayList<T>();
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();

        try {
            trns = session.getTransaction();
            convocatorias = session.createQuery("from Convocatorias").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return convocatorias;
    }

    public T readElementById(int id, String nombreTabla) {
        T convocatoria = null;
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();

        try {
            trns = session.getTransaction();
            String queryString = "from " + nombreTabla + " where id = :Id";
            Query query = session.createQuery(queryString);
            query.setInteger("Id", id);
            convocatoria = (T) query.uniqueResult();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return convocatoria;
    }
}
