package io.david.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductoTest {
    private Producto pcto;

    @Before
    public void setup(){

            pcto = new Producto("123",12000,"Vest","M","Verde","calicó");
    }
    @Test
    public void getCIUTest() {
        Assert.assertEquals( "el codigo es ","123",  pcto.getCIU());
    }
    @Test
    public void  setPrecioTest() {
        pcto.setPrecio(12000);
        Assert.assertEquals("el  precio es ", 12000, pcto.getPrecio());
    }

    @Test
    public  void getPrecioTest(){

        Assert.assertEquals("El precio que se obtiene es" ,12000 , pcto.getPrecio() );
    }


}
