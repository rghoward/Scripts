package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sz1 extends qp8 {
    public final ContentResolver a;
    public final Uri b;

    public sz1(ContentResolver contentResolver, Uri uri) {
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // defpackage.qp8
    public final long contentLength() {
        return wy3.d(this.a, this.b);
    }

    @Override // defpackage.qp8
    public final wq6 contentType() {
        String type = this.a.getType(this.b);
        if (type != null) {
            ol8 ol8Var = wq6.e;
            try {
                return wq6.a.a(type);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.qp8
    public final void writeTo(fy0 fy0Var) throws IOException {
        fy0Var.getClass();
        InputStream inputStreamOpenInputStream = this.a.openInputStream(this.b);
        if (inputStreamOpenInputStream == null) {
            o03.a("Couldn't open content URI for reading");
            return;
        }
        vd5 vd5VarC = ev6.c(inputStreamOpenInputStream);
        try {
            fy0Var.F(vd5VarC);
            vd5VarC.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(vd5VarC, th);
                throw th2;
            }
        }
    }
}
