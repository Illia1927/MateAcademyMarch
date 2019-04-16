package mate.academy.homeWork1.homeEx5;

public class BubbleSort  {
    static int co;
    private long[] a;
    private int elements;

    public BubbleSort(int max) {
        a = new long[max];
        elements = 0;
    }

    public void into(long value) {
        a[elements] = value;
        elements++;
    }

    public void printer() {
        for (int i = 0; i < elements; i++) {
            System.out.print(a[i] + " ");
            System.out.print(" ");
        }
        System.out.println();
    }

    private void toSwap(int first, int second) {
        long dummy = a[first];
        a[first] = a[second];
        a[second]=dummy;

    }
    public void bubbleSorter(){
        for (int out = elements - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(a[in] > a[in + 1])
                    toSwap(in, in + 1);
            }
            co++;
        }
    }
    public void showCoSwap(){
        System.out.println("Сравнений в сортировке пузырьком : "+co);
    }
}