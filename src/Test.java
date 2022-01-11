import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] array1 = {-14, 10, 7, -13, 9, -2, 12, 0, 11, 5, -6, 1, 4, -8, -16, 3, -15, 17, -19, 18};

        SortingContext context1 = new SortingContext(new BubbleSort());
        System.out.println(Arrays.toString(context1.ExecuteStrategy(array1)));


        SortingContext context2 = new SortingContext(new SelectionSort());
        System.out.println(Arrays.toString(context2.ExecuteStrategy(array1)));
    }
}
