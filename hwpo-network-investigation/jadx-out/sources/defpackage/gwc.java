package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gwc extends u1c implements h3c {
    private static final gwc zzg;
    private static volatile o3c zzh;
    private int zzb;
    private i2c zze = r3c.x;
    private String zzf = BuildConfig.FLAVOR;

    static {
        gwc gwcVar = new gwc();
        zzg = gwcVar;
        u1c.s(gwc.class, gwcVar);
    }

    public static gwc y() {
        return zzg;
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 1;
        this.zzf = BuildConfig.FLAVOR;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new gwc();
        }
        if (i2 == 4) {
            return new ewc(zzg);
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
        synchronized (gwc.class) {
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

    public final void z(String str) {
        i2c i2cVar = this.zze;
        if (!i2cVar.a()) {
            this.zze = j3c.a(i2cVar);
        }
        this.zze.add(BuildConfig.FLAVOR);
    }
}
