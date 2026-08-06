package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xz7 {
    public static final xz7 t;
    public static final xz7 u;
    public static final xz7 v;
    public static final /* synthetic */ xz7[] w;

    static {
        xz7 xz7Var = new xz7("UNKNOWN", 0);
        t = xz7Var;
        xz7 xz7Var2 = new xz7("SHOWN", 1);
        u = xz7Var2;
        xz7 xz7Var3 = new xz7("HIDDEN", 2);
        v = xz7Var3;
        w = new xz7[]{xz7Var, xz7Var2, xz7Var3};
    }

    public xz7() {
        throw null;
    }

    public static xz7 valueOf(String str) {
        return (xz7) Enum.valueOf(xz7.class, str);
    }

    public static xz7[] values() {
        return (xz7[]) w.clone();
    }
}
