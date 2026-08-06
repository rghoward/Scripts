package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s48 {
    public static final s48 t;
    public static final s48 u;
    public static final s48 v;
    public static final /* synthetic */ s48[] w;

    static {
        s48 s48Var = new s48("Initial", 0);
        t = s48Var;
        s48 s48Var2 = new s48("Main", 1);
        u = s48Var2;
        s48 s48Var3 = new s48("Final", 2);
        v = s48Var3;
        w = new s48[]{s48Var, s48Var2, s48Var3};
    }

    public s48() {
        throw null;
    }

    public static s48 valueOf(String str) {
        return (s48) Enum.valueOf(s48.class, str);
    }

    public static s48[] values() {
        return (s48[]) w.clone();
    }
}
