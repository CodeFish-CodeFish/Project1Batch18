package project_06;

import java.util.*;

public class Project_06 {

    public static void main(String[] args) {

        // 1. Find the largest number and secondLargest number from an array

        int [] arrays = {1,2,3,2};
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i] > largest){
                secondLargest = largest;
                largest = arrays[i];
            } else if (arrays[i] > secondLargest && arrays[i] < largest) {
                secondLargest = arrays[i];
            }

        }

        System.out.println(largest);
        System.out.println(secondLargest);

        // 2. Fix the string by separating chars and numbers and print them ex: 123fsdafdsf

        String unFixed = "123sdfds!@#@#$#%#$&^$^*&*(*)(*)";
        String letters = "";
        String numbers = "";
        String symbols = "";

        for (int i = 0; i < unFixed.length(); i++) {

            if (unFixed.charAt(i) >= 'A'&& unFixed.charAt(i) <= 'Z' || unFixed.charAt(i) >= 'a'
            && unFixed.charAt(i) <= 'z'){
                letters+= unFixed.charAt(i);
            } else if (unFixed.charAt(i) >= '0' && unFixed.charAt(i) <= '9') {
                numbers += unFixed.charAt(i);
            }else {
                symbols += unFixed.charAt(i);
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("numbers = " + numbers);
        System.out.println("symbols = " + symbols);


        // 3. Count the letters from string using Map/HashMap
        // for ex: javaa j = 1, a = 3, v = 1 etc

        String str = "CCodeFish";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }else {
                int value = map.get(str.charAt(i));
                map.put(str.charAt(i), value+1);
            }

        }
        System.out.println(map);



        // 4. Count the letters from string of arrays and print out, also
        // print out the largest value with the key. For ex: codeee -> c:4
        String []strArray = {"aa", "bbb", "cccc"};

        Map<Character,Integer> map1 = new HashMap<>();

        for (int i = 0; i < strArray.length; i++) {

            for (int j = 0; j < strArray[i].length(); j++) {


                if (!map1.containsKey(strArray[i].charAt(j))){
                        // key - value a = 2;
                    map1.put(strArray[i].charAt(j), 1);

                }else {
                    map1.put(strArray[i].charAt(j), map1.get(strArray[i].charAt(j))+1);
                }

            }

        }
        System.out.println("map1 = " + map1);

        int max = 0;
        String keyMAx = "";
        HashMap<String, Integer> map2 = new HashMap<>();

        // for (String i: str){}
        for (Map.Entry<Character, Integer> entry: map1.entrySet()){

            if (entry.getValue() > max){
                max = entry.getValue();
                keyMAx = String.valueOf(entry.getKey());
            }
        }

        map2.put(keyMAx, max);
        System.out.println("map2 = " + map2);


        // 5. Find the biggest and smallest number from an array (do not use List) plain for loop
        int [] num = {1,2,3,4,5,6,7,8,9};

        // 6. Find the length of each element from string array and return
        // with key - value with Maps or Hashmaps.

        String[] strings = {"aa", "bbb", "ccc", "aaa"}; // aa = 2, bbb = 3

        Map<String, Integer> map3 = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            map3.put(strings[i], strings[i].length());

        }
        System.out.println(map3);



        // 7. Convert aaabbbccddeeee into a3b3c2d2e4, use Maps and StringBuilder, StringBuilder has "append" method

        String chars = "aabbbccccc";

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {

            if (hashMap.containsKey(chars.charAt(i))){
                hashMap.put(chars.charAt(i), hashMap.get(chars.charAt(i))+1);
            }else {
                hashMap.put(chars.charAt(i), 1);
            }

        }


        StringBuilder builder = new StringBuilder();

        for (Map.Entry<Character, Integer> entry: hashMap.entrySet()){

            builder.append(entry.getKey());
            builder.append(entry.getValue());

        }
        System.out.println("hashMap = " + hashMap);
        System.out.println("builder = " + builder);


    }
}
