package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bfc extends u1c implements h3c {
    private static final bfc zzj;
    private static volatile o3c zzk;
    private int zzb;
    private int zze;
    private i2c zzf;
    private i2c zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        bfc bfcVar = new bfc();
        zzj = bfcVar;
        u1c.s(bfc.class, bfcVar);
    }

    public bfc() {
        r3c r3cVar = r3c.x;
        this.zzf = r3cVar;
        this.zzg = r3cVar;
    }

    public final int A() {
        return this.zzf.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lfc B(int i) {
        return (lfc) this.zzf.get(i);
    }

    public final i2c C() {
        return this.zzg;
    }

    public final int D() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final efc E(int i) {
        return (efc) this.zzg.get(i);
    }

    public final void F(int i, lfc lfcVar) {
        i2c i2cVar = this.zzf;
        if (!i2cVar.a()) {
            this.zzf = j3c.a(i2cVar);
        }
        this.zzf.set(i, lfcVar);
    }

    public final void G(int i, efc efcVar) {
        i2c i2cVar = this.zzg;
        if (!i2cVar.a()) {
            this.zzg = j3c.a(i2cVar);
        }
        this.zzg.set(i, efcVar);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", lfc.class, "zzg", efc.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new bfc();
        }
        if (i2 == 4) {
            return new afc(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzk;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (bfc.class) {
            try {
                q1cVar = zzk;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzj);
                    zzk = q1cVar;
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
