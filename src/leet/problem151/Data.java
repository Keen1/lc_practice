package leet.problem151;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedList;

public class Data {
    LinkedList<Integer> list = new LinkedList<>();


    public Data(){

    }

    public void insert(int value){
        list.addLast(value);
    }
    public void delete(int value){
        list.remove(value);
    }

    public int getUniformRandom(){
        SecureRandom random = new SecureRandom();
        return random.nextInt(list.size());
    }
}
