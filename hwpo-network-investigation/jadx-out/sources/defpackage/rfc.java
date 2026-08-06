package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rfc extends u1c implements h3c {
    private static final rfc zzh;
    private static volatile o3c zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        rfc rfcVar = new rfc();
        zzh = rfcVar;
        u1c.s(rfc.class, rfcVar);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", yfc.a, "zzf", vfc.a, "zzg", ogc.a});
        }
        if (i2 == 3) {
            return new rfc();
        }
        if (i2 == 4) {
            return new qfc(zzh);
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
        synchronized (rfc.class) {
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

    public final int x() {
        int iB = sy.b(this.zze);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final int y() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int z() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
