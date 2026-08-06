package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class qk1 {
    public static final /* synthetic */ int a = 0;

    public static final gg5 a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new gg5(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static final g99 b(Object obj) {
        if (obj != zu1.t) {
            return (g99) obj;
        }
        aa0.c("Does not contain segment");
        return null;
    }

    public static final boolean c(Object obj) {
        return obj == zu1.t;
    }

    public static final gg5 d(sk8 sk8Var) {
        return new gg5(Math.round(sk8Var.a), Math.round(sk8Var.b), Math.round(sk8Var.c), Math.round(sk8Var.d));
    }

    public static final rk1 e(pk1 pk1Var) {
        pk1Var.getClass();
        if (pk1Var instanceof pk1.a) {
            return rk1.LEADERBOARD_COMMENT;
        }
        if (pk1Var instanceof pk1.b) {
            return rk1.LEADERBOARD_VALUE_COMMENT;
        }
        u.b();
        return null;
    }
}
