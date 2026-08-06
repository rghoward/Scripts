package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hy3 {
    public static final a Companion;
    public static final hy3 t;
    public static final hy3 u;
    public static final hy3 v;
    public static final hy3 w;
    public static final /* synthetic */ hy3[] x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    static {
        hy3 hy3Var = new hy3("IMAGE", 0);
        t = hy3Var;
        hy3 hy3Var2 = new hy3("VIDEO", 1);
        u = hy3Var2;
        hy3 hy3Var3 = new hy3("DOCUMENT", 2);
        v = hy3Var3;
        hy3 hy3Var4 = new hy3("UNKNOWN", 3);
        w = hy3Var4;
        x = new hy3[]{hy3Var, hy3Var2, hy3Var3, hy3Var4};
        Companion = new a();
    }

    public hy3() {
        throw null;
    }

    public static hy3 valueOf(String str) {
        return (hy3) Enum.valueOf(hy3.class, str);
    }

    public static hy3[] values() {
        return (hy3[]) x.clone();
    }
}
