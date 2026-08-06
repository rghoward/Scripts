package defpackage;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ym5 {
    public static final ry2.a<Map<String, Integer>> a = new ry2.a<>();

    public static final int a(SerialDescriptor serialDescriptor, sl5 sl5Var, String str) {
        serialDescriptor.getClass();
        sl5Var.getClass();
        str.getClass();
        d(sl5Var, serialDescriptor);
        int iD = serialDescriptor.d(str);
        if (iD != -3 || !sl5Var.a.g) {
            return iD;
        }
        ry2 ry2Var = sl5Var.c;
        xm5 xm5Var = new xm5(sl5Var, serialDescriptor);
        ry2Var.getClass();
        ConcurrentHashMap concurrentHashMap = ry2Var.a;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        ry2.a<Map<String, Integer>> aVar = a;
        Object obj = map != null ? map.get(aVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = xm5Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(aVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(SerialDescriptor serialDescriptor, sl5 sl5Var, String str, String str2) {
        serialDescriptor.getClass();
        sl5Var.getClass();
        str.getClass();
        int iA = a(serialDescriptor, sl5Var, str);
        if (iA != -3) {
            return iA;
        }
        throw new td9(serialDescriptor.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(sl5 sl5Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        sl5Var.getClass();
        if (sl5Var.a.a) {
            return true;
        }
        List<Annotation> annotations = serialDescriptor.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof rm5) {
                return true;
            }
        }
        return false;
    }

    public static final void d(sl5 sl5Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        sl5Var.getClass();
        xj5.a(serialDescriptor.e(), g3a.a.a);
    }
}
