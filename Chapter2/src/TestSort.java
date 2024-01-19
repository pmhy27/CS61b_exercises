import org.junit.Test;
import  org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestSort {
    @Test
    public void testSort(){
        String[] input = {"H", "B", "C", "A"};
        String[] expected = {"A", "B", "C", "H"};
        String[] actual = Sort.sort(input);
        assertArrayEquals(expected,actual);
    }
    @Test
    public void testFindSmallest(){
        String[] input = {"I", "have", "an", "egg"};
        int expected = 0;

        int actual = Sort.findSmallest(input);

        assertEquals(expected,actual);

    }
    @Test
    public void testSwap(){
        String[] input = {"I", "have", "an", "egg"};
        String[] expected = {"an", "have", "I", "egg"};

        String[] actual = Sort.swap(input,0,2);

        for( int m = 0; m < actual.length; m++){
            System.out.println(actual[m]);
        }

        assertArrayEquals(expected,actual);

    }



    public static void main(String[] args) {
//        IntList L = new IntList(2,null);
//        L.rest = new IntList(4,null);
//        L.rest.rest = new IntList(6,null);

//        IntList L1 = new IntList(1,null);
//        L1 = new IntList(3,L1);
//        L1 = new IntList(5,L1);
//        L1 = new IntList(7,L1);
//
//        System.out.println(L.size());
//        System.out.println(L1.iterativeSize());
//
//        SLList L2 = new SLList(3);
//        L2.addFirst(6);
//        L2.addFirst(9);

//        IntList L3 = new IntList(10,null);
//        L3.addFirst(20);
//        L3.addFirst(30);
//        L3.addFirst(40);

//        SLList L4 = new SLList(10);
//        L4.addLast(20);
//        L4.addLast(30);
//        L4.addLast(40);
//        System.out.println(L4.size());

//        System.out.println(L1.first);
//        System.out.println(L2.first);
    }
}
