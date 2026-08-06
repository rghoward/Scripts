package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vb7 {
    public static final vb7 t;
    public static final vb7 u;
    public static final /* synthetic */ vb7[] v;

    static {
        vb7 vb7Var = new vb7("Width", 0);
        t = vb7Var;
        vb7 vb7Var2 = new vb7("Height", 1);
        u = vb7Var2;
        v = new vb7[]{vb7Var, vb7Var2};
    }

    public vb7() {
        throw null;
    }

    public static vb7 valueOf(String str) {
        return (vb7) Enum.valueOf(vb7.class, str);
    }

    public static vb7[] values() {
        return (vb7[]) v.clone();
    }
}
