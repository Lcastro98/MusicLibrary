/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musiclibrary;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase MusicLibrary contiene el método main para iniciar el programa.
 * 
 * @version 1.00.00 2022-02-17, la clase corresponde a la versión 1 del sistema.
 *
 * @author Wilmer Pérez wianpedi@gmail.com
 */
public class MusicLibrary {

    /**
     * Permite la interacción con el usuario para ver, ordenar y filtrar las canciones,
     * y crear playlist.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Library lib = new Library(new ArrayList<>()) {};
        ArrayList<Playlist> playlists = new ArrayList<>();
        
        Song s1 = new Song(1, "Día de Enero       ", "2005", 2.55F, "Pop", 
                "https://static.wikia.nocookie.net/shakira/images/3/3d/D%C3%ADa_de_Enero.jpg/revision/latest?cb=20121030143317", 
                "Escrita y producida por Shakira, es una canción de amor que cuenta como ella conoció a su por entonces novio.");
        lib.addSong(s1);
        Song s2 = new Song(2, "Sweet Child o' Mine", "1987", 5.56F, "Rock", 
                "https://images.squarespace-cdn.com/content/v1/56c240a0d51cd440f4c3f6ca/1476634391354-FD4HYCQR8TERT35AY3HN/2rcbqsh.jpg?format=1000w", 
                "Canción del grupo de hard rock Guns N' Roses. Fue publicada en su primer álbum, Appetite for Destruction.");
        lib.addSong(s2);
        Song s3 = new Song(3, "Dura               ", "2018", 3.38F, "Reguetón", 
                "https://mega963fm.sbs.co/wp-content/uploads/sites/13/2018/08/Dura080818-765x500.jpg", 
                "Canción del puertorriqueño Daddy Yankee, perteneciente a su álbum El Disco Duro.");
        lib.addSong(s3);
        Song s4 = new Song(4, "Otra como tú       ", "1993", 4.20F, "Pop", 
                "https://i.scdn.co/image/ab67616d0000b273c8729fbeebb389680f1e6ee5", 
                "Canción interpretada por Eros Ramazzotti, pertenece al álbum 'Todo historias', "
                + "que fue la versión en español del disco original en italiano titulado 'Tutte storie'");
        lib.addSong(s4);
        Song s5 = new Song (5, "Johnny B. Goode   ", "1959", 2.40F, "Rock and Roll", 
                "https://m.media-amazon.com/images/I/71DFIo6p8GL._SL1200_.jpg", 
                "Canción del cantante y guitarrista estadounidense Chuck Berry, de su tercer álbum de estudio Chuck Berry Is on Top");
        lib.addSong(s5);
        
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

