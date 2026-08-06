package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bt4 {
    public static final bt4 t;
    public static final bt4 u;
    public static final bt4 v;
    public static final /* synthetic */ bt4[] w;

    static {
        bt4 bt4Var = new bt4("None", 0);
        t = bt4Var;
        bt4 bt4Var2 = new bt4("Selection", 1);
        u = bt4Var2;
        bt4 bt4Var3 = new bt4("Cursor", 2);
        v = bt4Var3;
        w = new bt4[]{bt4Var, bt4Var2, bt4Var3};
    }

    public bt4() {
        throw null;
    }

    public static bt4 valueOf(String str) {
        return (bt4) Enum.valueOf(bt4.class, str);
    }

    public static bt4[] values() {
        return (bt4[]) w.clone();
    }
}
