package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sxa {
    public static final sxa t;
    public static final sxa u;
    public static final sxa v;
    public static final /* synthetic */ sxa[] w;

    static {
        sxa sxaVar = new sxa("ContinueTraversal", 0);
        t = sxaVar;
        sxa sxaVar2 = new sxa("SkipSubtreeAndContinueTraversal", 1);
        u = sxaVar2;
        sxa sxaVar3 = new sxa("CancelTraversal", 2);
        v = sxaVar3;
        w = new sxa[]{sxaVar, sxaVar2, sxaVar3};
    }

    public sxa() {
        throw null;
    }

    public static sxa valueOf(String str) {
        return (sxa) Enum.valueOf(sxa.class, str);
    }

    public static sxa[] values() {
        return (sxa[]) w.clone();
    }
}
