import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class myBinarySearchTreeNodeTester {


    /*
    TEST #1: INSERT
    Tests the basic method functionality of the insert method, and takes the size of tree after the element is
    inserted to see if was added correctly
    INPUT: 1                 OUTPUT:  1
             2                           2
               3                            3
                 4                             4
                                                  5
     INSERT: 5
     EXPECTED SIZE: 5
     Tests the insert when the value is greater than the root and will be inserted to the right
     PASS/FAIL: PASS
     */

    @Test
    public void mBSTNTest1(){
        int [] A = {1,2,3,4};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        tree.insert(5);
        assertEquals(5, tree.size());
    }

    /*
    TEST #2: INSERT VARIOUS
    Tests the method functionality of the insert method, and takes the size of tree after the element is
    inserted to see if was added correctly. This test will input various elements, larger numbers, and repeating #'s
    INPUT:     1                  OUTPUT          1
                  2                            0     2
                     3                      -1         3
                       4                                 4
                                                           20
     INSERT: 0, -1, 1, 20
     EXPECTED SIZE: 7 (Excludes the repeated number)
     Tests the insert when the value is less than the root and will be inserted to the left,
     and greater than the root will be inserted to the right.
     PASS/FAIL: PASS
     */

    @Test
    public void mBSTNTest2(){
        int [] A = {1,2,3,4};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        tree.insert(0);
        tree.insert(-1);
        tree.insert(1);
        tree.insert(20);
        assertEquals(7, tree.size());

    }

     /*
    TEST #3: HEIGHT
    Tests the basic method functionality of the height method, and finds the height of the tree
    INPUT:        2
                    3
                      4
                        5
                          8
                            9
                              14
     EXPECTED HEIGHT: 6
     Tests the height when the binary search tree has elements on either side of the tree, and looks for the
     lowest leaf and counts the number of edges it takes to get to the root
     PASS/FAIL: PASS
     */

    @Test
    public void mBSTNTest3(){
        int [] A = {2,3,4,5,8,9,14};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        assertEquals(6, tree.height());

    }

    /*
    TEST #4: HEIGHT (COMPLEX TREE)
    Tests the basic method functionality of the height method, and finds the height of the tree
    when it has numbers branching both right and left
    INPUT:                 20
                     4           21
                       6             23
                 5       8        22
                            9
                              10

     EXPECTED HEIGHT: 5
     Tests the height when the binary search tree has elements on either side of the tree, and looks for the
     lowest leaf and counts the number of edges it takes to get to the root
     PASS/FAIL: PASS
     */

    @Test
    public void mBSTNTest4(){
        int [] A = {20,4,6,5,8,9,10,21,23,22};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        assertEquals(5, tree.height());
    }

    /*
    TEST #5: DEPTH
    Tests the basic method functionality of the depth method, and finds the location of an element
    when the tree has numbers branching both right and left
    INPUT:                9
                        1   10
                      2        20
                    5             30
                 6     3
               8

     Finds the element within the tree and then counts the number of edges between the root and the element.
     ELEMENT: 3
     EXPECTED DEPTH: 4
     PASS/FAIL: PASS
     */

    @Test
    public void mBSTNTest5(){
        int [] A = {9,10,20,30,1,2,5,3,6,8};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        assertEquals(4, tree.depth(3));

    }

     /*
    TEST #6: DEPTH (NON-EXISTENT)
    Tests the basic method functionality of the depth method, and finds the location of an element
    when the tree has numbers branching both right and left
    INPUT:                       9
                        4               14
                            6      11        20
                        3                19

     Finds the element within the tree and then counts the number of edges between the root and the element.
     If element is non - existent it will out put -1
     ELEMENT: 5
     EXPECTED DEPTH: -1
     PASS/FAIL: PASS
     */

    @Test
    public void mBSTNTest6(){
        int [] A = {9,14,11,20,4,6,19,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        assertEquals(-1, tree.depth(5));

    }

    /*
    TEST #:7 SIZE
    Tests the basic method functionality of the size method, and finds keeps a running count of the total number of
    nodes regardless of if the tree has a right or left subtree
    INPUT:                 10
                       9       11
                    8               14
                 3               13      20
                   4                  18
                 2
               1
     EXPECTED SIZE: 13
     PASS/FAIL: PASS
     */

    @Test
    public void mBSTNTest7(){
        int [] A = {10,9,11,14,13,8,3,4,2,1,20,18};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        assertEquals(12, tree.size());
    }
}
