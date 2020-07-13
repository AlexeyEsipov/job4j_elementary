package ru.job4j.pojo;

import org.junit.Test;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ShopDropTest {

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[3];
        products[1] = new Product("Milk", 10);
        products[2] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[2], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] rsl = ShopDrop.leftShift(products, 2);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[2], is(nullValue()));
    }
}