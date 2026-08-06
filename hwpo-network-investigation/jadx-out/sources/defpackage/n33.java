package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n33 {
    public static final n33 t;
    public static final n33 u;
    public static final /* synthetic */ n33[] v;

    static {
        n33 n33Var = new n33("METER", 0);
        t = n33Var;
        n33 n33Var2 = new n33("YARD", 1);
        u = n33Var2;
        v = new n33[]{n33Var, n33Var2};
    }

    public n33() {
        throw null;
    }

    public static n33 valueOf(String str) {
        return (n33) Enum.valueOf(n33.class, str);
    }

    public static n33[] values() {
        return (n33[]) v.clone();
    }
}
