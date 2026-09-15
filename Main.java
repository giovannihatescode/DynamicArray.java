public class Main {
    public static void main(String[] args) {

        DynamicArray<String> names = new DynamicArray<>();

        names.add("John");
        names.add("Maria");
        names.add("David");

        System.out.println("Size: " + names.size());

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        names.remove(1);

        System.out.println("After removing:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}