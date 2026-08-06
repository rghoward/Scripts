package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uj4 {
    public static final uj4 t;
    public static final uj4 u;
    public static final uj4 v;
    public static final /* synthetic */ uj4[] w;

    static {
        uj4 uj4Var = new uj4("MALE", 0);
        t = uj4Var;
        uj4 uj4Var2 = new uj4("FEMALE", 1);
        u = uj4Var2;
        uj4 uj4Var3 = new uj4("OTHER", 2);
        v = uj4Var3;
        w = new uj4[]{uj4Var, uj4Var2, uj4Var3};
    }

    public uj4() {
        throw null;
    }

    public static uj4 valueOf(String str) {
        return (uj4) Enum.valueOf(uj4.class, str);
    }

    public static uj4[] values() {
        return (uj4[]) w.clone();
    }
}
