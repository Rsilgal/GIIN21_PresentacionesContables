/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.ICRUD;
import Models.Usuarios;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author rsilvente
 */
public class UsuariosDAO implements ICRUD<Usuarios> {

    @Override
    public void addElemet(Usuarios element) {
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        try{
            trns = session.beginTransaction();
            session.save(element);
            session.getTransaction().commit();
        }catch(RuntimeException e) {
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
    public void updateElement(Usuarios element) {
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        try{
            trns = session.beginTransaction();
            session.update(element);
            session.getTransaction().commit();
        }catch(RuntimeException e){
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();            
        }finally{
            session.flush();
            session.close();
        }
    }

    @Override
    public void deleteElement(int id) {
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        try{
            trns = session.beginTransaction();
            Usuarios usuario = (Usuarios) session.load(Usuarios.class, id);
            session.delete(usuario);
            session.getTransaction().commit();
        }catch(RuntimeException e){
            if (trns != null){
                trns.rollback();
            }
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
    }
    

    @Override
    public List<Usuarios> getAllElements() {
        List<Usuarios> usuarios = new ArrayList<Usuarios>();
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        try{
            trns = session.beginTransaction();
            usuarios = session.createQuery("from Usuarios").list();
        }catch(RuntimeException e){
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return usuarios;
    }

    @Override
    public Usuarios getElementById(int id) {
        Usuarios usuario = null;
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        try{
            trns = session.beginTransaction();
            String queryString = "from Usuarios where id = :Id";
            Query query = session.createQuery(queryString);
            query.setInteger("Id", id);
            usuario = (Usuarios) query.uniqueResult();
        }catch(RuntimeException e){
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return usuario;
    }

    public static Usuarios getElementByUsername(String username) {
        
        Usuarios usuario = null;
        Transaction trns = null;
        Session session = ConnectionController.getSessionFactory().openSession();
        try{
            trns = session.beginTransaction();
            String queryString = "from Usuarios where Nombre = :Nombre";
            Query query = session.createQuery(queryString);
            query.setString("Nombre", username);
            usuario = (Usuarios) query.uniqueResult();
        }catch(RuntimeException e){
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return usuario;
    }

}
