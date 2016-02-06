import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {

   static boolean isAnagram(String str1, String str2) {
      //Complete the function
       String A=str1.toLowerCase();
       String B= str2.toLowerCase();
       if(A.length() != B.length()){
            return false;
        }
      
   HashMap<Character,Integer> map= new HashMap<Character,Integer>();
       for(char c: A.toCharArray())
           {
           if(map.containsKey(c))
               {
               map.put(c,map.get(c)+1);  //if already there
           }
           else
               {
               map.put(c,1);  //add in map
           }
       }
       for(char c:B.toCharArray())
           {
           if(!map.containsKey(c))
               {
               return false;
           }
           else
               {
               map.put(c,map.get(c)-1);
               if(map.get(c)==0)   
                   {
                   map.remove(c);
               }
           }
           
           }
       return map.isEmpty();
           }
 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        boolean ret=isAnagram(str1,str2);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
