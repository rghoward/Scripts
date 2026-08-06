package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class wj4 {
    public static final wj4 t;
    public static final wj4 u;
    public static final wj4 v;
    public static final /* synthetic */ wj4[] w;

    static {
        wj4 wj4Var = new wj4("MALE", 0);
        t = wj4Var;
        wj4 wj4Var2 = new wj4("FEMALE", 1);
        u = wj4Var2;
        wj4 wj4Var3 = new wj4("OTHER", 2);
        v = wj4Var3;
        w = new wj4[]{wj4Var, wj4Var2, wj4Var3};
    }

    public wj4() {
        throw null;
    }

    public static wj4 valueOf(String str) {
        return (wj4) Enum.valueOf(wj4.class, str);
    }

    public static wj4[] values() {
        return (wj4[]) w.clone();
    }
}
