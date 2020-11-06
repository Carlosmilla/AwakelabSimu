package cl.reskilling.dia2.negocio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Tienda tnd = new Tienda();
		Scanner sc = new Scanner(System.in);
		
		int op = 0;
		
		do { 
			System.out.println("Menu");
			System.out.println("1 - Agregar vendedor");
			System.out.println("2 - Agregar Vehiculo");
			System.out.println("3 - Agregar Pedido");
			System.out.println("4 - Listar Vendedor");
			System.out.println("5 - salir");
			
			System.out.println("Ingresa una opcion: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1: tnd.agregarTrabajador(); break;
			case 2: tnd.agregarVehiculo(); break;
			case 3: tnd.agregarPedido(); break;
			case 4: tnd.listarTrabajador(); break;
			case 5: System.out.println("Adios!"); break;
			default: System.out.println("opcion invalida"); break;
			}
			
		} while (op != 5);
		
		sc.close();
	}
}
