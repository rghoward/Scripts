package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wb6 {
    public static final wb6 t;
    public static final wb6 u;
    public static final wb6 v;
    public static final /* synthetic */ wb6[] w;

    static {
        wb6 wb6Var = new wb6("REFRESH", 0);
        t = wb6Var;
        wb6 wb6Var2 = new wb6("PREPEND", 1);
        u = wb6Var2;
        wb6 wb6Var3 = new wb6("APPEND", 2);
        v = wb6Var3;
        w = new wb6[]{wb6Var, wb6Var2, wb6Var3};
    }

    public wb6() {
        throw null;
    }

    public static wb6 valueOf(String str) {
        return (wb6) Enum.valueOf(wb6.class, str);
    }

    public static wb6[] values() {
        return (wb6[]) w.clone();
    }
}
