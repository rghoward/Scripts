package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qn8 {
    public static final qn8 t;
    public static final qn8 u;
    public static final /* synthetic */ qn8[] v;

    static {
        qn8 qn8Var = new qn8("Restart", 0);
        t = qn8Var;
        qn8 qn8Var2 = new qn8("Reverse", 1);
        u = qn8Var2;
        v = new qn8[]{qn8Var, qn8Var2};
    }

    public qn8() {
        throw null;
    }

    public static qn8 valueOf(String str) {
        return (qn8) Enum.valueOf(qn8.class, str);
    }

    public static qn8[] values() {
        return (qn8[]) v.clone();
    }
}
