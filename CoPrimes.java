public class CoPrimes {
    /*Given an array of numbers, e.g. [5, 8, 14] , return an array of numbers representing counts of coprimes to given numbers [4,4,6]. */
    public static int findGCD(int num1, int num2){
        // System.out.println("num1 : "+num1 + "num2 : "+ num2);
        int small = Math.min(num1, num2);
        int large = Math.max(num1, num2);
        int gcd = 0;
        if(large % small == 0){
            return small;
        }else{
            for(int i = 1; i <= small && i <= large; i++){
                if((small % i == 0) && (large % i == 0)){
                    gcd = i;
                }
            }
        }
        
        return gcd;
    }
    public static int getCoPrimes(int num){
        int count = 0;
        for(int i = 1; i <= num - 1; i++){
            int gcd = findGCD(num, i);
            if(gcd == 1){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int arr[] = {5, 8, 14};
        for(int i =0; i < arr.length; i++){
            int num = arr[i];
            int coPrimes = getCoPrimes(num);
            System.out.print(coPrimes+" ");
        }
    }
}


