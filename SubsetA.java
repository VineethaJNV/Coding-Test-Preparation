import java.util.*;
public class SubsetA {
    /*Given an integer array, the values of the array need to separated into two subsets A and B whose intersection is null and whose unions the entire array. The sum of values in set A must be strictly greater than sum of values in set B, and number of elements in set A must be minimal. Return the values in set A.
Complete following function definition for the same. */
    public static void findSubsetA(Integer arr[]){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer>list = new ArrayList<>();
        int arrSum = 0;
        for(int i = 0; i < arr.length; i++){
            arrSum += arr[i];
        }
        int listSum = 0;
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
            listSum += arr[i];
            arrSum -= arr[i];
            if(listSum > arrSum){
                break;
            }
        }
        Collections.sort(list);E
        System.out.println(list);


    }
    public static void main(String[] args) {
        Integer arr[] = {2,3,4,4,5,9,7,8,6,10,4,5,10,10,8,4,6,4,10,1};
       
        findSubsetA(arr);
    }
}
