package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class qi6 extends pi6 {
    public static Object h(Object obj, Map map) {
        map.getClass();
        if (map instanceof fi6) {
            return ((fi6) map).B();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static <K, V> Map<K, V> i(js7<? extends K, ? extends V>... js7VarArr) {
        if (js7VarArr.length <= 0) {
            return if3.t;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(pi6.g(js7VarArr.length));
        j(linkedHashMap, js7VarArr);
        return linkedHashMap;
    }

    public static final void j(HashMap map, js7[] js7VarArr) {
        for (js7 js7Var : js7VarArr) {
            map.put(js7Var.t, js7Var.u);
        }
    }

    public static Map k(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return if3.t;
        }
        int i = 0;
        if (size == 1) {
            js7 js7Var = (js7) arrayList.get(0);
            js7Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(js7Var.t, js7Var.u);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(pi6.g(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            js7 js7Var2 = (js7) obj;
            linkedHashMap.put(js7Var2.t, js7Var2.u);
        }
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return if3.t;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static LinkedHashMap m(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
