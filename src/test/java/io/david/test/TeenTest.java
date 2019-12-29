package io.david.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeenTest {
private Teen ten;

  @Before
  public void setup(){

      ten = new Teen("145",30000,"socks","s","verde","raso");
  }

  @Test
    public void descEfectivo(){

      Assert.assertEquals("El decuento de la  condicion es: ", 40, ten.descEfectivo(12,"efectivo"));
  }



}
