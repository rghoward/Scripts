package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jfc extends u1c implements h3c {
    private static final jfc zzj;
    private static volatile o3c zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        jfc jfcVar = new jfc();
        zzj = jfcVar;
        u1c.s(jfc.class, jfcVar);
    }

    public static jfc G() {
        return zzj;
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

    public final String D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zzb & 16) != 0;
    }

    public final String F() {
        return this.zzi;
    }

    public final int H() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", ifc.a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new jfc();
        }
        if (i2 == 4) {
            return new hfc(zzj);
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
        synchronized (jfc.class) {
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

    public final boolean x() {
        return (this.zzb & 1) != 0;
    }

    public final boolean y() {
        return (this.zzb & 2) != 0;
    }

    public final boolean z() {
        return this.zzf;
    }
}
