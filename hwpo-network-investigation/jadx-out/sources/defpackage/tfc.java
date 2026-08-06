package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tfc extends u1c implements h3c {
    private static final tfc zzg;
    private static volatile o3c zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        tfc tfcVar = new tfc();
        zzg = tfcVar;
        u1c.s(tfc.class, tfcVar);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            yfc yfcVar = yfc.a;
            return new s3c(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", yfcVar, "zzf", yfcVar});
        }
        if (i2 == 3) {
            return new tfc();
        }
        if (i2 == 4) {
            return new sfc(zzg);
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
        synchronized (tfc.class) {
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

    public final int x() {
        int iB = sy.b(this.zze);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final int y() {
        int iB = sy.b(this.zzf);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }
}
