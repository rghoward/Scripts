package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ub7 {
    public static final ub7 t;
    public static final ub7 u;
    public static final /* synthetic */ ub7[] v;

    static {
        ub7 ub7Var = new ub7("Min", 0);
        t = ub7Var;
        ub7 ub7Var2 = new ub7("Max", 1);
        u = ub7Var2;
        v = new ub7[]{ub7Var, ub7Var2};
    }

    public ub7() {
        throw null;
    }

    public static ub7 valueOf(String str) {
        return (ub7) Enum.valueOf(ub7.class, str);
    }

    public static ub7[] values() {
        return (ub7[]) v.clone();
    }
}
