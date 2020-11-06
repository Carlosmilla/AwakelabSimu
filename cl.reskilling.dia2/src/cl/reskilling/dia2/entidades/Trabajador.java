package cl.reskilling.dia2.entidades;

public class Trabajador {

    private int run;
    private String nombre;
    private String telefono;

    public Trabajador(){
        super();
    }

    public Trabajador(int run, String nombre, String telefono) {
        this.run = run;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "trabajador{" +
                "run=" + run +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
