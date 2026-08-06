package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface qq5 {
    long F(long j);

    qq5 G();

    long T(qq5 qq5Var, long j);

    default long U(qq5 qq5Var, long j) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    sk8 Z(qq5 qq5Var, boolean z);

    long a();

    long a0(long j);

    boolean e();

    default long f(long j) {
        return 9205357640488583168L;
    }

    default long j(long j) {
        return 9205357640488583168L;
    }

    long q(long j);

    qq5 v();

    default void y(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    default void z(qq5 qq5Var, float[] fArr) {
        uc5.e("transformFrom is not implemented on this LayoutCoordinates");
    }
}
