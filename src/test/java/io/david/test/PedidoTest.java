
package io.david.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;

public class PedidoTest {
    private Pedido pedido;
    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;

    @Before
    public void setup(){

        pedido = new Pedido();
        leonisa = new Leonisa("234",50000,"Short","M","Amarillo","arpillera");
        leo = new Leo("123",20000,"panti","XL","Azul","Terciopelo");
        teen = new Teen("145",30000,"socks","s","verde","raso");

    }

    @Test
    public void buscarProducto(){

        //PARA BUSCAR UN OBJETO TIPO NULL
        Assert.assertNull("Buscar el pedido solicitado",  leonisa.getCIU());
    }

    @Test
    public void buscarProducto2(){


        Assert.assertNull("Buscar el pedido solicitado",  leo.getCIU());
    }
    @Test
    public void buscarProducto3(){


        Assert.assertNull("Buscar el pedido solicitado",  teen.getCIU());
    }
}
