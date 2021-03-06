import java.util.Arrays;
/*@ author SupriyaMadupathi
     * The goal for the list is to store items.
     * How are we going to store the items in the list?
     * An array would be good. Right?
     * So, when we do not what we are going to have in the list
     * We need to create a Generic list to store the items

     * Here E is a type parameter, and it will be replaced with
        actual type when the object got created.
     */
public class List<E> {
    //Implement all the methods mentioned to build a ListADT

    /*
     * The goal for the list is to store items.
     * How are we going to store the items in the list?
     * An array would be good. Right?
     * So, assume we are only going to have ints in the list
     * We need to create an array of ints to store the items
     * added to the list.
     *
     * Create a variable of the type int[]
     * Use the private access specifier
     * Why private access specifier and why not public?
     * Well, we don't want the array to be manipulated by
     * methods that are outside the List class.
     * If you allow methods outside the List class to manipulate
     * the array then there is a possibility of having a corrupted
     * list i.e., a list with incorrect items.
     * This is not desirable and so having private access specifer
     * will protect the array such corruption.
     * This is a hard concept to understand. Discuss with your mentor.
     *
    */
    // declare a private int[]
    // don't create the array yet using new
    // that's the job of the List constructor

    /*
     * What are the other class variables needed for creating a list?
     * How about keeping track of the size of the list?
     * If you add 2 items to the list then the size should be 2.
     * Let's think about the size of the list by comparing it to the
     * length of the array. Do they mean the same?
     * No, Array length signifies the maximum number of items
     * you can store in the list. Whereas, the size of the list
     * denotes the number of items in the list. Makes sense?
     * Here is an example:
     * array = [1,2,3,0,0,0,0,0,0,0]
     * The length of the array is 10 and size is 3.
     * This means you can store 10 items in the list and
     * currently it has 3 items.
     * So, to keep track of the size we need a variable called size
     * Again, we use private as we don't want that size variable
     * to be accessed by the methods that are outside of the List class.
     *
     */

    // declare a private int size
    // again, don't initialize it here
    // variable initialization should be done in the constructor
    /**
     *
     */
    private E[] array;
    /**
     * integer array variable.
     */
    private int count;
    /**
     * count variable.
     */
    /*
     * The purpose of the constructor is to initialize the class variables with
     * some default values.
     */
    /**
     * integer variable.
     */
    // private static final int TEN = 10;
    /**
     * Constructs the object.
     */
    public List() {

        // what are the two variables to be initialized here? think about the
        // private variables described above. What should be the default values?
        // In the case of the list, it should be empty but it should be
        // initialized with an array size like 10

        // Think about the initial value for size.
        // How many items do we have in the list when you create it?
        // An empty list has how many items?
        // That is the initial value to use for size.
        array = ((E[])new Object[10]);
        count = 0;
    }
    /*
     * The add method does what the name suggests. Add an int item to the list.
     * The assumption is to store the item at the end of the list What is the
     * end of the list? Is it the same as the end of the array? Think about how
     * you can use the size variable to add item to the list.
     *
     * The method returns void (nothing)
     */
    /**
     * add the item to list.
     *
     * @param      item  The item
     */
    public void add(E item) {
        //Inserts the specified element at the end of the list.
        if (count >= array.length) {
            resize();
        }
        array[count] = item;
        count++;
    }

    /**
     * The size method returns the value of the size. The purpose of the method
     * is to announce the size of the list to the objects outside the list
     *
     * The method returns an int. Empty list should return 0.
     *
     */
    /**
     * to know the size of a list.
     *
     * @return     the size of the list.
     */
    public int size() {
        // replace the code below to implement the size method
        return count;
    }

    /**
     * The remove method does what the name suggests. Removes an int item,
     * specified by the index argument, from the list It also does an additional
     * step. Think about what happens when an item is removed from the middle of
     * the list It creates a hole in the list, right? This would mean, all the
     * items that are to the right side of the removed item should be moved to
     * the left by one position. Here is an example: array =
     * [1,2,3,0,0,0,0,0,0,0] remove(1) would remove the item 2 which is at index
     * position 1. But how do you remove the item from an array? Well, the way
     * to remove it is to move all the items, that are to the right of the
     * removed item, to the left So, the new array looks like this. array =
     * [1,3,0,0,0,0,0,0,0,0] The method returns void (nothing)
     *
     */
    /**
     * to remove the values in list at specified index.
     *
     * @param      index  The index
     */
    public void remove(final int index) {
        // write the logic for remove here. Think about what to do to the size
        // variable.
        if (index >= 0 && index < count) {
            for (int i = index; i < size(); i++) {
                array[i] = array[i + 1];
            }
            count--;
        } else {
            System.out.println("Invalid Position Exception");
        }
    }

