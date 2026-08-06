package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class glc extends u1c implements h3c {
    private static final glc zzh;
    private static volatile o3c zzi;
    private h2c zzb;
    private h2c zze;
    private i2c zzf;
    private i2c zzg;

    static {
        glc glcVar = new glc();
        zzh = glcVar;
        u1c.s(glc.class, glcVar);
    }

    public glc() {
        r2c r2cVar = r2c.x;
        this.zzb = r2cVar;
        this.zze = r2cVar;
        r3c r3cVar = r3c.x;
        this.zzf = r3cVar;
        this.zzg = r3cVar;
    }

    public static elc F() {
        return (elc) zzh.o();
    }

    public static glc G() {
        return zzh;
    }

    public final int A() {
        return ((r2c) this.zze).size();
    }

    public final i2c B() {
        return this.zzf;
    }

    public final int C() {
        return this.zzf.size();
    }

    public final i2c D() {
        return this.zzg;
    }

    public final int E() {
        return this.zzg.size();
    }

    public final void H(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((g0c) randomAccess).t) {
            r2c r2cVar = (r2c) randomAccess;
            int i = r2cVar.v;
            this.zzb = r2cVar.p0(i + i);
        }
        f0c.i(iterable, this.zzb);
    }

    public final void I() {
        this.zzb = r2c.x;
    }

    public final void J(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((g0c) randomAccess).t) {
            r2c r2cVar = (r2c) randomAccess;
            int i = r2cVar.v;
            this.zze = r2cVar.p0(i + i);
        }
        f0c.i(list, this.zze);
    }

    public final void K() {
        this.zze = r2c.x;
    }

    public final void L(ArrayList arrayList) {
        i2c i2cVar = this.zzf;
        if (!i2cVar.a()) {
            this.zzf = j3c.a(i2cVar);
        }
        f0c.i(arrayList, this.zzf);
    }

    public final void M() {
        this.zzf = r3c.x;
    }

    public final void N(Iterable iterable) {
        i2c i2cVar = this.zzg;
        if (!i2cVar.a()) {
            this.zzg = j3c.a(i2cVar);
        }
        f0c.i(iterable, this.zzg);
    }

    public final void O() {
        this.zzg = r3c.x;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", pjc.class, "zzg", klc.class});
        }
        if (i2 == 3) {
            return new glc();
        }
        if (i2 == 4) {
            return new elc(zzh);
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
        synchronized (glc.class) {
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

    public final List x() {
        return this.zzb;
    }

    public final int y() {
        return ((r2c) this.zzb).size();
    }

    public final List z() {
        return this.zze;
    }
}
