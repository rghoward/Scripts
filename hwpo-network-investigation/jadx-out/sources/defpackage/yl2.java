package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yl2 {
    public static final yl2 t;
    public static final yl2 u;
    public static final /* synthetic */ yl2[] v;

    static {
        yl2 yl2Var = new yl2("DISABLED", 0);
        t = yl2Var;
        yl2 yl2Var2 = new yl2("ENABLED", 1);
        u = yl2Var2;
        v = new yl2[]{yl2Var, yl2Var2};
    }

    public yl2() {
        throw null;
    }

    public static yl2 valueOf(String str) {
        return (yl2) Enum.valueOf(yl2.class, str);
    }

    public static yl2[] values() {
        return (yl2[]) v.clone();
    }
}
