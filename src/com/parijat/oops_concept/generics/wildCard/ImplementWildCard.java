package com.parijat.oops_concept.generics.wildCard;

import java.util.ArrayList;
// It is good to use only for reading task

public class ImplementWildCard {

    // ****** Reading Task *******

    // Without Wild card.
    public <T> void printArrayListNonGeneric(ArrayList<T> list){
        for (T o : list){
            System.out.print(o + " ");
        }
    }

    // Using Wild Card.
    public void printArrayListGeneric(ArrayList<?> list){
        for (Object o:list){
            System.out.print(o + " ");
        }
    }

    // ****** Return Task *******
    public <T> T getFirstNonGeneric(ArrayList<T> list){
        return list.get(0);
    }

    // Not Type safe as it returns Super class of everything
    public Object getFirstGeneric(ArrayList<?> list){
        return list.get(0);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            list.add(i);
        }

        ImplementWildCard obj = new ImplementWildCard();
        obj.printArrayListGeneric(list);
        System.out.println();
        obj.printArrayListNonGeneric(list);

        System.out.println();
        System.out.println(obj.getFirstNonGeneric(list));
        System.out.println(obj.getFirstGeneric(list));
    }
}
