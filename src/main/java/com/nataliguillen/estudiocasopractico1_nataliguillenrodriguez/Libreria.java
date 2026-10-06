/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nataliguillen.estudiocasopractico1_nataliguillenrodriguez;

public class Libreria {

    //Método para prestar publicaciones
    public static void prestarPublicacion(Publicacion publicacion) {

        if (publicacion instanceof Libro) {

            Libro libro = (Libro) publicacion;

            if (libro.getPrecio() < 200) {
                System.out.println("El libro " + libro.getTitulo()
                        + " se puede prestar por 15 dias.");
            } 
            
            else {
                System.out.println("El libro " + libro.getTitulo()
                        + " se puede prestar por 3 dias.");
            }

        } 
        
        else if (publicacion instanceof Revista) {

            Revista revista = (Revista) publicacion;

            System.out.println("La revista " + revista.getTitulo()
                    + " se puede prestar por 5 dias.");
        } 
        
        else if (publicacion instanceof EBook) {

            EBook ebook = (EBook) publicacion;

            System.out.println("El EBook " + ebook.getTitulo()
                    + " no se presta. URL de descarga: " + ebook.getUrl());
        }
        
    }

    //Método para devolver publicaciones
    public static void DevolverPublicacion(Publicacion publicacion,
            int diasRetraso) {

        if (publicacion instanceof Libro) {

            double multa = diasRetraso * 2;

            System.out.println("Monto a pagar por retraso del libro: $"
                    + multa);
        } 
        
        else if (publicacion instanceof Revista) {

            double multa = diasRetraso * 1.5;

            System.out.println("Monto a pagar por retraso de la revista: $"
                    + multa);
        }
        
        else if (publicacion instanceof EBook) {
            try {
                throw new EBookNoSeDevuelveException("El EBook "
                        + publicacion.getTitulo()
                        + " no se devuelve porque no se presta.");
            } catch (EBookNoSeDevuelveException e) {
                System.out.println(e.getMessage());
            }
        }
        
    }
    
}