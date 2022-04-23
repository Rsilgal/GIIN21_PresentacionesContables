/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Views.Convocatorias.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author rsilvente
 */
public class ConvocatoriasViewHandler implements ActionListener {
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
//        this.delete.
    }

    public Read getRead() {
        return read;
    }

    public void setRead(Read read) {
        this.read = read;
    }

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
