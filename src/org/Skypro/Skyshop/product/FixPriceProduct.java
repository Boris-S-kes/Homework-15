package org.Skypro.Skyshop.product;


public class FixPriceProduct extends Product{
    private static final int fixPrice1 = 888;

    public FixPriceProduct(String name) {
        super(name);
    }
    @Override
    public int getPrice() {
        return fixPrice1;
    }
    @Override
    public boolean isSpecial() {
        return true;
    }
    @Override
    public String toString() {
        return getName() + "Фиксированная цена" + fixPrice1;
    }
}
