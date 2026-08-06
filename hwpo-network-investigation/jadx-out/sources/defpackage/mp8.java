package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mp8 extends qp8 {
    public final /* synthetic */ wq6 a;
    public final /* synthetic */ fy3 b;
    public final /* synthetic */ du7 c;

    public mp8(du7 du7Var, fy3 fy3Var, wq6 wq6Var) {
        this.a = wq6Var;
        this.b = fy3Var;
        this.c = du7Var;
    }

    @Override // defpackage.qp8
    public final long contentLength() {
        Long l = this.b.B(this.c).d;
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @Override // defpackage.qp8
    public final wq6 contentType() {
        return this.a;
    }

    @Override // defpackage.qp8
    public final void writeTo(fy0 fy0Var) throws IOException {
        fy0Var.getClass();
        kw9 kw9VarK = this.b.K(this.c);
        try {
            fy0Var.F(kw9VarK);
            kw9VarK.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fg1.a(kw9VarK, th);
                throw th2;
            }
        }
    }
}
