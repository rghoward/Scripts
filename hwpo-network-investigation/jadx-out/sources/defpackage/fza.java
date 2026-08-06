package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fza {
    public static Map a(Object obj) {
        if ((obj instanceof zn5) && !(obj instanceof bo5)) {
            d(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            xj5.d(e, fza.class.getName());
            throw e;
        }
    }

    public static void b(int i, Object obj) {
        if (obj == null || c(i, obj)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean c(int i, Object obj) {
        int arity;
        if (obj instanceof di4) {
            if (obj instanceof ni4) {
                arity = ((ni4) obj).getArity();
            } else if (obj instanceof mh4) {
                arity = 0;
            } else if (obj instanceof oh4) {
                arity = 1;
            } else if (obj instanceof ci4) {
                arity = 2;
            } else if (obj instanceof ei4) {
                arity = 3;
            } else if (obj instanceof fi4) {
                arity = 4;
            } else if (obj instanceof gi4) {
                arity = 5;
            } else if (obj instanceof hi4) {
                arity = 6;
            } else if (obj instanceof ii4) {
                arity = 7;
            } else if (obj instanceof ji4) {
                arity = 8;
            } else if (obj instanceof ki4) {
                arity = 9;
            } else if (obj instanceof nh4) {
                arity = 10;
            } else if (obj instanceof ph4) {
                arity = 11;
            } else if (obj instanceof qh4) {
                arity = 12;
            } else if (obj instanceof rh4) {
                arity = 13;
            } else if (obj instanceof sh4) {
                arity = 14;
            } else if (obj instanceof th4) {
                arity = 15;
            } else if (obj instanceof uh4) {
                arity = 16;
            } else if (obj instanceof vh4) {
                arity = 17;
            } else if (obj instanceof wh4) {
                arity = 18;
            } else if (obj instanceof xh4) {
                arity = 19;
            } else if (obj instanceof zh4) {
                arity = 20;
            } else if (obj instanceof ai4) {
                arity = 21;
            } else {
                arity = obj instanceof bi4 ? 22 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(cj2.a(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        xj5.d(classCastException, fza.class.getName());
        throw classCastException;
    }
}
