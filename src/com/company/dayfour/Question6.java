package com.company.dayfour;
import java.util.Comparator;
import java.util.Map;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {

        int[] ar = new int[] {0,0,0,1,3,3,2,1,3,5,6,0};

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        for(int current : ar) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1);
            output.add(current);
        }

        FrequencyComparator comp = new FrequencyComparator(map);
        Collections.sort(output, comp);
        for(Integer i : output){
            System.out.print(i + " ");
        }
    }

}

class FrequencyComparator implements Comparator<Integer> {
    private final Map<Integer,Integer> freqMap;

    FrequencyComparator(Map<Integer,Integer> i_freqMap)

    {
        this.freqMap = i_freqMap;
    }

    @Override
    public int compare(Integer k1, Integer k2) {
        int freqCompare = freqMap.get(k1).compareTo(freqMap.get(k2));
        int valueCompare = k1.compareTo(k2);

        // If frequency is equal, then just compare by value, otherwise - compare by the frequency.

        if(freqCompare == 0)
            return valueCompare;
        else
            return freqCompare;
    }
}

