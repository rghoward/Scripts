package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tjc extends u1c implements h3c {
    private static final tjc zzm;
    private static volatile o3c zzn;
    private int zzb;
    private i2c zze = r3c.x;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        tjc tjcVar = new tjc();
        zzm = tjcVar;
        u1c.s(tjc.class, tjcVar);
    }

    public static rjc N() {
        return (rjc) zzm.o();
    }

    public final int A() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final akc B(int i) {
        return (akc) this.zze.get(i);
    }

    public final String C() {
        return this.zzf;
    }

    public final boolean D() {
        return (this.zzb & 2) != 0;
    }

    public final long E() {
        return this.zzg;
    }

    public final boolean F() {
        return (this.zzb & 4) != 0;
    }

    public final long G() {
        return this.zzh;
    }

    public final boolean H() {
        return (this.zzb & 8) != 0;
    }

    public final int I() {
        return this.zzi;
    }

    public final boolean J() {
        return (this.zzb & 32) != 0;
    }

    public final long K() {
        return this.zzk;
    }

    public final boolean L() {
        return (this.zzb & 64) != 0;
    }

    public final long M() {
        return this.zzl;
    }

    public final /* synthetic */ void O(int i, akc akcVar) {
        y();
        this.zze.set(i, akcVar);
    }

    public final /* synthetic */ void P(akc akcVar) {
        akcVar.getClass();
        y();
        this.zze.add(akcVar);
    }

    public final /* synthetic */ void Q(Iterable iterable) {
        y();
        f0c.i(iterable, this.zze);
    }

    public final void R() {
        this.zze = r3c.x;
    }

    public final /* synthetic */ void S(int i) {
        y();
        this.zze.remove(i);
    }

    public final /* synthetic */ void T(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void U(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void V(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void W(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void X(long j) {
        this.zzb |= 32;
        this.zzk = j;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", akc.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new tjc();
        }
        if (i2 == 4) {
            return new rjc(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzn;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (tjc.class) {
            try {
                q1cVar = zzn;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzm);
                    zzn = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void y() {
        i2c i2cVar = this.zze;
        if (i2cVar.a()) {
            return;
        }
        this.zze = j3c.a(i2cVar);
    }

    public final List z() {
        return this.zze;
    }
}
