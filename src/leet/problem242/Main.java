package leet.problem242;

public class Main {
    public static void main(String[] args){

    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int sSum = 0;
        int tSum = 0;
        for(int i = 0; i < s.length(); i++){
            sSum += s.charAt(i);
            tSum += t.charAt(i);
        }
        if(sSum == tSum){
            return true;
        }else{
            return false;
        }
    }
}
