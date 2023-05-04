package aplicacion.servicios;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.CuentaCorriente;

/**
 * Implementacion de la interfaz cuenta corriente
 * @author frand
 *
 */
public class ImplCuentaCorriente implements InterfazCuentaCorriente {

	@Override
	public CuentaCorriente crearCuenta(String dni, String nombreTitular) {
		return new CuentaCorriente(dni, nombreTitular, 0);
	}

	@Override
	public List<CuentaCorriente> ingresarDinero(List<CuentaCorriente> listaDatos, float cantIngresar) {
		
		// Obtenemos la cuenta corriente a ingresar dinero
		CuentaCorriente aux = buscaCuentaPorDni(listaDatos);
		
		// Ingresamos el dinero
		aux.setSaldo(aux.getSaldo() + cantIngresar);
		
		// Mostramos mensaje con el saldo actual
		System.out.println("Saldo actual: " + aux.getSaldo());
		
		// Devolvemos la lista actualizada
		return listaDatos;
	}

	@Override
	public void mostrarInformacion(List<CuentaCorriente> listaDatos) {
		
		// Obtenemos la cuenta corriente que vamos a mostrar informacion
		CuentaCorriente aux = buscaCuentaPorDni(listaDatos);
		// Mostramos los datos
		System.out.println("DNI: "+aux.getDniTitular()+"; Nombre: "+ aux.getNombreTitular()+"; Saldo: "+aux.getSaldo());
	}

	@Override
	public List<CuentaCorriente> sacarDinero(List<CuentaCorriente> listaDatos, float cantSacar) {
		
		// Obtenemos la cuenta corriente a sacar dinero
		CuentaCorriente aux = buscaCuentaPorDni(listaDatos);
		
		// Comprobamos que tenga saldo suficiente
		// Si tiene saldo suficiente restaremos la cantidad al saldo actual y mostraremos el saldo actual
		if(aux.getSaldo() < cantSacar)
			System.out.println("Saldo insuficiente. Saldo actual: " +aux.getSaldo());
		else
		{
			aux.setSaldo(aux.getSaldo() - cantSacar);
			System.out.println("Saldo actual: " +aux.getSaldo());
		}
		// Devolvemos la lista actualizada
		return listaDatos;
	}
	
	/**
	 * Método que devuelve la Cuenta corriente que contenga el dni pedido
	 * @param listaDatos
	 * @return
	 */
	private CuentaCorriente buscaCuentaPorDni(List<CuentaCorriente> listaDatos) {
		// Scanner para pedir el dni
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el dni
		System.out.print("Introduzca el dni del titular: ");
		String dniTitular = sc.nextLine();
		
		for (CuentaCorriente aux : listaDatos) {
			if(aux.getDniTitular().equals(dniTitular))
				return aux;
		}
		
		// Si llega aqui es porque no existe ninguna cuenta con el dni introducido
		System.err.println("** ERROR: No existe ninguna cuenta con el dni: " + dniTitular + " **");
		return null;
	}

}
