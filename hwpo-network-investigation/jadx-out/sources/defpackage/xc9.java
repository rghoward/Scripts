package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xc9 {
    public static final xc9 t;
    public static final xc9 u;
    public static final xc9 v;
    public static final /* synthetic */ xc9[] w;

    static {
        xc9 xc9Var = new xc9("SENDING", 0);
        t = xc9Var;
        xc9 xc9Var2 = new xc9("SENT", 1);
        u = xc9Var2;
        xc9 xc9Var3 = new xc9("FAILED", 2);
        v = xc9Var3;
        w = new xc9[]{xc9Var, xc9Var2, xc9Var3};
    }

    public xc9() {
        throw null;
    }

    public static xc9 valueOf(String str) {
        return (xc9) Enum.valueOf(xc9.class, str);
    }

    public static xc9[] values() {
        return (xc9[]) w.clone();
    }
}
