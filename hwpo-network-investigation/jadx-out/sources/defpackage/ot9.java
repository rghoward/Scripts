package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ot9 {
    public static final ot9 t;
    public static final ot9 u;
    public static final /* synthetic */ ot9[] v;

    static {
        ot9 ot9Var = new ot9("Dismissed", 0);
        t = ot9Var;
        ot9 ot9Var2 = new ot9("ActionPerformed", 1);
        u = ot9Var2;
        v = new ot9[]{ot9Var, ot9Var2};
    }

    public ot9() {
        throw null;
    }

    public static ot9 valueOf(String str) {
        return (ot9) Enum.valueOf(ot9.class, str);
    }

    public static ot9[] values() {
        return (ot9[]) v.clone();
    }
}
