package model.util;

import java.util.ArrayList;
import java.util.List;

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
}
