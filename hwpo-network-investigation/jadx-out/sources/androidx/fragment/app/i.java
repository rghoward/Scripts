package androidx.fragment.app;

import defpackage.ep9;
import defpackage.sk0;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class i {
    public static final ep9<ClassLoader, ep9<String, Class<?>>> a = new ep9<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        ep9<ClassLoader, ep9<String, Class<?>>> ep9Var = a;
        ep9<String, Class<?>> ep9Var2 = ep9Var.get(classLoader);
        if (ep9Var2 == null) {
            ep9Var2 = new ep9<>();
            ep9Var.put(classLoader, ep9Var2);
        }
        Class<?> cls = ep9Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ep9Var2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends f> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new f.l(sk0.c("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new f.l(sk0.c("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public f a(ClassLoader classLoader, String str) {
        throw null;
    }
}
