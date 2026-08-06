package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ur3 {
    public static volatile ur3 b;
    public static final ur3 c = new ur3(0);
    public final Map<a, ek4.e<?, ?>> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Object a;
        public final int b;

        public a(int i, au6 au6Var) {
            this.a = au6Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public ur3() {
        this.a = new HashMap();
    }

    public static ur3 a() {
        ur3 ur3Var;
        ye8 ye8Var = ye8.c;
        ur3 ur3Var2 = b;
        if (ur3Var2 != null) {
            return ur3Var2;
        }
        synchronized (ur3.class) {
            try {
                ur3Var = b;
                if (ur3Var == null) {
                    Class<?> cls = tr3.a;
                    ur3 ur3Var3 = null;
                    if (cls != null) {
                        try {
                            ur3Var3 = (ur3) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    ur3Var = ur3Var3 != null ? ur3Var3 : c;
                    b = ur3Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ur3Var;
    }

    public ur3(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
