/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Views.Presentaciones.*;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsilvente
 */
public class PresentacionesViewHandler implements ActionListener {
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
                
            }
        } else if (component.getParent() == this.delete) {
            if (component == this.delete.btnBorrar) {
                
            }
        } else if (component.getParent() == this.read) {
            if (component == this.read.btnVolver) {
                
            }
        } else if (component.getParent() == this.update) {
            if (component == this.update.btnConfirmar) {
                
            }
        }
        
    }
    
}
