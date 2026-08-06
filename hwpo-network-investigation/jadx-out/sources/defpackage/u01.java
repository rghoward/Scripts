package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class u01 implements kw9 {
    public boolean t;
    public final /* synthetic */ hy0 u;
    public final /* synthetic */ l01.b v;
    public final /* synthetic */ mi8 w;

    public u01(hy0 hy0Var, l01.b bVar, mi8 mi8Var) {
        this.u = hy0Var;
        this.v = bVar;
        this.w = mi8Var;
    }

    @Override // defpackage.kw9
    public final long O(tx0 tx0Var, long j) throws Throwable {
        tx0Var.getClass();
        try {
            long jO = this.u.O(tx0Var, j);
            mi8 mi8Var = this.w;
            if (jO != -1) {
                tx0Var.t(mi8Var.u, tx0Var.u - jO, jO);
                mi8Var.h();
                return jO;
            }
            if (!this.t) {
                this.t = true;
                mi8Var.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.t) {
                throw e;
            }
            this.t = true;
            this.v.a();
            throw e;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zH;
        if (!this.t) {
            TimeZone timeZone = ytb.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zH = ytb.h(this, 100);
            } catch (IOException unused) {
                zH = false;
            }
            if (!zH) {
                this.t = true;
                this.v.a();
            }
        }
        this.u.close();
    }

    @Override // defpackage.kw9
    public final voa timeout() {
        return this.u.timeout();
    }
}
