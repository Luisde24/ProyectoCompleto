package io.david.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeonisaTest {
    private Leonisa leonisa;

    @Before
    public void setup(){

        leonisa = new Leonisa("234",50000,"Short","M","Amarillo","arpillera");
    }

    @Test
    public void descProntoPago(){
        Assert.assertEquals("desc de la primera condicion es: ",10, leonisa.descProntoPago(25));
    }
    @Test
    public void descProntoPago1(){
        Assert.assertEquals("desc de la segunda condicion es: ",20, leonisa.descProntoPago(4));
    }
    @Test
    public void descProntoPago2(){
        Assert.assertEquals("desc de la tercera condicion es: ",30, leonisa.descProntoPago(1));
    }
    @Test
    public void descProntoPago3(){
        Assert.assertEquals("desc de la cuarta condicion es: ",0, leonisa.descProntoPago(16));
    }



}
