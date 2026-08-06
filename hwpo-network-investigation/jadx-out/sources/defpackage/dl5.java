package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dl5 {
    public static final dl5 A;
    public static final dl5 B;
    public static final dl5 C;
    public static final /* synthetic */ dl5[] D;
    public static final dl5 t;
    public static final dl5 u;
    public static final dl5 v;
    public static final dl5 w;
    public static final dl5 x;
    public static final dl5 y;
    public static final dl5 z;

    static {
        dl5 dl5Var = new dl5("VOID", 0);
        t = dl5Var;
        dl5 dl5Var2 = new dl5("INT", 1);
        u = dl5Var2;
        dl5 dl5Var3 = new dl5("LONG", 2);
        v = dl5Var3;
        dl5 dl5Var4 = new dl5("FLOAT", 3);
        w = dl5Var4;
        dl5 dl5Var5 = new dl5("DOUBLE", 4);
        x = dl5Var5;
        dl5 dl5Var6 = new dl5("BOOLEAN", 5);
        y = dl5Var6;
        dl5 dl5Var7 = new dl5("STRING", 6);
        z = dl5Var7;
        e01.f fVar = e01.u;
        dl5 dl5Var8 = new dl5("BYTE_STRING", 7);
        A = dl5Var8;
        dl5 dl5Var9 = new dl5("ENUM", 8);
        B = dl5Var9;
        dl5 dl5Var10 = new dl5("MESSAGE", 9);
        C = dl5Var10;
        D = new dl5[]{dl5Var, dl5Var2, dl5Var3, dl5Var4, dl5Var5, dl5Var6, dl5Var7, dl5Var8, dl5Var9, dl5Var10};
    }

    public static dl5 valueOf(String str) {
        return (dl5) Enum.valueOf(dl5.class, str);
    }

    public static dl5[] values() {
        return (dl5[]) D.clone();
    }
}
