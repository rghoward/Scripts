package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ru7 {
    public static final /* synthetic */ ru7[] A;
    public static final ru7 t;
    public static final ru7 u;
    public static final ru7 v;
    public static final ru7 w;
    public static final ru7 x;
    public static final ru7 y;
    public static final ru7 z;

    static {
        ru7 ru7Var = new ru7("Invalid", 0);
        t = ru7Var;
        ru7 ru7Var2 = new ru7("Cancelled", 1);
        u = ru7Var2;
        ru7 ru7Var3 = new ru7("InitialPending", 2);
        v = ru7Var3;
        ru7 ru7Var4 = new ru7("RecomposePending", 3);
        w = ru7Var4;
        ru7 ru7Var5 = new ru7("Recomposing", 4);
        x = ru7Var5;
        ru7 ru7Var6 = new ru7("ApplyPending", 5);
        y = ru7Var6;
        ru7 ru7Var7 = new ru7("Applied", 6);
        z = ru7Var7;
        A = new ru7[]{ru7Var, ru7Var2, ru7Var3, ru7Var4, ru7Var5, ru7Var6, ru7Var7};
    }

    public ru7() {
        throw null;
    }

    public static ru7 valueOf(String str) {
        return (ru7) Enum.valueOf(ru7.class, str);
    }

    public static ru7[] values() {
        return (ru7[]) A.clone();
    }
}
