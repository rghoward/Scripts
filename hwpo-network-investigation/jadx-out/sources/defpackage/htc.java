package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class htc extends u1c implements h3c {
    private static final htc zzl;
    private static volatile o3c zzm;
    private int zzb;
    private String zze = BuildConfig.FLAVOR;
    private p0c zzf = p0c.u;
    private String zzg = BuildConfig.FLAVOR;
    private i2c zzh;
    private i2c zzi;
    private boolean zzj;
    private long zzk;

    static {
        htc htcVar = new htc();
        zzl = htcVar;
        u1c.s(htc.class, htcVar);
    }

    public htc() {
        r3c r3cVar = r3c.x;
        this.zzh = r3cVar;
        this.zzi = r3cVar;
    }

    public static ftc D() {
        return (ftc) zzl.o();
    }

    public final String A() {
        return this.zzg;
    }

    public final i2c B() {
        return this.zzh;
    }

    public final long C() {
        return this.zzk;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void F(o0c o0cVar) {
        o0cVar.getClass();
        this.zzb |= 2;
        this.zzf = o0cVar;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void H(ktc ktcVar) {
        i2c i2cVar = this.zzh;
        if (!i2cVar.a()) {
            this.zzh = j3c.a(i2cVar);
        }
        this.zzh.add(ktcVar);
    }

    public final void I(String str) {
        str.getClass();
        i2c i2cVar = this.zzi;
        if (!i2cVar.a()) {
            this.zzi = j3c.a(i2cVar);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void J(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void K(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", ktc.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new htc();
        }
        if (i2 == 4) {
            return new ftc(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzm;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (htc.class) {
            try {
                q1cVar = zzm;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzl);
                    zzm = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }

    public final String x() {
        return this.zze;
    }

    public final boolean y() {
        return (this.zzb & 2) != 0;
    }

    public final p0c z() {
        return this.zzf;
    }
}
