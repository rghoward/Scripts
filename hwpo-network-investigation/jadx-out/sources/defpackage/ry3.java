package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ry3 {
    public static final ry3 t;
    public static final /* synthetic */ ry3[] u;

    /* JADX INFO: Fake field, exist only in values array */
    ry3 EF0;

    static {
        ry3 ry3Var = new ry3("TOP_DOWN", 0);
        ry3 ry3Var2 = new ry3("BOTTOM_UP", 1);
        t = ry3Var2;
        u = new ry3[]{ry3Var, ry3Var2};
    }

    public ry3() {
        throw null;
    }

    public static ry3 valueOf(String str) {
        return (ry3) Enum.valueOf(ry3.class, str);
    }

    public static ry3[] values() {
        return (ry3[]) u.clone();
    }
}
