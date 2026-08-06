package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rj5 {
    public static final rj5 t;
    public static final rj5 u;
    public static final /* synthetic */ rj5[] v;

    static {
        rj5 rj5Var = new rj5("Min", 0);
        t = rj5Var;
        rj5 rj5Var2 = new rj5("Max", 1);
        u = rj5Var2;
        v = new rj5[]{rj5Var, rj5Var2};
    }

    public rj5() {
        throw null;
    }

    public static rj5 valueOf(String str) {
        return (rj5) Enum.valueOf(rj5.class, str);
    }

    public static rj5[] values() {
        return (rj5[]) v.clone();
    }
}
