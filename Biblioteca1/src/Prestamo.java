public class Prestamo {

    private String codigo;
    private String fechaPrestamos;
    private String fechaDevolucion;

    private Usuario usuario;

    public String getFechaPrestamos() {
        return fechaPrestamos;
    }

    public void setFechaPrestamos(String fechaPrestamos) {
        this.fechaPrestamos = fechaPrestamos;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
