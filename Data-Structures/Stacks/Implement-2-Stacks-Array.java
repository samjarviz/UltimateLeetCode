/*Problem Statement
Your task is to implement two stacks in a single array efficiently.
You need to provide the following methods for the stacks: push1, push2, pop1, pop2.

Examples
Example 1:
push1(1)
push2(2)
push2(3)
push1(4)
pop1() //returns 4
pop2() //returns 3*/

//-----------Solution------------------
//Time: push/pop: O(1)
//Space: O(n), fill array of size n
public class Solution {
    int size;
    int top1, top2;
    int arr[];
    //two stacks from start and end of array
    //if indexes overlap, its full (overflow)
    //if indexes go out of bounds, (underflow)
     Solution() {
        arr = new int[100];
        size = 100;
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if (top1 >= top2 - 1) {
          return;
        }
        arr[++top1] = x;
        size++;
    }

    void push2(int x) {
        if (top1 >= top2 - 1) {
          return;
        }
        arr[--top2] = x;
        size++;
    }

    // Note: Always return -1, when stack becomes empty.
    int pop1() {
        if (top1 < 0) return -1;
        int result = arr[top1--];
        size--;
        return result;
    }
    
    // Note: Always return -1, when stack becomes empty.
    int pop2() { 
        if (top2 >= size) return -1;
        int result = arr[top2++];
        size--;
        return result;
    }
}
