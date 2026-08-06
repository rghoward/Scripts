package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tt3 extends sd4 {
    public final yt0 u;
    public boolean v;

    public tt3(yq9 yq9Var, yt0 yt0Var) {
        super(yq9Var);
        this.u = yt0Var;
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
        try {
            super.flush();
        } catch (IOException e) {
            this.v = true;
            this.u.invoke(e);
        }
    }

    @Override // defpackage.sd4, defpackage.yq9
    public final void i0(tx0 tx0Var, long j) throws EOFException {
        if (this.v) {
            tx0Var.skip(j);
            return;
        }
        try {
            super.i0(tx0Var, j);
        } catch (IOException e) {
            this.v = true;
            this.u.invoke(e);
        }
    }
}
