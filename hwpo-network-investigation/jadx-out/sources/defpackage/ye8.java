package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ye8 {
    public static final ye8 c = new ye8();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ih6 a = new ih6();

    public final <T> w49<T> a(Class<T> cls) {
        xr3<?> xr3Var;
        w49<T> w49VarX;
        Class<?> cls2;
        xi5.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        w49<T> w49Var = (w49) concurrentHashMap.get(cls);
        if (w49Var != null) {
            return w49Var;
        }
        ih6 ih6Var = this.a;
        ih6Var.getClass();
        Class<?> cls3 = h59.a;
        if (!ek4.class.isAssignableFrom(cls) && (cls2 = h59.a) != null && !cls2.isAssignableFrom(cls)) {
            z90.a("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        wt6 wt6VarA = ih6Var.a.a(cls);
        if (wt6VarA.a()) {
            if (ek4.class.isAssignableFrom(cls)) {
                w49VarX = new ku6<>(h59.c, bs3.a, wt6VarA.b());
            } else {
                q2b<?, ?> q2bVar = h59.b;
                xr3<?> xr3Var2 = bs3.b;
                if (xr3Var2 == null) {
                    aa0.c("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w49VarX = new ku6<>(q2bVar, xr3Var2, wt6VarA.b());
            }
        } else if (ek4.class.isAssignableFrom(cls)) {
            sa7 sa7Var = ua7.b;
            j96 j96Var = k96.b;
            u2b u2bVar = h59.c;
            zr3 zr3Var = wt6VarA.c().ordinal() != 1 ? bs3.a : null;
            zh6 zh6Var = bi6.b;
            if (!(wt6VarA instanceof yh8)) {
                int[] iArr = iu6.p;
                throw null;
            }
            w49VarX = iu6.x((yh8) wt6VarA, sa7Var, j96Var, u2bVar, zr3Var, zh6Var);
        } else {
            qa7 qa7Var = ua7.a;
            i96 i96Var = k96.a;
            q2b<?, ?> q2bVar2 = h59.b;
            if (wt6VarA.c().ordinal() != 1) {
                xr3<?> xr3Var3 = bs3.b;
                if (xr3Var3 == null) {
                    aa0.c("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                xr3Var = xr3Var3;
            } else {
                xr3Var = null;
            }
            xh6 xh6Var = bi6.a;
            if (!(wt6VarA instanceof yh8)) {
                int[] iArr2 = iu6.p;
                throw null;
            }
            w49VarX = iu6.x((yh8) wt6VarA, qa7Var, i96Var, q2bVar2, xr3Var, xh6Var);
        }
        w49<T> w49Var2 = (w49) concurrentHashMap.putIfAbsent(cls, w49VarX);
        return w49Var2 != null ? w49Var2 : w49VarX;
    }
}
