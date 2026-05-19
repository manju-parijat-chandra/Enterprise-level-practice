package com.parijat.oops_concept.generics.genericConstructor;

public class MultipleValue<K,V> {

    K key;
    V value;

    public MultipleValue(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void getKeyValue(){
        System.out.println("Key : " + key + " Value : " + value);
    }

    public static void main(String[] args) {
        MultipleValue<String,Integer> entry = new MultipleValue<>("Age" , 45);

        entry.getKeyValue();
    }
}
