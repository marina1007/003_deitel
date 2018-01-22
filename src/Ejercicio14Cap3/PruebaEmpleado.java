package Ejercicio14Cap3;

/**
 * Created by marina on 16/01/18.
 */
public class PruebaEmpleado {

  public static void main(String[] args){
    Empleado empleado1 = new Empleado("Diego", "Viani" , 15.000);
    Empleado empleado2 = new Empleado("Marina", "Toranzo", -18.000);

    System.out.println("El nombre del primer empleado es: " + empleado1.obtenerNombreEmpleado());
    System.out.println("El apellido del primer empleado es: " + empleado1.obtenerApellidoEmpleado());
    System.out.println("El salario del empleado es: "+ empleado1.obtenerSalarioMensual());

    System.out.println("El nombre del segundo empleado es: " + empleado2.obtenerNombreEmpleado());
    System.out.println("El apellido paterno del segundo empleado es: " + empleado2.obtenerApellidoEmpleado());
    System.out.println("El salario mensual del segundo empleado es: " + empleado2.obtenerSalarioMensual());
  }
}
