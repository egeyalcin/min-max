import java.util.*;

public class MinMax {
    public static void main(String[] args) {
        TreeSet<Integer> list = new TreeSet<>();
        int howMuch;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kac tane sayi gireceksiniz");
        howMuch = inp.nextInt();

        for (int i = 0; i<howMuch;i++) {
            System.out.println("Sayi giriniz");
            list.add(inp.nextInt());
        }

        System.out.println("Min : " + list.first());
        System.out.println("Max : " + list.last());

    }
}
