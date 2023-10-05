public class PlacaBase {
    public String marca;
    public String modelo;
    public Double precio;
    public String memory;
    public String chipset;

    public String getFullName() {
        return marca + modelo + precio + memory + chipset;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getMemory() {
        return memory;
    }

    public String getChipset() {
        return chipset;
    }
    // ctr+alt+l te tabula todo el codigo para que se ajuste

}
