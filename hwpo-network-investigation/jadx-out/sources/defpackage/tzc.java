package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tzc extends u1c implements h3c {
    private static final tzc zze;
    private static volatile o3c zzf;
    private i2c zzb = r3c.x;

    static {
        tzc tzcVar = new tzc();
        zze = tzcVar;
        u1c.s(tzc.class, tzcVar);
    }

    public static tzc y(byte[] bArr, f1c f1cVar) {
        return (tzc) u1c.j(zze, bArr, f1cVar);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new tzc();
        }
        if (i2 == 4) {
            return new rzc(zze);
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
        synchronized (tzc.class) {
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

    public final List x() {
        return this.zzb;
    }
}
