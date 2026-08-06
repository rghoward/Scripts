package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mic extends u1c implements h3c {
    private static final mic zzp;
    private static volatile o3c zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private w2c zzm;
    private w2c zzn;
    private String zzo;

    static {
        mic micVar = new mic();
        zzp = micVar;
        u1c.s(mic.class, micVar);
    }

    public mic() {
        w2c w2cVar = w2c.u;
        this.zzm = w2cVar;
        this.zzn = w2cVar;
        this.zze = BuildConfig.FLAVOR;
        this.zzf = BuildConfig.FLAVOR;
        this.zzg = BuildConfig.FLAVOR;
        this.zzi = BuildConfig.FLAVOR;
        this.zzj = BuildConfig.FLAVOR;
        this.zzk = BuildConfig.FLAVOR;
        this.zzo = BuildConfig.FLAVOR;
    }

    public static aic c0() {
        return (aic) zzp.o();
    }

    public static mic d0() {
        return zzp;
    }

    public final /* synthetic */ void A() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void B(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void C() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void D(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    public final /* synthetic */ void E() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }

    public final w2c G() {
        w2c w2cVar = this.zzm;
        if (!w2cVar.t) {
            this.zzm = w2cVar.a();
        }
        return this.zzm;
    }

    public final w2c H() {
        w2c w2cVar = this.zzn;
        if (!w2cVar.t) {
            this.zzn = w2cVar.a();
        }
        return this.zzn;
    }

    public final /* synthetic */ void I(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void J() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean K() {
        return (this.zzb & 1) != 0;
    }

    public final String L() {
        return this.zze;
    }

    public final boolean M() {
        return (this.zzb & 2) != 0;
    }

    public final String N() {
        return this.zzf;
    }

    public final boolean O() {
        return (this.zzb & 4) != 0;
    }

    public final String P() {
        return this.zzg;
    }

    public final boolean Q() {
        return (this.zzb & 8) != 0;
    }

    public final long R() {
        return this.zzh;
    }

    public final boolean S() {
        return (this.zzb & 16) != 0;
    }

    public final String T() {
        return this.zzi;
    }

    public final boolean U() {
        return (this.zzb & 32) != 0;
    }

    public final String V() {
        return this.zzj;
    }

    public final boolean W() {
        return (this.zzb & 64) != 0;
    }

    public final String X() {
        return this.zzk;
    }

    public final boolean Y() {
        return (this.zzb & 128) != 0;
    }

    public final long Z() {
        return this.zzl;
    }

    public final boolean a0() {
        return (this.zzb & 256) != 0;
    }

    public final String b0() {
        return this.zzo;
    }

    public final /* synthetic */ void e0(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void f0() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void g0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void h0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void i0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", cic.a, "zzn", eic.a, "zzo"});
        }
        if (i2 == 3) {
            return new mic();
        }
        if (i2 == 4) {
            return new aic(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzq;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (mic.class) {
            try {
                q1cVar = zzq;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzp);
                    zzq = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }

    public final /* synthetic */ void x() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void y(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void z(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }
}
