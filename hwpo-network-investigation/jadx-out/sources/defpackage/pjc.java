package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pjc extends u1c implements h3c {
    private static final pjc zzg;
    private static volatile o3c zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        pjc pjcVar = new pjc();
        zzg = pjcVar;
        u1c.s(pjc.class, pjcVar);
    }

    public static njc B() {
        return (njc) zzg.o();
    }

    public final long A() {
        return this.zzf;
    }

    public final /* synthetic */ void C(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void D(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new pjc();
        }
        if (i2 == 4) {
            return new njc(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzh;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (pjc.class) {
            try {
                q1cVar = zzh;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzg);
                    zzh = q1cVar;
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

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
