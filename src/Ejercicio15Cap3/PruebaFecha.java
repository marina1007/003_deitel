package Ejercicio15Cap3;

import javax.swing.*;

/**
 * Created by marina on 17/01/18.
 */
public class PruebaFecha {

  public static void main(String[] args){

    String d1 = JOptionPane.showInputDialog(null, "Ingrese el dia: ", "Fecha ", JOptionPane.INFORMATION_MESSAGE);
    int dias = Integer.parseInt(d1);

    String m1 = JOptionPane.showInputDialog(null, "Ingrese el mes: ", "Fecha ", JOptionPane.INFORMATION_MESSAGE);
    int mes = Integer.parseInt(m1);

    String a1 = JOptionPane.showInputDialog(null, "Ingrese el anio: ", "Fecha ", JOptionPane.INFORMATION_MESSAGE);
    int anio = Integer.parseInt(a1);

    Fecha fecha1 = new Fecha(12, 15, 1689);

    fecha1.obtenerMes();
    fecha1.obtenerDia();

    }
  }

