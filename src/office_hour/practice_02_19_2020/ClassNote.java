package office_hour.practice_02_19_2020;

public class ClassNote{


/**
 *ArrayList is backed by array
 * For get operation its faster
 * it can just directly jump into that index
 * add or remove  ,its slower
 * because we are resizing the array and shifting elements
 *
 * LinkedList is backed by Node
 *    Node is an object that store value
 *    along with the address of neighbours
 *
 * For get operation its slower
 * since it has to go through each and every node until it comes to the correct indext
 * add or remove , its faster
 * because we just need to change the pointer
 *
 * Big O notation is used to describe the performance (time complexity) of an algorithm
 *
 * Array VS ArrayList
 * Array is fixed in size, can not be resized once being created
 * ArrayList can grow and shrink anytime
 *
 * Array can store primitives and object
 * ArrayList can only store Object !!!
 *    --any primitive values will be wrapped into wrapper type object
 *    -- autoboxed
 *
 * Array can not be printed directly ( need to use Arrays.toString(arrObject))
 * ArrayList(along with every other collection type in java ) can be printed directly to see whats inside(toString method overriden)
 *
 * ArrayList has its own class and lots of ready method we can use to easily manipulate data
 * Array: it does not have convinient methods ready like ArrayList
 *        we can use Arrays utility class instead
 *
 *        ---Iterator ----- see it as a tool to iterate over a collection
 *            ---with basic functionality
 *   in order to get an Iterator object  we can call the method
 *
 *   List<Integer> lst = new ArrayList <>(Arrays.asList(20,10,44,3,11);
 *   Iterator<Integer> numIter = lst.iterator();
 *   // 3 methods  available : hasNext(), next(),remove
 *
 *   example :
 *
 *  Collection<Integer> nums = new ArrayList<>(Arrays.asList(10,4,5,22,88,13));
 *
 *  Iterator<Integer> myIter = nums.Iterator();
 *    while(myIter.hasNext()){
 *        if(myIter.next() < 10){
 *            myIter.remove();
 *        }
 *    }
 *    System.out.println("nums = ") + nums);
 *
 *
 *
 *        we use length property  of Array object to count the items
 *        we use size() method of ArrayList to count the items
 *
 *  -----------------------------------------------------------------------------------------------------
 *  List is the only ordered collection in entire collection framework
 *  with index : NON OF OTHER COLLECTION TYPE PROVIDE INDEXED ACCESS !!!!
 *
 *
 */




}

