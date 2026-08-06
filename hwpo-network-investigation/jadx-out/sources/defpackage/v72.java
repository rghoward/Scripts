package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class v72 {
    public static final v72 t;
    public static final v72 u;
    public static final v72 v;
    public static final /* synthetic */ v72[] w;

    static {
        v72 v72Var = new v72("COROUTINE_SUSPENDED", 0);
        t = v72Var;
        v72 v72Var2 = new v72("UNDECIDED", 1);
        u = v72Var2;
        v72 v72Var3 = new v72("RESUMED", 2);
        v = v72Var3;
        w = new v72[]{v72Var, v72Var2, v72Var3};
    }

    public v72() {
        throw null;
    }

    public static v72 valueOf(String str) {
        return (v72) Enum.valueOf(v72.class, str);
    }

    public static v72[] values() {
        return (v72[]) w.clone();
    }
}
