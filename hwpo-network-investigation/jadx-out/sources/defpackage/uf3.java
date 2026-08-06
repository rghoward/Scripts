package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uf3 {
    public static final uf3 t;
    public static final uf3 u;
    public static final uf3 v;
    public static final /* synthetic */ uf3[] w;

    static {
        uf3 uf3Var = new uf3("SOURCE", 0);
        t = uf3Var;
        uf3 uf3Var2 = new uf3("TRANSFORMED", 1);
        u = uf3Var2;
        uf3 uf3Var3 = new uf3("NONE", 2);
        v = uf3Var3;
        w = new uf3[]{uf3Var, uf3Var2, uf3Var3};
    }

    public uf3() {
        throw null;
    }

    public static uf3 valueOf(String str) {
        return (uf3) Enum.valueOf(uf3.class, str);
    }

    public static uf3[] values() {
        return (uf3[]) w.clone();
    }
}
