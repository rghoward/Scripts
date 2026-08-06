package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class skc extends u1c implements h3c {
    private static final skc zzi;
    private static volatile o3c zzj;
    private int zzb;
    private i2c zze = r3c.x;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private int zzh;

    static {
        skc skcVar = new skc();
        zzi = skcVar;
        u1c.s(skc.class, skcVar);
    }

    public static gkc E() {
        return (gkc) zzi.o();
    }

    public static gkc F(skc skcVar) {
        p1c p1cVarO = zzi.o();
        p1cVarO.l(skcVar);
        return (gkc) p1cVarO;
    }

    public final boolean A() {
        return (this.zzb & 1) != 0;
    }

    public final String B() {
        return this.zzf;
    }

    public final boolean C() {
        return (this.zzb & 2) != 0;
    }

    public final String D() {
        return this.zzg;
    }

    public final /* synthetic */ void G(int i, wkc wkcVar) {
        M();
        this.zze.set(i, wkcVar);
    }

    public final /* synthetic */ void H(wkc wkcVar) {
        M();
        this.zze.add(wkcVar);
    }

    public final /* synthetic */ void I(ArrayList arrayList) {
        M();
        f0c.i(arrayList, this.zze);
    }

    public final void J() {
        this.zze = r3c.x;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void L(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void M() {
        i2c i2cVar = this.zze;
        if (i2cVar.a()) {
            return;
        }
        this.zze = j3c.a(i2cVar);
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", wkc.class, "zzf", "zzg", "zzh", qkc.a});
        }
        if (i2 == 3) {
            return new skc();
        }
        if (i2 == 4) {
            return new gkc(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        o3c o3cVar = zzj;
        if (o3cVar != null) {
            return o3cVar;
        }
        synchronized (skc.class) {
            try {
                q1cVar = zzj;
                if (q1cVar == null) {
                    q1cVar = new q1c(zzi);
                    zzj = q1cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q1cVar;
    }

    public final List x() {
        return this.zze;
    }

    public final int y() {
        return this.zze.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wkc z(int i) {
        return (wkc) this.zze.get(i);
    }
}
