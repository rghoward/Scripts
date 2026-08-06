package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lfc extends u1c implements h3c {
    private static final lfc zzk;
    private static volatile o3c zzl;
    private int zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private gfc zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        lfc lfcVar = new lfc();
        zzk = lfcVar;
        u1c.s(lfc.class, lfcVar);
    }

    public static kfc F() {
        return (kfc) zzk.o();
    }

    public final gfc A() {
        gfc gfcVar = this.zzg;
        return gfcVar == null ? gfc.F() : gfcVar;
    }

    public final boolean B() {
        return this.zzh;
    }

    public final boolean C() {
        return this.zzi;
    }

    public final boolean D() {
        return (this.zzb & 32) != 0;
    }

    public final boolean E() {
        return this.zzj;
    }

    public final /* synthetic */ void G(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new lfc();
        }
        if (i2 == 4) {
            return new kfc(zzk);
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
        synchronized (lfc.class) {
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

    public final int y() {
        return this.zze;
    }

    public final String z() {
        return this.zzf;
    }
}
