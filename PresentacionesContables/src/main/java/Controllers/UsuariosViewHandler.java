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
    
    public Create getCreate() {
        return create;
    }

    public void setCreate(Create create) {
        this.create = create;
        this.create.btnConfirmar.addActionListener(this);
    }

    public Delete getDelete() {
        return delete;
    }

    public void setDelete(Delete delete) {
        this.delete = delete;
        this.delete.btnBorrar.addActionListener(this);
    }

    public Read getRead() {
        return read;
    }

    public void setRead(Read read) {
        this.read = read;
        this.read.btnVolver.addActionListener(this);
    }

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
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
        UsuariosDAO dao = new UsuariosDAO();
        
        dao.addElemet(
        new Usuarios(
                create.getjTextField1().getText(),
                String.valueOf(create.getjPasswordField1().getPassword()),
                (Models.Tipos.TipoUsuario) create.getjComboBox1().getSelectedItem()
        ));
    }

    private void eliminarElemento() {
        UsuariosDAO dao = new UsuariosDAO();
        
        Usuarios elemento = (Usuarios) delete.getjComboBox2().getSelectedItem();
        dao.deleteElement(elemento.getId());
    }
    
    private void leerElemento() {        
        Usuarios elemento = (Usuarios) read.getjComboBox2().getSelectedItem();
        
        read.getjTextField1().setText(elemento.getNombre());
        read.getjComboBox1().setSelectedItem(elemento);
    }
    
    private void actualizarElemento() {
        UsuariosDAO dao = new UsuariosDAO();
        
        Usuarios elemento = (Usuarios) read.getjComboBox2().getSelectedItem();
        
        elemento.setNombre(update.getjTextField1().getText());
        elemento.setClave(String.valueOf(update.getjPasswordField1().getPassword()));
        elemento.setTipoUsuario((Models.Tipos.TipoUsuario) update.getjComboBox1().getSelectedItem());
        
        dao.updateElement(elemento);
    }
    
}