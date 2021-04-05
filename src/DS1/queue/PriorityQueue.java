package DS1.queue;

import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<Integer> arrayList;

    public PriorityQueue(int size) {
        arrayList = new ArrayList<>();
    }

    public void heapify(ArrayList<Integer> arr, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < arr.size() && arr.get(left) > arr.get(largest))
            largest = left;
        if (right < arr.size() && arr.get(right) > arr.get(largest))
            largest = right;

        if (largest != i) {
            int temp = arr.get(largest);
            arr.set(largest, arr.get(i));
            arr.set(i, temp);
            heapify(arr, largest);
        }
    }

    public void insertNode(int data) {
        if (arrayList.size() == 0) {
            arrayList.add(data);
        } else {
            arrayList.add(data);
            for (int i = arrayList.size() / 2 - 1; i >= 0; i--) {
                heapify(arrayList, i);
            }
        }
    }

    public void deleteNode(int data) {

    }

    public void print() {
        for (int el : arrayList) {
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insertNode(3);
        priorityQueue.insertNode(4);
        priorityQueue.insertNode(9);
        priorityQueue.insertNode(5);
        priorityQueue.insertNode(2);

        priorityQueue.print();
    }
}
