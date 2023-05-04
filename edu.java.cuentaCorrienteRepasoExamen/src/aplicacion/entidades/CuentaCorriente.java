package aplicacion.entidades;

/**
 * Clase Cuenta corriente
 * @author frand
 *
 */
public class CuentaCorriente {
	// Atributos
	
	private String dniTitular, nombreTitular;
	private float saldo;
	
	// Constructores
	// Constructor 1 -> Con todos los atributos
	public CuentaCorriente(String dniTitular, String nombreTitular, float saldo) {
		super();
		this.dniTitular = dniTitular;
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
	}
	// Constructor 2 -> Constructor vacio
	public CuentaCorriente() {
		super();
	}
	
	// Getter
	
	public String getDniTitular() {
		return dniTitular;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public float getSaldo() {
		return saldo;
	}
	
	// Setter
	
	public void setDniTitular(String dniTitular) {
		this.dniTitular = dniTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
