package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z78 {
    public static final z78 t;
    public static final /* synthetic */ z78[] u;

    /* JADX INFO: Fake field, exist only in values array */
    z78 EF0;

    static {
        z78 z78Var = new z78("SRGB", 0);
        z78 z78Var2 = new z78("DISPLAY_P3", 1);
        t = z78Var2;
        u = new z78[]{z78Var, z78Var2};
    }

    public z78() {
        throw null;
    }

    public static z78 valueOf(String str) {
        return (z78) Enum.valueOf(z78.class, str);
    }

    public static z78[] values() {
        return (z78[]) u.clone();
    }
}
