package defpackage;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class op8 extends qp8 {
    public final /* synthetic */ wq6 a;
    public final /* synthetic */ FileDescriptor b;

    public op8(FileDescriptor fileDescriptor, wq6 wq6Var) {
        this.a = wq6Var;
        this.b = fileDescriptor;
    }

    @Override // defpackage.qp8
    public final wq6 contentType() {
        return this.a;
    }

    @Override // defpackage.qp8
    public final boolean isOneShot() {
        return true;
    }

    @Override // defpackage.qp8
    public final void writeTo(fy0 fy0Var) throws IOException {
        fy0Var.getClass();
        FileInputStream fileInputStream = new FileInputStream(this.b);
        try {
            fy0Var.j().F(ev6.c(fileInputStream));
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(fileInputStream, th);
                throw th2;
            }
        }
    }
}
