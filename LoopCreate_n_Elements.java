package abc_Samouczek;

import java.util.Scanner;

public class LoopCreate_n_Elements {
	 public static void main(String[] args) {
	        
	        Scanner inp = new Scanner(System.in);
	        System.out.println("enter n number");
	        int n = inp.nextInt();
	        inp.close();
	        /***********************************/
	        for(int i=1;i<=n;i++){
	            System.out.println(i);
	        }   
	    }

}
