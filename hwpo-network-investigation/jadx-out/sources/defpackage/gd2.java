package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gd2 {
    public static final gd2 t;
    public static final gd2 u;
    public static final gd2 v;
    public static final /* synthetic */ gd2[] w;

    static {
        gd2 gd2Var = new gd2("None", 0);
        t = gd2Var;
        gd2 gd2Var2 = new gd2("Cancelled", 1);
        u = gd2Var2;
        gd2 gd2Var3 = new gd2("Redirected", 2);
        v = gd2Var3;
        w = new gd2[]{gd2Var, gd2Var2, gd2Var3, new gd2("RedirectCancelled", 3)};
    }

    public gd2() {
        throw null;
    }

    public static gd2 valueOf(String str) {
        return (gd2) Enum.valueOf(gd2.class, str);
    }

    public static gd2[] values() {
        return (gd2[]) w.clone();
    }
}
