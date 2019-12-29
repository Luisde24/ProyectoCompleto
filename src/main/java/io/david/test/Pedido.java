package io.david.test;

import java.util.ArrayList;

public class Pedido {
    private int nProducto;
    private String modoPago;
    private int desc;
    private int prontoPago;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public Pedido(){}

    public void asignarProducto(Leonisa leonisa){
        productos.add(leonisa);
    }
    public void asignarProducto(Leo leo){
        productos.add(leo);
    }
    public void asignarProducto(Teen teen){
        productos.add(teen);
    }

    public Producto buscarProducto(String ciu){
        for(Producto pd: productos){
            if(pd.getCIU() == ciu){
                return pd;
            }
        }
        return null;
    }
}
