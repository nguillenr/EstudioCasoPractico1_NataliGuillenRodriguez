/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.estudiocasopractico1_nataliguillenrodriguez;

public abstract class Publicacion {

    //Atributos
    protected String titulo;
    protected String editorial;
    protected int paginas;

    //Constructor
    public Publicacion(String titulo, String editorial, int paginas) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
}
