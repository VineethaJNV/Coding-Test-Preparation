import java.util.*;
public class KMostRecentRequests {
    public static List<String> getLatestKRequests(List<String> requests, int k){
        HashSet<String>set = new HashSet<>();
        for(int i = requests.size() - 1; i >= 0; i--){
            String latestRequest = requests.get(i);
            System.out.println(latestRequest);
            set.add(latestRequest);
            if(set.size() == k){
                break;
            }
        }
        System.out.println("-------------------------------");
        List<String> result = new ArrayList<>();
        for(String s: set){
            System.out.print(s+" ");
            result.add(s);
        }
        return result;

    }
    public static void main(String[] args) {
        int n= 5;
       String requestsArr[] = {"item1", "item2", "item3", "item1", "item3"};
       ArrayList<String> requests = new ArrayList<>();
       for(int i = 0; i < requestsArr.length; i++){
        requests.add(requestsArr[i]);
       }
       int k = 3;
       List<String> result = new ArrayList<>();
       result = getLatestKRequests(requests, k);
    }
}
