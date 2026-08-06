package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o89 {
    public static final o89 t;
    public static final o89 u;
    public static final o89 v;
    public static final o89 w;
    public static final o89 x;
    public static final o89 y;
    public static final /* synthetic */ o89[] z;

    static {
        o89 o89Var = new o89("TIP", 0);
        t = o89Var;
        o89 o89Var2 = new o89("LEADERBOARD", 1);
        u = o89Var2;
        o89 o89Var3 = new o89("SECTION", 2);
        v = o89Var3;
        o89 o89Var4 = new o89("CHALLENGE", 3);
        w = o89Var4;
        o89 o89Var5 = new o89("PRE_WOD", 4);
        x = o89Var5;
        o89 o89Var6 = new o89("POST_WOD", 5);
        y = o89Var6;
        z = new o89[]{o89Var, o89Var2, o89Var3, o89Var4, o89Var5, o89Var6};
    }

    public o89() {
        throw null;
    }

    public static o89 valueOf(String str) {
        return (o89) Enum.valueOf(o89.class, str);
    }

    public static o89[] values() {
        return (o89[]) z.clone();
    }
}
