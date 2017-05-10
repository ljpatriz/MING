/**
 * FileName: Util.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Util {

    public static void ensureSize(ArrayList<?> list, int size) {
        //http://stackoverflow.com/questions/7688151/java-arraylist-ensurecapacity-not-working
        list.ensureCapacity(size);
        while (list.size() < size) {
            list.add(null);
        }


    }

    public static boolean checkOverflow(int x){
        return (x==2147483647);
    }

}
