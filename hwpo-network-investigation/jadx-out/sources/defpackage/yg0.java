package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface yg0 extends tx2 {
    r48 I();

    default Object K(long j, ci4 ci4Var, u02 u02Var) {
        return ci4Var.invoke(this, u02Var);
    }

    default long Z0() {
        return 0L;
    }

    long a();

    lgb getViewConfiguration();

    Object h1(s48 s48Var, ak0 ak0Var);

    default Object w1(long j, ci4 ci4Var, ak0 ak0Var) {
        return ci4Var.invoke(this, ak0Var);
    }
}
