package io.david.test;

public class Leo extends Producto implements Cashable,ProntoPagable{


    public Leo(String ciu, int precio, String tipoPrenda, String talla, String color, String material){
        super(ciu, precio, tipoPrenda, talla, color, material);
    }

    public int descProntoPago(int prontoPago){

        if(prontoPago > 20 ){

            return 10;
        }else if(prontoPago >=2 && prontoPago<= 10){

            return 20;
        }

        else if(prontoPago < 2){


            return 30;
        }
        return 0;

    }

    public int descEfectivo(int nProductos, String modoPago) {

        int desc = 0;

        if (modoPago == "efectivo" ) {

            desc = desc + 40;
        }
        if (nProductos > 10)
        {

            desc = desc + 10;

        }

        return desc;
    }
}
