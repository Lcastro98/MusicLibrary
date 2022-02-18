/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musiclibrary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wilmer Pérez wianpedi@gmail.com
 */
public class MusicLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Library lib = new Library(new ArrayList<>()) {};
        ArrayList<Playlist> playlists = new ArrayList<>();
        
        Song s1 = new Song(1, "Día de Enero", "2005", 2.55F, "Pop", "imagen", "Escrita y producida por Shakira, "
                + "«Día de enero» es una canción de amor que cuenta como ella conoció a su por entonces novio, "
                + "Antonio de la Rúa, en un día de enero. La canción también hace referencia a dos famosos personajes de cómics, "
                + "\"Mutt & Jeff\", conocidos en español como \"Eneas & Benitín\".");
        lib.addSong(s1);
        Song s2 = new Song(2, "Sweet Child o' Mine", "1987", 5.56F, "Rock", "imagen", "«Sweet Child o' Mine» es una canción del grupo de hard rock Guns N' Roses. "
                + "Fue publicada en su primer álbum, Appetite for Destruction, el 21 de julio de 1987. Es la novena canción en el álbum y el tercer sencillo. "
                + "«Sweet Child o' Mine» fue el primer sencillo de Guns N' Roses en alcanzar el número uno del Billboard Hot 100, en el cual permaneció durante dos semanas en el verano de 1988.​ "
                + "También es la primera canción de la década de los 80' en llegar a mil millones de visitas en el sitio YouTube, lo consiguieron en el año 2019.");
        lib.addSong(s2);
        Song s3 = new Song(3, "Dura", "2018", 3.38F, "Reguetón", "imagen", "«Dura» es una canción del puertorriqueño Daddy Yankee, perteneciente a su álbum El Disco Duro. "
                + "Se estrenó el 18 de enero de 2018 bajo su sello El Cartel Records, y producido por el propio cantante, junto a Urba & Rome (Los Evo Jedais). "
                + "La canción tuvo un gran parecido con el hit Gasolina también de Daddy Yankee.");
        lib.addSong(s3);
        
        Scanner s = new Scanner(System.in);
        int menu1 = 0;
        do{
            System.out.println("""
                               Bienvenido al sistema Administrador de Canciones. 
                               Por favor seleccione una de las siguientes opciones:
                               1. Crear Playlist. 
                               2. Listar todas las canciones. 
                               3. Salir del sistema""");

            menu1 = Integer.parseInt(s.nextLine());
            switch (menu1){
                case 1 -> {
                    System.out.println("Por favor indique un nombre para su Playlist");
                    String name = s.nextLine();
                    Playlist pl = new Playlist(name, new ArrayList<>());
                    playlists.add(pl);
                    int menu2 = 0;
                    do{
                        System.out.println("Opciones de la playlist " + name 
                            +  "\n1. Agregar canciones.\n2. listar canciones."
                            + "\n3. Volver al menú principal");

                        menu2 = Integer.parseInt(s.nextLine());
                        switch (menu2){
                            case 1 -> {
                                System.out.println("""
                                                   ¿Desea ordenar la lista de canciones?: 
                                                   1. Ordenar de forma ascendente las canciones por Duración.
                                                   2. Ordenar de forma descendente las canciones por Duración.
                                                   3. Ordenar de forma ascendente las canciones por Año.
                                                   4. Ordenar de forma descendente las canciones por Año.
                                                   5. Sin orden """);
                                int order = Integer.parseInt(s.nextLine());
                                switch (order) {
                                    case 1 -> lib.sortByDurationAsc();
                                    case 2 -> lib.sortByDurationDesc();
                                    case 3 -> lib.sortByYearDesc();
                                    case 4 -> lib.sortByYearDesc();
                                    default -> {
                                    }
                                }
                                System.out.println("""
                                                   ¿Desea aplicar algún filtro?: 
                                                   1. Filtrar canciones por Género.
                                                   2. Filtrar canciones por Año.
                                                   3. Sin filtrar """);
                                int filter = Integer.parseInt(s.nextLine());
                                switch (filter) {
                                    case 1 -> {
                                        System.out.println("Indique el género por el que desea filtrar");
                                        String genre = s.nextLine();
                                        lib.byGenre(genre, lib.getSongs());
                                    }
                                    case 2 -> {
                                        System.out.println("Indique el año por el que desea filtrar");
                                        String year = s.nextLine();
                                        lib.byDate(year, lib.getSongs());
                                    }
                                    default -> System.out.println(lib);
                                }
                                System.out.println("Por favor indique el identificador de la canción a agregar:");
                                int song = Integer.parseInt(s.nextLine());
                                pl.addSong(lib.getSong(song));
                            }

                            case 2 -> {
                                System.out.println(pl);
                            }
                        }
                    } while (menu2 != 3);
                }
                
                case 2 -> {
                    System.out.println(lib);
                }
            }
        } while (menu1 !=3);
    }
}

