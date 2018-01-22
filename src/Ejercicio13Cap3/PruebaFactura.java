package Ejercicio13Cap3;

/**
 * Created by marina on 13/01/18.
 */
public class PruebaFactura {

  public static void main(String[] args){

    double monto;
    Factura factura1 = new Factura("1250", "tornillos", 18, 15.3);
    monto = factura1.obtenerMontoFactura();

    System.out.println("El numero de la pieza es: " + factura1.obtenerNumeroPieza());
    System.out.println("La descripcion del articulo es: " + factura1.obtenerDescripcionPieza());
    System.out.println("La cantidad del articulo es: " + factura1.obtenercCantidadArticulosPieza());
    System.out.println("El precio por articulo es de : " + factura1.precioArticuloPieza());

    System.out.printf(" El monto de la factura es: $%.2f\n" , monto);
  }
}


