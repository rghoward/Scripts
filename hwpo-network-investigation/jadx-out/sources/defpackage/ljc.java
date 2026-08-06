package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ljc extends u1c implements h3c {
    private static final ljc zze;
    private static volatile o3c zzf;
    private i2c zzb = r3c.x;

    static {
        ljc ljcVar = new ljc();
        zze = ljcVar;
        u1c.s(ljc.class, ljcVar);
    }

    public static ajc y() {
        return (ajc) zze.o();
    }

    public static ljc z() {
        return zze;
    }

    public final void A(ArrayList arrayList) {
        i2c i2cVar = this.zzb;
        if (!i2cVar.a()) {
            this.zzb = j3c.a(i2cVar);
        }
        f0c.i(arrayList, this.zzb);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", gjc.class});
        }
        if (i2 == 3) {
            return new ljc();
        }
        if (i2 == 4) {
            return new ajc(zze);
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
        synchronized (ljc.class) {
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
