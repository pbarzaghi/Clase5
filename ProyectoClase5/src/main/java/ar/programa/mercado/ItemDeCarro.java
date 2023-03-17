/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.mercado;

/**
 * Esta case es es el Iten de cada producto y la cantidad que lleva
 *  @author pbarzaghi
 */
public class ItemDeCarro {
    private Producto producto;
    private int cantidad;
    private double precioItem;
    
    public ItemDeCarro(Producto producto,int cantidad){
      this.producto=producto;
      this.cantidad=cantidad;
    
    }
    
    /*
     Este metodo obtiene una tabla con los descuentos que se aplican a cada 
     producto.
     La formula que se usa es Cantidad por el precio y se multiplica
     por el porcentaje que le va quedar
     Ejemplo si tiene un 5% entonces  (1-5)= 0,95
     Cantidad 2
     Precio 40 
        = 40 * 2 * 0,95 = 76
     return double
    */
    
    
    public double getPrecioItemConDescuento(){
    
       double porcentaje=  Descuento.getDescuento(producto);
       
       return ( (cantidad * producto.getPrecio())* (1-(porcentaje/100)) );
    
    }
            
            
    
    
    
    
    
}
