package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class umc extends u1c implements h3c {
    private static final umc zzg;
    private static volatile o3c zzh;
    private int zzb;
    private i2c zze = r3c.x;
    private fmc zzf;

    static {
        umc umcVar = new umc();
        zzg = umcVar;
        u1c.s(umc.class, umcVar);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", bnc.class, "zzf"});
        }
        if (i2 == 3) {
            return new umc();
        }
        if (i2 == 4) {
            return new kmc(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzh;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (umc.class) {
            try {
                q1cVar = zzh;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzg);
                    zzh = q1cVar;
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

    public final fmc y() {
        fmc fmcVar = this.zzf;
        return fmcVar == null ? fmc.z() : fmcVar;
    }
}
