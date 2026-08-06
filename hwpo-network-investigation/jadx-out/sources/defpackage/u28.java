package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class u28 {
    public static final u28 A;
    public static final /* synthetic */ u28[] B;
    public static final u28 t;
    public static final u28 u;
    public static final u28 v;
    public static final u28 w;
    public static final u28 x;
    public static final u28 y;
    public static final u28 z;

    static {
        u28 u28Var = new u28("UNKNOWN", 0);
        t = u28Var;
        u28 u28Var2 = new u28("SMALL", 1);
        u = u28Var2;
        u28 u28Var3 = new u28("MEDIUM", 2);
        v = u28Var3;
        u28 u28Var4 = new u28("LARGE", 3);
        w = u28Var4;
        u28 u28Var5 = new u28("HD720", 4);
        x = u28Var5;
        u28 u28Var6 = new u28("HD1080", 5);
        y = u28Var6;
        u28 u28Var7 = new u28("HIGH_RES", 6);
        z = u28Var7;
        u28 u28Var8 = new u28("DEFAULT", 7);
        A = u28Var8;
        B = new u28[]{u28Var, u28Var2, u28Var3, u28Var4, u28Var5, u28Var6, u28Var7, u28Var8};
    }

    public u28() {
        throw null;
    }

    public static u28 valueOf(String str) {
        return (u28) Enum.valueOf(u28.class, str);
    }

    public static u28[] values() {
        return (u28[]) B.clone();
    }
}
