package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rgc extends u1c implements h3c {
    private static final rgc zzj;
    private static volatile o3c zzk;
    private int zzb;
    private i2c zze;
    private i2c zzf;
    private i2c zzg;
    private boolean zzh;
    private i2c zzi;

    static {
        rgc rgcVar = new rgc();
        zzj = rgcVar;
        u1c.s(rgc.class, rgcVar);
    }

    public rgc() {
        r3c r3cVar = r3c.x;
        this.zze = r3cVar;
        this.zzf = r3cVar;
        this.zzg = r3cVar;
        this.zzi = r3cVar;
    }

    public static rgc D() {
        return zzj;
    }

    public final boolean A() {
        return (this.zzb & 1) != 0;
    }

    public final boolean B() {
        return this.zzh;
    }

    public final i2c C() {
        return this.zzi;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", rfc.class, "zzf", tfc.class, "zzg", mgc.class, "zzh", "zzi", rfc.class});
        }
        if (i2 == 3) {
            return new rgc();
        }
        if (i2 == 4) {
            return new pfc(zzj);
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
        synchronized (rgc.class) {
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

    public final List x() {
        return this.zze;
    }

    public final List y() {
        return this.zzf;
    }

    public final List z() {
        return this.zzg;
    }
}
