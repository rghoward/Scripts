package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u60 {
    public static final u60 t;
    public static final u60 u;
    public static final u60 v;
    public static final u60 w;
    public static final /* synthetic */ u60[] x;

    static {
        u60 u60Var = new u60("YOUTUBE", 0);
        t = u60Var;
        u60 u60Var2 = new u60("VIDEO", 1);
        u = u60Var2;
        u60 u60Var3 = new u60("IMAGE", 2);
        v = u60Var3;
        u60 u60Var4 = new u60("OTHER", 3);
        w = u60Var4;
        x = new u60[]{u60Var, u60Var2, u60Var3, u60Var4};
    }

    public u60() {
        throw null;
    }

    public static u60 valueOf(String str) {
        return (u60) Enum.valueOf(u60.class, str);
    }

    public static u60[] values() {
        return (u60[]) x.clone();
    }
}
