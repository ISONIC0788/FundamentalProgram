import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListRe {
    public static void main(String[] args) {
        // stydiang abaout array list
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Fold");
        cars.add("Mozda");
        // inserting element on the biginning of
        cars.add(0,"Suzuki");
        System.out.println(cars);
        System.out.println("The items on index 1 is :" + cars.get(1));
        // to set the array list on specified index
        cars.set(4,"Ebedi");
        System.out.println(cars);

        // to remove items
        cars.remove(3);
        System.out.println(cars);

        System.out.println("The array list size is ="+ cars.size());
       // to print all arrary list

        Collections.sort(cars);
        // allow to sort in array

        for (int i = 0; i < cars.size() ; i++) {
            System.out.println(cars.get(i));
        }

    }
}
