package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o98 {
    public static final o98 t;
    public static final o98 u;
    public static final o98 v;
    public static final /* synthetic */ o98[] w;

    static {
        o98 o98Var = new o98("DEFAULT", 0);
        t = o98Var;
        o98 o98Var2 = new o98("VERY_LOW", 1);
        u = o98Var2;
        o98 o98Var3 = new o98("HIGHEST", 2);
        v = o98Var3;
        w = new o98[]{o98Var, o98Var2, o98Var3};
    }

    public o98() {
        throw null;
    }

    public static o98 valueOf(String str) {
        return (o98) Enum.valueOf(o98.class, str);
    }

    public static o98[] values() {
        return (o98[]) w.clone();
    }
}