    /**
     * Get method has to return the items that is at the index position passed
     * as an argument to the method. If the item doesn't exist then return a -1
     * to indicate that there is no element at that index. How can an element
     * not be there at a given position? Well, if the position is greater than
     * the number of items in the list then that would mean the item doesn't
     * exist. How do we check if the position is greater than the number of
     * items in the list? Would size variable be useful?
     */
    /**
     * to get the list.
     *
     * @param      index  The index
     *
     * @return     the int value
     */
    public E get(final int index) {
        // Replace the code below to write the code for get
        if (index >= 0 && index < count) {
            return array[index];
        }
        return null;
    }

    /**
     * What happens when you print an object using println? Java provides a
     * method named toString that is internally invoked when an object variable
     * is used in println. For example: List l = new List();
     * System.out.println(l); This statement is a shortcut for
     * System.out.println(l.toString());
     *
     * So, implement the toString method to display the items in the list in the
     * square brackets notation. i.e., if the list has numbers 1, 2, 3 return
     * the string [1,2,3] Caution: The array may be having other elements
     * Example: [1,2,3,0,0,0,0,0,0,0] toString should only return the items in
     * the list and not all the elements of the array.
     */
    /**
     * Returns a string representation of the object.
     *
     * @return     String of the object.
     */
    public String toString() {
        // Replace the code below
        if (count == 0) {
            return "[]";
        }
        int i;
        String s = "[";
        for (i = 0; i < count - 1; i++) {
            s += array[i] + ",";
        }
        s += array[i] + "]";
        
        return s;
    }
    /*
     * Contains return true if the list has the item passed as an argument to
     * the method So, iterate through the list and return true if the item
     * exists and otherwise false
     */
    /**
     * to check the list whether list contains items or not.
     *
     * @param      item  The item
     *
     * @return     true if exists or false.
     */
    public boolean contains(E item) {
        // Replace the code below
        return (indexOf(item) >= 0);
    }
    /*
     * Returns the index of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element.
     */
    /**
     * Searches for the first match.
     *
     * @param      item  The item
     *
     * @return     the index index of the item.
     */
    public int indexOf(E item) {
        // Replace the code below
        for (int i = 0; i < count; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
    /**
     * to resize the list.
     */
    public void resize() {
        array = Arrays.copyOf(array, array.length * 2);
        // array[count++] = n;
    }
    /*
    Inserts all the elements of specified int array to the end of list
    */
    /**
     * Adds all the items to list.
     *
     * @param      newArray  The new array
     */
    public void addAll(E[] newArray) {
        // write the logic
        if (count + newArray.length >= array.length) {
            resize();
        }
            for (int i = 0; i < newArray.length; i++) {
                add(newArray[i]);
            }
    }
    /*
     Removes all of its elements that are contained in the specified int
     array.
    */
     /**
      * Removes  values in the new array.
      *
      * @param      newArray  The new array
      */
    public void removeAll(E[] newArray) {
        // write the logic
        if (newArray.length < array.length) {
            for (int i = 0; i < newArray.length; i++) {
                int index = indexOf(newArray[i]);
                while (index != -1) {
                   remove(index);
                    index = indexOf(newArray[i]);
                }
            }
        }
        
    }
    /*
    Returns a list object containing elements, including startIndex and
    excluding endIndex. The first parameter indicates the startIndex and the
    second parameter indicates the endIndex. Returns null and print
    "Index Out of Bounds Exception" if any of values start and end are negative
    and also if start is greater than end.
    */
    /**
     * to get the sublist.
     *
     * @param      start  The start
     * @param      end    The end
     *
     * @return     the list of items.
     */
    public List subList(final int start, final int end) {
    // write the logic for subList
        
        if (start < 0 || end < 0 || start > end
            || start > count || end > count) {
            System.out.println("Index Out of Bounds Exception");
            return null;
        }
        if (start == end && start > count) {
            System.out.println("Index Out of Bounds Exception");
            return null;
        }
        List list1 = new List();
        for (int i = start; i < end; i++) {
            list1.add(array[i]);
        }
        return list1;
    }
    /*
    Returns a boolean indicating whether the parameter i.e a List object is
    exactly matching with the given list or not.
    */
    /**
     * Compares two lists.
     *
     * @param      list  The list
     *
     * @return     true if lists are equal.
     */
    public boolean equals(final List list) {
    // Replace the code below
        return list.toString().equals(this.toString());
        
    }
    /*
     * Removes all the elements from list Think about this case and make the
     * method the simpler.
     */
    /**
     * clears the list.
     */
    public void clear() {
    // write the logic for clear.
        count = 0;
    }
    /**
     * Main funciton.
     *
     * @param      args  The arguments
     */
}
