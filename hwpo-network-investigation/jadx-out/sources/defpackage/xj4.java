package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xj4 extends g5b<g2b, a> {
    public final yw3 a;
    public final xy3 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final File a;
        public final Uri b;

        public a(File file, Uri uri) {
            this.a = file;
            this.b = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OutputParams(file=" + this.a + ", uri=" + this.b + ")";
        }
    }

    public xj4(yw3 yw3Var, xy3 xy3Var) {
        xy3Var.getClass();
        this.a = yw3Var;
        this.b = xy3Var;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) throws IOException {
        File fileA = this.a.a();
        xy3 xy3Var = this.b;
        xy3Var.getClass();
        Uri uriC = wy3.c(fileA, xy3Var.a);
        if (uriC != null) {
            return new a(fileA, uriC);
        }
        z90.a("Required value was null.");
        return null;
    }
}
