public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean isSort = false;
        int count = 0;
        int storage = 0;

        //algorithm added here
        //another comment

        while (isSort != true) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i+1]<array[i]) {
                    storage = array[i];
                    array[i] = array[i+1];
                    array[i+1] = storage;
                    count = count + 1;
                }
            } if (count > 0) {
                isSort = false;
                count = 0;
            } else isSort = true;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
