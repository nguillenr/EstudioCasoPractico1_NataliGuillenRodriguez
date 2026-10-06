/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.estudiocasopractico1_nataliguillenrodriguez;

public class Libro extends Publicacion {
    
    //Atributos
    private String autor;
    private double precio;

    //Constructor
    public Libro(String titulo, String editorial, int paginas,
            String autor, double precio) {
        super(titulo, editorial, paginas);
        this.autor = autor;
        this.precio = precio;
    }

    //Getters y Setters
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
