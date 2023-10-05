public class  procesador {
//pasamos de de el diagrama de clases a java
    // simbolo + es un diagrama de clases esque es publico
    // estados, clase, atributo
    public String marca;
    public String modelo;
    public Double precio;
    // comportamiento o metodo (funciones que estan dentro de una clase)
    // public es por el +, el string o double es el atributo, y marca, modelo etc.. la propiedad
    // para concatenar se pone el mas (abajo concateno)
    public String getFullName() {
        return marca + modelo + precio;
    }
        // para ponerlo con espacio en blan es  return marca + ´´ ´´+ modelo +´´ ´´+ precio;
        public String getMarca() {
            return marca;
        }
        public String getModelo(){
            return modelo;
        }
        public Double getPrecio(){
            return precio;
        }
    }

