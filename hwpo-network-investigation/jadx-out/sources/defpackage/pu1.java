package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pu1 {
    public static final <T> T a(kw7 kw7Var, hf8 hf8Var) {
        hf8Var.getClass();
        Object objB = kw7Var.get(hf8Var);
        if (objB == null) {
            objB = hf8Var.b();
        }
        return (T) ((oab) objB).a(kw7Var);
    }

    public static final kw7 b(kf8<?>[] kf8VarArr, kw7 kw7Var, kw7 kw7Var2) {
        jw7.a aVar = new jw7.a(jw7.w);
        for (kf8<?> kf8Var : kf8VarArr) {
            hf8 hf8Var = kf8Var.a;
            if (kf8Var.f || !kw7Var.containsKey(hf8Var)) {
                aVar.put(hf8Var, hf8Var.c(kf8Var, (oab) kw7Var2.get(hf8Var)));
            }
        }
        return aVar.a();
    }
}
