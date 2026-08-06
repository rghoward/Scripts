package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tq5 {
    public static final tq5 t;
    public static final tq5 u;
    public static final /* synthetic */ tq5[] v;

    static {
        tq5 tq5Var = new tq5("Ltr", 0);
        t = tq5Var;
        tq5 tq5Var2 = new tq5("Rtl", 1);
        u = tq5Var2;
        v = new tq5[]{tq5Var, tq5Var2};
    }

    public tq5() {
        throw null;
    }

    public static tq5 valueOf(String str) {
        return (tq5) Enum.valueOf(tq5.class, str);
    }

    public static tq5[] values() {
        return (tq5[]) v.clone();
    }
}
