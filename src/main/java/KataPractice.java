import java.util.Arrays;

public class KataPractice {
    public static String numberToString(int num) {
        // Return a string of the number here!

//        Integer iInteger = Integer.valueOf(num);
//        String result = iInteger.toString();
//        return result;

        return Integer.toString(num);
    }

    public static String highAndLow(String numbers) {
        // Code here or

//        String[] stringSpiltToArray = numbers.split(" ");
//        int size = stringSpiltToArray.length;
//        int [] numArray = new int [size];
//        for(int i = 0; i<size; i++){
//            numArray[i] = Integer.parseInt(stringSpiltToArray[i]);
//        }
//
//        Arrays.sort(numArray);
//        int lowestNumber = numArray[0];
//        int highestNumber = numArray[numArray.length - 1];
//
//        String lowestNumberString = Integer.toString(lowestNumber);
//        String highestNumberString = Integer.toString(highestNumber);
//
//
//        return highestNumberString + " " + lowestNumberString ;

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);

    }
}
