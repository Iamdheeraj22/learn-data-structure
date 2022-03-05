import java.util.LinkedList;
import java.util.List;

public class LinkedxList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Dheeraj");
        list.add("Mukesh");
        list.add("Sitaram");
        list.add("Dinesh");
        list.add("Yogesh");
        System.out.println(list);

        System.out.println("Peek :-"+list.peek());

        System.out.println("Peek first :-"+list.peekFirst());

        System.out.println("Peek last:-"+list.peekLast());

        System.out.println("Only remove :-"+list.remove());
        System.out.println(list);

        System.out.println("remove first :-"+list.removeFirst());
        System.out.println(list);

        System.out.println("return first :-"+list.element());

        System.out.println("Contains :-"+list.contains("o"));

        System.out.println("getFirst() -->"+list.getFirst());

        System.out.println("getLast() -->"+list.getLast());

        System.out.println("getIndexOf() -->"+list.indexOf("o"));

        System.out.println("getLastIndexOf() -->"+"'"+list.lastIndexOf("o")+"'");

        System.out.println("offer() -->"+list.offer("Dheeraj"));

        System.out.println("offerFirst() -->"+list.offerFirst("Dheeraj"));

        System.out.println("offerLast() -->"+list.offerLast("Dheeraj"));

        System.out.println("pollFirst() -->"+list.pollFirst());

        System.out.println("poll() -->"+list.poll());

        System.out.println("pollLast() -->"+list.pollLast());

        System.out.println(list);

        System.out.println("Size :- "+list.size());

        System.out.println("set() -->"+list.set(2, "element"));

        System.out.println(list);
    }
}


//Linkedlist Class 
/****
 * Linkedlist is class of the collections framework , and it's always uses the doubly linklist  to store the elements.
 * 
 * 
 * Linkedlist extends the abstractlist class and implements the List interface and Deque interface.
 * 
 * 
 * //Points
 * 
 *      :-it's maintain the insertion order
 *        :- it is a non-synchronized.
 * 
 *        :-linkedlist the fast list and it's manipulation is fast because no shifting needs to occur.
 * 
 *        :- Linkedlist class can be used as list ,stack or queue.
 * 
 * 
 * We can remove the elments into linkedlist both side
 *  
 */

 //Function of the LinkedList 

    //--> add()
    //--> void add(index,element)
    //-->addAll()
    //-->addAll(index , Collection)
    //addFirst()
    //addLast()
    //clear()
    //clone()
    

    //Get the first element
        //element()
        //getFirst()
    

    //Get the element using with index
        //getIndex(index)

    //get the last element
        //getLast()

    //get the first occurence index of element in list

        //indexOf(object)


    //get the last occurence index of element in list
    
        // lastIndexOf()

    //Add the specied element as the last element of a list.
    
        //offer()

    //insert the elment at the front of list.

        //offerFirst()

    //insert the element end of list

        //offerLast()

    //Retrives the first element of list.

        //peek()
        //peekFirst() --> if null list empty
        
    //Retrives the last elementof list

        //peekLast()

    //retrive & remove in to list :-

        // poll()  -->First element
        // pollFirst() --> First(retrurn null if list empty)
        // pollLast() --> last(retrun null is list empty)


    //Remove the first element into the list 

        //remove() // removefirst()--> Retrive and remove the first element of list

        //remove(index) --> retrive and remove the element specified position

        //remove(object) --> remove the element by object of first iccurence

        //removeFirstOccurrence(Object o) --> remove the first occurence of the element.

        //removeLastOccurence(Object o)--> remove the first occurence of the element.

        //removeLast() --> It removes and returns the last element from a list.

        //set(index , element)--> it replaces the element at the specified position.

        //size()--> return the size of list


