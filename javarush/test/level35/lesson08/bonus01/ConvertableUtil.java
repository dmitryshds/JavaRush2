package com.javarush.test.level35.lesson08.bonus01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertableUtil {

    public static Map<?,? extends Convertable> convert(List<? extends Convertable> list) {
        Map<Object, Convertable<?>> result = new HashMap();
        for (Convertable<?> convertable : list) {
            Object key = convertable.getKey();
             result.put(key,convertable);
        }


        return result;
    }
}
