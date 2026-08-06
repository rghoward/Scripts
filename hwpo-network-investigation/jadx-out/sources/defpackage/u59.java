package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u59 {
    public static final u59 A;
    public static final u59 B;
    public static final u59 C;
    public static final /* synthetic */ u59[] D;
    public static final u59 t;
    public static final u59 u;
    public static final u59 v;
    public static final u59 w;
    public static final u59 x;
    public static final u59 y;
    public static final u59 z;

    static {
        u59 u59Var = new u59("WEIGHT", 0);
        t = u59Var;
        u59 u59Var2 = new u59("TIME", 1);
        u = u59Var2;
        u59 u59Var3 = new u59("REPS", 2);
        v = u59Var3;
        u59 u59Var4 = new u59("DISTANCE", 3);
        w = u59Var4;
        u59 u59Var5 = new u59("CALORIES", 4);
        x = u59Var5;
        u59 u59Var6 = new u59("RPM", 5);
        y = u59Var6;
        u59 u59Var7 = new u59("SPM", 6);
        z = u59Var7;
        u59 u59Var8 = new u59("BPM", 7);
        A = u59Var8;
        u59 u59Var9 = new u59("WATTS", 8);
        B = u59Var9;
        u59 u59Var10 = new u59("ROUND_REPS", 9);
        C = u59Var10;
        D = new u59[]{u59Var, u59Var2, u59Var3, u59Var4, u59Var5, u59Var6, u59Var7, u59Var8, u59Var9, u59Var10};
    }

    public u59() {
        throw null;
    }

    public static u59 valueOf(String str) {
        return (u59) Enum.valueOf(u59.class, str);
    }

    public static u59[] values() {
        return (u59[]) D.clone();
    }

    public final boolean a() {
        switch (ordinal()) {
            case 0:
            case 3:
                return true;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                u.b();
                return false;
        }
    }
}
