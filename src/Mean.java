public class Mean {
    public static void main(String[] args) {
        int[] marks ={74,43,58,60,90,64,70};
        int sum = 0;
        int sumSquares = 0;
        double mean, stdDev;
        for(int i = 0; i < marks.length; i++){
            sum += marks[i];
            sumSquares += marks[i]*marks[i];

        }
        mean = sum/marks.length;
        stdDev = Math.sqrt(sumSquares / marks.length);
        System.out.println("mean = " + mean);
        System.out.println("stdDev = " + stdDev);


    }
}
