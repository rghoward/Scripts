package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zlb {
    public static final zlb t;
    public static final zlb u;
    public static final /* synthetic */ zlb[] v;

    static {
        zlb zlbVar = new zlb("KG", 0);
        t = zlbVar;
        zlb zlbVar2 = new zlb("POUND", 1);
        u = zlbVar2;
        v = new zlb[]{zlbVar, zlbVar2};
    }

    public zlb() {
        throw null;
    }

    public static zlb valueOf(String str) {
        return (zlb) Enum.valueOf(zlb.class, str);
    }

    public static zlb[] values() {
        return (zlb[]) v.clone();
    }
}
