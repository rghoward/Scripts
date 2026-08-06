package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class t08 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final Method a;
        public static final Method b;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            methods.getClass();
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i];
                if (xj5.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (xj5.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        break;
                    }
                }
                i++;
            }
            a = method2;
            for (Method method3 : methods) {
                if (xj5.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            b = method;
        }
    }

    public void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Method method = a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List<Throwable> b(Throwable th) {
        Object objInvoke;
        th.getClass();
        Method method = a.b;
        if (method == null || (objInvoke = method.invoke(th, null)) == null) {
            return hf3.t;
        }
        List<Throwable> listAsList = Arrays.asList((Throwable[]) objInvoke);
        listAsList.getClass();
        return listAsList;
    }
}
