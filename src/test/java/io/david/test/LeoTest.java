package io.david.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeoTest {

    private Leo leo;


    @Before
    public void setup(){

        leo = new Leo("123",20000,"panti","XL","Azul","Terciopelo");
    }

    @Test
    public void descProntoPagoTest(){

        Assert.assertEquals("La primera condicion de descuento es: ",10, leo.descProntoPago(25));
    }

    @Test
    public void descProntoPagoTest1(){

        Assert.assertEquals("ELa segunda condicion de descuento es: ",20, leo.descProntoPago(8) );
    }
    @Test
    public void descProntoPagoTest2(){

        Assert.assertEquals("ELa segunda condicion de descuento es: ",30, leo.descProntoPago(1) );
    }
    @Test
    public void descProntoPagoTest3(){

        Assert.assertEquals("ELa segunda condicion de descuento es: ",0, leo.descProntoPago(12) );
    }
    @Test
    public void descEfectivo(){

        Assert.assertEquals("El descuento generado de la primera condicion es: ", 50, leo.descEfectivo(14,"efectivo"));
    }
    @Test
    public void descEfectivo1(){

        Assert.assertEquals("El descuento generado en la segunda condicion ess de: ", 40, leo.descEfectivo(6,"efectivo"));

    }
    @Test
    public void escEfectivo2(){

        Assert.assertEquals("El descuento generado en la tercera condicion ess de: ", 10, leo.descEfectivo(20,"tarjeta"));

    }



}
