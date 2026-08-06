package defpackage;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface l80 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        void a(long j);

        void b();

        void c();

        void d();

        void e();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends Exception {
        public final int t;
        public final boolean u;

        public b(int i, boolean z) {
            super(pp2.a(i, "AudioOutput write failed: "));
            this.u = z;
            this.t = i;
        }
    }

    void a();

    void b();

    void c(k28 k28Var);

    k28 e();

    long g();

    void h();

    boolean i();

    void j(int i, int i2);

    boolean k();

    int l();

    void m(float f);

    long o();

    boolean p(int i, long j, ByteBuffer byteBuffer);

    int q();

    void r();

    void setPreferredDevice(AudioDeviceInfo audioDeviceInfo);

    void stop();

    default void n(x38 x38Var) {
    }
}
