package mahiapp;

public class GenericUtils {
    public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
        if (firstPos < 0 || firstPos >= list.length || secondPos < 0 || secondPos >= list.length) {
            throw new IndexOutOfBoundsException("Invalid index. Ensure both positions are within bounds.");
        }

        T temp = list[firstPos];
        list[firstPos] = list[secondPos];
        list[secondPos] = temp;

        return list;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        swap(numbers, 1, 3); 
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}