package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xm8 {
    public static final xm8 t;
    public static final /* synthetic */ xm8[] u;

    static {
        xm8 xm8Var = new xm8("LAUNCH_INITIAL_REFRESH", 0);
        t = xm8Var;
        u = new xm8[]{xm8Var, new xm8("SKIP_INITIAL_REFRESH", 1)};
    }

    public xm8() {
        throw null;
    }

    public static xm8 valueOf(String str) {
        return (xm8) Enum.valueOf(xm8.class, str);
    }

    public static xm8[] values() {
        return (xm8[]) u.clone();
    }
}
