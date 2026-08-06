package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s89 {
    public static final s89 t;
    public static final s89 u;
    public static final /* synthetic */ s89[] v;

    static {
        s89 s89Var = new s89("Inherit", 0);
        t = s89Var;
        s89 s89Var2 = new s89("SecureOn", 1);
        u = s89Var2;
        v = new s89[]{s89Var, s89Var2, new s89("SecureOff", 2)};
    }

    public s89() {
        throw null;
    }

    public static s89 valueOf(String str) {
        return (s89) Enum.valueOf(s89.class, str);
    }

    public static s89[] values() {
        return (s89[]) v.clone();
    }
}
