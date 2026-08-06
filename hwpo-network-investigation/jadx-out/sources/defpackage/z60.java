package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z60 {
    public static final z60 t;
    public static final z60 u;
    public static final z60 v;
    public static final z60 w;
    public static final /* synthetic */ z60[] x;

    static {
        z60 z60Var = new z60("INIT", 0);
        t = z60Var;
        z60 z60Var2 = new z60("UPLOADING", 1);
        u = z60Var2;
        z60 z60Var3 = new z60("FAILED", 2);
        v = z60Var3;
        z60 z60Var4 = new z60("UPLOADED", 3);
        w = z60Var4;
        x = new z60[]{z60Var, z60Var2, z60Var3, z60Var4};
    }

    public z60() {
        throw null;
    }

    public static z60 valueOf(String str) {
        return (z60) Enum.valueOf(z60.class, str);
    }

    public static z60[] values() {
        return (z60[]) x.clone();
    }
}
