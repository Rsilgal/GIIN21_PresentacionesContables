/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import java.util.List;

/**
 * Esta interfaz define un grupo de métodos que nos permite realizar las 
 * operaciones más basicas de un CRUD (Create - Read - Update - Delete)
 * @author rsilvente
 */
public interface ICRUD<T> {
    
    void addElemet(T element);
    void updateElement(T element);
    void deleteElement(int id);
    List<T> getAllElements();
    T getElementById(int id);
}
