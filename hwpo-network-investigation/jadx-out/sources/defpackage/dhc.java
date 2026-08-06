package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dhc extends u1c implements h3c {
    private static final dhc zzw;
    private static volatile o3c zzx;
    private int zzb;
    private long zze;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;
    private i2c zzh;
    private i2c zzi;
    private i2c zzj;
    private String zzk;
    private boolean zzl;
    private i2c zzm;
    private i2c zzn;
    private String zzo;
    private String zzp;
    private rgc zzq;
    private khc zzr;
    private whc zzs;
    private ohc zzt;
    private ghc zzu;
    private d2c zzv;

    static {
        dhc dhcVar = new dhc();
        zzw = dhcVar;
        u1c.s(dhc.class, dhcVar);
    }

    public dhc() {
        r3c r3cVar = r3c.x;
        this.zzh = r3cVar;
        this.zzi = r3cVar;
        this.zzj = r3cVar;
        this.zzk = BuildConfig.FLAVOR;
        this.zzm = r3cVar;
        this.zzn = r3cVar;
        this.zzo = BuildConfig.FLAVOR;
        this.zzp = BuildConfig.FLAVOR;
        this.zzv = v1c.x;
    }

    public static bhc O() {
        return (bhc) zzw.o();
    }

    public static dhc P() {
        return zzw;
    }

    public final String A() {
        return this.zzf;
    }

    public final i2c B() {
        return this.zzh;
    }

    public final int C() {
        return this.zzi.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zgc D(int i) {
        return (zgc) this.zzi.get(i);
    }

    public final List E() {
        return this.zzj;
    }

    public final i2c F() {
        return this.zzm;
    }

    public final int G() {
        return this.zzm.size();
    }

    public final i2c H() {
        return this.zzn;
    }

    public final String I() {
        return this.zzo;
    }

    public final boolean J() {
        return (this.zzb & 128) != 0;
    }

    public final rgc K() {
        rgc rgcVar = this.zzq;
        return rgcVar == null ? rgc.D() : rgcVar;
    }

    public final boolean L() {
        return (this.zzb & 512) != 0;
    }

    public final whc M() {
        whc whcVar = this.zzs;
        return whcVar == null ? whc.z() : whcVar;
    }

    public final d2c N() {
        return this.zzv;
    }

    public final void Q(int i, zgc zgcVar) {
        i2c i2cVar = this.zzi;
        if (!i2cVar.a()) {
            this.zzi = j3c.a(i2cVar);
        }
        this.zzi.set(i, zgcVar);
    }

    public final void R() {
        this.zzj = r3c.x;
    }

    public final void S() {
        this.zzm = r3c.x;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", shc.class, "zzi", zgc.class, "zzj", bfc.class, "zzk", "zzl", "zzm", umc.class, "zzn", vgc.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new dhc();
        }
        if (i2 == 4) {
            return new bhc(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzx;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (dhc.class) {
            try {
                q1cVar = zzx;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzw);
                    zzx = q1cVar;
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

    public final long y() {
        return this.zze;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
