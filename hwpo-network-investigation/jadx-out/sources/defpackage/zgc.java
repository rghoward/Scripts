package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zgc extends u1c implements h3c {
    private static final zgc zzi;
    private static volatile o3c zzj;
    private int zzb;
    private String zze = BuildConfig.FLAVOR;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zgc zgcVar = new zgc();
        zzi = zgcVar;
        u1c.s(zgc.class, zgcVar);
    }

    public final boolean A() {
        return (this.zzb & 4) != 0;
    }

    public final boolean B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zzb & 8) != 0;
    }

    public final int D() {
        return this.zzh;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zgc();
        }
        if (i2 == 4) {
            return new xgc(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzj;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (zgc.class) {
            try {
                q1cVar = zzj;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzi);
                    zzj = q1cVar;
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
        return (this.zzb & 2) != 0;
    }

    public final boolean z() {
        return this.zzf;
    }
}
