public class SumAndAvarage {
    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double avarage;
        for(int number: numbers){
            sum += number;
        }
        int arraylength = numbers.length;
        avarage = (double)sum /(double) arraylength;
        System.out.println("sum = " + sum);
        System.out.println("avarage = " + avarage);


    }
}