package org.example.DataStructures;
import java.util.*;

/**
 *  Get String list as input and initialize the map. Iterate array values over an loop and store each
 *  character in the string array. Initialize an arrayList and add string variable into list.
 *  Convert array list into Char array and sort it. Convert that sorted array into string object.
 *  put sorted array and it list as value in a map and meanwhile check if character contains in map and if present
 *  then add sorted array and character in map.
 */
public class Anagram {

        public static ArrayList<List<String>> groupAnagram(List<String> input) {
            HashMap<String, List<String>> map = new HashMap<>();
            for(int i=0;i<input.size();i++) {
                String eachstr = input.get(i);
                ArrayList<String> valueList = new ArrayList<>();
                valueList.add(eachstr);
                char[] charArray = eachstr.toCharArray();
                Arrays.sort(charArray);
                String sortedArray = String.valueOf(charArray);
                if(!map.containsKey(sortedArray)) {
                    map.put(sortedArray, valueList);
                }else {
                    List<String> list = map.get(sortedArray);
                    list.addAll(valueList);
                    map.put(sortedArray, list);
                }
            }
            Collection<List<String>> values = map.values();
            return new ArrayList<>(values);

        }

        public void test01(){
            String[] str = {"eat","tea","tan","ate","nat","bat"};
            List<String> asList =Arrays.asList(str);
            List<List<String>> result = groupAnagram(asList);
        }
}
