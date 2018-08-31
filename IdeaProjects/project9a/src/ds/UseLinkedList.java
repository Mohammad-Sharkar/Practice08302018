package ds;

import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("NC");
        list.add("FL");
        list.add("AZ");
        list.add("GA");
        list.add("NJ");
        /*System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.get(2));*/

//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }  //IF NO ITERATOR, WHAT IS THE OTHER OPTION? DO "FOR LOOP", so 2 choice, forloop or iterator
        for(String st:list){
            System.out.println(st);
        }





    }
}
