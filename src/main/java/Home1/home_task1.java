package Home1;

import java.util.Arrays;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.
public class home_task1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(differenceArr(new int[]{1, 5, 1, 1}, new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(divArr(new int[]{1, 5, 1, 1}, new int[]{1, 2, 3, 0})));
        System.out.println(Arrays.toString(metod2(new int[]{2, 3, 5}, 1)));
        System.out.println(metod1());
        System.out.println(metod3());
    }

    static int[] differenceArr(int[] arrFirst, int[] arrSecond) {
        if (arrFirst.length != arrSecond.length) throw new RuntimeException("Длины массивов не равны");
        else {
            int[] arrResult = new int[arrFirst.length];
            for (int i = 0; i < arrFirst.length; i++) {
                arrResult[i] = arrFirst[i] - arrSecond[i];
            }
            return arrResult;
        }
    }

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

    static float[] divArr(int[] arrFirst, int[] arrSecond) {
        if (arrFirst.length != arrSecond.length) throw new RuntimeException("Длины массивов не равны");
            //if
        else {
            float[] arrResult = new float[arrFirst.length];
            for (int i = 0; i < arrFirst.length; i++) {
                if (arrSecond[i] == 0) throw new RuntimeException("Деление на ноль");
                arrResult[i] = arrFirst[i] / arrSecond[i];
            }
            return arrResult;
        }
    }

    //Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    static int[] metod2(int[] arr, int i) {
        if (i > arr.length)
            throw new RuntimeException("Нет такого индекса");
        arr[i] = 1;
        return arr;

    }

    static int metod1() {
        int x = 10 / 0;
        return x;

    }

    static int metod3() {
        String str = null;
        return str.length();
    }
}

