public class SelectionSort {
    static int list[]={1,6,4,8,3,7,4,9};
    public static void selectionSort(int[]list){
        for (int i = 0; i < list.length ; i++) {
            int max=i;
            for (int j = i+1; j < list.length ; j++) {
                if(list[j]>list[max]){
                    max=j;
                }
            }
            if(max!=i){
                int temp = list[max];
                list[max] = list[i];
                list[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i]);
        }
    }
}
