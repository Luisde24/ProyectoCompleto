package io.david.test;

public class Producto {

private String CIU;
private int precio;
private Categoria cat;



    public Producto(String CIU, int precio, String tipoPrenda, String talla, String color, String material) {
        cat = new Categoria(tipoPrenda, talla, color, material);
        this.CIU = CIU;
        this.precio = precio;
    }




    public String getCIU() {
        return CIU;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                '}';
    }


}



