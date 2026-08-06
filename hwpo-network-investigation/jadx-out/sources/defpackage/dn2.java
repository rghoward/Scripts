package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dn2 {
    public static final dn2 t;
    public static final dn2 u;
    public static final dn2 v;
    public static final /* synthetic */ dn2[] w;

    static {
        dn2 dn2Var = new dn2("PREFER_ARGB_8888", 0);
        t = dn2Var;
        dn2 dn2Var2 = new dn2("PREFER_RGB_565", 1);
        u = dn2Var2;
        w = new dn2[]{dn2Var, dn2Var2};
        v = dn2Var;
    }

    public dn2() {
        throw null;
    }

    public static dn2 valueOf(String str) {
        return (dn2) Enum.valueOf(dn2.class, str);
    }

    public static dn2[] values() {
        return (dn2[]) w.clone();
    }
}
