/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author rsilvente
 */
import App.Router;
import Models.Municipios;
import Views.Municipios.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MunicipiosViewHandler implements ActionListener {
    Create create;
    Delete delete;
    Read read;
    Update update;
    
    /**
     * 
     * @return Devuelve la instancia de la ventana Create de las Municipios.
     */
    public Views.Municipios.Create getCreate() {
        return create;
    }

    /**
     * Crea la relación de la Ventana Create de las Municipios y define 
     * los eventos de esta.
     * @param create Instancia de la ventana Create de las Municipios.
     */
    public void setCreate(Views.Municipios.Create create) {
        this.create = create;
        this.create.btnConfirmar.addActionListener(this);
    }

    /**
     * 
     * @return Devuelve la instancia de la ventana Delete de las Municipios.
     */
    public Views.Municipios.Delete getDelete() {
        return delete;
    }

    /**
     * Crea la relacion de la Ventana Delete de las Municipios y define 
     * los eventos de esta.
     * @param delete Instancia de la ventena Delete de las Municipios.
     */
    public void setDelete(Views.Municipios.Delete delete) {
        this.delete = delete;
        this.delete.btnBorrar.addActionListener(this);
    }

    /**
     * 
     * @return Devuelve la instancia de la ventana Read de las Municipios.
     */
    public Views.Municipios.Read getRead() {
        return read;
    }

    /**
     * Crea la relacion de la ventana Read de las Municipios y define 
     * los eventos de esta.
     * @param read Instancia de la ventana Read de las Municipios.
     */
    public void setRead(Views.Municipios.Read read) {
        this.read = read;
        this.read.btnVolver.addActionListener(this);
    }

    /**
     * 
     * @return Devuelve la instancia de la ventana Update de las Municipios.
     */
    public Views.Municipios.Update getUpdate() {
        return update;
    }

    /**
     * Crea la relación de la ventana Update de las Municipios y define 
     * los eventos de esta.
     * @param update Instancia de la ventana Update de las Municipios.
     */
    public void setUpdate(Views.Municipios.Update update) {
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
        MunicipiosDAO dao = new MunicipiosDAO();
        
        dao.addElemet(
        new Municipios(
                create.getjTextField1().getText(),
                (Models.Tipos.TipoMunicipio) create.getjComboBox1().getSelectedItem(),
                (Models.Usuarios) create.getjComboBox2().getSelectedItem()
        ));
    }

    private void eliminarElemento() {
        MunicipiosDAO dao = new MunicipiosDAO();
        
        Municipios elemento = (Municipios) delete.getjComboBox3().getSelectedItem();
        dao.deleteElement(elemento);
    }
    
    private void leerElemento() {        
        Municipios elemento = (Municipios) read.getjComboBox3().getSelectedItem();
        
        read.getjTextField1().setText(elemento.getNombre());
        read.getjComboBox1().setSelectedItem(elemento.getTipoMunicipio());
        read.getjComboBox2().setSelectedItem(elemento.getUsuario());
    }
    
    private void actualizarElemento() {
        MunicipiosDAO dao = new MunicipiosDAO();
        
        Municipios elemento = (Municipios) read.getjComboBox1().getSelectedItem();
        
        elemento.setNombre(update.getjTextField1().getText());
        elemento.setTipoMunicipio((Models.Tipos.TipoMunicipio) update.getjComboBox1().getSelectedItem());
        elemento.setUsuario((Models.Usuarios) update.getjComboBox2().getSelectedItem());
                
        dao.updateElement(elemento);
    }
    
}