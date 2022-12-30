import java.util.Scanner;

public class peragrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int length = word.length(), odd = 0, even = 0;
        if (length>0 && length<1001){
            int[] letterCount = new int[123];
            for(int i=0; i<length; i++){
                letterCount[word.charAt(i)]++;
            }
            for (int j : letterCount) {
                if (j % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (odd > 1) {
                System.out.println(odd-1);
            } else {
                System.out.println(0);
            }
        }
    }
}
