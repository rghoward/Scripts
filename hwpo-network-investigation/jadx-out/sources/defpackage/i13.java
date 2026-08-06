package defpackage;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface i13 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public du7 a;
        public final tn5 b = fy3.t;
        public final double c = 0.02d;
        public final long d = 10485760;
        public final long e = 262144000;
        public final wr2 f;

        public a() {
            et2 et2Var = i23.a;
            this.f = wr2.v;
        }

        public final si8 a() {
            long jH;
            du7 du7Var = this.a;
            if (du7Var == null) {
                aa0.c("directory == null");
                return null;
            }
            double d = this.c;
            if (d > 0.0d) {
                try {
                    File file = du7Var.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jH = uh8.h((long) (d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.d, this.e);
                } catch (Exception unused) {
                    jH = this.d;
                }
            } else {
                jH = 0;
            }
            return new si8(jH, this.f, this.b, du7Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b extends Closeable {
        du7 G();

        si8.a Q();

        du7 getData();
    }

    si8.a a(String str);

    si8.b b(String str);

    fy3 getFileSystem();
}
