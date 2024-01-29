package ra;

import java.util.Scanner;

public class Bai1_8 {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 12, 8, 3, 5, 15, 21};
        //1. Sắp xếp mảng giảm dần
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        //2. Tìm chỉ số chèn vào mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị cần chèn:");
        int value = Integer.parseInt(scanner.nextLine());
        int index = 0;
        if (value >= numbers[0]) {
            index = 0;
        } else if (value <= numbers[numbers.length - 1]) {
            index = numbers.length;
        } else {
            for (int i = 1; i < numbers.length - 1; i++) {
                if (value <= numbers[i] && value >= numbers[i + 1]) {
                    index = i + 1;
                }
            }
        }
        //3. Thực hiện chèn giá trị vào chỉ số index
        int[] newNumbers = new int[numbers.length + 1];
        for (int i = 0; i < newNumbers.length; i++) {
            if (i < index) {
                newNumbers[i] = numbers[i];
            } else if (i == index) {
                newNumbers[i] = value;
            } else {
                newNumbers[i] = numbers[i-1];
            }
        }
        //4. In mảng sau khi chèn phần tử
        System.out.println("Mảng sau khi chèn phần tử:");
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.printf("%d\t", newNumbers[i]);
        }
        System.out.printf("\n");
    }
}
