package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g31 {
    public static final g31 t;
    public static final g31 u;
    public static final /* synthetic */ g31[] v;

    static {
        g31 g31Var = new g31("PROFILE", 0);
        t = g31Var;
        g31 g31Var2 = new g31("LEADERBOARD", 1);
        u = g31Var2;
        v = new g31[]{g31Var, g31Var2};
    }

    public g31() {
        throw null;
    }

    public static g31 valueOf(String str) {
        return (g31) Enum.valueOf(g31.class, str);
    }

    public static g31[] values() {
        return (g31[]) v.clone();
    }
}
