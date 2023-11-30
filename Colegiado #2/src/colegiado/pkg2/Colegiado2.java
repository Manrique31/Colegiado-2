/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegiado.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author mtorr
 */
public class Colegiado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Creacion de los arreglos de las canciones 
        Cancion[] canciones = new Cancion[10];
        canciones[0] = new Cancion(1, "flowers", "miley cyrus", "2:20", 2023);
        canciones[1] = new Cancion(2, "A sky full a star", "Coldplay", "4:15", 2021);
        canciones[2] = new Cancion(3, "My Universe", "Coldplay", "2:45", 2019);
        canciones[3] = new Cancion(4, "Kill Bill", "SZA", "2:33", 2022);
        canciones[4] = new Cancion(5, "As It Was", "Harry Styles", "2:47", 2022);
        canciones[5] = new Cancion(6, "Ella Baila Sola", "Eslabón Armado y Peso Pluma", "2:45", 2023);
        canciones[6] = new Cancion(7, "Cruel Summer", "Taylor Swift", "2:58", 2023);
        canciones[7] = new Cancion(8, "Something Just Like This", "The Chainsmokers & Coldplay", "4:07", 2017);
        canciones[8] = new Cancion(9, "Tulum", "PP & Grupo Frontera", "3:15", 2018);
        canciones[9] = new Cancion(10, "Closer", "The Chainsmokers & Coldplay", "4:04", 2016);

        
        
        
       // Obtener canciones anteriores al pasado
        int anoActual = 2023;
        for (Cancion cancion : canciones) {
            if (cancion.getAnoCreacion() < anoActual) {
                System.out.println(cancion.getTitulo());
            }
        }

        // Obtener musicas al presente
        for (Cancion cancion : canciones) {
            if (cancion.getAnoCreacion() == anoActual) {
                System.out.println(cancion.getTitulo());
            }
        }

        // Obtener musica posteriores al presente
        for (Cancion cancion : canciones) {
            if (cancion.getAnoCreacion() > anoActual) {
                System.out.println(cancion.getTitulo());
            }
        }

        // Obtener la canción de mayor duración
        Cancion cancionMayorDuracion = canciones[0];
        for (Cancion cancion : canciones) {
            if (cancion.getDuracion().compareTo(cancionMayorDuracion.getDuracion()) > 0) {
                cancionMayorDuracion = cancion;
            }
        }
        JOptionPane.showInputDialog(cancionMayorDuracion.getTitulo ());

        // Obtener el autor de la canción en la primera posición
        String autorPrimeraCancion = canciones[0].getAutor();
        System.out.println(autorPrimeraCancion);

        // El resultado de todas las canciones
        for (Cancion cancion : canciones) {
            JOptionPane.showMessageDialog(null,"Id: " + cancion.getIdCancion() + ", Titulo: " + cancion.getTitulo() + ", Autor: " + cancion.getAutor() + ", Duracion: " + cancion.getDuracion() + ", anio de creacion: " + cancion.getAnoCreacion());
        }

    
    
    

        //llamados a los getters y setters en el programa principal
        Cancion cancion = canciones[0];
        System.out.println(cancion.getTitulo());  
        cancion.setTitulo("Spotify le agradece ");  
        System.out.println(cancion.getTitulo());  
    }
}