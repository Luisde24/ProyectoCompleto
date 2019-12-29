package io.david.test;

public class Teen extends Producto implements Cashable{

    public Teen(String ciu, int precio, String tipoPrenda, String talla, String color, String material){
        super(ciu, precio, tipoPrenda, talla, color, material);
    }

    public int descEfectivo(int nProductos, String modoPago) {

        int desc = 0;

        if (modoPago == "efectivo" ) {

            desc = desc + 40;
            return desc;
        }
        return 0;
    }

}
