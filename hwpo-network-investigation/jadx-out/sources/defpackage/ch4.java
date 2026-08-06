package defpackage;

import java.io.EOFException;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ch4 extends td4 {
    public static final g01 v;
    public final tx0 u;

    static {
        g01 g01Var = g01.w;
        v = g01.a.b("0021F904");
    }

    public ch4(hy0 hy0Var) {
        super(hy0Var);
        this.u = new tx0();
    }

    @Override // defpackage.td4, defpackage.kw9
    public final long O(tx0 tx0Var, long j) throws EOFException {
        long j2;
        long j3;
        h(j);
        tx0 tx0Var2 = this.u;
        long j4 = 0;
        if (tx0Var2.u == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long jV = -1;
            while (true) {
                g01 g01Var = v;
                jV = this.u.v(g01Var.t[0], jV + 1, Long.MAX_VALUE);
                if (jV == -1) {
                    j2 = j4;
                    break;
                }
                j2 = j4;
                if (h(g01Var.t.length) && tx0Var2.B(g01Var.g(), jV, g01Var)) {
                    break;
                }
                j4 = j2;
            }
            if (jV == -1) {
                break;
            }
            long jO = tx0Var2.O(tx0Var, jV + 4);
            if (jO < j2) {
                jO = j2;
            }
            j5 += jO;
            if (h(5L) && tx0Var2.u(4L) == 0 && (((tx0Var2.u(2L) & MessagePack.Code.EXT_TIMESTAMP) << 8) | (tx0Var2.u(1L) & MessagePack.Code.EXT_TIMESTAMP)) < 2) {
                tx0Var.Z(tx0Var2.u(j2));
                tx0Var.Z(10);
                tx0Var.Z(0);
                tx0Var2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long jO2 = tx0Var2.O(tx0Var, j - j5);
            j3 = 0;
            if (jO2 < 0) {
                jO2 = 0;
            }
            j5 += jO2;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }

    public final boolean h(long j) {
        tx0 tx0Var = this.u;
        long j2 = tx0Var.u;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return super.O(tx0Var, j3) == j3;
    }
}
