package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sj5 {
    public static final sj5 t;
    public static final sj5 u;
    public static final /* synthetic */ sj5[] v;

    static {
        sj5 sj5Var = new sj5("Min", 0);
        t = sj5Var;
        sj5 sj5Var2 = new sj5("Max", 1);
        u = sj5Var2;
        v = new sj5[]{sj5Var, sj5Var2};
    }

    public sj5() {
        throw null;
    }

    public static sj5 valueOf(String str) {
        return (sj5) Enum.valueOf(sj5.class, str);
    }

    public static sj5[] values() {
        return (sj5[]) v.clone();
    }
}
