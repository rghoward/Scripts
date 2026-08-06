package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ds4 {
    public static final ds4 t;
    public static final ds4 u;
    public static final ds4 v;
    public static final /* synthetic */ ds4[] w;

    static {
        ds4 ds4Var = new ds4("GARAGE", 0);
        t = ds4Var;
        ds4 ds4Var2 = new ds4("UNAFFILIATED", 1);
        u = ds4Var2;
        ds4 ds4Var3 = new ds4("AFFILIATED", 2);
        v = ds4Var3;
        w = new ds4[]{ds4Var, ds4Var2, ds4Var3};
    }

    public ds4() {
        throw null;
    }

    public static ds4 valueOf(String str) {
        return (ds4) Enum.valueOf(ds4.class, str);
    }

    public static ds4[] values() {
        return (ds4[]) w.clone();
    }
}
