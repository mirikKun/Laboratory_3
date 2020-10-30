import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lab3Iterable {
    public static <T> Iterable<T> Filter(Iterable<T> unfiltered, Predicate<? super T> retainIfTrue)
    {
        List<T> result = new LinkedList<>();
        for (T temp: unfiltered) {
            if (retainIfTrue.test(temp))
                result.add(temp);
        }
        return result;
    }
    public static <F, T> Iterable<T> Transform(Iterable<F> fromIterable, Function<? super F, ? extends T> function)
    {
        List<T> result = new LinkedList<>();
        for (F temp: fromIterable)
            result.add(function.apply(temp));
        return result;
    }
}
