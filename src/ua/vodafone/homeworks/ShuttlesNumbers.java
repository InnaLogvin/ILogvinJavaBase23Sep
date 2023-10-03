package ua.vodafone.homeworks;

public class ShuttlesNumbers {
    public static void main(String[] args) {
        int[] shuttleNumberArray = new int[100];
        int count = 0;

        for (int i = 1; count < shuttleNumberArray.length; i++) {

            if (isNotContainingFourOrNine(i)) {
                shuttleNumberArray[count] = i;
                count++;
            }
        }
        for (int number : shuttleNumberArray) {
            System.out.println("Shuttle's number: " + number);
        }
    }

    private static boolean isNotContainingFourOrNine(int number) {
        while (number > 0) {
            System.out.println("number: " + number);
            int digit = number % 10;
            System.out.println("number % 10 (остаток после деления на 10): " + digit);

            if (digit == 4 || digit == 9) {
                return false;
            }
            number /= 10;
            System.out.println("number / 10 (без последней цифры): " + number);
            System.out.println("--------------");
        }

        return true;
    }
}
