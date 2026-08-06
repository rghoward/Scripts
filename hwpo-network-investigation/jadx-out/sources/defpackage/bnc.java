package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bnc extends u1c implements h3c {
    private static final bnc zzk;
    private static volatile o3c zzl;
    private int zzb;
    private int zze;
    private i2c zzf = r3c.x;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private boolean zzi;
    private double zzj;

    static {
        bnc bncVar = new bnc();
        zzk = bncVar;
        u1c.s(bnc.class, bncVar);
    }

    public final String A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 8) != 0;
    }

    public final boolean C() {
        return this.zzi;
    }

    public final boolean D() {
        return (this.zzb & 16) != 0;
    }

    public final double E() {
        return this.zzj;
    }

    public final int F() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", ymc.a, "zzf", bnc.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new bnc();
        }
        if (i2 == 4) {
            return new wmc(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzl;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (bnc.class) {
            try {
                q1cVar = zzl;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzk);
                    zzl = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }

    public final List x() {
        return this.zzf;
    }

    public final String y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 4) != 0;
    }
}
