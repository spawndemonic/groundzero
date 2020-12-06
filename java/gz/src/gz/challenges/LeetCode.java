package gz.challenges;

import java.util.HashSet;
import java.util.Set;

public class LeetCode {
    //for add two numbers challenge #2
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result= new ListNode();
        int val1=0,val2=0;
        while(l1!=null||l2!=null){

        }

        return result;
    }
    public  int sizeOfLL(ListNode l){
        ListNode tmp = l;
        int size=0;
        while(tmp!=null){

        }
        return size;
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int answer=0;
        //loop through each character
        //check if set already contains character
        //loop i < length then slice the string at where i is till length-1?
        s.chars().takeWhile(ch ->(!set.contains(ch))).forEach(ch->set.add((char) ch));
        answer=set.size();
        System.out.println(set);
        return answer;
    }
// answer for challenge #1 Two Sum
    public int[] twoSum(int[] nums, int target){
        int [] solution = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    solution[0] = i;
                    solution[1]=j;
                    return solution;
                }
            }
        }
        return solution;
    }
}
