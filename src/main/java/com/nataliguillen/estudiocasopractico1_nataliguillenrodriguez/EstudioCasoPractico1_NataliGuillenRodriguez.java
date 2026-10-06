/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nataliguillen.estudiocasopractico1_nataliguillenrodriguez;

public class EstudioCasoPractico1_NataliGuillenRodriguez {

    public static void main(String[] args) {
        
        System.out.println("===== BIBLIOTECA UNIVERSIDAD FIDELITAS =====\n");
        
        //Creación de libros
        Libro libro1 = new Libro("Cien años de soledad", "Sudamericana",
                471, "Gabriel Garcia Marquez", 150.0);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Francisco de Robles",
                863, "Miguel de Cervantes", 250.0);
        
        //Creación de revistas
        Revista revista1 = new Revista("National Geographic", "National Geographic",
                120, 25);
        Revista revista2 = new Revista("Muy Interesante", "Zinet Media",
                98, 15);
        
        //Creación de EBooks
        EBook ebook1 = new EBook("Java para principiantes", "Alfaomega",
                350, "PDF", "www.descarga-java.com");
        EBook ebook2 = new EBook("Programacion orientada a objetos", "Pearson",
                420, "EPUB", "www.descarga-poo.com");
        
        //Préstamo de publicaciones
        System.out.println("===== PRESTAMOS =====");
        Libreria.prestarPublicacion(libro1);
        Libreria.prestarPublicacion(libro2);
        Libreria.prestarPublicacion(revista1);
        Libreria.prestarPublicacion(ebook1);
        Libreria.prestarPublicacion(revista2);
        Libreria.prestarPublicacion(ebook2);

        //Devolución de publicaciones
        System.out.println("\n===== DEVOLUCIONES =====");
        Libreria.DevolverPublicacion(libro1, 3);
        Libreria.DevolverPublicacion(libro2, 2);
        Libreria.DevolverPublicacion(revista1, 2);
        Libreria.DevolverPublicacion(revista2, 1);
        Libreria.DevolverPublicacion(ebook1, 0);
        Libreria.DevolverPublicacion(ebook2, 0);

        //Reproducción del EBook
        System.out.println("\n===== REPRODUCCION DE EBOOK =====");
        ebook1.reproducir(ebook1.getTitulo(), ebook1.getPaginas());
        ebook1.detener(ebook1.getTitulo());
    }  
    
}
