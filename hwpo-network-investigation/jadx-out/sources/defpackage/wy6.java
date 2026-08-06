package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wy6 {
    public static final wy6 t;
    public static final wy6 u;
    public static final wy6 v;
    public static final wy6 w;
    public static final wy6 x;
    public static final /* synthetic */ wy6[] y;

    static {
        wy6 wy6Var = new wy6("DefaultSpatial", 0);
        t = wy6Var;
        wy6 wy6Var2 = new wy6("FastSpatial", 1);
        u = wy6Var2;
        wy6 wy6Var3 = new wy6("SlowSpatial", 2);
        wy6 wy6Var4 = new wy6("DefaultEffects", 3);
        v = wy6Var4;
        wy6 wy6Var5 = new wy6("FastEffects", 4);
        w = wy6Var5;
        wy6 wy6Var6 = new wy6("SlowEffects", 5);
        x = wy6Var6;
        y = new wy6[]{wy6Var, wy6Var2, wy6Var3, wy6Var4, wy6Var5, wy6Var6};
    }

    public wy6() {
        throw null;
    }

    public static wy6 valueOf(String str) {
        return (wy6) Enum.valueOf(wy6.class, str);
    }

    public static wy6[] values() {
        return (wy6[]) y.clone();
    }
}
