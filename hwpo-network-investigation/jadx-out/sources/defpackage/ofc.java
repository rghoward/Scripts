package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ofc extends u1c implements h3c {
    private static final ofc zzi;
    private static volatile o3c zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = BuildConfig.FLAVOR;
    private i2c zzh = r3c.x;

    static {
        ofc ofcVar = new ofc();
        zzi = ofcVar;
        u1c.s(ofc.class, ofcVar);
    }

    public static ofc E() {
        return zzi;
    }

    public final boolean A() {
        return (this.zzb & 4) != 0;
    }

    public final boolean B() {
        return this.zzg;
    }

    public final i2c C() {
        return this.zzh;
    }

    public final int D() {
        return this.zzh.size();
    }

    public final int F() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.u1c
    public final Object w(int i) {
        o3c q1cVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new s3c(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", nfc.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new ofc();
        }
        if (i2 == 4) {
            return new mfc(zzi);
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
        synchronized (ofc.class) {
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

    public final boolean x() {
        return (this.zzb & 1) != 0;
    }

    public final boolean y() {
        return (this.zzb & 2) != 0;
    }

    public final String z() {
        return this.zzf;
    }
}
