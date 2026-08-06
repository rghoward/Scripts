package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xn0 {
    public static final xn0 A;
    public static final xn0 B;
    public static final xn0 C;
    public static final xn0 D;
    public static final xn0 E;
    public static final xn0 F;
    public static final xn0 G;
    public static final xn0 H;
    public static final /* synthetic */ xn0[] I;
    public static final /* synthetic */ pl3 J;
    public static final xn0 t;
    public static final xn0 u;
    public static final xn0 v;
    public static final xn0 w;
    public static final xn0 x;
    public static final xn0 y;
    public static final xn0 z;

    static {
        xn0 xn0Var = new xn0("WEIGHT", 0);
        t = xn0Var;
        xn0 xn0Var2 = new xn0("TIME", 1);
        u = xn0Var2;
        xn0 xn0Var3 = new xn0("REPS", 2);
        v = xn0Var3;
        xn0 xn0Var4 = new xn0("ROUND_REPS", 3);
        w = xn0Var4;
        xn0 xn0Var5 = new xn0("DISTANCE", 4);
        x = xn0Var5;
        xn0 xn0Var6 = new xn0("CALORIES", 5);
        y = xn0Var6;
        xn0 xn0Var7 = new xn0("RPM", 6);
        z = xn0Var7;
        xn0 xn0Var8 = new xn0("SPM", 7);
        A = xn0Var8;
        xn0 xn0Var9 = new xn0("BPM", 8);
        B = xn0Var9;
        xn0 xn0Var10 = new xn0("WATTS", 9);
        C = xn0Var10;
        xn0 xn0Var11 = new xn0("BLOOD_PRESSURE", 10);
        D = xn0Var11;
        xn0 xn0Var12 = new xn0("BODY_MASS_INDEX", 11);
        E = xn0Var12;
        xn0 xn0Var13 = new xn0("SCALE", 12);
        F = xn0Var13;
        xn0 xn0Var14 = new xn0("PERCENT", 13);
        G = xn0Var14;
        xn0 xn0Var15 = new xn0("BEATS_MIN", 14);
        H = xn0Var15;
        xn0[] xn0VarArr = {xn0Var, xn0Var2, xn0Var3, xn0Var4, xn0Var5, xn0Var6, xn0Var7, xn0Var8, xn0Var9, xn0Var10, xn0Var11, xn0Var12, xn0Var13, xn0Var14, xn0Var15};
        I = xn0VarArr;
        J = new pl3(xn0VarArr);
    }

    public xn0() {
        throw null;
    }

    public static xn0 valueOf(String str) {
        return (xn0) Enum.valueOf(xn0.class, str);
    }

    public static xn0[] values() {
        return (xn0[]) I.clone();
    }

    public final boolean a() {
        switch (ordinal()) {
            case 0:
            case 4:
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 12:
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                return true;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return false;
            default:
                u.b();
                return false;
        }
    }
}
