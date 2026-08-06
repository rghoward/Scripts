package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vz0 implements kx6<File, ByteBuffer> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements lx6<File, ByteBuffer> {
        @Override // defpackage.lx6
        public final kx6<File, ByteBuffer> d(i07 i07Var) {
            return new vz0();
        }
    }

    @Override // defpackage.kx6
    public final kx6.a<ByteBuffer> a(File file, int i, int i2, xk7 xk7Var) {
        File file2 = file;
        return new kx6.a<>(new ke7(file2), new a(file2));
    }

    @Override // defpackage.kx6
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements xe2<ByteBuffer> {
        public final File t;

        public a(File file) {
            this.t = file;
        }

        @Override // defpackage.xe2
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // defpackage.xe2
        public final void c(p98 p98Var, xe2.a<? super ByteBuffer> aVar) {
            try {
                aVar.e(yz0.a(this.t));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.d(e);
            }
        }

        @Override // defpackage.xe2
        public final kf2 getDataSource() {
            return kf2.t;
        }

        @Override // defpackage.xe2
        public final void b() {
        }

        @Override // defpackage.xe2
        public final void cancel() {
        }
    }
}
