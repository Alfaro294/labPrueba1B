package jennifer_20210182;

import java.util.*;

public class EstructuraDatos {

    String titulo2;
    public void registrarLibros(){

        Set<String> titulo = new HashSet<>();
        TreeMap<String,String> AlfaLibro = new TreeMap<>();
        if (titulo.contains(titulo2)){
            System.out.println("Error titulo ya esiste");
        }
        else {
            System.out.println("-");
        }
        LinkedList<String> libros = new LinkedList<>();
        if (libros.size() > 10){
            libros.removeLast();
        }

    }

    public void buscarPorGenero(String generos){
        LinkedList<String> genero = new LinkedList<>();
        genero.add("ficcion");
        genero.add("aventura");
    }
}
