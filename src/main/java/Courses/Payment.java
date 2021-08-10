package Courses;

import java.util.Scanner;

public class Payment {
    private static double cost;
    private Product[] prodArray;
    private String name;


    private class Product {
        private String productName;
        private double productCost;

        public Product() {
            super();
            productName = "";
            productCost = 0;
        }

        public Product(String productName, double productCost) {
            super();
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public double getProductCost() {
            return this.productCost;
        }
    }

    public Payment() {
        super();
        this.name = "";
        this.cost = 0;
    }

    public Payment(String name) {
        super();
        this.name = name;
    }

    public void setPayment() {
        this.cost = 0;
        System.out.print("Введите количество товаров, которое Вы хотите приобрести: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        prodArray = new Product[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Товар " + (i + 1) + " ");
            System.out.print("Наименование: ");
            String str_name = sc.next();
            System.out.print("Цена: ");
            double prod_cost = sc.nextDouble();
            prodArray[i] = new Product(str_name, prod_cost);
            this.cost = this.cost + prodArray[i].productCost;
        }
    }

    public void printCheque() {
        if (this.prodArray.length != 0) {
            System.out.println("============================");
            System.out.println(" " + this.name + " ");
            System.out.println("============================");
            for (int i = 0; i < this.prodArray.length; i++) {
                System.out.printf("%3d", i + 1);
                System.out.printf("%13s", this.prodArray[i].productName + " ");
                System.out.printf("%.2f", this.prodArray[i].productCost);
                System.out.println();
            }
            System.out.println("============================");
            System.out.print("Общая стоимость: ");
            System.out.printf(String.format("%.2f.", this.cost));
            System.out.println();
            System.out.println("============================");
        } else {
            System.out.println();
            System.out.println("Массив не создан");

        }
    }


}

