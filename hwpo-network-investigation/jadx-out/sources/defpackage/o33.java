package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o33 {
    public static final o33 t;
    public static final o33 u;
    public static final /* synthetic */ o33[] v;

    static {
        o33 o33Var = new o33("METER", 0);
        t = o33Var;
        o33 o33Var2 = new o33("YARD", 1);
        u = o33Var2;
        v = new o33[]{o33Var, o33Var2};
    }

    public o33() {
        throw null;
    }

    public static o33 valueOf(String str) {
        return (o33) Enum.valueOf(o33.class, str);
    }

    public static o33[] values() {
        return (o33[]) v.clone();
    }
}
