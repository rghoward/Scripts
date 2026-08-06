package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pb2 {
    public static final pb2 t;
    public static final pb2 u;
    public static final pb2 v;
    public static final /* synthetic */ pb2[] w;

    static {
        pb2 pb2Var = new pb2("CROSSED", 0);
        t = pb2Var;
        pb2 pb2Var2 = new pb2("NOT_CROSSED", 1);
        u = pb2Var2;
        pb2 pb2Var3 = new pb2("COLLAPSED", 2);
        v = pb2Var3;
        w = new pb2[]{pb2Var, pb2Var2, pb2Var3};
    }

    public pb2() {
        throw null;
    }

    public static pb2 valueOf(String str) {
        return (pb2) Enum.valueOf(pb2.class, str);
    }

    public static pb2[] values() {
        return (pb2[]) w.clone();
    }
}
