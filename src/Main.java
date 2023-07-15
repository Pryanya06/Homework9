import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println(" Задача 1");
        int[] salaryArr = generateRandomArray();
        int salary1 = 0;
        System.out.println(Arrays.toString(salaryArr));
        for ( int salary: salaryArr ) {
            salary1 += salary;
        }
        System.out.println(" Сумма трат за месяц составила " + salary1 + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int minCost = salaryArray[0];
        int maxCost = salaryArray[0];

        for (int salary: salaryArray) {
            if ( salary < minCost) {
                minCost = salary;
            }
            if (salary > maxCost) {
                maxCost = salary;
            }
        }
        System.out.println( "Минимальная сумма трат за день составила " + minCost + " рублей. Максимальная сумма трат за день составила " + maxCost + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] salaryArray = generateRandomArray();

    }

    public static void task4(){
        System.out.println("Задача 4");
    }
}