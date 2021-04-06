package DS1.queue;

import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<Integer> arrayList;

    public PriorityQueue(int size) {
        arrayList = new ArrayList<>();
    }

    public void heapify(ArrayList<Integer> arr, int i) {
        int size = arrayList.size();

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr.get(left) > arr.get(largest))
            largest = left;
        if (right < size && arr.get(right) > arr.get(largest))
            largest = right;

        if (largest != i) {
            int temp = arr.get(largest);
            arr.set(largest, arr.get(i));
            arr.set(i, temp);
            heapify(arr, largest);
        }
    }

    public void insertNode(int data) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(data);
        } else {
            arrayList.add(data);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(arrayList, i);
            }
        }
    }

    public void deleteNode(int data) {
        int i;
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            if (data == arrayList.get(i))
                break;
        }

        int temp = arrayList.get(i);
        arrayList.set(i, arrayList.get(size - 1));
        arrayList.set(size - 1, temp);

        arrayList.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(arrayList, j);
        }
    }

    public void print() {
        arrayList.stream().forEach(x -> System.out.print(x + " "));
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insertNode(3);
        priorityQueue.insertNode(4);
        priorityQueue.insertNode(9);
        priorityQueue.insertNode(5);
        priorityQueue.insertNode(2);

        priorityQueue.print();
        System.out.println();

        priorityQueue.deleteNode(9);
        priorityQueue.print();

    }

}
