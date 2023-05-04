package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.CuentaCorriente;
import aplicacion.servicios.ImplCuentaCorriente;
import aplicacion.servicios.ImplPrincipal;
import aplicacion.servicios.InterfazCuentaCorriente;
import aplicacion.servicios.InterfazPrincipal;

public class Principal {

	public static void main(String[] args) {
		// Lista de tipo CuentaCorriente (base de datos)
		List<CuentaCorriente> listaBD = new ArrayList<>();
		
		// Inicializamos la interfaz de CuentaCorriente y Principal
		InterfazCuentaCorriente intCC = new ImplCuentaCorriente();
		InterfazPrincipal intP = new ImplPrincipal();
		
		int opcion=-1;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				opcion = intP.Menu();
			} catch (Exception e) {
				//
			}
			
			switch (opcion) {
				case 1:
					// Crear cuenta
					// Pedimos el dni del titular
					System.out.println("Introduzca el dni del titular: ");
					String dniTitular = sc.nextLine();
					// Pedimos el nombre del titular
					System.out.println("Introduzca el nombre del titular: ");
					String nombreTitular = sc.nextLine();
					listaBD.add(intCC.crearCuenta(dniTitular, nombreTitular));
					break;
				case 2:
					// Ingresar dinero
					// Pedimos la cantidad a ingresar
					System.out.println("Introduzca la cantidad a ingresar: ");
					listaBD = intCC.ingresarDinero(listaBD, sc.nextFloat());
					break;
				case 3:
					// Sacar dinero
					// Pedimos la cantidad a sacar
					System.out.println("Introduzca la cantidad a sacar: ");
					listaBD = intCC.sacarDinero(listaBD, sc.nextFloat());
					break;
				case 4:
					// Mostrar informacion
					intCC.mostrarInformacion(listaBD);
					break;
				case 0:
					break;
				default:
					System.err.println("** ERROR **");
					break;
			}
		} while (opcion != 0);
		
		sc.close();
	}

}
