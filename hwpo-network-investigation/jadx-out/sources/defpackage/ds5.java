package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ds5 {
    public static final ds5 t;
    public static final /* synthetic */ ds5[] u;

    static {
        ds5 ds5Var = new ds5("Horizontal", 0);
        t = ds5Var;
        u = new ds5[]{ds5Var, new ds5("Vertical", 1)};
    }

    public ds5() {
        throw null;
    }

    public static ds5 valueOf(String str) {
        return (ds5) Enum.valueOf(ds5.class, str);
    }

    public static ds5[] values() {
        return (ds5[]) u.clone();
    }
}
