//Superclase


package com.mycompany.proyectoinventario;

public abstract class Inventario {
    
    protected int ID;
    protected String Marca;
    protected float Precio;
    protected int Cantidad;
    protected float VentaPedido;
    
    public Inventario(){
    
        ID = 0;
        Marca = "";
        Precio = 0;
        Cantidad = 0;
        VentaPedido = 0;
        
    }
    public abstract void ElegirProducto();
    
}
