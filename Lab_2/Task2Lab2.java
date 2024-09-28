import java.util.Arrays;

public class Task2Lab2 {
    public static void main(String[] args) {
        int[] b = {15, -20, 30, 45, 0, 50, -5, 25};
        int[] c = createFilteredArray(b);
        
        selectionSort(c);
        
        System.out.println("Отсортированный массив C:");
        System.out.println(Arrays.toString(c));
    }
    
    public static int[] createFilteredArray(int[] b) {
        int count = 0;
        for (int value : b) {
            if (value > 0 && value % 5 == 0) {
                count++;
            }
        }
        
        int[] c = new int[count];
        int index = 0;
        for (int value : b) {
            if (value > 0 && value % 5 == 0) {
                c[index++] = value / 5;
            }
        }
        
        return c;
    }
    
    // Метод сортировки выбором
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами найденный минимальный элемент с текущим элементом
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
