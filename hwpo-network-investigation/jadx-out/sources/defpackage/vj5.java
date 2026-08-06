package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vj5 {
    public static final vj5 t;
    public static final vj5 u;
    public static final /* synthetic */ vj5[] v;

    static {
        vj5 vj5Var = new vj5("Width", 0);
        t = vj5Var;
        vj5 vj5Var2 = new vj5("Height", 1);
        u = vj5Var2;
        v = new vj5[]{vj5Var, vj5Var2};
    }

    public vj5() {
        throw null;
    }

    public static vj5 valueOf(String str) {
        return (vj5) Enum.valueOf(vj5.class, str);
    }

    public static vj5[] values() {
        return (vj5[]) v.clone();
    }
}
