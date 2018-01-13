package Ejercicio12Cap3;

/**
 * Created by marina on 12/01/18.
 */

/**
 * Modifique la clase cuenta(3.13) para proporcionar un metodo llamado cargar, que retire dinero de un objeto cuenta
 * Asegure que el monto a cargar no exceda el saldo de la cuenta. si lo hace, el saldo debe permanecer sin cambio y
 * el metodo debe imprimir un mensaje ue indique "El monto a cargar excede el saldo de la cuenta."
 * Modifique la clase PruebaCuenta para probar el metodo cargar".
 */
public class CuentaModificada {

  private double saldo; // variable de instancia que almacena el saldo

  //constructor
  public CuentaModificada(double saldoInicial) {
    //valida que saldoInicial sea mayor que 0.0;
    //si no lo es, saldo se inicializa con el valor predeterminado0.0;
    if (saldoInicial > 0.0)
      saldo = saldoInicial;
  } // fin del constructor de Cuenta

  // abona (suma un monto a la cuenta
  public void abonar(double monto) {
    saldo = saldo + monto; // suma el monto al saldo
  } // fin del metodo abonar

  // devuelve el saldo a la cuenta
  public double obtenerSaldo() {
    return saldo; // proporciona el valor de saldo al metodo que hizo la llamada
  }//fin del metodo obtenerSaldo

  //metodo cargar para retirar de la cuenta
  public double cargarSaldo(double retiro) {
    if (saldo >= retiro) {
      saldo = saldo - retiro;
      System.out.println("El retiro resulto con exito");
    } else {
      if (saldo < retiro) ;
      System.out.println("El retiro excede al monto que existe en su cuenta");
    }
    return saldo;
  } // fin metodo cargarSaldo
}// fin de la clase cuenta


