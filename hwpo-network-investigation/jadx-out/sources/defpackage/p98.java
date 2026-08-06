package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class p98 {
    public static final p98 t;
    public static final p98 u;
    public static final p98 v;
    public static final p98 w;
    public static final /* synthetic */ p98[] x;

    static {
        p98 p98Var = new p98("IMMEDIATE", 0);
        t = p98Var;
        p98 p98Var2 = new p98("HIGH", 1);
        u = p98Var2;
        p98 p98Var3 = new p98("NORMAL", 2);
        v = p98Var3;
        p98 p98Var4 = new p98("LOW", 3);
        w = p98Var4;
        x = new p98[]{p98Var, p98Var2, p98Var3, p98Var4};
    }

    public p98() {
        throw null;
    }

    public static p98 valueOf(String str) {
        return (p98) Enum.valueOf(p98.class, str);
    }

    public static p98[] values() {
        return (p98[]) x.clone();
    }
}
