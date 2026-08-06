package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zec extends u1c implements h3c {
    private static final zec zzi;
    private static volatile o3c zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        zec zecVar = new zec();
        zzi = zecVar;
        u1c.s(zec.class, zecVar);
    }

    public static yec x() {
        return (yec) zzi.o();
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void B(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zec();
        }
        if (i2 == 4) {
            return new yec(zzi);
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
        synchronized (zec.class) {
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

    public final /* synthetic */ void y(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void z() {
        this.zzb |= 2;
        this.zzf = true;
    }
}
