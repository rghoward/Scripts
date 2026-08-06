package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jk5 {
    public static final jk5 t;
    public static final jk5 u;
    public static final jk5 v;
    public static final jk5 w;
    public static final /* synthetic */ jk5[] x;

    static {
        jk5 jk5Var = new jk5("LookaheadMeasurement", 0);
        t = jk5Var;
        jk5 jk5Var2 = new jk5("LookaheadPlacement", 1);
        u = jk5Var2;
        jk5 jk5Var3 = new jk5("Measurement", 2);
        v = jk5Var3;
        jk5 jk5Var4 = new jk5("Placement", 3);
        w = jk5Var4;
        x = new jk5[]{jk5Var, jk5Var2, jk5Var3, jk5Var4};
    }

    public jk5() {
        throw null;
    }

    public static jk5 valueOf(String str) {
        return (jk5) Enum.valueOf(jk5.class, str);
    }

    public static jk5[] values() {
        return (jk5[]) x.clone();
    }
}
