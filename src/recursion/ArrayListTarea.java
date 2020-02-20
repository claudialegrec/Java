package recursion;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTarea {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            int a = (int) (Math.random() * 10);
            nums.add(a);
        }

        System.out.println(nums);
        
        Iterator<Integer> iter = nums.iterator();
        
        while(iter.hasNext()){
            if((iter.next() % 2) == 0){
                iter.remove();
            }
        }
        iter = nums.iterator();
        
        System.out.println(nums);
    }
}
