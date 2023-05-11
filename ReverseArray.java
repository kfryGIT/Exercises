package abc_Samouczek;

import java.util.Scanner;

public class ReverseArray {

	
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
	        System.out.println("podaj d³ugoœc tablicy n");
	        int a1=scan.nextInt();
	        int[]tab=new int[a1];
	        System.out.println("wprowadz n liczb, ka¿d¹ kolejn¹ liczbê oddziel enterem");
	        for(int i=0;i<a1;i++){
	            int a2=scan.nextInt();
	            tab[i]=a2;
	        }
	        for(int el:tab){
	          System.out.println(el);  
	        }
	        System.out.println("-------");
	        int j=tab.length-1;
	        do{
	          System.out.println(tab[j]);
	          j--;
	        }while(j>=0);
   }
}
