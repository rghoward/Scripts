package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kf2 {
    public static final kf2 t;
    public static final kf2 u;
    public static final kf2 v;
    public static final kf2 w;
    public static final kf2 x;
    public static final /* synthetic */ kf2[] y;

    static {
        kf2 kf2Var = new kf2("LOCAL", 0);
        t = kf2Var;
        kf2 kf2Var2 = new kf2("REMOTE", 1);
        u = kf2Var2;
        kf2 kf2Var3 = new kf2("DATA_DISK_CACHE", 2);
        v = kf2Var3;
        kf2 kf2Var4 = new kf2("RESOURCE_DISK_CACHE", 3);
        w = kf2Var4;
        kf2 kf2Var5 = new kf2("MEMORY_CACHE", 4);
        x = kf2Var5;
        y = new kf2[]{kf2Var, kf2Var2, kf2Var3, kf2Var4, kf2Var5};
    }

    public kf2() {
        throw null;
    }

    public static kf2 valueOf(String str) {
        return (kf2) Enum.valueOf(kf2.class, str);
    }

    public static kf2[] values() {
        return (kf2[]) y.clone();
    }
}
