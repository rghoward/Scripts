package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ue8 {
    public static final ue8 t;
    public static final ue8 u;
    public static final ue8 v;
    public static final /* synthetic */ ue8[] w;

    static {
        ue8 ue8Var = new ue8("PROTO2", 0);
        t = ue8Var;
        ue8 ue8Var2 = new ue8("PROTO3", 1);
        u = ue8Var2;
        ue8 ue8Var3 = new ue8("EDITIONS", 2);
        v = ue8Var3;
        w = new ue8[]{ue8Var, ue8Var2, ue8Var3};
    }

    public ue8() {
        throw null;
    }

    public static ue8 valueOf(String str) {
        return (ue8) Enum.valueOf(ue8.class, str);
    }

    public static ue8[] values() {
        return (ue8[]) w.clone();
    }
}
