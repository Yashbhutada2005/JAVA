package Q_Hashing;

import java.util.HashMap;

public class E_ValidAnagram {

     public static boolean isAnagram(String s, String t) {

        HashMap<Character , Integer> hm = new HashMap<>();

        // yeh loop s ke characters ko count kar raha hai aur unko hashmap me store kar raha hai
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            hm.put(ch , hm.getOrDefault(ch, 0) + 1);
        }

        // yeh loop t ke characters ko check kar raha hai ki kya wo s ke characters ke saath match karte hain ya nahi
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            // agar t ke kisi character ko s me nahi milta hai to wo anagram nahi hoga
            if(!hm.containsKey(ch)){
                return false;
            }

            // agar t ke kisi character ko s me milta hai to uska count ko 1 se kam kar do
            hm.put(ch , hm.get(ch) - 1);

            // agar kisi character ka count 0 ho jata hai to usko hashmap se remove kar do
            if(hm.get(ch) == 0){
                hm.remove(ch);
            }
        }
        return hm.isEmpty();
     }
     public static void main(String[] args) {
       
        String s = "listen";
        String t = "silent";

        System.out.println(isAnagram(s, t));
     }
 }

