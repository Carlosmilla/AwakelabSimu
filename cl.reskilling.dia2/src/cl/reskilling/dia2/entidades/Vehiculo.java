package cl.reskilling.dia2.entidades;

public class Vehiculo {

    private int vehiculoid;
    private String marca;
    private String modelo;

    public Vehiculo() {
        super();
    }

    public Vehiculo(int vehiculoid, String marca, String modelo) {
        this.vehiculoid = vehiculoid;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getVehiculoid() {
        return vehiculoid;
    }

    public void setVehiculoid(int vehiculoid) {
        this.vehiculoid = vehiculoid;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "vehiculoid=" + vehiculoid +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
