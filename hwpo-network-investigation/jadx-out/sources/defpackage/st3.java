package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class st3 extends sd4 {
    public final oh4<IOException, g2b> u;
    public boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public st3(yq9 yq9Var, oh4<? super IOException, g2b> oh4Var) {
        super(yq9Var);
        yq9Var.getClass();
        this.u = oh4Var;
    }

    @Override // defpackage.sd4, defpackage.yq9, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.v = true;
            this.u.invoke(e);
        }
    }

    @Override // defpackage.sd4, defpackage.yq9, java.io.Flushable
    public final void flush() {
        if (this.v) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.v = true;
            this.u.invoke(e);
        }
    }

    @Override // defpackage.sd4, defpackage.yq9
    public final void i0(tx0 tx0Var, long j) throws EOFException {
        tx0Var.getClass();
        if (this.v) {
            tx0Var.skip(j);
            return;
        }
        try {
            this.t.i0(tx0Var, j);
        } catch (IOException e) {
            this.v = true;
            this.u.invoke(e);
        }
    }
}
