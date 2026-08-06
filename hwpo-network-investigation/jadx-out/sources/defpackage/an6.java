package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface an6 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final en6 a;
        public final MediaFormat b;
        public final id4 c;
        public final Surface d;
        public final MediaCrypto e;
        public final jf6 f;

        public a(en6 en6Var, MediaFormat mediaFormat, id4 id4Var, Surface surface, MediaCrypto mediaCrypto, jf6 jf6Var) {
            this.a = en6Var;
            this.b = mediaFormat;
            this.c = id4Var;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = jf6Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        an6 a(a aVar);
    }

    void a();

    void b(Bundle bundle);

    void c(int i, cc2 cc2Var, long j, int i2);

    void d(int i, int i2, int i3, long j);

    void e(int i);

    default boolean f(in6.c cVar) {
        return false;
    }

    void flush();

    default void g(hn6 hn6Var) {
        hn6Var.run();
    }

    MediaFormat h();

    void i();

    void j(int i, long j);

    int k();

    int l(MediaCodec.BufferInfo bufferInfo);

    void m(int i);

    ByteBuffer n(int i);

    void o(Surface surface);

    ByteBuffer p(int i);

    void q(ArrayList arrayList);

    void r(pn6.e eVar, Handler handler);

    void s(ArrayList arrayList);
}
