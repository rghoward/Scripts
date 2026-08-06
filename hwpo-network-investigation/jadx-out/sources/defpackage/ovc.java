package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ovc extends u1c implements h3c {
    private static final e2c zzl = new kvc();
    private static final ovc zzq;
    private static volatile o3c zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private i2c zzi;
    private i2c zzj;
    private d2c zzk;
    private wvc zzm;
    private boolean zzn;
    private boolean zzo;
    private ivc zzp;
    private p0c zze = p0c.u;
    private String zzg = BuildConfig.FLAVOR;

    static {
        ovc ovcVar = new ovc();
        zzq = ovcVar;
        u1c.s(ovc.class, ovcVar);
    }

    public ovc() {
        r3c r3cVar = r3c.x;
        this.zzi = r3cVar;
        this.zzj = r3cVar;
        this.zzk = v1c.x;
    }

    public static mvc K() {
        return (mvc) zzq.o();
    }

    public static ovc L() {
        return zzq;
    }

    public final String A() {
        return this.zzg;
    }

    public final long B() {
        return this.zzh;
    }

    public final i2c C() {
        return this.zzi;
    }

    public final i2c D() {
        return this.zzj;
    }

    public final List E() {
        return new f2c(this.zzk, zzl);
    }

    public final boolean F() {
        return (this.zzb & 16) != 0;
    }

    public final wvc G() {
        wvc wvcVar = this.zzm;
        return wvcVar == null ? wvc.z() : wvcVar;
    }

    public final boolean H() {
        return this.zzn;
    }

    public final boolean I() {
        return this.zzo;
    }

    public final ivc J() {
        ivc ivcVar = this.zzp;
        return ivcVar == null ? ivc.y() : ivcVar;
    }

    public final /* synthetic */ void M(long j) {
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
            return new s3c(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", xzb.b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new ovc();
        }
        if (i2 == 4) {
            return new mvc(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzr;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (ovc.class) {
            try {
                q1cVar = zzr;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzq);
                    zzr = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }

    public final boolean x() {
        return (this.zzb & 1) != 0;
    }

    public final p0c y() {
        return this.zze;
    }

    public final boolean z() {
        return this.zzf;
    }
}
