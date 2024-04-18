package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int m, n, f;
        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);
        logger.log("Здоров! Введи 2 числа через пробел, где первое  размер списка, второе максимальное значение элемента в списке:");
        n = sc.nextInt();
        m = sc.nextInt();
        List<Integer> arr = new ArrayList<>(list(n, m));
        logger.log(arr.toString());
        logger.log("Введи число для фильтрации списка");
        f = sc.nextInt();
        Filter filter = new Filter(f);
        logger.log(filter.filterOut(arr).toString());


    }

    private static List<Integer> list(int n, int m) {
        return new Random()
                .ints(0, m)
                .limit(n)
                .boxed()
                .collect(Collectors.toList());
    }
}