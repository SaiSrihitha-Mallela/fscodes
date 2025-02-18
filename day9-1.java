Magic Reflections: In a mystical world, a spell can concatenate the essence of two magical artifacts represented as sequences of integers. 
Once combined, the new sequence may reflect ancient symmetrical magic if it appears the same from both ends. 
As a novice wizard,your task is to determine if the resulting sequence from combining two artifacts holds this reflective, symmetrical property.


Test Case 1:
Input = 1 4 9
9 4 1
output true 

Test Case 2:
Input = 1 2 3
3 2 4 
output false

import java.util.*;

class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr1 = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");

        List<Integer> list = new ArrayList<>();
        for (String s : arr1) {
            list.add(Integer.parseInt(s));
        }
        for (String s : arr2) {
            list.add(Integer.parseInt(s));
        }

        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                System.out.println(list.get(left)); 
                System.out.println(list.get(right));
                System.out.print("false");
                return;
            }
            left++;
            right--;
        }

        System.out.print("true");
    }
}
