package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ys4 {
    public static final ys4 t;
    public static final ys4 u;
    public static final ys4 v;
    public static final /* synthetic */ ys4[] w;

    static {
        ys4 ys4Var = new ys4("Cursor", 0);
        t = ys4Var;
        ys4 ys4Var2 = new ys4("SelectionStart", 1);
        u = ys4Var2;
        ys4 ys4Var3 = new ys4("SelectionEnd", 2);
        v = ys4Var3;
        w = new ys4[]{ys4Var, ys4Var2, ys4Var3};
    }

    public ys4() {
        throw null;
    }

    public static ys4 valueOf(String str) {
        return (ys4) Enum.valueOf(ys4.class, str);
    }

    public static ys4[] values() {
        return (ys4[]) w.clone();
    }
}
