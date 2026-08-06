package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ylb {
    public static final ylb t;
    public static final ylb u;
    public static final /* synthetic */ ylb[] v;

    static {
        ylb ylbVar = new ylb("KG", 0);
        t = ylbVar;
        ylb ylbVar2 = new ylb("POUND", 1);
        u = ylbVar2;
        v = new ylb[]{ylbVar, ylbVar2};
    }

    public ylb() {
        throw null;
    }

    public static ylb valueOf(String str) {
        return (ylb) Enum.valueOf(ylb.class, str);
    }

    public static ylb[] values() {
        return (ylb[]) v.clone();
    }
}
