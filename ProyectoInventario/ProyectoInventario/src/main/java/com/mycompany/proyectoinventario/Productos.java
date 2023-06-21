//Superclase

package com.mycompany.proyectoinventario;

public abstract class Productos {
    
    protected int ID;
    protected int Cantidad;
    protected float VentaPedido;
    
    Productos(){
    
        ID = 0;
        Cantidad = 0;
        VentaPedido = 0;
        
    }
    public abstract void ElegirProducto();
    
}
