package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ec6 {
    public static final ec6 t;
    public static final ec6 u;
    public static final ec6 v;
    public static final /* synthetic */ ec6[] w;

    static {
        ec6 ec6Var = new ec6("INITIAL", 0);
        t = ec6Var;
        ec6 ec6Var2 = new ec6("RETRY", 1);
        u = ec6Var2;
        ec6 ec6Var3 = new ec6("REFRESH", 2);
        v = ec6Var3;
        w = new ec6[]{ec6Var, ec6Var2, ec6Var3};
    }

    public ec6() {
        throw null;
    }

    public static ec6 valueOf(String str) {
        return (ec6) Enum.valueOf(ec6.class, str);
    }

    public static ec6[] values() {
        return (ec6[]) w.clone();
    }
}
