import java.util.*;

public class Collections {

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 3, 2, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Array elements in sequence:");
        for (int num : arr) {
            ;';';''

            
            System.out.print(num + " ");
        }

        System.out.println("\n\nElement frequencies:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
    

}

