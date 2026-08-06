package defpackage;

import com.intercom.twig.BuildConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ztc extends u1c implements h3c {
    private static final ztc zzj;
    private static volatile o3c zzk;
    private int zzb;
    private long zzh;
    private w2c zzi = w2c.u;
    private String zze = BuildConfig.FLAVOR;
    private p0c zzf = p0c.u;
    private String zzg = BuildConfig.FLAVOR;

    static {
        ztc ztcVar = new ztc();
        zzj = ztcVar;
        u1c.s(ztc.class, ztcVar);
    }

    public static ztc D(s0c s0cVar, f1c f1cVar) throws k2c {
        u1c u1cVarM = zzj.m();
        try {
            t3c t3cVarA = q3c.c.a(u1cVarM.getClass());
            t0c t0cVar = s0cVar.c;
            if (t0cVar == null) {
                t0cVar = new t0c(s0cVar);
            }
            t3cVarA.i(u1cVarM, t0cVar, f1cVar);
            t3cVarA.f(u1cVarM);
            u1c.v(u1cVarM);
            return (ztc) u1cVarM;
        } catch (b4c e) {
            throw e.a();
        } catch (k2c e2) {
            if (e2.t) {
                throw new k2c(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof k2c) {
                throw ((k2c) e3.getCause());
            }
            throw new k2c(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof k2c) {
                throw ((k2c) e4.getCause());
            }
            throw e4;
        }
    }

    public static ztc E() {
        return zzj;
    }

    public final long A() {
        return this.zzh;
    }

    public final int B() {
        return this.zzi.size();
    }

    public final Map C() {
        return Collections.unmodifiableMap(this.zzi);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", xtc.a});
        }
        if (i2 == 3) {
            return new ztc();
        }
        if (i2 == 4) {
            return new vtc(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzk;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (ztc.class) {
            try {
                q1cVar = zzk;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzj);
                    zzk = q1cVar;
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

    public final p0c y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
