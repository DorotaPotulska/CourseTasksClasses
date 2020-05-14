package JavaGda34.weekend10_TypyGeneryczne.zad2_Mediana;

import java.util.List;
import java.util.stream.Collectors;

public class MedianUtil {

    private static final int UPPER_BOIND_VALUE=1000;

    public static Double findMedian(List<Integer> values){

        if(values.isEmpty()){
            throw new SdaException("Cannot calculate median from empty list");
        }

        if(values.stream().anyMatch(value ->Math.abs(value)>UPPER_BOIND_VALUE)){
            throw new SdaException("At least one value does not match bound condition");
        }

        final List<Integer> sortedValues=values.stream()
                .sorted()
                .collect(Collectors.toList());

        if(sortedValues.size()%2==1){
            return (double)sortedValues.get(sortedValues.size()/2);
        }

        final int firstIndex = sortedValues.size()/2 -1;

        return ((double)sortedValues.get(firstIndex) +sortedValues.get(firstIndex+1))/2;
    }
}
