import java.util.Scanner;

public class LoopTask {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("enter n");
        int n = inp.nextInt();
        inp.close();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
