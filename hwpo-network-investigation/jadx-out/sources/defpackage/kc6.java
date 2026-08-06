package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kc6 {
    public static final hf8<m76> a;

    static {
        Object aVar;
        try {
            ClassLoader classLoader = m76.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof hf8) {
                        aVar = (hf8) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof gy2)) {
                    i++;
                }
                aVar = null;
                break;
            }
        } catch (Throwable th) {
            aVar = new av8.a(th);
        }
        hf8<m76> y0aVar = (hf8) (aVar instanceof av8.a ? null : aVar);
        if (y0aVar == null) {
            y0aVar = new y0a(new jc6());
        }
        a = y0aVar;
    }
}
