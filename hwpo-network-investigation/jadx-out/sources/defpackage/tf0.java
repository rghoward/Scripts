package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tf0 {
    public static final tf0 t;
    public static final tf0 u;
    public static final tf0 v;
    public static final tf0 w;
    public static final /* synthetic */ tf0[] x;

    static {
        tf0 tf0Var = new tf0("ONLY_PREVIOUS", 0);
        t = tf0Var;
        tf0 tf0Var2 = new tf0("BOTH", 1);
        u = tf0Var2;
        tf0 tf0Var3 = new tf0("ONLY_NEXT", 2);
        v = tf0Var3;
        tf0 tf0Var4 = new tf0("NONE", 3);
        w = tf0Var4;
        x = new tf0[]{tf0Var, tf0Var2, tf0Var3, tf0Var4};
    }

    public tf0() {
        throw null;
    }

    public static tf0 valueOf(String str) {
        return (tf0) Enum.valueOf(tf0.class, str);
    }

    public static tf0[] values() {
        return (tf0[]) x.clone();
    }
}
