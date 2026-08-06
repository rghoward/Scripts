package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ve8 {
    public static final ve8 t;
    public static final ve8 u;
    public static final ve8 v;
    public static final /* synthetic */ ve8[] w;

    static {
        ve8 ve8Var = new ve8("PROTO2", 0);
        t = ve8Var;
        ve8 ve8Var2 = new ve8("PROTO3", 1);
        u = ve8Var2;
        ve8 ve8Var3 = new ve8("EDITIONS", 2);
        v = ve8Var3;
        w = new ve8[]{ve8Var, ve8Var2, ve8Var3};
    }

    public ve8() {
        throw null;
    }

    public static ve8 valueOf(String str) {
        return (ve8) Enum.valueOf(ve8.class, str);
    }

    public static ve8[] values() {
        return (ve8[]) w.clone();
    }
}
