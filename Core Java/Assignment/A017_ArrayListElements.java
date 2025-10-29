import java.util.ArrayList;

public class A017_ArrayListElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\nUsing for-each loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println("\nUsing Iterator:");
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nUsing forEach and lambda:");
        list.forEach(fruit -> System.out.println(fruit));
    }

}
