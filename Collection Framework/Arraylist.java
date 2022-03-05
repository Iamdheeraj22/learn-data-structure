import java.util.*;
/****
 * Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime.
 * 
 * The ArrayList in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of List interface
 * 
 * It inherits the AbstractList class and implements List interface.
 * 
 * Java ArrayList class maintains insertion order.
 * Java ArrayList allows random access because array works at the index basis.
 * 
 * Java ArrayList class extends AbstractList class which implements List interface. The List interface extends the Collection
and Iterable interfaces in hierarchical order.


manipulation is little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.

Java new generic collection allows you to have only one type of object in a collection. Now it is type safe so typecasting is not required at runtime.


 */

 /****
  * Ways to the iterate the elements of the collection in java

        :- iterator interator 
        :- for loop
        :- for each loop
        :- listiterator interface
        :- for each() method
        :- forEachRemaining
  */

public class Arraylist {
    public static void main(String[] args) {
        List<String> array=new ArrayList<String>();
        array.add("Dheeraj");
        array.add("Dheeraj Prajapat");
        array.add(1,"a");

        //toArray()
        array.toArray();

        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }

        //Traversal through iterator
       System.out.println("Print arraylist through Iterator....");
       Iterator<String> iterator=array.listIterator();

       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }
       
       //Remove the elements between given range
       //Sort the arraylist elements 
       
       //Collections.sort(Array)


        //Here, element iterates in reverse order through List iterator
        ListIterator<String> listIterator=array.listIterator(array.size());
        while(listIterator.hasPrevious()){
            String str=listIterator.previous();
            System.out.println(str);
        }


       //Remove the element into arraylist
       array.remove(1);

       array.remove("a");


       //Clear elements
       array.clear();

       //Get the size
       System.out.println(array.size());

       ////check list empty 
       System.out.println(array.isEmpty());

       //Check the value is present in list or not
       System.out.println(array.contains("o"));

       //set the values at fixed position
       array.set(0,"hjkh");
       
    }
}


//Difference between list and arraylist

/****
 * Difference between List and ArrayList:-

    :- List is an interface and arraylist is a class of collections framework.

    :- List is extends the Collection framework and ArrayList implements the list interface and extends the Abstractlist class.

    :- Namespace :-

            :- list ==> System.Collection.Generic
            :- arrayLsit ==> System.collection

    :- List stores the element sequesntially and identified by the index number.

        And arraylist is a dynamic array ; it can grow when required.

    
    :-List is provides the faster manipulationof objects.Arraylist provide the slow manipulationon objects compared to list
 * 
 */