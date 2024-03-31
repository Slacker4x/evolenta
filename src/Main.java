public class Main {
    public static void main(String[] args) {
        int[] array = {14, 15, 16, 11, 12, 13};

            System.out.println("Минимальный элемент: " + findMinElement(array));
        }

        private static int findMinElement ( int[] array){
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Массив не может быть пустым");
            }

            int firstInOrderIndex = findFirstInOrderIndex(array);
            return findMinFromIndex(array, firstInOrderIndex);
        }

        private static int findFirstInOrderIndex ( int[] array){
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    return i;
                }
            } return array.length;
        }

        private static int findMinFromIndex ( int[] array, int startIndex){
            int minIndex = startIndex;
            for (int i = startIndex + 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            } return array[minIndex];
        }
    }