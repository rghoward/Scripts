package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ns9 {
    public static final ns9 t;
    public static final ns9 u;
    public static final ns9 v;
    public static final /* synthetic */ ns9[] w;

    static {
        ns9 ns9Var = new ns9("Short", 0);
        t = ns9Var;
        ns9 ns9Var2 = new ns9("Long", 1);
        u = ns9Var2;
        ns9 ns9Var3 = new ns9("Indefinite", 2);
        v = ns9Var3;
        w = new ns9[]{ns9Var, ns9Var2, ns9Var3};
    }

    public ns9() {
        throw null;
    }

    public static ns9 valueOf(String str) {
        return (ns9) Enum.valueOf(ns9.class, str);
    }

    public static ns9[] values() {
        return (ns9[]) w.clone();
    }
}
