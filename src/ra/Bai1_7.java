package ra;

public class Bai1_7 {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 12, 8, 3, 5, 15, 21};
        /*
         * 1. Các số chẵn chia hết cho 3 ở đầu mảng, tăng dần -> number1
         * 2. Các số lẻ chia hết cho 3 ở cuối mảng, giảm dần -> number3
         * 3. Các số còn lại ở giữa mảng, tăng dần -> number2
         * */
        int cntEvent = 0, cntOdd = 0, cnt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 2 == 0) {
                cntEvent++;
            } else if (numbers[i] % 3 == 0 && numbers[i] % 2 != 0) {
                cntOdd++;
            } else {
                cnt++;
            }
        }
        int[] number1 = new int[cntEvent];
        int[] number2 = new int[cnt];
        int[] number3 = new int[cntOdd];
        //1. Tách các số chẵn chia hết cho 3 ra mảng number1
        //2. Tách các số lẻ chia hết cho 3 ra mảng number3
        //3. Tách các số còn lại ra mảng number2
        int index1 = 0, index2 = 0, index3 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 2 == 0) {
                number1[index1] = numbers[i];
                index1++;
            } else if (numbers[i] % 3 == 0 && numbers[i] % 2 != 0) {
                number3[index3] = numbers[i];
                index3++;
            } else {
                number2[index2] = numbers[i];
                index2++;
            }
        }
        //4. Sắp xếp mảng number1 tăng dần, number2 tăng dần, number3 giảm dần
        for (int i = 0; i < number1.length - 1; i++) {
            for (int j = i + 1; j < number1.length; j++) {
                if (number1[i] > number1[j]) {
                    int temp = number1[i];
                    number1[i] = number1[j];
                    number1[j] = temp;
                }
            }
        }
        for (int i = 0; i < number2.length - 1; i++) {
            for (int j = i + 1; j < number2.length; j++) {
                if (number2[i] > number2[j]) {
                    int temp = number2[i];
                    number2[i] = number2[j];
                    number2[j] = temp;
                }
            }
        }
        for (int i = 0; i < number3.length - 1; i++) {
            for (int j = i + 1; j < number3.length; j++) {
                if (number3[i] < number3[j]) {
                    int temp = number3[i];
                    number3[i] = number3[j];
                    number3[j] = temp;
                }
            }
        }
        //5. copy từ number1, number2, number3 sang numbers
        int index = 0;
        for (int i = 0; i < number1.length; i++) {
            numbers[index] = number1[i];
            index++;
        }
        for (int i = 0; i < number2.length; i++) {
            numbers[index] = number2[i];
            index++;
        }
        for (int i = 0; i < number3.length; i++) {
            numbers[index] = number3[i];
            index++;
        }
        //6. In mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\t", numbers[i]);
        }
        System.out.printf("\n");
    }
}
