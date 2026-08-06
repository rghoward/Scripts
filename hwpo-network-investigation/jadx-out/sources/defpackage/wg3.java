package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wg3 {
    public static final wg3 t;
    public static final wg3 u;
    public static final wg3 v;
    public static final /* synthetic */ wg3[] w;

    static {
        wg3 wg3Var = new wg3("PreEnter", 0);
        t = wg3Var;
        wg3 wg3Var2 = new wg3("Visible", 1);
        u = wg3Var2;
        wg3 wg3Var3 = new wg3("PostExit", 2);
        v = wg3Var3;
        w = new wg3[]{wg3Var, wg3Var2, wg3Var3};
    }

    public wg3() {
        throw null;
    }

    public static wg3 valueOf(String str) {
        return (wg3) Enum.valueOf(wg3.class, str);
    }

    public static wg3[] values() {
        return (wg3[]) w.clone();
    }
}
