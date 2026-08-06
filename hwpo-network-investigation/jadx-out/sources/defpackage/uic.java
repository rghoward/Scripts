package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uic extends u1c implements h3c {
    private static final uic zzl;
    private static volatile o3c zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        uic uicVar = new uic();
        zzl = uicVar;
        u1c.s(uic.class, uicVar);
    }

    public static sic E() {
        return (sic) zzl.o();
    }

    public static uic F() {
        return zzl;
    }

    public final boolean A() {
        return this.zzh;
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return this.zzj;
    }

    public final boolean D() {
        return this.zzk;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void H(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    public final /* synthetic */ void I(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final /* synthetic */ void J(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final /* synthetic */ void K(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    public final /* synthetic */ void L(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    public final /* synthetic */ void M(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new uic();
        }
        if (i2 == 4) {
            return new sic(zzl);
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
        synchronized (uic.class) {
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

    public final boolean x() {
        return this.zze;
    }

    public final boolean y() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzg;
    }
}
