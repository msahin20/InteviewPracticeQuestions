import java.util.*;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.addAll(Arrays.asList(10,2,3,4,5));
        Map<String, Object> map1 = new HashMap<>();


        map1.put("Age", 43);
        map1.put("FName", "Murat");
        map1.put ("LName", "Sahin");
        map1.put("Employed", true);



        System.out.println(map1);

        for (Map.Entry<String, Object> eachMap : map1.entrySet()) {
            //System.out.println("Printing each Map");
            //System.out.println(eachMap);
            System.out.println("______________________________");

            if(eachMap.getValue() instanceof String){
            }
        }

        //System.out.println(map1);




        Collections.sort(list);
        //System.out.println("list = " + list);

        list.removeIf(n -> n<5);

        System.out.println("list = " + list);

        Iterator<Integer> it = list.iterator();

        System.out.println("it.hasNext() = " + it.hasNext());

        while (it.hasNext()){
            it.next();
            System.out.println(it.toString());
            }
        }
        //System.out.println(list);


    }

