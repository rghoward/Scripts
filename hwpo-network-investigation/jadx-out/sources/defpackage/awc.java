package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class awc extends u1c implements h3c {
    private static final awc zzg;
    private static volatile o3c zzh;
    private int zzb;
    private ovc zze;
    private svc zzf;

    static {
        awc awcVar = new awc();
        zzg = awcVar;
        u1c.s(awc.class, awcVar);
    }

    public static yvc A() {
        return (yvc) zzg.o();
    }

    public static awc z(byte[] bArr, f1c f1cVar) {
        return (awc) u1c.j(zzg, bArr, f1cVar);
    }

    public final /* synthetic */ void B(ovc ovcVar) {
        this.zze = ovcVar;
        this.zzb |= 1;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new awc();
        }
        if (i2 == 4) {
            return new yvc(zzg);
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
        synchronized (awc.class) {
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

    public final ovc x() {
        ovc ovcVar = this.zze;
        return ovcVar == null ? ovc.L() : ovcVar;
    }

    public final svc y() {
        svc svcVar = this.zzf;
        return svcVar == null ? svc.x() : svcVar;
    }
}
