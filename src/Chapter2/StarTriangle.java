package Chapter2;

public class StarTriangle {
    void main() {
        int n=5;
        for (int i=0; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
