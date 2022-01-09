import java.util.Arrays;

public class BubbleSort implements Strategy {

    @Override
    public int[] execute(int[] arrayInt){
        for (int i = arrayInt.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arrayInt[j] > arrayInt[j + 1]){
                    int tmp = arrayInt[j];
                    arrayInt[j] = arrayInt[j + 1];
                    arrayInt[j + 1] = tmp;
                }
            }
        }
        return arrayInt;
    }
}
