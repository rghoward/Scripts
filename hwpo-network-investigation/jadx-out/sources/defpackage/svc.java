package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class svc extends u1c implements h3c {
    private static final svc zzo;
    private static volatile o3c zzp;
    private int zzb;
    private boolean zzf;
    private i2c zzh;
    private i2c zzi;
    private d2c zzj;
    private wvc zzk;
    private boolean zzl;
    private boolean zzm;
    private ivc zzn;
    private p0c zze = p0c.u;
    private String zzg = BuildConfig.FLAVOR;

    static {
        svc svcVar = new svc();
        zzo = svcVar;
        u1c.s(svc.class, svcVar);
    }

    public svc() {
        r3c r3cVar = r3c.x;
        this.zzh = r3cVar;
        this.zzi = r3cVar;
        this.zzj = v1c.x;
    }

    public static svc x() {
        return zzo;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", xzb.b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new svc();
        }
        if (i2 == 4) {
            return new qvc(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzp;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (svc.class) {
            try {
                q1cVar = zzp;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzo);
                    zzp = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }
}
