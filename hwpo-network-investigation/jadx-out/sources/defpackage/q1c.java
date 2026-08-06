package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q1c implements o3c {
    public final u1c a;

    static {
        f1c f1cVar = f1c.b;
        int i = h0c.a;
    }

    public q1c(u1c u1cVar) {
        this.a = u1cVar;
    }

    @Override // defpackage.o3c
    public final u1c a(InputStream inputStream, f1c f1cVar) throws k2c {
        s0c s0cVarH = s0c.h(inputStream, 4096);
        int i = u1c.zzd;
        u1c u1cVarM = this.a.m();
        try {
            t3c t3cVarA = q3c.c.a(u1cVarM.getClass());
            t0c t0cVar = s0cVarH.c;
            if (t0cVar == null) {
                t0cVar = new t0c(s0cVarH);
            }
            t3cVarA.i(u1cVarM, t0cVar, f1cVar);
            t3cVarA.f(u1cVarM);
            s0cVarH.m(0);
            if (u1c.u(u1cVarM, true)) {
                return u1cVarM;
            }
            throw new b4c().a();
        } catch (b4c e) {
            throw e.a();
        } catch (IOException e2) {
            if (e2.getCause() instanceof k2c) {
                throw ((k2c) e2.getCause());
            }
            throw new k2c(e2.getMessage(), e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof k2c) {
                throw ((k2c) e3.getCause());
            }
            throw e3;
        } catch (k2c e4) {
            if (e4.t) {
                throw new k2c(e4.getMessage(), e4);
            }
            throw e4;
        }
    }
}
