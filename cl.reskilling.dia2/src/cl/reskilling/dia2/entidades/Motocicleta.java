package cl.reskilling.dia2.entidades;

public class Motocicleta extends Vehiculo{

    private String patente;
    private int anioFabrica;

    public Motocicleta() {
        super();
    }

    public Motocicleta(int vehiculoid, String marca, String modelo, String patente, int anioFabrica) {
        super(vehiculoid, marca, modelo);
        this.patente = patente;
        this.anioFabrica = anioFabrica;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnioFabrica() {
        return anioFabrica;
    }

    public void setAnioFabrica(int anioFabrica) {
        this.anioFabrica = anioFabrica;
    }




    @Override
    public String toString() {
        return "Motocicleta{" +
                "patente='" + patente + '\'' +
                ", anioFabrica=" + anioFabrica +
                super.toString() +
                '}';
    }
}
