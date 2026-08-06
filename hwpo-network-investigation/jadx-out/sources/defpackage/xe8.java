package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xe8 {
    public static final xe8 c = new xe8();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final jh6 a = new jh6();

    public final <T> v49<T> a(Class<T> cls) {
        v49<T> v49VarR;
        Class<?> cls2;
        zi5.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        v49<T> v49Var = (v49) concurrentHashMap.get(cls);
        if (v49Var != null) {
            return v49Var;
        }
        jh6 jh6Var = this.a;
        jh6Var.getClass();
        Class<?> cls3 = g59.a;
        if (!fk4.class.isAssignableFrom(cls) && (cls2 = g59.a) != null && !cls2.isAssignableFrom(cls)) {
            z90.a("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        vt6 vt6VarA = jh6Var.a.a(cls);
        if (vt6VarA.a()) {
            if (fk4.class.isAssignableFrom(cls)) {
                v49VarR = new ju6<>(g59.c, as3.a, vt6VarA.b());
            } else {
                p2b<?, ?> p2bVar = g59.b;
                wr3<?> wr3Var = as3.b;
                if (wr3Var == null) {
                    aa0.c("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                v49VarR = new ju6<>(p2bVar, wr3Var, vt6VarA.b());
            }
        } else if (fk4.class.isAssignableFrom(cls)) {
            v49VarR = vt6VarA.c().ordinal() != 1 ? hu6.r(vt6VarA, ta7.b, h96.b, g59.c, as3.a, ai6.b) : hu6.r(vt6VarA, ta7.b, h96.b, g59.c, null, ai6.b);
        } else if (vt6VarA.c().ordinal() != 1) {
            pa7 pa7Var = ta7.a;
            h96.a aVar = h96.a;
            p2b<?, ?> p2bVar2 = g59.b;
            wr3<?> wr3Var2 = as3.b;
            if (wr3Var2 == null) {
                aa0.c("Protobuf runtime is not correctly loaded.");
                return null;
            }
            v49VarR = hu6.r(vt6VarA, pa7Var, aVar, p2bVar2, wr3Var2, ai6.a);
        } else {
            v49VarR = hu6.r(vt6VarA, ta7.a, h96.a, g59.b, null, ai6.a);
        }
        v49<T> v49Var2 = (v49) concurrentHashMap.putIfAbsent(cls, v49VarR);
        return v49Var2 != null ? v49Var2 : v49VarR;
    }
}
