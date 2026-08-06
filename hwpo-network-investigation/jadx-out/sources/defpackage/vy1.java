package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 {
    public static final vy1 t;
    public static final vy1 u;
    public static final /* synthetic */ vy1[] v;

    static {
        vy1 vy1Var = new vy1("VIEW_APPEAR", 0);
        t = vy1Var;
        vy1 vy1Var2 = new vy1("VIEW_DISAPPEAR", 1);
        u = vy1Var2;
        v = new vy1[]{vy1Var, vy1Var2};
    }

    public vy1() {
        throw null;
    }

    public static vy1 valueOf(String str) {
        return (vy1) Enum.valueOf(vy1.class, str);
    }

    public static vy1[] values() {
        return (vy1[]) v.clone();
    }
}
