package Ejercicio15Cap3;

/**
 * Created by marina on 16/01/18.
 */

/**
 * Cree una clase fecha, que incluya tres variables de instancia: un mes (tipo int), un dia (tipo int) y un anio (tipo int)
 * Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe asumir que los valores
 * que se proporcionan son correctos. Proporcione un metodo establecer y un metodo obtener para cada variable de instancia.
 * Proporcione un metodo mostrarFecha, que muestre el mes, el dia y el anio, separados por barras diagonales (/).
 * Escriba una aplicacion de prueba llamada PruebaFecha, que demuestre las capacidades de la clase fecha.
 */
public class Fecha {

  private int mes;
  private int dia;
  private int anio;

  //este es el constructor de la clase

  public Fecha(int mess, int dias, int anios) {
    mes = mess;
    dia = dias;
    anio = anios;
  }

  //metodo para establecer el mes dia y anio.
  public void establecerMes(int mess, int dias, int anios) {
    mes = mess;
    dia = dias;
    anio = anios;
  }

  public int obtenerDia() {
    if (dia < 0 && dia > 31) {
      System.out.println("El dia ingresado es incorrecto");
    }
    return dia;
  }
  public void obtenerMes(){
    if (mes < 0 && mes > 12){
      System.out.println("El mes ingresado es incorrecto");
    }
  }
  public void obtenerAnio(){
   anio = anio;
  }

  public void mostrarFecha(){
    System.out.println("La fecha ingresada es: " + dia + " / " + mes + " / " + anio + " / ");

  }

}

