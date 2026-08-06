package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jf2 {
    public static final jf2 t;
    public static final jf2 u;
    public static final jf2 v;
    public static final jf2 w;
    public static final /* synthetic */ jf2[] x;

    static {
        jf2 jf2Var = new jf2("MEMORY_CACHE", 0);
        t = jf2Var;
        jf2 jf2Var2 = new jf2("MEMORY", 1);
        u = jf2Var2;
        jf2 jf2Var3 = new jf2("DISK", 2);
        v = jf2Var3;
        jf2 jf2Var4 = new jf2("NETWORK", 3);
        w = jf2Var4;
        x = new jf2[]{jf2Var, jf2Var2, jf2Var3, jf2Var4};
    }

    public jf2() {
        throw null;
    }

    public static jf2 valueOf(String str) {
        return (jf2) Enum.valueOf(jf2.class, str);
    }

    public static jf2[] values() {
        return (jf2[]) x.clone();
    }
}
