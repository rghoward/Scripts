package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ya9 {
    public static final ya9 t;
    public static final ya9 u;
    public static final ya9 v;
    public static final /* synthetic */ ya9[] w;

    static {
        ya9 ya9Var = new ya9("Left", 0);
        t = ya9Var;
        ya9 ya9Var2 = new ya9("Middle", 1);
        u = ya9Var2;
        ya9 ya9Var3 = new ya9("Right", 2);
        v = ya9Var3;
        w = new ya9[]{ya9Var, ya9Var2, ya9Var3};
    }

    public ya9() {
        throw null;
    }

    public static ya9 valueOf(String str) {
        return (ya9) Enum.valueOf(ya9.class, str);
    }

    public static ya9[] values() {
        return (ya9[]) w.clone();
    }
}
