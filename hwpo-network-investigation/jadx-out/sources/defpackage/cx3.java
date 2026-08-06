package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cx3<Data> implements kx6<File, Data> {
    public final d<Data> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<Data> implements lx6<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // defpackage.lx6
        public final kx6<File, Data> d(i07 i07Var) {
            return new cx3(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends a<ParcelFileDescriptor> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e extends a<InputStream> {
    }

    public cx3(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // defpackage.kx6
    public final kx6.a a(File file, int i, int i2, xk7 xk7Var) {
        File file2 = file;
        return new kx6.a(new ke7(file2), new c(file2, this.a));
    }

    @Override // defpackage.kx6
    public final /* bridge */ /* synthetic */ boolean b(File file) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<Data> implements xe2<Data> {
        public final File t;
        public final d<Data> u;
        public Data v;

        public c(File file, d<Data> dVar) {
            this.t = file;
            this.u = dVar;
        }

        @Override // defpackage.xe2
        public final Class<Data> a() {
            return this.u.a();
        }

        @Override // defpackage.xe2
        public final void b() {
            Data data = this.v;
            if (data != null) {
                try {
                    this.u.b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r2v5, types: [Data, java.lang.Object] */
        @Override // defpackage.xe2
        public final void c(p98 p98Var, xe2.a<? super Data> aVar) {
            try {
                Data dataC = this.u.c(this.t);
                this.v = dataC;
                aVar.e(dataC);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
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
