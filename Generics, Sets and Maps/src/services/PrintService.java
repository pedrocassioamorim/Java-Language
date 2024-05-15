package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintService<T> {

    List <T> list = new ArrayList<>();

    public T first(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty! No first!");
        }
        return list.get(0);
    }

    public void addValue(T value){
        list.add(value);
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for (int i = 1 ; i < list.size() ; i++){
            System.out.print(", " + list.get(i));
        }
        System.out.print("]");
    }

}
