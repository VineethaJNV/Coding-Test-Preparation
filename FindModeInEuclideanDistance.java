import java.util.*;
public class FindModeInEuclideanDistance {
    public static int findModeInEuclideanDistance(int arr[][]){
        int euclideanDistance[] = new int[arr.length-1];
        for(int i =0; i < arr.length - 1; i++){
            int x1 = arr[i][0];
            int y1 = arr[i][1];
            int x2 =arr[i+1][0];
            int y2=arr[i+1][1];
            System.out.println("x1 : "+x1+" y1 :"+y1+ " x2 : "+x2+" y2 "+y2);
            double distance = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
            euclideanDistance[i] =(int) distance;
            System.out.println("distance : "+euclideanDistance[i]);
        }
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i < euclideanDistance.length; i++){
            map.put(euclideanDistance[i], map.getOrDefault(euclideanDistance, 0)+1);
        }
        int mode = 0;
        for(Integer k:map.keySet()){
            if(map.get(k) > mode){
                mode = k;
            }
        }
        return mode;
    }
    public static void main(String[] args) {
        int arr[][] = {{-11, 3}, {8, 5}, {-3, 2}, {9, 17}};
        System.out.println(findModeInEuclideanDistance(arr));
    }
}
