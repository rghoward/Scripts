package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gz7 {
    public static final gz7 t;
    public static final gz7 u;
    public static final gz7 v;
    public static final /* synthetic */ gz7[] w;

    static {
        gz7 gz7Var = new gz7("UNCHANGED", 0);
        t = gz7Var;
        gz7 gz7Var2 = new gz7("TRANSLUCENT", 1);
        u = gz7Var2;
        gz7 gz7Var3 = new gz7("OPAQUE", 2);
        v = gz7Var3;
        w = new gz7[]{gz7Var, gz7Var2, gz7Var3};
    }

    public gz7() {
        throw null;
    }

    public static gz7 valueOf(String str) {
        return (gz7) Enum.valueOf(gz7.class, str);
    }

    public static gz7[] values() {
        return (gz7[]) w.clone();
    }
}
