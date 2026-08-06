package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bmc extends u1c implements h3c {
    private static final bmc zzk;
    private static volatile o3c zzl;
    private int zzb;
    private long zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        bmc bmcVar = new bmc();
        zzk = bmcVar;
        u1c.s(bmc.class, bmcVar);
    }

    public static zlc I() {
        return (zlc) zzk.o();
    }

    public final boolean A() {
        return (this.zzb & 4) != 0;
    }

    public final String B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zzb & 8) != 0;
    }

    public final long D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zzb & 16) != 0;
    }

    public final float F() {
        return this.zzi;
    }

    public final boolean G() {
        return (this.zzb & 32) != 0;
    }

    public final double H() {
        return this.zzj;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void N(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void O() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void P(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    public final /* synthetic */ void Q() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new bmc();
        }
        if (i2 == 4) {
            return new zlc(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzl;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (bmc.class) {
            try {
                q1cVar = zzl;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzk);
                    zzl = q1cVar;
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

    public final String z() {
        return this.zzf;
    }
}
