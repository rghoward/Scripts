package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lk5 {
    public static final lk5 t;
    public static final lk5 u;
    public static final lk5 v;
    public static final lk5 w;
    public static final /* synthetic */ lk5[] x;

    static {
        lk5 lk5Var = new lk5("IGNORED", 0);
        t = lk5Var;
        lk5 lk5Var2 = new lk5("SCHEDULED", 1);
        u = lk5Var2;
        lk5 lk5Var3 = new lk5("DEFERRED", 2);
        v = lk5Var3;
        lk5 lk5Var4 = new lk5("IMMINENT", 3);
        w = lk5Var4;
        x = new lk5[]{lk5Var, lk5Var2, lk5Var3, lk5Var4};
    }

    public lk5() {
        throw null;
    }

    public static lk5 valueOf(String str) {
        return (lk5) Enum.valueOf(lk5.class, str);
    }

    public static lk5[] values() {
        return (lk5[]) x.clone();
    }
}
