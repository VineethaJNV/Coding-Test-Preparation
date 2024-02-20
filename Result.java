import java.util.*;
public class Result {
    public static long dominatingXorPairs(List<Integer>arr){
        long count = 0;
        for(int i =  0; i < arr.size() - 1; i++){
            for(int j = i+1; j < arr.size(); j++){
                System.out.println(i + " "+ j);
                if((arr.get(i)^arr.get(j)) > (arr.get(i)&arr.get(j))){
                    count++;
                }
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        List<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(5);
        arr.add(7);
        System.out.println(dominatingXorPairs(arr));
    }
}


public static long dominatingXorPairs(List<Integer> arr) {
    long count = 0;
    for (int i = 0; i < arr.size() - 1; i++) {
        for (int j = i + 1; j < arr.size(); j++) {
            System.out.println(i + " " + j);
            if (arr.get(i).equals(arr.get(j))) {
                // Handle the case where elements are equal
                // You might want to increment count or perform a different action
            } else if ((arr.get(i) ^ arr.get(j)) > (arr.get(i) & arr.get(j))) {
                count++;
            }
        }
    }
    return count;
}
