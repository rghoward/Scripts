package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xfb {
    public static final LinkedHashMap a = new LinkedHashMap();

    static {
        new LinkedHashMap();
    }

    public static final wfb a(sd1 sd1Var, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Class clsB = me3.b(sd1Var);
        LinkedHashMap linkedHashMap = a;
        Object obj = linkedHashMap.get(clsB);
        if (obj == null) {
            Method[] declaredMethods = clsB.getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                Method method = declaredMethods[i];
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (xj5.a(method.getName(), "inflate") && xj5.a(parameterTypes[0], LayoutInflater.class) && xj5.a(u30.z(1, parameterTypes), ViewGroup.class) && (parameterTypes.length == 2 || xj5.a(parameterTypes[2], Boolean.TYPE))) {
                    obj = method;
                    break;
                }
                i++;
            }
            if (obj == null) {
                throw new IllegalStateException(("Method " + clsB.getSimpleName() + ".inflate(LayoutInflater, ViewGroup[, boolean]) not found.").toString());
            }
            linkedHashMap.put(clsB, obj);
        }
        Method method2 = (Method) obj;
        if (method2.getParameterTypes().length > 2) {
            objInvoke = method2.invoke(null, layoutInflater, viewGroup, Boolean.valueOf(z));
        } else {
            if (!z) {
                rma.a.a(sk0.c("ViewBinding: attachToRoot is always true for ", me3.b(sd1Var).getSimpleName(), ".inflate"), new Object[0]);
            }
            objInvoke = method2.invoke(null, layoutInflater, viewGroup);
        }
        objInvoke.getClass();
        return (wfb) objInvoke;
    }
}
