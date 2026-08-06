package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ktc extends u1c implements h3c {
    private static final ktc zzh;
    private static volatile o3c zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = BuildConfig.FLAVOR;

    static {
        ktc ktcVar = new ktc();
        zzh = ktcVar;
        u1c.s(ktc.class, ktcVar);
    }

    public static itc D() {
        return (itc) zzh.o();
    }

    public static ktc E() {
        return zzh;
    }

    public final double A() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String B() {
        return this.zze == 4 ? (String) this.zzf : BuildConfig.FLAVOR;
    }

    public final p0c C() {
        return this.zze == 5 ? (p0c) this.zzf : p0c.u;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void H(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void I(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final /* synthetic */ void K(o0c o0cVar) {
        o0cVar.getClass();
        this.zze = 5;
        this.zzf = o0cVar;
    }

    public final int L() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new ktc();
        }
        if (i2 == 4) {
            return new itc(zzh);
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
        synchronized (ktc.class) {
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

    public final String x() {
        return this.zzg;
    }

    public final long y() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean z() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }
}
