package Ejercicio13Cap3;

/**
 * Created by marina on 12/01/18.
 */

/**
 * La clase factura, que una ferreteria podria utilizar para represetar una factura para un articulo vendido en la tienda,
 * Una Factura debe incluir cuatro piezas de informacion como variables de instancia: un numero de pieza (tipo String)
 * la descripcion de la pieza (tipo String), la canditad de articulos de ese tipo que se van a comprar (tipo int)
 * y el precio por articulo (double). su clase debe tener un constructor que inicialice las cuatro variables de instancia
 * Proporcione un metodo establecer y uno obtener para cada variable de instancia. Ademas, proporcione un metodo llamado
 * obtenerMontoFactura, que  calcule el monto de la factura (es decir, que multiplique la cantidad por el precio por articulo)
 * y despues lo devuelva como un valor double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio no es
 * positivo, debe establecerse en 0.0. Escriba una aplicacion de prueba llamada PruebaFactura, que demuestre las
 * capacidades de la clase Factura.
 */
public class Factura {

  // variables de instancia
  private String numeroPieza;
  private String descripcion;
  private int cantidadArticulos;
  private double precioArticulo;
  private double montoFactura;

  //constructor ue inicializa las 4 variables de instancia
  public Factura(String numPieza, String desc, int canArt, double precArt){
    numeroPieza = numPieza;
    descripcion = desc;
    cantidadArticulos = canArt;
    precioArticulo = precArt;
  } // fin del constructor.


  //metodo establecer las variables
  public void establecerNumeroPieza(String numPieza, String desc, int cantArt, double precioArt){
    numeroPieza = numPieza;
    descripcion = desc;
    cantidadArticulos = cantArt;
    precioArticulo = precioArt;
  }

  //metodo obtener
  public String obtenerNumeroPieza(){
    return numeroPieza;
  }
  public String obtenerDescripcionPieza(){
    return descripcion;
  }
  public int obtenercCantidadArticulosPieza(){
    return cantidadArticulos;
  }
  public double precioArticuloPieza(){
    return precioArticulo;
  }

  // metodo obtener el monto de la factura
  public double obtenerMontoFactura(){
    if (cantidadArticulos < 0){
      cantidadArticulos = 0;
    }
    if (precioArticulo < 0){
      precioArticulo = 0;
    }
    return montoFactura =  cantidadArticulos * precioArticulo;
  }

}


