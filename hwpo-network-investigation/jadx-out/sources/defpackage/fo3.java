package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fo3 {
    public static final fo3 t;
    public static final /* synthetic */ fo3[] u;

    /* JADX INFO: Fake field, exist only in values array */
    fo3 EF0;

    static {
        fo3 fo3Var = new fo3("IGNORE", 0);
        fo3 fo3Var2 = new fo3("RESPECT_PERFORMANCE", 1);
        t = fo3Var2;
        u = new fo3[]{fo3Var, fo3Var2, new fo3("RESPECT_ALL", 2)};
    }

    public fo3() {
        throw null;
    }

    public static fo3 valueOf(String str) {
        return (fo3) Enum.valueOf(fo3.class, str);
    }

    public static fo3[] values() {
        return (fo3[]) u.clone();
    }
}
