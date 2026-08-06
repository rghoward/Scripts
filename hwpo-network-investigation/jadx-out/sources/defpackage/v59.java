package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v59 {
    public static final /* synthetic */ v59[] A;
    public static final v59 t;
    public static final v59 u;
    public static final v59 v;
    public static final v59 w;
    public static final v59 x;
    public static final v59 y;
    public static final v59 z;

    static {
        v59 v59Var = new v59("SIMPLE_VALUE", 0);
        t = v59Var;
        v59 v59Var2 = new v59("SIMPLE_TIME_VALUE", 1);
        u = v59Var2;
        v59 v59Var3 = new v59("SIMPLE_TIME_CAP_VALUE", 2);
        v = v59Var3;
        v59 v59Var4 = new v59("SIMPLE_ROUND_REPS_VALUE", 3);
        w = v59Var4;
        v59 v59Var5 = new v59("MULTIPLY_VALUE", 4);
        x = v59Var5;
        v59 v59Var6 = new v59("MULTIPLY_TIME_VALUE", 5);
        y = v59Var6;
        v59 v59Var7 = new v59("MULTIPLY_ROUND_REPS_VALUE", 6);
        z = v59Var7;
        A = new v59[]{v59Var, v59Var2, v59Var3, v59Var4, v59Var5, v59Var6, v59Var7};
    }

    public v59() {
        throw null;
    }

    public static v59 valueOf(String str) {
        return (v59) Enum.valueOf(v59.class, str);
    }

    public static v59[] values() {
        return (v59[]) A.clone();
    }
}
