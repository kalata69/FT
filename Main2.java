import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> classes = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        int n = Integer.parseInt(kb.nextLine());

        for (int i = 0; i < n; i++) {
            names.add(kb.nextLine());
            classes.add(kb.nextLine());
            grades.add(Double.parseDouble(kb.nextLine()));
        }

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) indices.add(i);

        indices.sort(Comparator.comparing(classes::get));

        for (int i : indices) {
            System.out.println(names.get(i) + " - " + classes.get(i) + " - " + grades.get(i));
        }

        for (int i : indices) {
            if (grades.get(i) > 5.50) {
                System.out.println(names.get(i) + " - " + classes.get(i) + " - " + grades.get(i));
            }
        }
    }
}
