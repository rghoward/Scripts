package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qk9 {
    public static final qk9 t;
    public static final qk9 u;
    public static final qk9 v;
    public static final /* synthetic */ qk9[] w;

    static {
        qk9 qk9Var = new qk9("USE_CACHE", 0);
        t = qk9Var;
        qk9 qk9Var2 = new qk9("SKIP_CACHE_LOOKUP", 1);
        u = qk9Var2;
        qk9 qk9Var3 = new qk9("IGNORE_CACHE_EXPIRATION", 2);
        v = qk9Var3;
        w = new qk9[]{qk9Var, qk9Var2, qk9Var3};
    }

    public qk9() {
        throw null;
    }

    public static qk9 valueOf(String str) {
        return (qk9) Enum.valueOf(qk9.class, str);
    }

    public static qk9[] values() {
        return (qk9[]) w.clone();
    }
}
