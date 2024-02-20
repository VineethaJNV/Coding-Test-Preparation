import java.util.HashSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class GCD {
    public static int calculateGCD(int num1, int num2){
        int GCD = 0;
        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                GCD = i;
            }
        }
        return GCD;
    }
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i < 14; i++){
            System.out.print("i = "+14+" j = "+i+" GCD =");
            int GCD = calculateGCD(14, i);
            System.out.println(GCD);
            if(GCD== 1){
               count++;
            }

            
        }
        System.out.println("coprimes = "+count);
        
    }
}
