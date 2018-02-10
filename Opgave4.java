import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Opgave 4

public class Opgave4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(6);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(8);

        partitions(list,5);
    }
    public static void partitions(ArrayList<Integer> list1,int E)
    {
        for (int i = 0; i < list1.size() ; i++) {

        if (E > list1.get(i)) // hvis E er større end
        {
            int that = list1.get(i); // får fat i værdien

            list1.remove(i); // fjerner værdien

            list1.add(0,that); // indsætter værdien igen men ved starten af listen
        }

        }
        System.out.println(list1); // udskriver listen for at se at den har ændret i rækkefølgen
    }
}
