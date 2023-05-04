package aplicacion.servicios;


import java.util.Scanner;

/**
 * Implementación de la interfaz principal
 * @author frand
 *
 */
public class ImplPrincipal implements InterfazPrincipal {

	@Override
	public int Menu() {
		int opcion=-1;
		Scanner sc = new Scanner(System.in);

		do {
			// Mostramos el menu
			System.out.println("1. Crear cuenta");
			System.out.println("2. Ingresar dinero");
			System.out.println("3. Sacar dinero");
			System.out.println("4. Mostrar información");
			System.out.println("0. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = sc.nextInt();
			if(opcion < 0 || opcion > 4)
				System.err.println("** ERROR: No se ha introducido una opción correcta **");
			
		} while (opcion < 0 || opcion > 4);
		
		
		return opcion;
	}

}
