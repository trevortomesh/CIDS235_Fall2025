import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class HigherOrderExample {
    public static <T,R> List<R> applyToAll(
        List<T> items, 
        Function<T, R> operation
    ){
        List<R> result = new ArrayList<>();

        for(T item : items){
            result.add(operation.apply(item));
        }
        return result;
    }
}
