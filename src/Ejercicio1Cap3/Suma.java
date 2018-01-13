package Ejercicio1Cap3;

/**
 * Created by marina on 05/01/18.
 */

import javax.swing.*;

/**
 * Modifique el programa de la fig 2.7 para usar la entrada y salida con base en el cuadrado de dialogo
 * con los metodos de la clase JOptionPane. Como el metodo showInmputDialog devuelve un objeto String
 * debe convertir el objeto String que introduce el usuario a un int para usarlo en los calculos. el metodo static
 * parseInt de la clase Integer recibe un argumento String que representa un entero y devuelve el valor completo
 * como un int. El metodo parseInt es un metodo static de la clase Integer (del paquete java.lang). Si el
 * objeto String no contiene un entero valido, el prograa terminara con un error
 */
public class Suma {

  public static void main(String[] args){

    int suma;

    int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));

    int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero: "));

    suma = numero1 + numero2;
    
    JOptionPane.showMessageDialog(null,"El resultado de la suma es: " + suma);

  }
}


