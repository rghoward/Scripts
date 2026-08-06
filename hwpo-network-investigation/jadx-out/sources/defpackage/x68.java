package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x68 {
    public static final x68 t;
    public static final x68 u;
    public static final x68 v;
    public static final /* synthetic */ x68[] w;

    static {
        x68 x68Var = new x68("EXACT", 0);
        t = x68Var;
        x68 x68Var2 = new x68("INEXACT", 1);
        u = x68Var2;
        x68 x68Var3 = new x68("AUTOMATIC", 2);
        v = x68Var3;
        w = new x68[]{x68Var, x68Var2, x68Var3};
    }

    public x68() {
        throw null;
    }

    public static x68 valueOf(String str) {
        return (x68) Enum.valueOf(x68.class, str);
    }

    public static x68[] values() {
        return (x68[]) w.clone();
    }
}
