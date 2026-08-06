package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class in9 {
    public static final in9 t;
    public static final in9 u;
    public static final in9 v;
    public static final /* synthetic */ in9[] w;

    static {
        in9 in9Var = new in9("Hidden", 0);
        t = in9Var;
        in9 in9Var2 = new in9("Expanded", 1);
        u = in9Var2;
        in9 in9Var3 = new in9("PartiallyExpanded", 2);
        v = in9Var3;
        w = new in9[]{in9Var, in9Var2, in9Var3};
    }

    public in9() {
        throw null;
    }

    public static in9 valueOf(String str) {
        return (in9) Enum.valueOf(in9.class, str);
    }

    public static in9[] values() {
        return (in9[]) w.clone();
    }
}
