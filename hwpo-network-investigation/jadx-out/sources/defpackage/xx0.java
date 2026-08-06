package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xx0 {
    public static final xx0 t;
    public static final xx0 u;
    public static final xx0 v;
    public static final /* synthetic */ xx0[] w;

    static {
        xx0 xx0Var = new xx0("SUSPEND", 0);
        t = xx0Var;
        xx0 xx0Var2 = new xx0("DROP_OLDEST", 1);
        u = xx0Var2;
        xx0 xx0Var3 = new xx0("DROP_LATEST", 2);
        v = xx0Var3;
        w = new xx0[]{xx0Var, xx0Var2, xx0Var3};
    }

    public xx0() {
        throw null;
    }

    public static xx0 valueOf(String str) {
        return (xx0) Enum.valueOf(xx0.class, str);
    }

    public static xx0[] values() {
        return (xx0[]) w.clone();
    }
}
