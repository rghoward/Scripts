package androidx.media3.exoplayer;

import defpackage.bq6;
import defpackage.fq3;
import defpackage.md6;
import defpackage.toa;
import defpackage.x38;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final x38 a;
        public final toa b;
        public final bq6.b c;
        public final long d;
        public final float e;
        public final boolean f;
        public final long g;

        public a(x38 x38Var, toa toaVar, bq6.b bVar, long j, long j2, float f, boolean z, long j3) {
            this.a = x38Var;
            this.b = toaVar;
            this.c = bVar;
            this.d = j2;
            this.e = f;
            this.f = z;
            this.g = j3;
        }
    }

    default boolean a(a aVar) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default boolean b() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean c(a aVar) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean d() {
        md6.g("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void e(x38 x38Var) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default void f(x38 x38Var) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default long g() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default void h(x38 x38Var) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    c.a i(x38 x38Var);

    default void j(a aVar, fq3[] fq3VarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }
}
