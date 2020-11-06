package cl.reskilling.dia2.entidades;

public class Pedido {

    private int pedidoId;
    private String fecha;
    private String hora;
    private String nomCliente;
    private String dirInicio;
    private String dirFin;
    private String comuna;
    private int monto;
    private Trabajador trabajador;
    private Vehiculo vehiculo;

    public Pedido() {
        super();
    }

    public Pedido(int pedidoId, String fecha, String hora, String nomCliente, String dirInicio, String dirFin, String comuna, int monto, Trabajador trabajador, Vehiculo vehiculo) {
        this.pedidoId = pedidoId;
        this.fecha = fecha;
        this.hora = hora;
        this.nomCliente = nomCliente;
        this.dirInicio = dirInicio;
        this.dirFin = dirFin;
        this.comuna = comuna;
        this.monto = monto;
        this.trabajador = trabajador;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getDirInicio() {
        return dirInicio;
    }

    public void setDirInicio(String dirInicio) {
        this.dirInicio = dirInicio;
    }

    public String getDirFin() {
        return dirFin;
    }

    public void setDirFin(String dirFin) {
        this.dirFin = dirFin;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pedidoId=" + pedidoId +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", nomCliente='" + nomCliente + '\'' +
                ", dirInicio='" + dirInicio + '\'' +
                ", dirFin='" + dirFin + '\'' +
                ", comuna='" + comuna + '\'' +
                ", monto=" + monto +
                ", trabajador=" + trabajador +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
