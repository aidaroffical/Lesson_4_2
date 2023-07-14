import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        System.out.println("Введите 5 строк: ");

        ArrayList<String> nameC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println(A);
        for (int i = 0; i < 5; i++) {
            B.add(scanner.nextLine());
        }
        System.out.println(B);
        Collections.reverse(B);
        System.out.println(B);

        for (int i = 0; i < A.size(); i++) {
            nameC.add(A.get(i));
            nameC.add(B.get(B.size() - i - 1));
        }

        System.out.println(nameC);

        Collections.sort(nameC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(nameC);
    }
}
