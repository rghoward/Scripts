package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mwc extends u1c implements h3c {
    private static final mwc zze;
    private static volatile o3c zzf;
    private w2c zzb = w2c.u;

    static {
        mwc mwcVar = new mwc();
        zze = mwcVar;
        u1c.s(mwc.class, mwcVar);
    }

    public static mwc y() {
        return zze;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", iwc.a});
        }
        if (i2 == 3) {
            return new mwc();
        }
        if (i2 == 4) {
            return new kwc(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzf;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (mwc.class) {
            try {
                q1cVar = zzf;
                if (q1cVar == null) {
                    q1cVar = new q1c(zze);
                    zzf = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }

    public final gwc x(String str, gwc gwcVar) {
        str.getClass();
        gwc gwcVar2 = (gwc) this.zzb.get(str);
        return gwcVar2 != null ? gwcVar2 : gwcVar;
    }

    public final w2c z() {
        w2c w2cVar = this.zzb;
        if (!w2cVar.t) {
            this.zzb = w2cVar.a();
        }
        return this.zzb;
    }
}
