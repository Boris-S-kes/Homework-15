package org.Skypro.Skyshop.basket;

import org.Skypro.Skyshop.product.Product;

public class ProductBasket {
    private final Product[] products = new Product[5];

    public void addProducts(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
    }

public int getTotalPrice() {
        int sum = 0;
        for (Product product : products) {
            if (product != null) {
                sum += product.getPrice();
            }
        }
                return sum;
            }
        public void printBasketContent() {
            boolean isEmpty = true;
            for (Product product : products) {
                if (product != null) {
                    isEmpty = false;
                    System.out.println(product.getName() + ":" + product.getPrice());
                }
            }
            if (isEmpty) {
                System.out.println("В корзине пусто");
                return;
            }
        }
        public boolean isProductBasketName(String name) {
            for (Product product : products) {
                if (product != null && product.getName().equals(name)) {
                    return true;
                }
            }
            return false;
        }
        public void clear() {
            for (int i = 0; i <products.length ; i++) {
                products[i] = null;

            }

        }
        }





















