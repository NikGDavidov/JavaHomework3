package HomeworkJava3;
import java.util.Arrays;
public class Task9HeapSort {


    static void heapify(int[] array, int length, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int parent = i;

        // если левый дочерний больше родительского
        if (leftChild < length && array[leftChild] > array[parent]) {
            parent = leftChild;
        }

        // если правый дочерний больше родительского
        if (rightChild < length && array[rightChild] > array[parent]) {
            parent = rightChild;
        }

        // если должна произойти замена меняем местами элементы
        if (parent != i) {
            int temp = array[i];
            array[i] = array[parent];
            array[parent] = temp;
            heapify(array, length, parent);// проверяем снова нужна ли замена элементов кучи с того же индекса
        }
    }

    public static void heapSort(int[] array) {
        if (array.length == 0) return;

        // Строим кучу
        int length = array.length;
        // проходим от первого узла от конца к корню
        for (int i = length / 2 - 1; i >= 0; i--) //length / 2 - 1 - индекс первого родительского элемента от конца кучи
            heapify(array, length, i);
// в цикле находим макс. элемент уменьшающихся подмассивов и ставим их в конец
        for (int i = length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);        }
    }
    public static void main(String[] args) {

        int[] arr = {6, 4, 7, 1, 9, -2};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}