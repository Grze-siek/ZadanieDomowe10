package tablicazunikalnymiobiektami;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Trousers {
    private String fashion;
    private int size;

    public Trousers(String fashion, int size) {
        this.fashion = fashion;
        this.size = size;
    }

    public static void main(String[] args) {

        int numberOfTrousers = 3;
        Scanner scanner = new Scanner(System.in);
        Trousers trouser;
        Trousers[] trousers = new Trousers[numberOfTrousers];
        for (int index = 0; index < trousers.length; index++) {
            switch(index) {
                case 0:
                    System.out.println("Pierwsze spodnie:");
                    break;
                case 1:
                    System.out.println("Drugie spodnie:");
                    break;
                case 2:
                    System.out.println("Trzecie spodnie:");
            }
            do {
                trouser = new Trousers(scanner.nextLine(), scanner.nextInt());
                scanner.nextLine();
            }
           while(index > 0 && !isNew(trousers, trouser));
            trousers[index] = trouser;
        }
        System.out.println(Arrays.toString(trousers));
    }

    private static boolean isNew(Trousers[] trousers, Trousers trouser) {
        for (Trousers t : trousers) {
            if(trouser.equals(t)) {
                System.out.println("Prosze wprowadzic unikatowe dane!");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trousers)) return false;
        Trousers trousers = (Trousers) o;
        return size == trousers.size &&
                fashion.equals(trousers.fashion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fashion, size);
    }
}
