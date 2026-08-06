package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dx1 {
    public static final dx1 t;
    public static final dx1 u;
    public static final dx1 v;
    public static final dx1 w;
    public static final /* synthetic */ dx1[] x;

    static {
        dx1 dx1Var = new dx1("DISCONNECTED", 0);
        t = dx1Var;
        dx1 dx1Var2 = new dx1("CONNECTING", 1);
        u = dx1Var2;
        dx1 dx1Var3 = new dx1("CONNECTED", 2);
        v = dx1Var3;
        dx1 dx1Var4 = new dx1("FAILED", 3);
        w = dx1Var4;
        x = new dx1[]{dx1Var, dx1Var2, dx1Var3, dx1Var4};
    }

    public dx1() {
        throw null;
    }

    public static dx1 valueOf(String str) {
        return (dx1) Enum.valueOf(dx1.class, str);
    }

    public static dx1[] values() {
        return (dx1[]) x.clone();
    }
}
