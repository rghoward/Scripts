package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sm9 {
    public static final sm9 t;
    public static final sm9 u;
    public static final sm9 v;
    public static final /* synthetic */ sm9[] w;

    static {
        sm9 sm9Var = new sm9("START", 0);
        t = sm9Var;
        sm9 sm9Var2 = new sm9("STOP", 1);
        u = sm9Var2;
        sm9 sm9Var3 = new sm9("STOP_AND_RESET_REPLAY_CACHE", 2);
        v = sm9Var3;
        w = new sm9[]{sm9Var, sm9Var2, sm9Var3};
    }

    public sm9() {
        throw null;
    }

    public static sm9 valueOf(String str) {
        return (sm9) Enum.valueOf(sm9.class, str);
    }

    public static sm9[] values() {
        return (sm9[]) w.clone();
    }
}
