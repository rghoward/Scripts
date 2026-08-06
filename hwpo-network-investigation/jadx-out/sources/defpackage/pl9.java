package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pl9 {
    public static final pl9 A;
    public static final /* synthetic */ pl9[] B;
    public static final pl9 t;
    public static final pl9 u;
    public static final pl9 v;
    public static final pl9 w;
    public static final pl9 x;
    public static final pl9 y;
    public static final pl9 z;

    /* JADX INFO: Fake field, exist only in values array */
    pl9 EF0;

    static {
        pl9 pl9Var = new pl9("CornerExtraExtraLarge", 0);
        pl9 pl9Var2 = new pl9("CornerExtraLarge", 1);
        t = pl9Var2;
        pl9 pl9Var3 = new pl9("CornerExtraLargeIncreased", 2);
        pl9 pl9Var4 = new pl9("CornerExtraLargeTop", 3);
        u = pl9Var4;
        pl9 pl9Var5 = new pl9("CornerExtraSmall", 4);
        v = pl9Var5;
        pl9 pl9Var6 = new pl9("CornerExtraSmallTop", 5);
        w = pl9Var6;
        pl9 pl9Var7 = new pl9("CornerFull", 6);
        x = pl9Var7;
        pl9 pl9Var8 = new pl9("CornerLarge", 7);
        y = pl9Var8;
        pl9 pl9Var9 = new pl9("CornerLargeEnd", 8);
        pl9 pl9Var10 = new pl9("CornerLargeIncreased", 9);
        pl9 pl9Var11 = new pl9("CornerLargeStart", 10);
        pl9 pl9Var12 = new pl9("CornerLargeTop", 11);
        pl9 pl9Var13 = new pl9("CornerMedium", 12);
        z = pl9Var13;
        pl9 pl9Var14 = new pl9("CornerNone", 13);
        pl9 pl9Var15 = new pl9("CornerSmall", 14);
        A = pl9Var15;
        B = new pl9[]{pl9Var, pl9Var2, pl9Var3, pl9Var4, pl9Var5, pl9Var6, pl9Var7, pl9Var8, pl9Var9, pl9Var10, pl9Var11, pl9Var12, pl9Var13, pl9Var14, pl9Var15};
    }

    public pl9() {
        throw null;
    }

    public static pl9 valueOf(String str) {
        return (pl9) Enum.valueOf(pl9.class, str);
    }

    public static pl9[] values() {
        return (pl9[]) B.clone();
    }
}
