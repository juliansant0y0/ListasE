/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author Johlver
 */
public class Biblioteca {
    LinkedList lista=new LinkedList();

    public Biblioteca() {
    }
    
    public void insertar(Libros libro){
        lista.add(libro);
    }
    public Libros obtener(int n){
        return (Libros)lista.get(n);
    }
    public Libros obtenerPrimero(){
        return (Libros)lista.getFirst();
    }
    public Libros obtenerUltimo(){
        return (Libros)lista.getLast();
    }
    public void eliminarUltimo(){
        lista.removeLast();
    }
    public boolean eliminarOcurrencia(Libros libro){
        return lista.removeFirstOccurrence(libro);
    }
    
    public int getSize(){
        return lista.size();
    }
}
