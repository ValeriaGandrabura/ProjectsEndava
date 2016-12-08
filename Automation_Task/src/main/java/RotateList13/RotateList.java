package RotateList13;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {

        int k = 2;
        int i = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        while (i < k) {
            list.add(list.size(), list.get(0));
            list.remove(0);
            i++;
        }

        System.out.println(list);
    }


}
