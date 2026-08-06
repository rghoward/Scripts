package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class akc extends u1c implements h3c {
    private static final akc zzk;
    private static volatile o3c zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private i2c zzj = r3c.x;

    static {
        akc akcVar = new akc();
        zzk = akcVar;
        u1c.s(akc.class, akcVar);
    }

    public static yjc J() {
        return (yjc) zzk.o();
    }

    public final String A() {
        return this.zzf;
    }

    public final boolean B() {
        return (this.zzb & 4) != 0;
    }

    public final long C() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zzb & 8) != 0;
    }

    public final float E() {
        return this.zzh;
    }

    public final boolean F() {
        return (this.zzb & 16) != 0;
    }

    public final double G() {
        return this.zzi;
    }

    public final i2c H() {
        return this.zzj;
    }

    public final int I() {
        return this.zzj.size();
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void N(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void O() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void P(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void Q() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void R(akc akcVar) {
        i2c i2cVar = this.zzj;
        if (!i2cVar.a()) {
            this.zzj = j3c.a(i2cVar);
        }
        this.zzj.add(akcVar);
    }

    public final void S(ArrayList arrayList) {
        i2c i2cVar = this.zzj;
        if (!i2cVar.a()) {
            this.zzj = j3c.a(i2cVar);
        }
        f0c.i(arrayList, this.zzj);
    }

    public final void T() {
        this.zzj = r3c.x;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", akc.class});
        }
        if (i2 == 3) {
            return new akc();
        }
        if (i2 == 4) {
            return new yjc(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzl;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (akc.class) {
            try {
                q1cVar = zzl;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzk);
                    zzl = q1cVar;
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

    public final String y() {
        return this.zze;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
