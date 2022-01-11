import java.util.Objects;

public class SortingContext {

   private Strategy strategy;

   public SortingContext(Strategy strategy){
      this.strategy = strategy;
   }

   public int[] ExecuteStrategy(int[] arrayInt){
      return strategy.execute(arrayInt);
   }

   @Override
   public String toString() {
      return "SortingContext{" +
              "strategy=" + strategy +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      SortingContext that = (SortingContext) o;
      return Objects.equals(strategy, that.strategy);
   }

   @Override
   public int hashCode() {
      return Objects.hash(strategy);
   }
}
