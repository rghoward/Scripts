package androidx.media3.exoplayer;

import defpackage.bq6;
import defpackage.id4;
import defpackage.mn8;
import defpackage.toa;
import defpackage.vf1;
import defpackage.x38;
import defpackage.xz8;
import defpackage.zm6;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface k extends j.b {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a();

        void b();
    }

    void A();

    long B();

    boolean C();

    default boolean D(long j) {
        return false;
    }

    zm6 E();

    int F();

    boolean b();

    boolean d();

    String getName();

    int getState();

    void h(long j, long j2);

    void i();

    void j(toa toaVar);

    boolean k();

    default long l(long j, long j2) {
        if (getState() == 1) {
            return (b() || d()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    void n(id4[] id4VarArr, xz8 xz8Var, long j, long j2, bq6.b bVar);

    void p();

    void q(long j, boolean z);

    void reset();

    void s(mn8 mn8Var, id4[] id4VarArr, xz8 xz8Var, boolean z, boolean z2, long j, long j2, bq6.b bVar);

    void start();

    void stop();

    void t(int i, x38 x38Var, vf1 vf1Var);

    androidx.media3.exoplayer.a u();

    xz8 z();

    default void a() {
    }

    default void o() {
    }

    default void v(float f, float f2) {
    }
}
