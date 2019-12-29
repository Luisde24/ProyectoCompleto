package io.david.test;

public class Categoria  {

    private String tipoPrenda;
    private String Color;
    private String Talla;
    private String Material;

    public Categoria(String tipoPrenda, String color,String talla, String material){
        this.tipoPrenda = tipoPrenda;
        this.Color = color;
        this.Talla = talla;
        this.Material = material;

    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public String getColor() {
        return Color;
    }

    public String getTalla() {
        return Talla;
    }

    public String getMaterial() {
        return Material;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "tipoPrenda='" + tipoPrenda + '\'' +
                ", Color='" + Color + '\'' +
                ", Talla='" + Talla + '\'' +
                ", Material='" + Material + '\'' +
                '}';
    }
}
