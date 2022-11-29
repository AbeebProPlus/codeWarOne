import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddOneOut {
    public boolean arrLength(int[] arr){
        return arr.length > 3;
    }
    public int oddOneOut(int[] arr){
        if (!arrLength(arr)) return 0;
        List<Integer> arr3 = new ArrayList<>();
        List<Integer> arr4 = new ArrayList<>();
        for (int j : arr) {
            if (j % 2 == 0)
                arr3.add(j);
            else arr4.add(j);
        }
        if (arr3.size() > arr4.size()) return arr4.get(0);
        else return arr3.get(0);
    }
}
