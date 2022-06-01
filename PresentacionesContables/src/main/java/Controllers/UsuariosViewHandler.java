/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import App.Router;
import Models.Usuarios;
import Views.Usuarios.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsilvente
 */
public class UsuariosViewHandler implements ActionListener {
    Create create;
    Delete delete;
    Read read;
    Update update;
    
    /**
     * 
     * @return Devuelve la instancia de la ventana Create de las Usuarios.
     */
    public Views.Usuarios.Create getCreate() {
        return create;
    }

    /**
     * Crea la relación de la Ventana Create de las Usuarios y define 
     * los eventos de esta.
     * @param create Instancia de la ventana Create de las Usuarios.
     */
    public void setCreate(Views.Usuarios.Create create) {
        this.create = create;
        this.create.btnConfirmar.addActionListener(this);
    }

    /**
     * 
     * @return Devuelve la instancia de la ventana Delete de las Usuarios.
     */
    public Views.Usuarios.Delete getDelete() {
        return delete;
    }

    /**
     * Crea la relacion de la Ventana Delete de las Usuarios y define 
     * los eventos de esta.
     * @param delete Instancia de la ventena Delete de las Usuarios.
     */
    public void setDelete(Views.Usuarios.Delete delete) {
        this.delete = delete;
        this.delete.btnBorrar.addActionListener(this);
    }

    /**
     * 
     * @return Devuelve la instancia de la ventana Read de las Usuarios.
     */
    public Views.Usuarios.Read getRead() {
        return read;
    }

    /**
     * Crea la relacion de la ventana Read de las Usuarios y define 
     * los eventos de esta.
     * @param read Instancia de la ventana Read de las Usuarios.
     */
    public void setRead(Views.Usuarios.Read read) {
        this.read = read;
        this.read.btnVolver.addActionListener(this);
    }

    /**
     * 
     * @return Devuelve la instancia de la ventana Update de las Usuarios.
     */
    public Views.Usuarios.Update getUpdate() {
        return update;
    }

    /**
     * Crea la relación de la ventana Update de las Usuarios y define 
     * los eventos de esta.
     * @param update Instancia de la ventana Update de las Usuarios.
     */
    public void setUpdate(Views.Usuarios.Update update) {
        this.update = update;
        this.update.btnConfirmar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Component component = (Component) e.getSource();
        if (component.getParent() == this.create) {
            if (component == this.create.btnConfirmar) {
                agregarElemento();
                Router.getRouter().navigateTo(this.create, 
                        Router.getRouter().getLastFrame());
            }
        } else if (component.getParent() == this.delete) {
            if (component == this.delete.btnBorrar) {
                eliminarElemento();
                Router.getRouter().navigateTo(this.delete,
                        Router.getRouter().getLastFrame());
            }
        } else if (component.getParent() == this.read) {
            if (component == this.read.btnVolver) {
                leerElemento();
                Router.getRouter().navigateTo(this.read, 
                        Router.getRouter().getLastFrame());
            }
        } else if (component.getParent() == this.update) {
            if (component == this.update.btnConfirmar) {
                actualizarElemento();
                Router.getRouter().navigateTo(this.update,
                        Router.getRouter().getLastFrame());
            }
        }   
    }
    
    private void agregarElemento() {
        UsuarioController.getUsuarioController().crearUsuario(create.getjTextField1().getText(),
                String.valueOf(create.getjPasswordField1().getPassword()),
                (Models.Tipos.TipoUsuario) create.getjComboBox1().getSelectedItem());
    }

    private void eliminarElemento() {
        Usuarios usuario = (Usuarios) delete.getjComboBox2().getSelectedItem();
        
        UsuarioController.getUsuarioController().eliminarUsuario(usuario);
    }
    
    private void leerElemento() {        
        Usuarios elemento = (Usuarios) read.getjComboBox2().getSelectedItem();
        
        read.getjTextField1().setText(elemento.getNombre());
        read.getjComboBox1().setSelectedItem(elemento);
    }
    
    private void actualizarElemento() {        
        Usuarios elemento = (Usuarios) read.getjComboBox2().getSelectedItem();
        
        elemento.setNombre(update.getjTextField1().getText());
        elemento.setClave(String.valueOf(update.getjPasswordField1().getPassword()));
        elemento.setTipoUsuario((Models.Tipos.TipoUsuario) update.getjComboBox1().getSelectedItem());
        
        UsuarioController.getUsuarioController().actualizarUsuario(elemento);
    }
    
}