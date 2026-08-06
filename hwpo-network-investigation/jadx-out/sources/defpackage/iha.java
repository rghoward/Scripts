package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iha {
    public static final iha t;
    public static final iha u;
    public static final /* synthetic */ iha[] v;

    static {
        iha ihaVar = new iha("Filled", 0);
        t = ihaVar;
        iha ihaVar2 = new iha("Outlined", 1);
        u = ihaVar2;
        v = new iha[]{ihaVar, ihaVar2};
    }

    public iha() {
        throw null;
    }

    public static iha valueOf(String str) {
        return (iha) Enum.valueOf(iha.class, str);
    }

    public static iha[] values() {
        return (iha[]) v.clone();
    }
}
