package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class klc extends u1c implements h3c {
    private static final klc zzg;
    private static volatile o3c zzh;
    private int zzb;
    private int zze;
    private h2c zzf = r2c.x;

    static {
        klc klcVar = new klc();
        zzg = klcVar;
        u1c.s(klc.class, klcVar);
    }

    public static ilc C() {
        return (ilc) zzg.o();
    }

    public final int A() {
        return ((r2c) this.zzf).size();
    }

    public final long B(int i) {
        return ((r2c) this.zzf).e(i);
    }

    public final /* synthetic */ void D(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final void E(List list) {
        RandomAccess randomAccess = this.zzf;
        if (!((g0c) randomAccess).t) {
            r2c r2cVar = (r2c) randomAccess;
            int i = r2cVar.v;
            this.zzf = r2cVar.p0(i + i);
        }
        f0c.i(list, this.zzf);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new klc();
        }
        if (i2 == 4) {
            return new ilc(zzg);
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
        synchronized (klc.class) {
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

    public final List z() {
        return this.zzf;
    }
}
