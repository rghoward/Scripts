package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vl6 {
    public static final vl6 t;
    public static final vl6 u;
    public static final /* synthetic */ vl6[] v;

    static {
        vl6 vl6Var = new vl6("Width", 0);
        t = vl6Var;
        vl6 vl6Var2 = new vl6("Height", 1);
        u = vl6Var2;
        v = new vl6[]{vl6Var, vl6Var2};
    }

    public vl6() {
        throw null;
    }

    public static vl6 valueOf(String str) {
        return (vl6) Enum.valueOf(vl6.class, str);
    }

    public static vl6[] values() {
        return (vl6[]) v.clone();
    }
}
