package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class w28 {
    public static final w28 t;
    public static final w28 u;
    public static final w28 v;
    public static final w28 w;
    public static final w28 x;
    public static final /* synthetic */ w28[] y;

    static {
        w28 w28Var = new w28("UNKNOWN", 0);
        t = w28Var;
        w28 w28Var2 = new w28("INVALID_PARAMETER_IN_REQUEST", 1);
        u = w28Var2;
        w28 w28Var3 = new w28("HTML_5_PLAYER", 2);
        v = w28Var3;
        w28 w28Var4 = new w28("VIDEO_NOT_FOUND", 3);
        w = w28Var4;
        w28 w28Var5 = new w28("VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER", 4);
        x = w28Var5;
        y = new w28[]{w28Var, w28Var2, w28Var3, w28Var4, w28Var5};
    }

    public w28() {
        throw null;
    }

    public static w28 valueOf(String str) {
        return (w28) Enum.valueOf(w28.class, str);
    }

    public static w28[] values() {
        return (w28[]) y.clone();
    }
}
