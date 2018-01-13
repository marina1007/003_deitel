package Ejercicio11Cap3;

/**
 * Created by marina on 10/01/18.
 */

/**
 * Modifique la clase LibroCalificaciones (3.10) de la sig manera
 * a) Incluya una segunda variable de instancia String, que represente el nombre del instructor del curso.
 * b) Proporcione un metodo establecer para modificar el nombre del instructor,
 * y un metodo oobtener para conseguir el nombre.
 * c) Modifique el constructor para especificar dos parametros uno para el nombre del curso y otro para
 * el del instructor
 * d) Modifique el metodo mostrarMensoje, de tal forma que primero imprima el mensaje de bienvenida y el nombre del curso
 * seguido de "Este curso es presentado por: " y el nombre del instructor.
 */

//3.10 LibroCalificaciones.java
// la clase LibroCalificaciones con un constructor para inicializar el nombre del curso

public class LibroCalificacionesModificada {

  private String nombreDelCurso; // nombre del curso para este LibroCalificaciones
  private String nombreInstructor; // nombre del instructor
  /**
   * a) Incluya una segunda variable de instancia String, que represente el nombre del instructor del curso.
   */
  /**
   * * c) Modifique el constructor para especificar dos parametros uno para el nombre del curso y otro para
   * el del instructor
   */
  // el constructor inicializa nombreDelCurso con un argumento String
  public LibroCalificacionesModificada (String nombre, String nomInst){//el nombre del constructor es el nombre de la clase

    nombreDelCurso = nombre; // inicializa nombreDelCurso
    nombreInstructor = nomInst;
  } // fin del constructor

  // metodo para establecer el nombre del curso
  public  void establecerNombreDelCurso(String nombre){
    nombreDelCurso = nombre; // almacena el nombre del curso
  } // fin del metodo establecerNombreDelCurso

  /**
   * b) Proporcione un metodo establecer para modificar el nombre del instructor,
   * y un metodo oobtener para conseguir el nombre.
   */
  public void establecerNombreInstructor(String nomInst){
    nombreInstructor = nomInst; // almacena el nombre del instructor
  }

  // metodo para obtener el nombre del curso
  public String obtenerNombreDelCurso(){
    return nombreDelCurso;
  } // fin del metodo obtenerNombreDelCurso
  public String obtenerNombreInstructor(){
    return nombreInstructor;
  }

  /**
   * d) Modifique el metodo mostrarMensoje, de tal forma que primero imprima el mensaje de bienvenida y el nombre del curso
   * seguido de "Este curso es presentado por: " y el nombre del instructor.
   */
  // muestra un mensaje de bienvenida al usuario de LibroCalificacionesModificada
  public void mostrarMensaje(){
    // esta instruccion llama a obtenerNombreDelCurso para obtener el nombre de curso que este LibroCalificaciones
    // representa
    System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n Este curso es presentado por: \n%s!\n", obtenerNombreDelCurso(),obtenerNombreInstructor());
  }// fin del metodo mostrarMensaje

}// fin de la clase LibroCalificaciones


