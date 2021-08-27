package com.easha.javareboot.task1;

import java.util.Arrays;

public class Task1 {
    public static final double EXPENSE = 10.0;

    public static void main(String[] args) {
        String[] cars = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"}; // массив строк

        double totalCost = 0.0; // общая стоимость ГСМ

        double[] costByType = {0.0, 0.0, 0.0, 0.0}; // стоимость по типу

        for (String car : cars) {
            String[] split = car.split("-");
            int distance = Integer.parseInt(split[1]);
            double fuel = distance * EXPENSE; // считаем объем потраченного топлива

            String codeStr = split[0].substring(1, 4);

            double rate;
            int typeIndex; // индекс типа машины
            switch (codeStr) {
                case "100":
                    rate = 46.10;
                    typeIndex = 0;
                    break;
                case "200":
                    rate = 48.90;
                    typeIndex = 1;
                    break;
                case "300":
                    rate = 47.50;
                    typeIndex = 2;
                    break;
                case "400":
                    rate = 48.90;
                    typeIndex = 3;
                    break;
                default:
                    rate = 0.0;
                    typeIndex = 0;
            }

            double cost = fuel * rate;

            totalCost += cost;
            costByType[typeIndex] += cost;
        }

        System.out.println("costByType = " + Arrays.toString(costByType));
        System.out.println("totalCost = " + totalCost);
        System.out.println("min= " + min(costByType));
        System.out.println("max= " + max(costByType));
    }

    public static double max(double[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double min(double[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
