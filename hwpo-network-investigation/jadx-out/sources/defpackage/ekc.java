package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ekc extends u1c implements h3c {
    private static final ekc zzh;
    private static volatile o3c zzi;
    private int zzb;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private qic zzg;

    static {
        ekc ekcVar = new ekc();
        zzh = ekcVar;
        u1c.s(ekc.class, ekcVar);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ekc();
        }
        if (i2 == 4) {
            return new ckc(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzi;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (ekc.class) {
            try {
                q1cVar = zzi;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzh);
                    zzi = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }
}
