package model.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by ncameron on 4/25/2017.
 */
public class Util {

    public static void ensureSize(ArrayList<?> list, int size) {
        //http://stackoverflow.com/questions/7688151/java-arraylist-ensurecapacity-not-working
        list.ensureCapacity(size);
        while (list.size() < size) {
            //// TODO: 4/25/2017 should this be 0 instead?
            list.add(null);
        }


    }

    public static boolean checkOverflow(int x){
        //TODO: Larry - "x>2147483647" always is false because Java handles overflow...also this is kinda just annoying
        return (x==2147483647);
    }

}
