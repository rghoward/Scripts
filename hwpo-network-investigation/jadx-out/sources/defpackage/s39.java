package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s39 {
    public static final s39 t;
    public static final s39 u;
    public static final /* synthetic */ s39[] v;

    static {
        s39 s39Var = new s39("FILL", 0);
        t = s39Var;
        s39 s39Var2 = new s39("FIT", 1);
        u = s39Var2;
        v = new s39[]{s39Var, s39Var2};
    }

    public s39() {
        throw null;
    }

    public static s39 valueOf(String str) {
        return (s39) Enum.valueOf(s39.class, str);
    }

    public static s39[] values() {
        return (s39[]) v.clone();
    }
}
