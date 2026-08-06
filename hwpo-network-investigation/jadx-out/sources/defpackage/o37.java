package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o37 {
    public static final o37 t;
    public static final o37 u;
    public static final o37 v;
    public static final /* synthetic */ o37[] w;

    static {
        o37 o37Var = new o37("Default", 0);
        t = o37Var;
        o37 o37Var2 = new o37("UserInput", 1);
        u = o37Var2;
        o37 o37Var3 = new o37("PreventUserInput", 2);
        v = o37Var3;
        w = new o37[]{o37Var, o37Var2, o37Var3};
    }

    public o37() {
        throw null;
    }

    public static o37 valueOf(String str) {
        return (o37) Enum.valueOf(o37.class, str);
    }

    public static o37[] values() {
        return (o37[]) w.clone();
    }
}
