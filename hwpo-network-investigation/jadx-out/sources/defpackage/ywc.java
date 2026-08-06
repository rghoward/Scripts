package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ywc {
    public static final fic a;
    public static final hkc b;
    public static volatile x0c c;
    public static final Object d;
    public static Context e;

    static {
        new ybc(lmc.i("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new idc(lmc.i("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new oec(lmc.i("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new zfc(lmc.i("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new fic(lmc.i("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new hkc(lmc.i("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static void a() {
        x0c yybVar;
        if (c != null) {
            return;
        }
        a78.g(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = DynamiteModule.c(e, DynamiteModule.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = zzb.b;
                    if (iBinderB == null) {
                        yybVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        yybVar = iInterfaceQueryLocalInterface instanceof x0c ? (x0c) iInterfaceQueryLocalInterface : new yyb(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    c = yybVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static q8d b(String str, moc mocVar, boolean z, boolean z2) {
        try {
            a();
            a78.g(e);
            try {
                return c.v(new n3d(str, mocVar, z, z2), new se7(e.getPackageManager())) ? q8d.d : new o7d(new jqc(z, str, mocVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return q8d.c("module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return q8d.c("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
