/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.estudiocasopractico1_nataliguillenrodriguez;

public class EBook extends Publicacion implements Reproducible {

    //Atributo
    private String formato;
    private String url;

    //Constructor
    public EBook(String titulo, String editorial, int paginas,
            String formato, String url) {
        super(titulo, editorial, paginas);
        this.formato = formato;
        this.url = url;
    }

    //Getter y Setter
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public String getUrl() {
    return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
    //Método reproducir
    @Override
    public void reproducir(String titulo, int paginas) {
        System.out.println("Reproduciendo " + titulo);
    }

    //Método detener
    @Override
    public void detener(String titulo) {
        System.out.println("Deteniendo la reproduccion de " + titulo);
    }
    
}