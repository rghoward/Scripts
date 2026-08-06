package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sn6 {
    public static final sn6 t;
    public static final sn6 u;
    public static final sn6 v;
    public static final sn6 w;
    public static final /* synthetic */ sn6[] x;

    static {
        sn6 sn6Var = new sn6("PHOTOS", 0);
        t = sn6Var;
        sn6 sn6Var2 = new sn6("VIDEOS", 1);
        u = sn6Var2;
        sn6 sn6Var3 = new sn6("YOUTUBE", 2);
        v = sn6Var3;
        sn6 sn6Var4 = new sn6("FILES", 3);
        w = sn6Var4;
        x = new sn6[]{sn6Var, sn6Var2, sn6Var3, sn6Var4};
    }

    public sn6() {
        throw null;
    }

    public static sn6 valueOf(String str) {
        return (sn6) Enum.valueOf(sn6.class, str);
    }

    public static sn6[] values() {
        return (sn6[]) x.clone();
    }
}
