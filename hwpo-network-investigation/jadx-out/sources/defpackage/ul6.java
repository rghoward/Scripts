package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ul6 {
    public static final ul6 t;
    public static final ul6 u;
    public static final /* synthetic */ ul6[] v;

    static {
        ul6 ul6Var = new ul6("Min", 0);
        t = ul6Var;
        ul6 ul6Var2 = new ul6("Max", 1);
        u = ul6Var2;
        v = new ul6[]{ul6Var, ul6Var2};
    }

    public ul6() {
        throw null;
    }

    public static ul6 valueOf(String str) {
        return (ul6) Enum.valueOf(ul6.class, str);
    }

    public static ul6[] values() {
        return (ul6[]) v.clone();
    }
}
