package org.Skypro.Skyshop;

import org.Skypro.Skyshop.basket.ProductBasket;
import  org.Skypro.Skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product p1 = new Product("булка",120);
        Product p2 = new Product("кофе",320);
        Product p3 = new Product("чай",250);
        Product p4 = new Product("фрукты",600);
        Product p5 = new Product("молоко",48);
        Product p6 = new Product("шоколад",99);

        basket.addProducts(p1);


        basket.addProducts(p2);
        basket.addProducts(p3);
        basket.addProducts(p4);
        basket.addProducts(p5);
        basket.addProducts(p6);

        basket.printBasketContent();

        System.out.println("сумма корзины:"+ basket.getTotalPrice());
        System.out.println("есть ли чай?" + basket.isProductBasketName("чай"));
        System.out.println(" есть ШОКОЛАД" + basket.isProductBasketName("шоколад"));
        basket.clear();
        basket.printBasketContent();

    }
}
