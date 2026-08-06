package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jt8 {
    public static final jt8 t;
    public static final jt8 u;
    public static final /* synthetic */ jt8[] v;

    static {
        jt8 jt8Var = new jt8("Ltr", 0);
        t = jt8Var;
        jt8 jt8Var2 = new jt8("Rtl", 1);
        u = jt8Var2;
        v = new jt8[]{jt8Var, jt8Var2};
    }

    public jt8() {
        throw null;
    }

    public static jt8 valueOf(String str) {
        return (jt8) Enum.valueOf(jt8.class, str);
    }

    public static jt8[] values() {
        return (jt8[]) v.clone();
    }
}
