public class SelectionSort implements Strategy{

    @Override
    public int[] execute(int[] arrayInt){
        for (int i = 0; i < arrayInt.length; i++){
            int minInd = i;
            for (int j = i; j < arrayInt.length; j++){
                if (arrayInt[j] < arrayInt[minInd]){
                minInd = j;
                }
            }
        }
        return arrayInt;
    }
}
