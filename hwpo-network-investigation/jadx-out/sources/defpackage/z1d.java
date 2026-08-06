package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import com.intercom.twig.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z1d {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public final Context a;
    public final l5a b;
    public final l5a c;
    public final l5a d;
    public final l5a e;
    public final l5a f;
    public final Uri g;
    public volatile ovc h;
    public final Uri i;

    public z1d(Context context, final l5a l5aVar, l5a l5aVar2, l5a l5aVar3) {
        this.a = context;
        this.c = l5aVar;
        this.b = l5aVar3;
        this.d = l5aVar2;
        Pattern pattern = v2d.a;
        o2d o2dVar = new o2d(context);
        o2dVar.a("phenotype_storage_info");
        o2dVar.b("storage-info.pb");
        this.g = o2dVar.c();
        o2d o2dVar2 = new o2d(context);
        o2dVar2.a("phenotype_storage_info");
        o2dVar2.b("device-encrypted-storage-info.pb");
        Set set = v2d.d;
        h4c.b(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        o2dVar2.b = "directboot-files";
        this.i = o2dVar2.c();
        this.e = m5a.a(new l5a() { // from class: y1d
            @Override // defpackage.l5a
            public final Object get() {
                final z1d z1dVar = this.t;
                ib6 ib6Var = (ib6) z1dVar.c.get();
                ib6Var.getClass();
                mtc mtcVar = (mtc) z1dVar.b.get();
                mtcVar.getClass();
                i0.a aVarD = mtcVar.d();
                int i = g84.A;
                int i2 = i0.E;
                i0.b bVar = new i0.b(aVarD, otc.class, m1d.t);
                aVarD.Q(bVar, hy6.a(ib6Var, bVar));
                final w2.b bVarM1 = ti4.m1(bVar, new yh4() { // from class: u1d
                    @Override // defpackage.yh4
                    public final Object apply(Object obj) {
                        z1d z1dVar2 = z1dVar;
                        awc awcVar = (awc) obj;
                        x2d x2dVar = new x2d();
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                        try {
                            try {
                                synchronized (z1d.j) {
                                    j2d j2dVar = (j2d) z1dVar2.d.get();
                                    Uri uri = z1dVar2.g;
                                    xd2 xd2Var = new xd2(awcVar.x());
                                    xd2Var.b = new x2d[]{x2dVar};
                                    j2dVar.a(uri, xd2Var);
                                    z1dVar2.h = awcVar.x();
                                }
                                synchronized (z1d.k) {
                                    j2d j2dVar2 = (j2d) z1dVar2.d.get();
                                    Uri uri2 = z1dVar2.i;
                                    xd2 xd2Var2 = new xd2(awcVar.y());
                                    xd2Var2.b = new x2d[]{x2dVar};
                                    j2dVar2.a(uri2, xd2Var2);
                                    awcVar.y();
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                                return null;
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    }
                }, ib6Var);
                bVarM1.Q(new Runnable() { // from class: v1d
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        try {
                            ti4.i1(bVarM1);
                        } catch (Exception e) {
                            if (Log.isLoggable("StorageInfoHandler", 3)) {
                                Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e);
                            }
                        }
                    }
                }, ib6Var);
                return bVarM1;
            }
        });
        this.f = m5a.a(new l5a() { // from class: l1d
            @Override // defpackage.l5a
            public final Object get() {
                ib6 ib6Var = (ib6) l5aVar.get();
                ib6Var.getClass();
                return ib6Var.schedule((Callable) x1d.a, 10000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    public final void a() {
        if (!gqc.b(this.a) || c().B() + 86400000 >= System.currentTimeMillis()) {
            t85 t85Var = t85.u;
            return;
        }
        ib6 ib6Var = (ib6) this.c.get();
        ib6Var.getClass();
        ListenableFuture listenableFutureL1 = ti4.l1((ListenableFuture) this.f.get());
        int i = g84.A;
        ti4.n1(listenableFutureL1 instanceof g84 ? (g84) listenableFutureL1 : new md4(listenableFutureL1), new x40() { // from class: w1d
            @Override // defpackage.x40
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return ti4.l1((ListenableFuture) this.a.e.get());
            }
        }, ib6Var);
    }

    public final a1d b() {
        ovc ovcVarC = c();
        return new a1d(ovcVarC.z(), k95.q(ovcVarC.E()), ovcVarC.y(), ovcVarC.A(), (ovcVarC.F() && ovcVarC.G().y() == ((long) Build.VERSION.SDK_INT)) ? ovcVarC.G().x() : BuildConfig.FLAVOR, k95.q(ovcVarC.C()), k95.q(ovcVarC.D()), ovcVarC.x(), ovcVarC.I(), ovcVarC.H(), ovcVarC.J());
    }

    public final ovc c() {
        ovc ovcVarL;
        ovc ovcVar = this.h;
        if (ovcVar != null) {
            return ovcVar;
        }
        synchronized (j) {
            ovcVarL = this.h;
            if (ovcVarL == null) {
                ovcVarL = ovc.L();
                if (gqc.b(this.a)) {
                    o3c o3cVarD = ovcVarL.d();
                    f1c f1cVar = f1c.b;
                    int i = h0c.a;
                    f1c f1cVar2 = f1c.c;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        try {
                            InputStream inputStreamC = mp0.c(((j2d) this.d.get()).b(this.g));
                            try {
                                u1c u1cVarA = o3cVarD.a(inputStreamC, f1cVar2);
                                if (inputStreamC != null) {
                                    inputStreamC.close();
                                }
                                ovc ovcVar2 = (ovc) u1cVarA;
                                StrictMode.setThreadPolicy(threadPolicy);
                                ovcVarL = ovcVar2;
                            } catch (Throwable th) {
                                if (inputStreamC != null) {
                                    try {
                                        inputStreamC.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th3;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    this.h = ovcVarL;
                }
            }
        }
        return ovcVarL;
    }
}
