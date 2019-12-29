package io.david.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategoriaTest {
     private Categoria cd;

        @Before
    public void setup(){

        cd = new Categoria("braziel","Negro","XL","Algodon");
    }

         @Test
         public void getTipoPrendaTest(){

             Assert.assertEquals("El tipo de prenda es","braziel", cd.getTipoPrenda());
         }

         @Test
         public void getColorTest(){

            Assert.assertEquals("El color es ","Negro",cd.getColor());
         }

         @Test
         public void getTalla() {

            Assert.assertEquals("la talla es ", "XL",cd.getTalla());
         }

         @Test
        public void getMaterial(){

            Assert.assertEquals("el tipo material es ", "Algodon", cd.getMaterial());
         }










}
