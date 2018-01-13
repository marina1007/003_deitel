package Ejercicio12Cap3;

import java.util.Scanner;

/**
 * Created by marina on 12/01/18.
 */
public class PruebaCuentaModificada {
  //el metodo main empieza la ejecucion de la aplicacion de Java

  public static void main(String[] args){

    CuentaModificada cuentaModificada1 = new CuentaModificada(50.000); // crea el objeto cuenta
    CuentaModificada cuentaModificada2 = new CuentaModificada(-7.53); // crea otro objeto cuenta

    //muestra el saldo inicial de cada objeto
    System.out.printf("Saldo de cuenta 1: $%.2f\n", cuentaModificada1.obtenerSaldo());
    System.out.printf("Saldo de cuenta 2: $%.2f\n\n", cuentaModificada2.obtenerSaldo());

    //crea objeto Scanner para obtener la entrada de la ventana de comandos
    Scanner entrada = new Scanner(System.in);
    double montoDeposito; // deposita el monto escrito por el usuario

    System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador
    montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
    System.out.printf("\nsumando %.2f al saldo de cuenta1\n\n", montoDeposito);
    cuentaModificada1.abonar(montoDeposito); // suma al saldo de cuentaModificada1

    //muestra los saldos
    System.out.printf("Saldo de cuenta1: $%.2f\n", cuentaModificada1.obtenerSaldo());
    System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuentaModificada2.obtenerSaldo());

    System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador
    montoDeposito = entrada.nextDouble(); //obtiene entrada del usuario

    System.out.printf("\nsumando %.2f al saldo de cuenta2\n\n", montoDeposito);
    cuentaModificada2.abonar(montoDeposito); // suma al saldo de cuenta2

    //muestra los saldos
    System.out.printf("Saldo de la cuenta1: $%.2f\n", cuentaModificada1.obtenerSaldo());
    System.out.printf("Saldo de cuenta2: $%.2f\n", cuentaModificada2.obtenerSaldo());

    //muestra saldos luego del retiro
    System.out.print("Escriba el monto a retirar para la cuenta1: ");
    double retiroCuenta;
    retiroCuenta = entrada.nextDouble();
    System.out.printf("\nretirando $%.2f al saldo de la cuenta\n\n", retiroCuenta);
    cuentaModificada1.cargarSaldo(retiroCuenta);

    System.out.print("Escriba el monto a retirar para la cuenta2: ");
    retiroCuenta = entrada.nextDouble();
    System.out.printf("\nretirando $%.2f al saldo de la cuenta\n\n", retiroCuenta);
    cuentaModificada2.cargarSaldo(retiroCuenta);

  }//fin de main
} // fin de la clase PruebaCuentaModificada


