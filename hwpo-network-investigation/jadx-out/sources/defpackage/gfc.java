package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gfc extends u1c implements h3c {
    private static final gfc zzi;
    private static volatile o3c zzj;
    private int zzb;
    private ofc zze;
    private jfc zzf;
    private boolean zzg;
    private String zzh = BuildConfig.FLAVOR;

    static {
        gfc gfcVar = new gfc();
        zzi = gfcVar;
        u1c.s(gfc.class, gfcVar);
    }

    public static gfc F() {
        return zzi;
    }

    public final jfc A() {
        jfc jfcVar = this.zzf;
        return jfcVar == null ? jfc.G() : jfcVar;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final boolean C() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zzb & 8) != 0;
    }

    public final String E() {
        return this.zzh;
    }

    public final /* synthetic */ void G(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new gfc();
        }
        if (i2 == 4) {
            return new ffc(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzj;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (gfc.class) {
            try {
                q1cVar = zzj;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzi);
                    zzj = q1cVar;
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

    public final ofc y() {
        ofc ofcVar = this.zze;
        return ofcVar == null ? ofc.E() : ofcVar;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
