package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class si1 {
    public static final float[] a;
    public static final float[] b;
    public static final zua c;
    public static final zua d;
    public static final lw8 e;
    public static final lw8 f;
    public static final lw8 g;
    public static final lw8 h;
    public static final lw8 i;
    public static final lw8 j;
    public static final lw8 k;
    public static final lw8 l;
    public static final lw8 m;
    public static final lw8 n;
    public static final lw8 o;
    public static final lw8 p;
    public static final lw8 q;
    public static final lw8 r;
    public static final lrb s;
    public static final up5 t;
    public static final lw8 u;
    public static final lw8 v;
    public static final lw8 w;
    public static final og7 x;
    public static final ii1[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        zua zuaVar = new zua(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        zua zuaVar2 = new zua(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        zua zuaVar3 = new zua(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = zuaVar3;
        zua zuaVar4 = new zua(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = zuaVar4;
        amb ambVar = e75.d;
        lw8 lw8Var = new lw8("sRGB IEC61966-2.1", fArr, ambVar, zuaVar, 0);
        e = lw8Var;
        lw8 lw8Var2 = new lw8("sRGB IEC61966-2.1 (Linear)", fArr, ambVar, 1.0d, 0.0f, 1.0f, 1);
        f = lw8Var2;
        lw8 lw8Var3 = new lw8("scRGB-nl IEC 61966-2-2:2003", fArr, ambVar, null, new oi1(), new pi1(), -0.799f, 2.399f, zuaVar, 2);
        g = lw8Var3;
        lw8 lw8Var4 = new lw8("scRGB IEC 61966-2-2:2003", fArr, ambVar, 1.0d, -0.5f, 7.499f, 3);
        h = lw8Var4;
        lw8 lw8Var5 = new lw8("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, ambVar, new zua(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = lw8Var5;
        lw8 lw8Var6 = new lw8("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, ambVar, new zua(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = lw8Var6;
        lw8 lw8Var7 = new lw8("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new amb(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = lw8Var7;
        lw8 lw8Var8 = new lw8("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, ambVar, zuaVar, 7);
        l = lw8Var8;
        lw8 lw8Var9 = new lw8("NTSC (1953)", fArr2, e75.a, new zua(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = lw8Var9;
        lw8 lw8Var10 = new lw8("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, ambVar, new zua(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = lw8Var10;
        lw8 lw8Var11 = new lw8("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, ambVar, 2.2d, 0.0f, 1.0f, 10);
        o = lw8Var11;
        lw8 lw8Var12 = new lw8("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, e75.b, new zua(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = lw8Var12;
        amb ambVar2 = e75.c;
        lw8 lw8Var13 = new lw8("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, ambVar2, 1.0d, -65504.0f, 65504.0f, 12);
        q = lw8Var13;
        lw8 lw8Var14 = new lw8("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, ambVar2, 1.0d, -65504.0f, 65504.0f, 13);
        r = lw8Var14;
        lrb lrbVar = new lrb(14, 12884901889L, "Generic XYZ");
        s = lrbVar;
        up5 up5Var = new up5(15, 12884901890L, "Generic L*a*b*");
        t = up5Var;
        lw8 lw8Var15 = new lw8("None", fArr, ambVar, zuaVar2, 16);
        u = lw8Var15;
        lw8 lw8Var16 = new lw8("Hybrid Log Gamma encoding", fArr3, ambVar, null, new qo(), new ro(), 0.0f, 1.0f, zuaVar3, 17);
        v = lw8Var16;
        lw8 lw8Var17 = new lw8("Perceptual Quantizer encoding", fArr3, ambVar, null, new qi1(), new ri1(), 0.0f, 1.0f, zuaVar4, 18);
        w = lw8Var17;
        og7 og7Var = new og7(19, 12884901890L, "Oklab");
        x = og7Var;
        y = new ii1[]{lw8Var, lw8Var2, lw8Var3, lw8Var4, lw8Var5, lw8Var6, lw8Var7, lw8Var8, lw8Var9, lw8Var10, lw8Var11, lw8Var12, lw8Var13, lw8Var14, lrbVar, up5Var, lw8Var15, lw8Var16, lw8Var17, og7Var};
    }

    public static double a(zua zuaVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = zuaVar.b;
        double d6 = zuaVar.c;
        double d7 = zuaVar.d;
        double d8 = zuaVar.e;
        double d9 = zuaVar.f;
        double d10 = d5 * d4;
        return (zuaVar.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(zua zuaVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / zuaVar.b;
        double d5 = 1.0d / zuaVar.c;
        double d6 = 1.0d / zuaVar.d;
        double d7 = zuaVar.e;
        double d8 = zuaVar.f;
        double d9 = (d2 * d3) / (zuaVar.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(zua zuaVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = zuaVar.b;
        double d6 = zuaVar.d;
        double dPow = (Math.pow(d4, d6) * zuaVar.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * zuaVar.f) + zuaVar.e), zuaVar.g) * d3;
    }

    public static double d(zua zuaVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -zuaVar.b;
        double d6 = zuaVar.e;
        double d7 = 1.0d / zuaVar.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-zuaVar.f)) + zuaVar.c), 1.0d / zuaVar.d) * d3;
    }
}
