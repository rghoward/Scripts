package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class n03 {
    public static final n03 t;
    public static final n03 u;
    public static final n03 v;
    public static final /* synthetic */ n03[] w;

    static {
        n03 n03Var = new n03("GAIN", 0);
        t = n03Var;
        n03 n03Var2 = new n03("LOSS", 1);
        u = n03Var2;
        n03 n03Var3 = new n03("NEUTRAL", 2);
        v = n03Var3;
        w = new n03[]{n03Var, n03Var2, n03Var3};
    }

    public n03() {
        throw null;
    }

    public static n03 valueOf(String str) {
        return (n03) Enum.valueOf(n03.class, str);
    }

    public static n03[] values() {
        return (n03[]) w.clone();
    }
}
