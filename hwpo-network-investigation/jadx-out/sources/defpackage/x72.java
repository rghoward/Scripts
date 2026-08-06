package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class x72 {
    public static final x72 t;
    public static final x72 u;
    public static final x72 v;
    public static final x72 w;
    public static final /* synthetic */ x72[] x;

    static {
        x72 x72Var = new x72("DEFAULT", 0);
        t = x72Var;
        x72 x72Var2 = new x72("LAZY", 1);
        u = x72Var2;
        x72 x72Var3 = new x72("ATOMIC", 2);
        v = x72Var3;
        x72 x72Var4 = new x72("UNDISPATCHED", 3);
        w = x72Var4;
        x = new x72[]{x72Var, x72Var2, x72Var3, x72Var4};
    }

    public x72() {
        throw null;
    }

    public static x72 valueOf(String str) {
        return (x72) Enum.valueOf(x72.class, str);
    }

    public static x72[] values() {
        return (x72[]) x.clone();
    }
}
