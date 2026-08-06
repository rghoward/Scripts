package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vr3 {
    public static volatile vr3 b;
    public static final vr3 c = new vr3(0);
    public final Map<Object, Object> a;

    public vr3() {
        this.a = new HashMap();
    }

    public static void a() {
        if (b == null) {
            synchronized (vr3.class) {
                try {
                    if (b == null) {
                        Class<?> cls = sr3.a;
                        vr3 vr3Var = null;
                        if (cls != null) {
                            try {
                                vr3Var = (vr3) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (vr3Var == null) {
                            vr3Var = c;
                        }
                        b = vr3Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public vr3(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
