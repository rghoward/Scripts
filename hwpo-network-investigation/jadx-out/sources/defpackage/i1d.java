package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i1d extends u1c implements h3c {
    private static final i1d zzj;
    private static volatile o3c zzk;
    private int zzb;
    private long zzh;
    private String zze = BuildConfig.FLAVOR;
    private p0c zzf = p0c.u;
    private String zzg = BuildConfig.FLAVOR;
    private i2c zzi = r3c.x;

    static {
        i1d i1dVar = new i1d();
        zzj = i1dVar;
        u1c.s(i1d.class, i1dVar);
    }

    public static h1d D() {
        return (h1d) zzj.o();
    }

    public static i1d E() {
        return zzj;
    }

    public final long A() {
        return this.zzh;
    }

    public final i2c B() {
        return this.zzi;
    }

    public final int C() {
        return this.zzi.size();
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(p0c p0cVar) {
        p0cVar.getClass();
        this.zzb |= 2;
        this.zzf = p0cVar;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void J(k1d k1dVar) {
        i2c i2cVar = this.zzi;
        if (!i2cVar.a()) {
            this.zzi = j3c.a(i2cVar);
        }
        this.zzi.add(k1dVar);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", k1d.class});
        }
        if (i2 == 3) {
            return new i1d();
        }
        if (i2 == 4) {
            return new h1d(zzj);
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
        synchronized (i1d.class) {
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

    public final String x() {
        return this.zze;
    }

    public final p0c y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
