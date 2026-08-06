package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yic extends u1c implements h3c {
    private static final yic zzi;
    private static volatile o3c zzj;
    private int zzb;
    private int zze;
    private glc zzf;
    private glc zzg;
    private boolean zzh;

    static {
        yic yicVar = new yic();
        zzi = yicVar;
        u1c.s(yic.class, yicVar);
    }

    public static wic E() {
        return (wic) zzi.o();
    }

    public final boolean A() {
        return (this.zzb & 4) != 0;
    }

    public final glc B() {
        glc glcVar = this.zzg;
        return glcVar == null ? glc.G() : glcVar;
    }

    public final boolean C() {
        return (this.zzb & 8) != 0;
    }

    public final boolean D() {
        return this.zzh;
    }

    public final /* synthetic */ void F(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void G(glc glcVar) {
        this.zzf = glcVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void H(glc glcVar) {
        this.zzg = glcVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void I(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new yic();
        }
        if (i2 == 4) {
            return new wic(zzi);
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
        synchronized (yic.class) {
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

    public final int y() {
        return this.zze;
    }

    public final glc z() {
        glc glcVar = this.zzf;
        return glcVar == null ? glc.G() : glcVar;
    }
}
