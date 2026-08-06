package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r39 {
    public static final r39 t;
    public static final r39 u;
    public static final r39 v;
    public static final r39 w;
    public static final r39 x;
    public static final /* synthetic */ r39[] y;

    static {
        r39 r39Var = new r39("TopBar", 0);
        t = r39Var;
        r39 r39Var2 = new r39("MainContent", 1);
        u = r39Var2;
        r39 r39Var3 = new r39("Snackbar", 2);
        v = r39Var3;
        r39 r39Var4 = new r39("Fab", 3);
        w = r39Var4;
        r39 r39Var5 = new r39("BottomBar", 4);
        x = r39Var5;
        y = new r39[]{r39Var, r39Var2, r39Var3, r39Var4, r39Var5};
    }

    public r39() {
        throw null;
    }

    public static r39 valueOf(String str) {
        return (r39) Enum.valueOf(r39.class, str);
    }

    public static r39[] values() {
        return (r39[]) y.clone();
    }
}
