import java.lang.reflect.Array;
import java.util.*;

@FunctionalInterface
interface A {
    int add(int a, int b);
}


public class Main {



    public static void main(String[] args) {



        /*
        	Collection - Data structure to store data
        	 1. Arrays -> Linear data structure, stores in contiguous fashion

        		 1xO ->
        		 1x1

         	2. List -> stores data in non-contiguous fashion
         	3. Sets -> unordered fashion, with no duplicates
         	4. Maps -> key value store, keys can't be duplicate
         	5. Queue -> Priority Queue, Deque, ArrayDeque

        */



        /*
        	Q1 - Given a list of distinct integers and a target value, you need to find one pair whose sum is equal to the target value.
        	If no pair is found, return -1


        	L = [1, 3, 5, 2, 7, 9, 6, 12]

        	Set =>
        	1
        	3

        	target = 15

        	Code ->
                List<Integer> list = Arrays.asList(1, 3, 5, 2, 7, 9, 6, 12);
                int target = 15;

                // set = {1, 3, 5, 2, 7, 9}
                //


        		// Note - Always try to program to an interface rather than concrete implementation
                Set<Integer> set = new HashSet<>();
                for(int a : list) {
                    int b = target-a;
                    if(set.contains(b)) {
                       System.out.println(a + " " + b);
                    }
                    set.add(a);
                }

         */

        /*

        	Q-2 -> Given an unsorted list of integers, find out the number of pairs whose sum is equal to target,
        	including duplicates

        	 L = [1, 2, 3, 7, 5, 7, 8, 8, 8, 8, 10]


			[7, 7]        => 2
			[8, 8, 8, 8]  => 4


        	numberOfPairs = 18/2 -> 9
        	TARGET = 15

        	MAP <->

        	1 - 1
        	2 - 1
        	3 - 1
        	5 - 1
        	7 - 2
        	8 - 4
        	10 - 1


list size = 10^7

numbers = 10^3







        List<Integer> list = Arrays.asList(1, 2, 3, 7, 5, 7, 8, 8, 8, 8, 10);
		int target = 15;
        int numberOfPairs = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : list) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for(int i : list) {
            int b = target - i;
            if(map.containsKey(b)) {
                int freqB = map.get(b);
                numberOfPairs += freqB;
            }
        }


        // TODO - try using frequencies of both numbers and make freq  = 0
//        int numberOfPairs2 = 0;
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int key = entry.getKey();
//            int value = entry.getValue();
//

//
//
//        }




        System.out.println(numberOfPairs/2);
*/

        /*
        Type of interfaces

        1. Normal interface
        2. Marker Interface ->

        3. Functional interfaces -> Just one abstract method (Single abstract method (SAM interface))

        Lambda expression works with functional interfaces


         */

      /*
      	Q -> Given a list of integers and a value 'k', we need to find the kth largest number
      	L = [1, 2, 3, 5, 7, 10, 4, 8, 3, 2, 20]


		7
	8    20
10


		k = 4

		Sorted_L = [1, 2, 2, 3, 3, 4, 5, 7, 8, 10, 20]

		20 7 8 10

		7 8 10 20

		O(n + klogk)

      	O(nlogn)

      	k


      	Max heap -> parent is always greater than child
      	Min heap -> parent is always smaller than child

      	tree -> filled from the left

      	1 2 7 10

      	1. Always keep largest k elements in min heap
      	2. If current element is greater than top of heap -> i will replace that with current element
      	3. Size of heap should always be K

      	return top of heap













       */
        List<Integer> list = Arrays.asList(1, 2, 3, 5, 7, 10, 4, 8, 3, 2, 20);

//        1. Always keep largest k elements in min heap
//        2. If current element is greater than top of heap and also if heap size = k -> i will replace that with current element
//        3. Size of heap should always be K



        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Integer i : list) {
            if(pq.size() == k) {
                if (i > pq.peek()) {
                    pq.poll();
                	pq.add(i);
            	}
            } else if(pq.size() < k) {
                pq.add(i);
            }
        }

        System.out.println(pq.peek());


    Map<Integer, Integer> map = new HashMap<>();

    Runnable runnable = new Runnable() {
        public void run() {
            System.out.println("hiii");
        }
    };

    Runnable runnable2 = () -> System.out.println("hiii");

//    Ans -> Lambda expression -> only works with functional interfaces, because FI -> one abstract methoda


    A obj2 = new A() {
        @Override
        public int add(int a, int b) {
            return a+b;
        }
    };

    A obj = (a, b) -> a+b;

    int result = obj.add(25, 4);
    System.out.println(result);

    }
}