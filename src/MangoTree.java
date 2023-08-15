import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt(), cols = scanner.nextInt(), trees = scanner.nextInt();
        if(trees <= rows || trees%rows == 1 || trees%rows==0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
