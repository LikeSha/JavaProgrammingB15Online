package rtplSelfPractce;

public class Reple128_ArraysAverageTemperature {

    public static void main(String[] args) {

        /**
         * Given an array temps of doubles, containing temperature data, compute the average temperature.
         * Store the average in a variable called avgTemp.
         * Besides temps and avgTemp, you may use only two other variables --
         * an int variable k and a double variable named total, which have been declared.
         * Example:
         * input: 80 88 88 84 82 78 60 68
         * output: 78.5
         */

        int k = 0;  // k = temps.length
        double total = 0;
        double avgTemp = 0;
        double[] temps = { 80, 88, 88, 84, 82, 78 ,60, 68 };

        for( double eachTemp:temps){
            total = total + eachTemp;
        }
        avgTemp = total/temps.length;
        System.out.println("avgTemp = " + avgTemp);
    }
}
