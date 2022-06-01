/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Tipos.TipoUsuario;
import Models.Usuarios;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramon
 */
public class UsuarioController {

    private static UsuarioController myController;

    private List<Usuarios> usuarios;
    private UsuariosDAO dao;
    // Ejemplo de visualizar Convocatoria

    public static UsuarioController getUsuarioController() {
        if (myController == null) {
            myController = new UsuarioController();
        }
        return myController;
    }

    private UsuarioController() {
        usuarios = new ArrayList();
        usuarios = dao.getAllElements();
    }

    public void crearUsuario(String nombre, String clave, TipoUsuario tipo) {
        Usuarios usuario = new Usuarios(nombre, clave, tipo);
        usuarios.add(usuario);
        dao.addElemet(usuario);
    }
    
    public void eliminarUsuario(Usuarios usuario){
        dao.deleteElement(usuario);
        usuarios.remove(usuario);
    }
    
    public Usuarios buscarUsuario(Usuarios usuario) {
        return new Usuarios();
    }
    
    public void actualizarUsuario(Usuarios usuario) {
        dao.updateElement(usuario);
        usuarios.set(usuarios.indexOf(usuario),
                usuario);
    }
}
