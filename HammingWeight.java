public class HammingWeight {
    /*Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight). */
    public static void main(String[] args) {
        int n = 00000000001011;
        int count = 0;
        while(n > 0){
            System.out.println((n&1));
            if((n&1) == 1){
                count++;
            }
            n = n / 10;
        }
        System.out.println("count = "+count);

    }
}
