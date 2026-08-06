package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class tw1 implements vg5 {
    public static final tw1 a = new tw1();

    @Override // defpackage.vg5
    public final qu8 intercept(vg5.a aVar) throws IOException {
        in3 t35Var;
        aj8 aj8Var = (aj8) aVar;
        oi8 oi8Var = aj8Var.a;
        synchronized (oi8Var) {
            if (!oi8Var.J) {
                throw new IllegalStateException("released");
            }
            if (oi8Var.G || oi8Var.F || oi8Var.I || oi8Var.H) {
                throw new IllegalStateException("Check failed.");
            }
            g2b g2bVar = g2b.a;
        }
        jn3 jn3Var = oi8Var.B;
        jn3Var.getClass();
        pi8 pi8VarA = jn3Var.a();
        lg7 lg7Var = oi8Var.t;
        pi8VarA.getClass();
        lg7Var.getClass();
        int i = aj8Var.g;
        gy0 gy0Var = pi8VarA.h;
        c45 c45Var = pi8VarA.j;
        if (c45Var != null) {
            t35Var = new g45(lg7Var, pi8VarA, aj8Var, c45Var);
        } else {
            pi8VarA.e.setSoTimeout(i);
            voa voaVarTimeout = gy0Var.d().timeout();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            voaVarTimeout.g(j, timeUnit);
            gy0Var.c().timeout().g(aj8Var.h, timeUnit);
            t35Var = new t35(lg7Var, pi8VarA, gy0Var);
        }
        gn3 gn3Var = new gn3(oi8Var, oi8Var.x, jn3Var, t35Var);
        oi8Var.E = gn3Var;
        oi8Var.L = gn3Var;
        synchronized (oi8Var) {
            oi8Var.F = true;
            oi8Var.G = true;
        }
        if (!oi8Var.K) {
            return aj8.b(aj8Var, 0, gn3Var, null, 61).a(aj8Var.e);
        }
        o03.a("Canceled");
        return null;
    }
}
