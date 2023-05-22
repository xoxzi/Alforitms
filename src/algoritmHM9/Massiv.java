package algoritmHM9;

import java.util.Arrays;

public class Massiv {

    public static void main(String[] args) {
        //  Дан массив целых чисел.
        // Числа в массиве расположены в произвольном порядке (массив не отсортирован).
        // Необходимо выбрать опорный элемент (любым способом - первый элемент или элемент, расположенный посередине массива).
        // Необходимо преобразовать массив таким образом, чтобы элементы, меньшие опорного оказались в массиве левее опорного,
        // а большие - правее. Замечание: после работы алгоритма, вы должны знать, где располагается опорный элемент
        // (ведь в результате работы алгоритма он возможно переместится со своего первоначального расположения).


        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        quickSort(array, 0, array.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));


    }
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Выбираем опорный элемент
            int pivotIndex = partition(array, low, high);

            // Рекурсивно сортируем элементы меньше и больше опорного
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    public static int partition(int[] array, int low, int high) {
        // Выбираем опорный элемент
        int pivot = array[low];

        int i = low + 1;
        int j = high;

        while (i <= j) {
            // Находим элемент, больший или равный опорному, в левой части массива
            while (i <= j && array[i] < pivot) {
                i++;
            }

            // Находим элемент, меньший или равный опорному, в правой части массива
            while (i <= j && array[j] > pivot) {
                j--;
            }

            // Если найдены элементы, не находящиеся на своих местах, меняем их местами
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // Помещаем опорный элемент на свое место
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;

        // Возвращаем индекс опорного элемента
        return j;
    }


}