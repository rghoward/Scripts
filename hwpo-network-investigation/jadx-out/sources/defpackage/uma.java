package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uma {
    public static final gi1 a = gi1.A;

    public static final ox6 a(ox6 ox6Var, jl9 jl9Var) {
        return po4.c(ox6Var, 0.0f, 0.0f, 0.0f, 0.0f, jl9Var, 518143);
    }

    public static final ox6 b(ox6 ox6Var) {
        return po4.c(ox6Var, 0.0f, 0.0f, 0.0f, 0.0f, null, 520191);
    }

    public static void c(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Object d(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        aa0.c(av.a(vb0.a("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }
}
