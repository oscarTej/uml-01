import java.util.ArrayList;

public class Libro {

    private String titulo;
    private String isbn;
    private String FechaDePublicacion;



    //el Arraylist es porque hay una N es la cardinalidad que es mas de 1

    private ArrayList<Autor> autores;
    private ArrayList < Genero> generos;

    private Prestamo prestamo;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFechaDePublicacion() {
        return FechaDePublicacion;
    }

    public void setFechaDePublicacion(String fechaDePublicacion) {
        FechaDePublicacion = fechaDePublicacion;
    }
}
