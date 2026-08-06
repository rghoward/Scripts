package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class efc extends u1c implements h3c {
    private static final efc zzm;
    private static volatile o3c zzn;
    private int zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private i2c zzg = r3c.x;
    private boolean zzh;
    private jfc zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        efc efcVar = new efc();
        zzm = efcVar;
        u1c.s(efc.class, efcVar);
    }

    public static cfc J() {
        return (cfc) zzm.o();
    }

    public final List A() {
        return this.zzg;
    }

    public final int B() {
        return this.zzg.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gfc C(int i) {
        return (gfc) this.zzg.get(i);
    }

    public final boolean D() {
        return (this.zzb & 8) != 0;
    }

    public final jfc E() {
        jfc jfcVar = this.zzi;
        return jfcVar == null ? jfc.G() : jfcVar;
    }

    public final boolean F() {
        return this.zzj;
    }

    public final boolean G() {
        return this.zzk;
    }

    public final boolean H() {
        return (this.zzb & 64) != 0;
    }

    public final boolean I() {
        return this.zzl;
    }

    public final /* synthetic */ void K(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void L(int i, gfc gfcVar) {
        i2c i2cVar = this.zzg;
        if (!i2cVar.a()) {
            this.zzg = j3c.a(i2cVar);
        }
        this.zzg.set(i, gfcVar);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", gfc.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new efc();
        }
        if (i2 == 4) {
            return new cfc(zzm);
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
        synchronized (efc.class) {
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

    public final boolean x() {
        return (this.zzb & 1) != 0;
    }

    public final int y() {
        return this.zze;
    }

    public final String z() {
        return this.zzf;
    }
}
