public class SortingContext {

   private Strategy strategy;

   public SortingContext(Strategy strategy){
      this.strategy = strategy;
   }

   public int[] ExecuteStrategy(int[] arrayInt){
      return strategy.execute(arrayInt);
   }
}
