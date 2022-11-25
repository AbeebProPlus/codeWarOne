import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddOneOut {
    public boolean arrLength(int[] arr){
        return arr.length > 3;
    }
    public int oddOneOut(int[] arr){
        if (arrLength(arr)) return 0;
        int oddOne = 0;
        List<Integer> arr3 = new ArrayList<>();
        List<Integer> arr4 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
           for (int j = 0; j < arr.length; j++){
               if (arr[i] % 2 == 0 && !arr3.contains(arr[i]))
                    arr3.add(arr[i]);
           }
            for (int j = 0; j < arr.length; j++){
                if (arr[i] % 2 != 0 && !arr4.contains(arr[i])){
                    arr4.add(arr[i]);
                }
            }
        }
        if (arr3.size() > arr4.size()) return arr4.get(0);
        else return arr3.get(0);
    }
}
