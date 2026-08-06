package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ivc extends u1c implements h3c {
    private static final ivc zzf;
    private static volatile o3c zzg;
    private int zzb;
    private boolean zze;

    static {
        ivc ivcVar = new ivc();
        zzf = ivcVar;
        u1c.s(ivc.class, ivcVar);
    }

    public static ivc y() {
        return zzf;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new ivc();
        }
        if (i2 == 4) {
            return new gvc(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzg;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (ivc.class) {
            try {
                q1cVar = zzg;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzf);
                    zzg = q1cVar;
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
}
