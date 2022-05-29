import java.util.*;
import java.util.stream.Collectors;

public class RemoveDublicates {
    public static void main2(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,0,1,2,2,3,4,4,5,6,6,6));

        Set<Integer> set = new LinkedHashSet<>();

        for (Integer each : list) {
            set.add(each);

        }
        System.out.println("set = " + set);



        ArrayList<Integer> collect = set.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println("collect = " + collect);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,0,1,2,2,3,4,4,5,6,6,6));
        ArrayList<Integer> newList= new ArrayList<>();

        for (Integer each : list) {

                if (!(newList.contains(each))){
                    newList.add(each);
                }





        }
        System.out.println("newList = " + newList);

    }
}
