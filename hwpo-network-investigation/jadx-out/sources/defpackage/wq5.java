package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wq5 {
    public static final wq5 t;
    public static final wq5 u;
    public static final /* synthetic */ wq5[] v;

    static {
        wq5 wq5Var = new wq5("Selector", 0);
        t = wq5Var;
        wq5 wq5Var2 = new wq5("InnerCircle", 1);
        u = wq5Var2;
        v = new wq5[]{wq5Var, wq5Var2};
    }

    public wq5() {
        throw null;
    }

    public static wq5 valueOf(String str) {
        return (wq5) Enum.valueOf(wq5.class, str);
    }

    public static wq5[] values() {
        return (wq5[]) v.clone();
    }
}
