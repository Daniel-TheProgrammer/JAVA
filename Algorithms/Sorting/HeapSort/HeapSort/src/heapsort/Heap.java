package heapsort;

public class Heap {
    private int[] heap;
    private int size;
    
    public Heap(int capacity){
        heap = new int[capacity];
    }
    
    public boolean isFull() {
        return size == heap.length;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int getParent(int index){
        return (index-1)/2;
    }
    
    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }
    
    public void sort() {
        int lastHeapIndex = size -1;
        
        for(int i = 0; i < lastHeapIndex; i++) {
            int temp = heap[0];
            heap[0] = heap[lastHeapIndex-i];
            heap[lastHeapIndex - i] = temp;
            fixHeapBelow(0,lastHeapIndex - i - 1);
        }
    }
    
    public void insert(int value) {
        if(isFull())
            throw new IndexOutOfBoundsException("Heap is full");
        
        // Puts the item at the next available spot
        heap[size] = value;
        
        //Heapify: checks to see if value is greater than its parent
        fixHeapAbove(size);
        
        // Used to track the next available space in the array
        size++;
    }
    
    private void fixHeapAbove(int index){
        int newValue = heap[index];
        while(index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
        
    }
    
    public int delete(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Heap is empty.");
        
        int parent = getParent(index);
        int deletedValue = heap[index];
        
        heap[index] = heap[size-1];
        
        if(index == 0 | heap[index] < heap[parent])
            fixHeapBelow(index, size-1);
        
        else
            fixHeapAbove(index);
        
        size--;
        return deletedValue;
    }
    
    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;
        
        // Gets the children of the inserted index 
        while(index <= lastHeapIndex) {
            // Gets the left and right child of the parent value
            int leftChild = getChild(index, true);
            int rightChild =  getChild(index, false);
            
            // Since this is a heap, there should always be a left child. 
            // We have to check and see if there is a right child as well
            if(leftChild <= lastHeapIndex) {
                
                // This means that the right child does not exist so the parent can only switch
                // with the right child 
                if(rightChild > lastHeapIndex) {
                    childToSwap  = leftChild;
                }
                
                // Compares the two children to see who is the larger value
                else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }
            
                // Compares the parent value with the child value
                // If the parent is less than the child value, swaps between the two value occurs
            if(heap[index] < heap[childToSwap]) {
                int tmp =  heap[index];
                heap[index] = heap[childToSwap];
                heap[childToSwap] = tmp;
            }
            else
                break;
            
            index = childToSwap;
        }
        // If the parent doesnt have any children, break from the loop    
        else
            break;
    }   
}
    
    public int peek() {
       if(isEmpty())
           throw new IndexOutOfBoundsException("Heap is empty");
       
       return heap[0];
    }
    
    public void printHeap() {
        for(int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }
}
