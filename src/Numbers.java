public class Numbers {

    public static int numbersSumCalculator(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

}



