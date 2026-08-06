package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oz0<Data> implements kx6<byte[], Data> {
    public final b<Data> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements lx6<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: oz0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0217a implements b<ByteBuffer> {
            @Override // oz0.b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // oz0.b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // defpackage.lx6
        public final kx6<byte[], ByteBuffer> d(i07 i07Var) {
            return new oz0(new C0217a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d implements lx6<byte[], InputStream> {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements b<InputStream> {
            @Override // oz0.b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // oz0.b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // defpackage.lx6
        public final kx6<byte[], InputStream> d(i07 i07Var) {
            return new oz0(new a());
        }
    }

    public oz0(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // defpackage.kx6
    public final kx6.a a(byte[] bArr, int i, int i2, xk7 xk7Var) {
        byte[] bArr2 = bArr;
        return new kx6.a(new ke7(bArr2), new c(bArr2, this.a));
    }

    @Override // defpackage.kx6
    public final /* bridge */ /* synthetic */ boolean b(byte[] bArr) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c<Data> implements xe2<Data> {
        public final byte[] t;
        public final b<Data> u;

        public c(byte[] bArr, b<Data> bVar) {
            this.t = bArr;
            this.u = bVar;
        }

        @Override // defpackage.xe2
        public final Class<Data> a() {
            return this.u.a();
        }

        @Override // defpackage.xe2
        public final void c(p98 p98Var, xe2.a<? super Data> aVar) {
            aVar.e(this.u.b(this.t));
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
