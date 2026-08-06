package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tg2<Model, Data> implements kx6<Model, Data> {
    public final b.a a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<Model> implements lx6<Model, InputStream> {
        public final a a = new a();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a {
            public final ByteArrayInputStream a(String str) {
                if (!str.startsWith("data:image")) {
                    z90.a("Not a valid image data URL.");
                    return null;
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    z90.a("Missing comma in data URL.");
                    return null;
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                z90.a("Not a base64 image data URL.");
                return null;
            }
        }

        @Override // defpackage.lx6
        public final kx6<Model, InputStream> d(i07 i07Var) {
            return new tg2(this.a);
        }
    }

    public tg2(b.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.kx6
    public final kx6.a<Data> a(Model model, int i, int i2, xk7 xk7Var) {
        return new kx6.a<>(new ke7(model), new a(model.toString(), this.a));
    }

    @Override // defpackage.kx6
    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<Data> implements xe2<Data> {
        public final String t;
        public final b.a u;
        public ByteArrayInputStream v;

        public a(String str, b.a aVar) {
            this.t = str;
            this.u = aVar;
        }

        @Override // defpackage.xe2
        public final Class<Data> a() {
            return InputStream.class;
        }

        @Override // defpackage.xe2
        public final void b() {
            try {
                this.v.close();
            } catch (IOException unused) {
            }
        }

        @Override // defpackage.xe2
        public final void c(p98 p98Var, xe2.a<? super Data> aVar) {
            try {
                ByteArrayInputStream byteArrayInputStreamA = this.u.a(this.t);
                this.v = byteArrayInputStreamA;
                aVar.e(byteArrayInputStreamA);
            } catch (IllegalArgumentException e) {
                aVar.d(e);
            }
        }

        @Override // defpackage.xe2
        public final kf2 getDataSource() {
            return kf2.t;
        }

        @Override // defpackage.xe2
        public final void cancel() {
        }
    }
}
