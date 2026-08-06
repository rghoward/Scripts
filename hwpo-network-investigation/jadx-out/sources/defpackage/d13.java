package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d13 {
    public static final d13 t;
    public static final d13 u;
    public static final d13 v;
    public static final /* synthetic */ d13[] w;

    static {
        d13 d13Var = new d13("Vertical", 0);
        t = d13Var;
        d13 d13Var2 = new d13("Horizontal", 1);
        u = d13Var2;
        d13 d13Var3 = new d13("Both", 2);
        v = d13Var3;
        w = new d13[]{d13Var, d13Var2, d13Var3};
    }

    public d13() {
        throw null;
    }

    public static d13 valueOf(String str) {
        return (d13) Enum.valueOf(d13.class, str);
    }

    public static d13[] values() {
        return (d13[]) w.clone();
    }
}
