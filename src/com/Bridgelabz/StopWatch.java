package com.Bridgelabz;

import java.util.Scanner;

public class StopWatch {
    static Scanner scanner = new Scanner(System.in);
        public static double startWatch() {
            System.out.println("Enter 1 to start watch : ");
                double startWatch = scanner.nextDouble();
                startWatch = System.currentTimeMillis();
                return startWatch;
        }
        public static double stopWatch() {
            System.out.println("Enter 0 to stop watch : ");
                double stopWatch = scanner.nextDouble();
                stopWatch = System.currentTimeMillis();
                return stopWatch;
            }

        public static void main(String[] args) {
            double timeInSec = Math.abs((startWatch() - stopWatch())) / 1000;
            System.out.println("time in sec is " + timeInSec);

        }

    }
