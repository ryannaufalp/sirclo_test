package ShoppingCart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import ShoppingCart.Cart;

public class Tests {

    Cart keranjang = new Cart();

    @Test
    public void test1(){
        keranjang.tambahProduk("Pisang Hijau", 2);

        keranjang.tambahProduk("Semangka Kuning", 3);

        keranjang.tambahProduk("Apel Merah", 1);
        keranjang.tambahProduk("Apel Merah", 4);
        keranjang.tambahProduk("Apel Merah", 2);

        keranjang.hapusProduk("Semangka Kuning");

        keranjang.hapusProduk("Semangka Merah");

        Assert.assertEquals("Apel Merah (7)\nPisang Hijau (2)\n" ,keranjang.tampilkanCart());
    }

    @Test
    public void test2(){
        keranjang.tambahProduk("Anggur Merah", 20);
        keranjang.tambahProduk("Mangga Kuning", 100);
        keranjang.tambahProduk("Sawo Matang", 1000);
        keranjang.tambahProduk("Anggur Merah", 80);

        keranjang.hapusProduk("Mangga Kuning");
        keranjang.hapusProduk("Sawo Matang");

        Assert.assertEquals("Anggur Merah (100)\n", keranjang.tampilkanCart());
    }
}
