package defpackage;

import com.intercom.twig.BuildConfig;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a0d extends u1c implements h3c {
    private static final a0d zzl;
    private static volatile o3c zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = BuildConfig.FLAVOR;
    private i2c zzg = r3c.x;

    static {
        a0d a0dVar = new a0d();
        zzl = a0dVar;
        u1c.s(a0d.class, a0dVar);
    }

    public static a0d z(InputStream inputStream, f1c f1cVar) throws k2c {
        a0d a0dVar = zzl;
        s0c s0cVarH = s0c.h(inputStream, 4096);
        u1c u1cVarM = a0dVar.m();
        try {
            t3c t3cVarA = q3c.c.a(u1cVarM.getClass());
            t0c t0cVar = s0cVarH.c;
            if (t0cVar == null) {
                t0cVar = new t0c(s0cVarH);
            }
            t3cVarA.i(u1cVarM, t0cVar, f1cVar);
            t3cVarA.f(u1cVarM);
            u1c.v(u1cVarM);
            return (a0d) u1cVarM;
        } catch (b4c e) {
            throw e.a();
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof k2c) {
                throw ((k2c) e2.getCause());
            }
            throw e2;
        } catch (k2c e3) {
            if (e3.t) {
                throw new k2c(e3.getMessage(), e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof k2c) {
                throw ((k2c) e4.getCause());
            }
            throw new k2c(e4.getMessage(), e4);
        }
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", xzb.b, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new a0d();
        }
        if (i2 == 4) {
            return new ihc(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzm;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (a0d.class) {
            try {
                q1cVar = zzm;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzl);
                    zzm = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }

    public final String x() {
        return this.zze;
    }

    public final boolean y() {
        return this.zzf;
    }
}
