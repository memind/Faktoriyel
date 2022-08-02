import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int n, nkomb = 1, rkomb = 1, c, r, farkfakto = 1, p;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Küme Eleman Sayısını Girin: ");
        n = inp.nextInt();
        System.out.print("Kombinasyon Eleman Sayısını Girin: ");
        r = inp.nextInt();

        for (int j = 1; j <= n; j++){
            nkomb *= j; 
        }

        for (int k = 1; k <= r; k++){
            rkomb *= k; 
        }

        p = n-r;
        for (int o = 1; o <= p; o++){
            farkfakto *= o; 
        }

        c = nkomb / (rkomb * farkfakto);
        System.out.println("C(n,r) = "+c);
    }
}