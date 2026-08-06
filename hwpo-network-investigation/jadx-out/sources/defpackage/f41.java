package defpackage;

import java.io.EOFException;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class f41 implements jac {
    public static final /* synthetic */ int v = 0;
    public static final k7a t = new k7a("RESUME_TOKEN");
    public static final h0b u = h0b.z;
    public static final /* synthetic */ f41 w = new f41();

    public static final boolean c(tx0 tx0Var) {
        tx0Var.getClass();
        try {
            ni8 ni8Var = new ni8(new av7(tx0Var));
            for (long j = 0; j < 16 && !ni8Var.z(); j++) {
                ni8Var.n0(1L);
                tx0 tx0Var2 = ni8Var.u;
                byte bU = tx0Var2.u(0L);
                if ((bU & MessagePack.Code.NEGFIXINT_PREFIX) == 192) {
                    ni8Var.n0(2L);
                } else if ((bU & 240) == 224) {
                    ni8Var.n0(3L);
                } else if ((bU & 248) == 240) {
                    ni8Var.n0(4L);
                }
                int iP = tx0Var2.P();
                if (Character.isISOControl(iP) && !Character.isWhitespace(iP)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Boolean.valueOf(((m7c) l7c.u.t.t).b());
    }

    public void b(rl9 rl9Var, float f, float f2) {
        throw null;
    }
}
