import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = { 12 , 11 , 10 , 11 , 9 , 11 ,8,12};
       // int[] inputArray = { };
        //int[] inputArray = null;
          findingDuplicateNumber(inputArray);
    }
    public static void findingDuplicateNumber( int[] inputArray){
        int count = 0;
        HashMap<Integer,Integer>  matchingCount = new HashMap<Integer,Integer>();

        if (inputArray == null){
            System.out.println("inputArray is null");
            return ;

        }
        if (inputArray.length < 1){
            System.out.println("inputarray is empty ");
            return ;
        }
        for( int i = 0 ; i < inputArray.length - 1 ; i++){
            for ( int j = i+1 ; j < inputArray.length ; j++ ){
                if (inputArray[i] == inputArray[j]){
                    if(matchingCount.containsKey(inputArray[i])){
                        int value = matchingCount.get(inputArray[i]);
                        matchingCount.put(inputArray[i],++value);
                    }
                    else {
                        matchingCount.put(inputArray[i], 2);
                    }
                    count++;
                    System.out.println("DuplicateNumbers are : " +inputArray[i]);
                }
            }

        }
        System.out.println("count of duplicate numbers : " +count);
        for (Integer number : matchingCount.keySet())
        {
            Integer occurrences = matchingCount.get(number);
            System.out.println("Number " + number + " was repeated " + occurrences + " Times");
        }

    }
}