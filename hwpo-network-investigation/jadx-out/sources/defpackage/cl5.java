package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cl5 {
    public static final cl5 A;
    public static final cl5 B;
    public static final cl5 C;
    public static final /* synthetic */ cl5[] D;
    public static final cl5 t;
    public static final cl5 u;
    public static final cl5 v;
    public static final cl5 w;
    public static final cl5 x;
    public static final cl5 y;
    public static final cl5 z;

    static {
        cl5 cl5Var = new cl5("VOID", 0);
        t = cl5Var;
        cl5 cl5Var2 = new cl5("INT", 1);
        u = cl5Var2;
        cl5 cl5Var3 = new cl5("LONG", 2);
        v = cl5Var3;
        cl5 cl5Var4 = new cl5("FLOAT", 3);
        w = cl5Var4;
        cl5 cl5Var5 = new cl5("DOUBLE", 4);
        x = cl5Var5;
        cl5 cl5Var6 = new cl5("BOOLEAN", 5);
        y = cl5Var6;
        cl5 cl5Var7 = new cl5("STRING", 6);
        z = cl5Var7;
        f01.e eVar = f01.u;
        cl5 cl5Var8 = new cl5("BYTE_STRING", 7);
        A = cl5Var8;
        cl5 cl5Var9 = new cl5("ENUM", 8);
        B = cl5Var9;
        cl5 cl5Var10 = new cl5("MESSAGE", 9);
        C = cl5Var10;
        D = new cl5[]{cl5Var, cl5Var2, cl5Var3, cl5Var4, cl5Var5, cl5Var6, cl5Var7, cl5Var8, cl5Var9, cl5Var10};
    }

    public static cl5 valueOf(String str) {
        return (cl5) Enum.valueOf(cl5.class, str);
    }

    public static cl5[] values() {
        return (cl5[]) D.clone();
    }
}
