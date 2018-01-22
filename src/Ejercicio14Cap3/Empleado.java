package Ejercicio14Cap3;

/**
 * Created by marina on 16/01/18.
 */

/**
 * cree una clase llamada empleado, que incluya tres variables de instancia: un primer nombre (tipo String), un apellido
 * paterno(tipo string) y un salario mensual (double). Su clase debe tener un constructor que inicialice las tres variables
 * de instancia. Proporcione un metodo establecer y un metodo obtener para cada variable de instancia. Si el salario
 * mensual no es positivo, no establezca du valor. Escriba una aplicacion de prueba llamada PruebaEmpleado, que demuestre
 * las capacidades de la clase Empeado. Cree dos objetos Empleado y muestre el salario anual de cada onjeto. Despues,
 * proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado otra vez
 *
 */
public class Empleado {

  private String nombre;
  private String apellidoPaterno;
  private double salarioMensual;

  //constructor que inicializa las variables
  public Empleado(String nom, String apellPat, double salMen){
    nombre = nom;
    apellidoPaterno = apellPat;
    salarioMensual = salMen;

  }

  // metodo establecer
  public void establecerEmpleado(String nom, String apellPat, double salMen){
    nombre = nom;
    apellidoPaterno = apellPat;
    salarioMensual = salMen;

  }

  // metodos obtener
  public String obtenerNombreEmpleado(){
    return nombre;
  }
  public String obtenerApellidoEmpleado(){
    return apellidoPaterno;
  }
  public double obtenerSalarioMensual(){
    if (salarioMensual < 0) {
      salarioMensual = 0;
    }
    return salarioMensual;
  }

}
