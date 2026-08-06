package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p37 {
    public static final p37 t;
    public static final /* synthetic */ p37[] u;

    static {
        p37 p37Var = new p37("Default", 0);
        t = p37Var;
        u = new p37[]{p37Var, new p37("UserInput", 1), new p37("PreventUserInput", 2)};
    }

    public p37() {
        throw null;
    }

    public static p37 valueOf(String str) {
        return (p37) Enum.valueOf(p37.class, str);
    }

    public static p37[] values() {
        return (p37[]) u.clone();
    }
}
