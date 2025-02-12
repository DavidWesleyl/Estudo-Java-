package Colecoes;

import java.util.HashSet;

public class Conjunto
{


    public static void main(String[] args)
    {


        HashSet conjunto = new HashSet();

        conjunto.add(10);
        conjunto.add(true);
        conjunto.add("OK");
        conjunto.add(12);
        conjunto.add('x');


        System.out.println(conjunto.size());


        conjunto.add("Teste");
        conjunto.add("Teste");
        conjunto.add("teste");

        System.out.println(conjunto.size());






        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // fazendo a união dos conjuntos


        System.out.println(conjunto);


    }
}
