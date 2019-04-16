package mate.academy.homeWork1.homeEx5;

public class Main {
    public static void main(String[] args) {
        QuickSort.initArray();
        QuickSort.printArray();
        QuickSort.quickSort();
        QuickSort.printArray();
        QuickSort.kolichestvoSmen();

        System.out.println();

        BubbleSort bubleeSort = new BubbleSort(5);

        bubleeSort.into(9);
        bubleeSort.into(5);
        bubleeSort.into(8);
        bubleeSort.into(6);
        bubleeSort.into(1);
        bubleeSort.printer();
        bubleeSort.bubbleSorter();
        bubleeSort.printer();
        bubleeSort.showCoSwap();
    }
}
