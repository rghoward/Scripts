package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class lya {
    public static final lya t;
    public static final lya u;
    public static final lya v;
    public static final lya w;
    public static final /* synthetic */ lya[] x;

    static {
        lya lyaVar = new lya("SUCCESSFUL", 0);
        t = lyaVar;
        lya lyaVar2 = new lya("REREGISTER", 1);
        u = lyaVar2;
        lya lyaVar3 = new lya("CANCELLED", 2);
        v = lyaVar3;
        lya lyaVar4 = new lya("ALREADY_SELECTED", 3);
        w = lyaVar4;
        x = new lya[]{lyaVar, lyaVar2, lyaVar3, lyaVar4};
    }

    public lya() {
        throw null;
    }

    public static lya valueOf(String str) {
        return (lya) Enum.valueOf(lya.class, str);
    }

    public static lya[] values() {
        return (lya[]) x.clone();
    }
}
