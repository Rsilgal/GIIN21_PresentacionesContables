/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import java.util.List;

/**
 *
 * @author rsilvente
 */
public interface ICRUD<T> {
    
    public void addElemet(T element);
    public void updateElement(T element);
    public void deleteElement(T element);
    public List<T> getAllElements();
    public T getElementById(int id);
}
