package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class v28 {
    public static final v28 t;
    public static final v28 u;
    public static final v28 v;
    public static final v28 w;
    public static final v28 x;
    public static final v28 y;
    public static final /* synthetic */ v28[] z;

    static {
        v28 v28Var = new v28("UNKNOWN", 0);
        t = v28Var;
        v28 v28Var2 = new v28("RATE_0_25", 1);
        u = v28Var2;
        v28 v28Var3 = new v28("RATE_0_5", 2);
        v = v28Var3;
        v28 v28Var4 = new v28("RATE_1", 3);
        w = v28Var4;
        v28 v28Var5 = new v28("RATE_1_5", 4);
        x = v28Var5;
        v28 v28Var6 = new v28("RATE_2", 5);
        y = v28Var6;
        z = new v28[]{v28Var, v28Var2, v28Var3, v28Var4, v28Var5, v28Var6};
    }

    public v28() {
        throw null;
    }

    public static v28 valueOf(String str) {
        return (v28) Enum.valueOf(v28.class, str);
    }

    public static v28[] values() {
        return (v28[]) z.clone();
    }
}
