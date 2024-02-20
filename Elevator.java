import java.util.*;
public class Elevator {
    public static void findFloorSequence(String direction, int currFloor, int count, int[] floorReqArr){
        Arrays.sort(floorReqArr);
        int val = 0;
        if(direction == "UP"){
            for(int i = 0; i < floorReqArr.length; i++){
                if(floorReqArr[i] > currFloor){
                    val = i;
                    break;
                }
            }
            for(int i = val; i < floorReqArr.length; i++){
                    if(floorReqArr[i] > currFloor){
                        System.out.print(floorReqArr[i]+" ");
                }
                
            }
            for(int i = val - 1; i >= 0; i--){
                System.out.print(floorReqArr[i]+" ");
            }
        }else{
            for(int i = 0; i < floorReqArr.length; i++){
                if(floorReqArr[i] > currFloor){
                    val = i;
                    break;
                }
            }
            for(int i = val; i < floorReqArr.length; i++){
                    if(floorReqArr[i] > currFloor){
                        System.out.print(floorReqArr[i]+" ");
                }
                
            }
            for(int i = val - 1; i >= 0; i--){
                System.out.print(floorReqArr[i]+" ");
            }
        }
        
        
    }
    public static void main(String[] args) {
        String direction = "UP";
        int currentFloor = 6;
        int floorRequestsCount = 6;
        int floorRequest[] = {1, 3, 10, 7, 0, 8};
        findFloorSequence(direction, currentFloor, floorRequestsCount, floorRequest);
    }
}
