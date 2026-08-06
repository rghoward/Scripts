package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s60 {
    public static final s60 t;
    public static final s60 u;
    public static final s60 v;
    public static final s60 w;
    public static final /* synthetic */ s60[] x;

    static {
        s60 s60Var = new s60("INIT", 0);
        t = s60Var;
        s60 s60Var2 = new s60("LOADED", 1);
        u = s60Var2;
        s60 s60Var3 = new s60("FAILED", 2);
        v = s60Var3;
        s60 s60Var4 = new s60("LOADING", 3);
        w = s60Var4;
        x = new s60[]{s60Var, s60Var2, s60Var3, s60Var4};
    }

    public s60() {
        throw null;
    }

    public static s60 valueOf(String str) {
        return (s60) Enum.valueOf(s60.class, str);
    }

    public static s60[] values() {
        return (s60[]) x.clone();
    }
}
