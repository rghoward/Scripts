package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class td5 {
    public static final td5 t;
    public static final td5 u;
    public static final td5 v;
    public static final /* synthetic */ td5[] w;

    static {
        td5 td5Var = new td5("Focused", 0);
        t = td5Var;
        td5 td5Var2 = new td5("UnfocusedEmpty", 1);
        u = td5Var2;
        td5 td5Var3 = new td5("UnfocusedNotEmpty", 2);
        v = td5Var3;
        w = new td5[]{td5Var, td5Var2, td5Var3};
    }

    public td5() {
        throw null;
    }

    public static td5 valueOf(String str) {
        return (td5) Enum.valueOf(td5.class, str);
    }

    public static td5[] values() {
        return (td5[]) w.clone();
    }
}
