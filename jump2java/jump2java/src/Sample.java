import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 1, 3, 2, 1,1,4,8};
        int[] result = Arrays.stream(data)
                .boxed()
                .filter((a) -> a %2 == 0)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray()
            ;
    }
}