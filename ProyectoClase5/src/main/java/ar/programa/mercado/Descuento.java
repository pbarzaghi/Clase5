/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.programa.mercado;

import java.util.HashMap;

/**
 * Esta clase es tiene una hashmap la cual tiene como clave el producto
 * y el valor el es descuento que se realiza
 * En caso que no exita el producto el valor da cero
 * @author pbarzaghi
 */
public class Descuento {
    private static HashMap tablaDesc;
    
    public void setDescuento(Producto producto,double porciento){
    
        if (tablaDesc == null){
            tablaDesc =new HashMap();
            tablaDesc.put(producto, porciento);
        }else if( tablaDesc.containsKey(producto))
            tablaDesc.replace(producto,producto);
        else
            tablaDesc.put(producto, porciento);                
                
  
    }
    
   


    /*
      Metodo getDescuento retorna el valor que es un float en caso de existir
      Caso que no exista el producto retorna cero
    */
    public static double getDescuento(Producto producto){
    
         if(tablaDesc !=null)     
         if( tablaDesc.containsKey(producto))
           return ( (Double) tablaDesc.get(producto));
       
       return 0.0;
           
    
    }
}
