import java.util.*;
public class CountNumbers {
    public static boolean isNonRepeating(int num){
        Set<Integer> digitSet = new HashSet<>();
        while (num > 0) {
            int digit = num % 10;
            if (!digitSet.add(digit)) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void countNumbers(List<List<Integer>>arr){
        for(int i = 0; i < arr.size(); i++){
            int lower = arr.get(i).get(0);
            int upper = arr.get(i).get(1);
            int count = 0;
            for(int j = lower; j <= upper; j++){
                int num = j;
                if(isNonRepeating(num)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        List<List<Integer>>arr = new ArrayList<>();
        List<Integer>pair1 = new ArrayList<>();
        pair1.add(1);
        pair1.add(20);
        arr.add(pair1);
         List<Integer>pair2 = new ArrayList<>();
         pair2.add(9);
         pair2.add(19);
         arr.add(pair2);
         countNumbers(arr);


    }
}
