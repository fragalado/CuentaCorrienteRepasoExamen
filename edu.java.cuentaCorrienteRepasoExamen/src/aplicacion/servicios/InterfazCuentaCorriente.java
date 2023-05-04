package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.CuentaCorriente;

/**
 * Interfaz que define los metodos que dan servicio a cuenta corriente
 * @author frand
 *
 */
public interface InterfazCuentaCorriente {
	
	/**
	 * Método que crea una cuenta con los atributos pasados como parametros y con el saldo inicial 0,0
	 * @param dni
	 * @param nombreTitular
	 * @return
	 */
	public CuentaCorriente crearCuenta(String dni, String nombreTitular);
	
	/**
	 * Método que sumará al saldo actual la cantidad pasada por parametro
	 * @param cantIngresar
	 */
	public List<CuentaCorriente> ingresarDinero(List<CuentaCorriente> listaDatos, float cantIngresar);
	
	/**
	 * Método que muestra la información disponible de la cuenta corriente
	 */
	public void mostrarInformacion(List<CuentaCorriente> listaDatos);
	
	/**
	 * Método que recibe la cantidad que se quiere sacar
	 * Devolverá el dinero si hay suficiente saldo y mostrará el saldo restante
	 * Si no hay suficiente saldo mostrará un mensaje de "no hay suficiente saldo"
	 * @param cantSacar
	 */
	public List<CuentaCorriente> sacarDinero(List<CuentaCorriente> listaDatos, float cantSacar);
}
