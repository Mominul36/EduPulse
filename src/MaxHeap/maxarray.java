
package MaxHeap;

import java.util.LinkedList;
import java.util.Queue;



public class maxarray{
    static int[] arr;
    static int n=0;

    public maxarray() {
    arr = new int[10000];
    }
    
    int[] getarray(){
        return arr;
    }
    int getsize(){
        return n;
    }
    void setsize(int n){
        this.n = n;
    }
     static void heapify(int[] arr, int n, int i)
    {
        // Find parent
        int parent = (i - 1) / 2;
     
        if (parent >= 0) {
            // For Max-Heap
            // If current node is greater than its parent
            // Swap both of them and call heapify again
            // for the parent
            if (arr[i] > arr[parent]) {
                 
                  // swap arr[i] and arr[parent]
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
               
                // Recursively heapify the parent node
                heapify(arr, n, parent);
            }
        }
    }
 
    // Function to insert a new node to the heap. 
     void insert(int Key)
    {
        // Increase the size of Heap by 1
        n = n + 1;
     
        // Insert the element at end of Heap
        arr[n - 1] = Key;
     
        // Heapify the new node following a
        // Bottom-up approach
        heapify(arr, n, n - 1);
         
       
       
    }
    
    
    
    
}
