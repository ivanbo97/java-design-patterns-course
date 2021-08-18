package com.ivanboyukliev.behavioralpatterns.visitor;

public class Client {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(23, "A9908SaSCA"), new Fruit(3.5f, 4.3f, "Banana"),
                new Fruit(2.3f, 3.4f, "Apple")};

        float total = calculatePrice(items);
    }

    private static float calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        float sum = 0;
        for (ItemElement element : items) {
            sum += element.accept(visitor);
        }
        return sum;
    }
}
