package cl.reskilling.dia2.negocio;

import cl.reskilling.dia2.entidades.Bicicleta;
import cl.reskilling.dia2.entidades.Motocicleta;
import cl.reskilling.dia2.entidades.Pedido;
import cl.reskilling.dia2.entidades.Trabajador;
import cl.reskilling.dia2.entidades.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    private List<Trabajador> ltrabajadores;
    private List<Vehiculo> lvehiculos;
    private List<Pedido> lpedidos;
    
    private Scanner scanner;

    Tienda (){
        this.ltrabajadores = new ArrayList<Trabajador>();
        this.lvehiculos = new ArrayList<Vehiculo>();
        this.lpedidos = new ArrayList<Pedido>();
        this.scanner = new Scanner(System.in);
    }

    public List<Trabajador> getLtrabajadores() {
        return ltrabajadores;
    }

    public void setLtrabajadores(List<Trabajador> ltrabajadores) {
        this.ltrabajadores = ltrabajadores;
    }

    public List<Vehiculo> getLvehiculos() {
        return lvehiculos;
    }

    public void setLvehiculos(List<Vehiculo> lvehiculos) {
        this.lvehiculos = lvehiculos;
    }

    public List<Pedido> getLpedidos() {
        return lpedidos;
    }

    public void setLpedidos(List<Pedido> lpedidos) {
        this.lpedidos = lpedidos;
    }
    
    public void agregarTrabajador() {
    	Trabajador trab = new Trabajador();
    	System.out.println("Crear trabajador");
    	System.out.println("Ingrese RUN: ");
    	int run = this.scanner.nextInt();
    	trab.setRun(run);
    	System.out.println("Ingrese Nombre: ");
    	String nom = this.scanner.next();
    	trab.setNombre(nom);
    	System.out.println("Ingrese Telefono: ");
    	String tel = this.scanner.next();
    	trab.setTelefono(tel);
    	
    	this.ltrabajadores.add(trab); // se agrega el trabajador nuevo
    	
    }
    
    public void listarTrabajador() {
    	if (this.ltrabajadores.size()<=0) {
    		System.out.println("no hay elementos");
    	} else {
    		System.out.println("Run | Nombre | Telefono");
    		for(int i=0;i<ltrabajadores.size();i++) {
    			Trabajador t = ltrabajadores.get(i);
    			System.out.println(t.getRun() +" | "+ t.getNombre() + " | "+ t.getTelefono());
    		}
    	}
    }
    
    public void agregarVehiculo() {
    	
    	System.out.println("marca: ");
    	String marca = this.scanner.next();
    	System.out.println("modelo: ");
    	String modelo = this.scanner.next();
    	
    	int ultid = this.lvehiculos.size()+1;
    	System.out.println("1 moto , 2 bici");
    	int tipo = this.scanner.nextInt();
    	
    	if (tipo == 1) {
    		Motocicleta moto = new Motocicleta();
    		
    		System.out.println("año de fabricacion= ");
    		int anio = this.scanner.nextInt();
    		System.out.println("patente: ");
    		String patente = this.scanner.next();
    		
    		moto.setVehiculoid(ultid);
    		moto.setAnioFabrica(anio);
    		moto.setMarca(marca);
    		moto.setModelo(modelo);
    		moto.setPatente(patente);
    		
    		lvehiculos.add(moto);
    	} else {
    		Bicicleta bici = new Bicicleta();
    		System.out.println("aro: ");
    	    int aro = this.scanner.nextInt();
    	    
    	    bici.setVehiculoid(ultid);
    	    bici.setModelo(modelo);
    	    bici.setMarca(marca);
    	    bici.setAro(aro);
    	    
    	    lvehiculos.add(bici);
    	}
    	
    }
    
    public void agregarPedido() {
    	
    	Pedido p = new Pedido();
    	
    	int ultid = this.lpedidos.size()+1;
    	
    	System.out.println("fecha: ");
    	String fecha = this.scanner.next();
    	
    	System.out.println("hora: ");
    	String hora = this.scanner.next();

    	System.out.println("cliente: ");
    	String cliente = this.scanner.next();

    	System.out.println("direccion ini: ");
    	String dirin = this.scanner.next();

    	System.out.println("direccion fin: ");
    	String dirfin = this.scanner.next();

    	System.out.println("comuna: ");
    	String comuna = this.scanner.next();

    	System.out.println("monto: ");
    	int monto = this.scanner.nextInt();
    	
    	System.out.println("run: ");
    	int run = this.scanner.nextInt();
    	
    	Trabajador tr = new Trabajador();
    	
    	for (int i=0; i<this.ltrabajadores.size(); i++) {
    		if(this.ltrabajadores.get(i).getRun() == run) {
    			tr = this.ltrabajadores.get(i);
    		}
    			
    	}
    	
    	System.out.println("id vehiculo: ");
    	int idvh = this.scanner.nextInt();
    	
    	Vehiculo vh = new Vehiculo();
    	
    	for (int j=0;j<this.lvehiculos.size();j++) {
    		if(this.lvehiculos.get(j).getVehiculoid() == idvh) {
    			vh = lvehiculos.get(j);
    		}
    	}
    	
    	p.setComuna(comuna);
    	p.setDirFin(dirfin);
    	p.setDirInicio(dirin);
    	p.setFecha(fecha);
    	p.setHora(hora);
    	p.setMonto(monto);
    	p.setNomCliente(cliente);
    	p.setPedidoId(ultid);
    	p.setTrabajador(tr);
    	p.setVehiculo(vh);
    	
    	this.lpedidos.add(p);
    	
    	System.out.println("pedido agregado");
    }
}

