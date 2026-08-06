package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x28 {
    public static final /* synthetic */ x28[] A;
    public static final x28 t;
    public static final x28 u;
    public static final x28 v;
    public static final x28 w;
    public static final x28 x;
    public static final x28 y;
    public static final x28 z;

    static {
        x28 x28Var = new x28("UNKNOWN", 0);
        t = x28Var;
        x28 x28Var2 = new x28("UNSTARTED", 1);
        u = x28Var2;
        x28 x28Var3 = new x28("ENDED", 2);
        v = x28Var3;
        x28 x28Var4 = new x28("PLAYING", 3);
        w = x28Var4;
        x28 x28Var5 = new x28("PAUSED", 4);
        x = x28Var5;
        x28 x28Var6 = new x28("BUFFERING", 5);
        y = x28Var6;
        x28 x28Var7 = new x28("VIDEO_CUED", 6);
        z = x28Var7;
        A = new x28[]{x28Var, x28Var2, x28Var3, x28Var4, x28Var5, x28Var6, x28Var7};
    }

    public x28() {
        throw null;
    }

    public static x28 valueOf(String str) {
        return (x28) Enum.valueOf(x28.class, str);
    }

    public static x28[] values() {
        return (x28[]) A.clone();
    }
}
