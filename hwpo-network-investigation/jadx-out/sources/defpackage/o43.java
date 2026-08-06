package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o43 {
    public static final o43 t;
    public static final o43 u;
    public static final o43 v;
    public static final o43 w;
    public static final /* synthetic */ o43[] x;

    static {
        o43 o43Var = new o43("Up", 0);
        t = o43Var;
        o43 o43Var2 = new o43("Drag", 1);
        u = o43Var2;
        o43 o43Var3 = new o43("Timeout", 2);
        v = o43Var3;
        o43 o43Var4 = new o43("Cancel", 3);
        w = o43Var4;
        x = new o43[]{o43Var, o43Var2, o43Var3, o43Var4};
    }

    public o43() {
        throw null;
    }

    public static o43 valueOf(String str) {
        return (o43) Enum.valueOf(o43.class, str);
    }

    public static o43[] values() {
        return (o43[]) x.clone();
    }
}
