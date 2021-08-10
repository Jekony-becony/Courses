package Courses;

import java.util.Scanner;

public class Park {
    private static double cost;
    private Courses.Park.Attraction[] attractionArray;
    private String name;


    private class Attraction {
        private String attractionName;
        private double attractionCost;
        private String attractionWorkTime;

        public Attraction() {
            super();
            attractionName = "";
            attractionCost = 0;
            attractionWorkTime = "00:00";
        }

        public Attraction(String attractionName, double attractionCost, String attractionWorkTime) {
            super();
            this.attractionName = attractionName;
            this.attractionCost = attractionCost;
            this.attractionWorkTime = attractionWorkTime;
        }

        public String getAttractionName() {
            return this.attractionName;
        }

        public double getAttractionCost() {
            return this.attractionCost;
        }

        public String getAttractionWorkTime() {
            return this.attractionWorkTime;
        }
    }

    public Park() {
        super();
        this.name = "";
        this.cost = 0;
    }

    public Park(String name) {
        super();
        this.name = name;
    }

    public void setPark() {
        this.cost = 0;
        System.out.print("Введите количество аттракционов, которое Вы хотите посетить: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        attractionArray = new Park.Attraction[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Аттракцион " + (i + 1) + " ");
            System.out.print("Наименование: ");
            String str_name = sc.next();
            System.out.print("Цена: ");
            double prod_cost = sc.nextDouble();
            System.out.print("Время работы: ");
            String str_time = sc.next();
            attractionArray[i] = new Courses.Park.Attraction(str_name, prod_cost, str_time);
            this.cost = this.cost + attractionArray[i].attractionCost;
        }
    }

    public void printCheque() {
        if (this.attractionArray.length != 0) {
            System.out.println("==================================");
            System.out.println(" " + this.name + " ");
            System.out.println("==================================");
            for (int i = 0; i < this.attractionArray.length; i++) {
                System.out.printf("%3d", i + 1);
                System.out.printf("%13s", this.attractionArray[i].attractionName + " ");
                System.out.printf("%.2f", this.attractionArray[i].attractionCost);
                System.out.printf("%10s", this.attractionArray[i].attractionWorkTime + " ");
                System.out.println();
            }
            System.out.println("==================================");
            System.out.print("Общая стоимость: ");
            System.out.printf(String.format("%.2f.", this.cost));
            System.out.println();
            System.out.println("==================================");
        } else {
            System.out.println();
            System.out.println("Массив не создан");

        }
    }


}



