package cl.reskilling.dia2.entidades;

public class Bicicleta extends Vehiculo{

    private int aro;

    public Bicicleta() {
        super();
    }

    public Bicicleta(int vehiculoid, String marca, String modelo, int aro) {
        super(vehiculoid, marca, modelo);
        this.aro = aro;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }


    @Override
    public String toString() {
        return "Bicicleta{" +
                "aro=" + aro +
                super.toString() +
                '}';
    }
}
