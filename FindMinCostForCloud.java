import java.util.*;
public class FindMinCostForCloud {
    static class Plan implements Comparable<Plan>{
        int startDay;
        int endDay;
        int coresAvailable;
        int priceOfEachCore;

        public Plan(int startDay, int endDay, int coresAvailable, int priceOfEachCore){
            this.startDay = startDay;
            this.endDay = endDay;
            this.coresAvailable = coresAvailable;
            this.priceOfEachCore = priceOfEachCore;
        }
        @Override
        public int compareTo(Plan p2){
            return this.priceOfEachCore - p2.priceOfEachCore;
        }
    }
    // public static int findCost(PriorityQueue<Plan>pq, int k, int n){
    //     for(int i = 0 ; i  <3; i++){
    //         // Plan p = pq.remove();
    //         System.out.print(pq.peek().startDay+" ");
    //         System.out.print(pq.peek().endDay+" ");
    //         System.out.print(pq.peek().coresAvailable+" ");
    //         System.out.println(pq.peek().priceOfEachCore+" ");  
    //         pq.remove();
    //         System.out.println(pq.size());
    //     }
    //     int cost = 0;
    //     while(k > 0 && (!pq.isEmpty())){
    //         Plan p = pq.remove();
    //         if(n >= p.startDay && n <= p.endDay){
    //             if(p.coresAvailable >= k){
    //                 cost += k * p.priceOfEachCore;
    //                 break;
    //             }else{
    //                 k -= p.priceOfEachCore;
    //                 cost += k * p.priceOfEachCore;
    //             }
    //         }
    //     }
    //     return cost;
    // }
    public static int getMinCost(List<List<Integer>>plans, int n, int k){
        if(plans.size() == 1){
            for(int i = 0; i <= n; i++){
                if(plans.get(0).get(0) == plans.get(0).get(1)){
                
                }
            }
        }
        PriorityQueue<Plan>pq = new PriorityQueue<>();
        for(int i = 0; i < plans.size(); i++){
            List<Integer>plan = plans.get(i);
            pq.add(new Plan(plan.get(0),plan.get(1) , plan.get(2), plan.get(3)));  
        }
        int size = pq.size();
        List<List<Integer>>sortedPlans = new ArrayList<>();
        for(int i = 0 ; i < size; i++){
            Plan p = pq.remove();
            List<Integer>sortedPlan = new ArrayList<>();
            sortedPlan.add(p.startDay);
            sortedPlan.add(p.endDay);
            sortedPlan.add(p.coresAvailable);
            sortedPlan.add(p.priceOfEachCore);
            sortedPlans.add(sortedPlan);
        }
        for(int i = 0; i <sortedPlans.size(); i++){
           
            for(int j = 0; j < sortedPlans.get(i).size(); j++){
                System.out.print(sortedPlans.get(i).get(j)+" ");
            }
            System.out.println();
           
        }
        int price = 0;
        for(int i = 1; i <= n; i++){
           int cores = k;
           while(cores > 0){
            for(int j = 0; j < sortedPlans.size(); j++){
                int startDay = sortedPlans.get(j).get(0);
                int endDay = sortedPlans.get(j).get(1);
                int coresAvailable = sortedPlans.get(j).get(2);
                int priceOfEachCore = sortedPlans.get(j).get(3);
                if(i >= startDay && i <= endDay){
                    if(coresAvailable >= cores){
                        price += cores*priceOfEachCore;
                        System.out.println("cores*priceOfEachCore: "+cores*priceOfEachCore);
                        cores = 0;
                        break;
                    }else{
                        price += coresAvailable*priceOfEachCore;
                        System.out.println("coresAvailable*priceOfEachCore: "+coresAvailable*priceOfEachCore);
                        cores -= coresAvailable;
                    }
                }
            }
            System.out.println(price);
           }
        }
        return price;
        // for(int i = 0 ; i  <size; i++){
        //     // Plan p = pq.remove();
        //     System.out.print(pq.peek().startDay+" ");
        //     System.out.print(pq.peek().endDay+" ");
        //     System.out.print(pq.peek().coresAvailable+" ");
        //     System.out.println(pq.peek().priceOfEachCore+" ");  
        //     pq.remove();
        //     System.out.println(pq.size());
        // }
       
    }
    public static void main(String[] args) {
        // int plansArr[][] = {{1, 3, 5, 2},
        //                  {1, 4, 5, 3},
        //                   {2, 5, 10, 1}};
        // int n = 5;
        // int k = 7;       
        int plansArr[][] = {{1, 4, 4, 5},
                         {1, 4, 2, 5},
                          {1, 2, 2, 1},
                            {2, 3, 3, 2}};
        int n = 4;
        int k = 4;          
        // int plansArr[][] = {{1, 1, 4, 5}};
        // int n = 4;
        // int k = 4;       
        List<List<Integer>>plans = new ArrayList<>();
        for(int i = 0; i < plansArr.length; i++){
            List<Integer>plan = new ArrayList<>();
            for(int j = 0; j < plansArr[0].length; j++){
                plan.add(plansArr[i][j]);
            }
            plans.add(plan);
        }
        System.out.println(plans);
        
        System.out.println("price = "+ getMinCost(plans, n, k));
    }
}
