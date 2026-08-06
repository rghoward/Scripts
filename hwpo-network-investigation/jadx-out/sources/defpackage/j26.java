package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class j26 {
    public static final j26 t;
    public static final j26 u;
    public static final /* synthetic */ j26[] v;

    /* JADX INFO: Fake field, exist only in values array */
    j26 EF0;

    static {
        j26 j26Var = new j26("SYNCHRONIZED", 0);
        j26 j26Var2 = new j26("PUBLICATION", 1);
        t = j26Var2;
        j26 j26Var3 = new j26("NONE", 2);
        u = j26Var3;
        v = new j26[]{j26Var, j26Var2, j26Var3};
    }

    public j26() {
        throw null;
    }

    public static j26 valueOf(String str) {
        return (j26) Enum.valueOf(j26.class, str);
    }

    public static j26[] values() {
        return (j26[]) v.clone();
    }
}
