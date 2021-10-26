import java.io.*;
import java.util.*;

class Solution {

  static String getShortestUniqueSubstring(char[] arr, String str) {
    // your code goes here
    HashSet<Character> set = new HashSet<>();
    for(char c : arr)
      set.add(c);

    HashSet<Character> set2 = new HashSet<>();
    int start = 0;
    int startIndex = 0;
    int endIndex = 0;
    for(int i=0; i<str.length(); i++)
    {
      char c = str.charAt(i);
      if(set.contains(c))
      {
        set2.add(c);
      }
      if(set.size() == set2.size())
      {
        while(set.size() == set2.size())
        {
          startIndex = start;
          endIndex = i;
          c = str.charAt(start++);
          set2.remove(c);
        }
      }
    }
    return (endIndex - startIndex) > 0 ? str.substring(startIndex, endIndex+1) : "";
  }
  

  public static void main(String[] args) {

  }

}