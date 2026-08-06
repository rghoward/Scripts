package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class whc extends u1c implements h3c {
    private static final whc zzj;
    private static volatile o3c zzk;
    private int zzb;
    private int zzh;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        whc whcVar = new whc();
        zzj = whcVar;
        u1c.s(whc.class, whcVar);
    }

    public static whc z() {
        return zzj;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new whc();
        }
        if (i2 == 4) {
            return new uhc(zzj);
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
        synchronized (whc.class) {
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

    public final int x() {
        return this.zzh;
    }

    public final String y() {
        return this.zzi;
    }
}
