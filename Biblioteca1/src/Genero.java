import java.util.ArrayList;

public class Genero {

    private String nombre;
    private String descripcion;

    private String  codigo;
     private ArrayList<Libro> libros;




    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;



    }



}
