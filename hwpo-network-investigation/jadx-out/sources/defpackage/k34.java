package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k34 extends td4 {
    public final long u;
    public final boolean v;
    public long w;

    public k34(kw9 kw9Var, long j, boolean z) {
        super(kw9Var);
        this.u = j;
        this.v = z;
    }

    @Override // defpackage.td4, defpackage.kw9
    public final long O(tx0 tx0Var, long j) throws IOException {
        tx0Var.getClass();
        long j2 = this.w;
        long j3 = this.u;
        if (j2 > j3) {
            j = 0;
        } else if (this.v) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jO = this.t.O(tx0Var, j);
        if (jO != -1) {
            this.w += jO;
        }
        long j5 = this.w;
        if ((j5 >= j3 || jO != -1) && j5 <= j3) {
            return jO;
        }
        if (jO > 0 && j5 > j3) {
            long j6 = tx0Var.u - (j5 - j3);
            tx0 tx0Var2 = new tx0();
            tx0Var2.F(tx0Var);
            tx0Var.i0(tx0Var2, j6);
            tx0Var2.h();
        }
        StringBuilder sbB = ao3.b("expected ", j3, " bytes but got ");
        sbB.append(this.w);
        throw new IOException(sbB.toString());
    }
}
