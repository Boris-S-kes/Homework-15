package org.Skypro.Skyshop;

import org.Skypro.Skyshop.product.Product;
import org.Skypro.Skyshop.basket.ProductBasket;
import org.Skypro.Skyshop.product.SimpleProduct;
import org.Skypro.Skyshop.product.FixPriceProduct;
import org.Skypro.Skyshop.product.DiscountedProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        Product milk = new SimpleProduct("молоко",50);
        Product coffee = new DiscountedProduct("кофе",350,11);
        Product meat = new FixPriceProduct("мясо с фиксированной ценой");
        Product cookie = new SimpleProduct("печенье",369);
        Product sugar = new DiscountedProduct("Сахар",55,20);
        Product stew = new DiscountedProduct("тушенка",180,30);

        basket.addProducts(sugar);



        basket.addProducts(meat);
        basket.addProducts(milk);
        basket.addProducts(coffee);
        basket.addProducts(cookie);
        basket.addProducts(stew);

        basket.printBasketContent();

        System.out.println("сумма корзины:"+ basket.getTotalPrice());
        System.out.println("есть в продаже печенье?" + basket.isProductBasketName("печенье"));
        System.out.println(" есть в продаже кофе ?" + basket.isProductBasketName("кофе"));
        basket.clear();
        basket.printBasketContent();

    }
}

