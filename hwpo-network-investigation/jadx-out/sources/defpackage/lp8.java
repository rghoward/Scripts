package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class lp8 extends qp8 {
    public final /* synthetic */ wq6 a;
    public final /* synthetic */ File b;

    public lp8(wq6 wq6Var, File file) {
        this.a = wq6Var;
        this.b = file;
    }

    @Override // defpackage.qp8
    public final long contentLength() {
        return this.b.length();
    }

    @Override // defpackage.qp8
    public final wq6 contentType() {
        return this.a;
    }

    @Override // defpackage.qp8
    public final void writeTo(fy0 fy0Var) throws IOException {
        fy0Var.getClass();
        File file = this.b;
        file.getClass();
        vd5 vd5Var = new vd5(new FileInputStream(file), voa.d);
        try {
            fy0Var.F(vd5Var);
            vd5Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(vd5Var, th);
                throw th2;
            }
        }
    }
}
