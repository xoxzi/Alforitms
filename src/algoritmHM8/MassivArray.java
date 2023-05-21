package algoritmHM8;

import java.util.Arrays;


    public class MassivArray {
        public static int[] addOne(int[] number) {
            int n = number.length;
            int carry = 1;
            for (int i = n - 1; i >= 0; i--) {
                int sum = number[i] + carry;
                number[i] = sum % 10;
                carry = sum / 10;
            }

            if (carry != 0) {
                int[] newNumber = new int[n + 1];
                newNumber[0] = carry;
                System.arraycopy(number, 0, newNumber, 1, n);
                return newNumber;
            }

            return number;
        }
        public static void main(String[] args) {
            int[] number = {5, 4, 6};
            int[] result = addOne(number);
            System.out.println("Результат: " + Arrays.toString(result));
        }

    }
