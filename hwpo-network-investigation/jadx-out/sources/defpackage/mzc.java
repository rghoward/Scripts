package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import com.intercom.twig.BuildConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mzc {
    public static final izc i = new izc();
    public static final xxc j;
    public volatile f1d a;
    public final lrc b;
    public final String c;
    public final String d;
    public final boolean e;
    public final q95 f;
    public final b0d g;
    public final g1d h;

    static {
        int i2 = q95.v;
        j = new xxc(qyc.t, false, wl8.C);
    }

    public mzc(lrc lrcVar, xxc xxcVar) {
        this.b = lrcVar;
        Context context = lrcVar.b;
        String str = xxcVar.d;
        if (str == null) {
            str = (String) xxcVar.a.apply(context);
            xxcVar.d = str;
        }
        this.c = str;
        this.d = BuildConfig.FLAVOR;
        this.e = xxcVar.b;
        this.f = xxcVar.c;
        this.a = null;
        this.g = new b0d();
        this.h = new g1d(lrcVar, str);
    }

    public final f1d a() {
        f1d f1dVar;
        f1d f1dVar2 = this.a;
        if (f1dVar2 != null) {
            return f1dVar2;
        }
        synchronized (this) {
            try {
                f1dVar = this.a;
                if (f1dVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        f1d f1dVarA = this.h.a();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i2 = f1dVarA.e.b - 2;
                        if (i2 == 15 || i2 == 16) {
                            f1dVar = f1dVarA;
                        } else {
                            lrc lrcVar = this.b;
                            lrcVar.g.a();
                            if (this.e || this.h.b() || !f1dVarA.b.isEmpty()) {
                                lrcVar.a().execute(new Runnable() { // from class: syc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        i0.a aVarC;
                                        final mzc mzcVar = this.t;
                                        f1d f1dVarA2 = mzcVar.a();
                                        String str = f1dVarA2.b;
                                        lrc lrcVar2 = mzcVar.b;
                                        l5a l5aVar = lrcVar2.d;
                                        a1d a1dVarB = lrcVar2.g.b();
                                        boolean z = a1dVarB.i;
                                        if (a1dVarB.j) {
                                            if (m20.c(str) && !z) {
                                                t85 t85Var = t85.u;
                                                return;
                                            }
                                            ysc yscVarY = dtc.y();
                                            e1d e1dVar = f1dVarA2.e;
                                            int i3 = e1dVar.a;
                                            atc atcVarX = btc.x();
                                            atcVarX.h();
                                            ((btc) atcVarX.u).y(i3);
                                            int i4 = e1dVar.b;
                                            atcVarX.h();
                                            ((btc) atcVarX.u).z(i4);
                                            btc btcVar = (btc) atcVarX.j();
                                            yscVarY.h();
                                            ((dtc) yscVarY.u).A(btcVar);
                                            if (!m20.c(str)) {
                                                yscVarY.h();
                                                ((dtc) yscVarY.u).z(str);
                                            }
                                            if (z) {
                                                String str2 = mzcVar.c;
                                                yscVarY.h();
                                                ((dtc) yscVarY.u).B(str2);
                                            }
                                            aVarC = ((mtc) l5aVar.get()).b((dtc) yscVarY.j());
                                        } else {
                                            if (m20.c(str)) {
                                                t85 t85Var2 = t85.u;
                                                return;
                                            }
                                            aVarC = ((mtc) l5aVar.get()).c(str);
                                        }
                                        ti4.h1(aVarC, otc.class, new x40() { // from class: gyc
                                            @Override // defpackage.x40
                                            public final ListenableFuture apply(Object obj) {
                                                int i5 = ((otc) obj).t;
                                                if (i5 == 29501 || i5 == 29537 || i5 == 29538 || i5 == 29539 || i5 == 29540 || i5 == 29541 || i5 == 29542 || i5 == 29543 || i5 == 29544) {
                                                    mzc mzcVar2 = mzcVar;
                                                    if (!mzcVar2.h.b()) {
                                                        mzcVar2.b();
                                                    }
                                                }
                                                return t85.u;
                                            }
                                        }, lrcVar2.a());
                                    }
                                });
                                lrcVar.a.a(f1dVarA.c, this.f, this.c);
                                if (!this.d.equals(BuildConfig.FLAVOR)) {
                                    lrcVar.a().execute(new Runnable() { // from class: cyc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final mzc mzcVar = this.t;
                                            lrc lrcVar2 = mzcVar.b;
                                            String str = mzcVar.c;
                                            s5d s5dVar = d0d.a;
                                            f0<Object> f0Var = f0.t;
                                            Context context = lrcVar2.b;
                                            Pattern pattern = v2d.a;
                                            o2d o2dVar = new o2d(context);
                                            o2dVar.a("phenotype");
                                            o2dVar.b("all_accounts.pb");
                                            Uri uriC = o2dVar.c();
                                            if (uriC == null) {
                                                ac4.c("Null uri");
                                                return;
                                            }
                                            mwc mwcVarY = mwc.y();
                                            if (mwcVarY == null) {
                                                ac4.c("Null schema");
                                                return;
                                            }
                                            s5d s5dVar2 = d0d.a;
                                            s5dVar2.getClass();
                                            i88 i88Var = new i88(s5dVar2);
                                            k95.b bVar = k95.u;
                                            x3d x3dVar = new x3d(uriC, mwcVarY, i88Var, ul8.x);
                                            j4d j4dVar = d0d.c;
                                            if (j4dVar == null) {
                                                synchronized (d0d.b) {
                                                    try {
                                                        j4dVar = d0d.c;
                                                        if (j4dVar == null) {
                                                            t5d t5dVar = t5d.a;
                                                            HashMap map = new HashMap();
                                                            ib6 ib6VarA = lrcVar2.a();
                                                            j2d j2dVar = (j2d) lrcVar2.f.get();
                                                            k4d k4dVar = k4d.a;
                                                            xl7.i(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                            map.put("singleproc", k4dVar);
                                                            j4d j4dVar2 = new j4d(ib6VarA, j2dVar, t5dVar, map);
                                                            d0d.c = j4dVar2;
                                                            j4dVar = j4dVar2;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                            }
                                            String strSubstring = BuildConfig.FLAVOR;
                                            ConcurrentHashMap concurrentHashMap = j4dVar.a;
                                            Uri uri = x3dVar.a;
                                            Pair pairCreate = (Pair) concurrentHashMap.get(uri);
                                            if (pairCreate == null) {
                                                Uri uri2 = x3dVar.a;
                                                xl7.i(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
                                                String lastPathSegment = uri2.getLastPathSegment();
                                                if (lastPathSegment == null) {
                                                    lastPathSegment = BuildConfig.FLAVOR;
                                                }
                                                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                xl7.i((iLastIndexOf == -1 ? BuildConfig.FLAVOR : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri2);
                                                xl7.f("Handler cannot be null", x3dVar.c != null);
                                                l5d l5dVar = (l5d) j4dVar.e.get("singleproc");
                                                xl7.i(l5dVar != null, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                String lastPathSegment2 = x3dVar.a.getLastPathSegment();
                                                if (lastPathSegment2 != null) {
                                                    strSubstring = lastPathSegment2;
                                                }
                                                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                                                if (iLastIndexOf2 != -1) {
                                                    strSubstring = strSubstring.substring(0, iLastIndexOf2);
                                                }
                                                w2.a aVarN1 = ti4.n1(ti4.k1(x3dVar.a), j4dVar.d, y03.t);
                                                Executor executor = j4dVar.b;
                                                z4d z4dVarB = l5dVar.b(x3dVar, strSubstring, executor, j4dVar.c);
                                                l5dVar.a();
                                                g4d g4dVar = new g4d(z4dVarB, aVarN1);
                                                k95 k95Var = x3dVar.d;
                                                if (!k95Var.isEmpty()) {
                                                    f4d f4dVar = new f4d(k95Var, executor);
                                                    synchronized (g4dVar.g) {
                                                        g4dVar.i.add(f4dVar);
                                                    }
                                                }
                                                pairCreate = Pair.create(g4dVar, x3dVar);
                                                Pair pair = (Pair) concurrentHashMap.putIfAbsent(uri, pairCreate);
                                                if (pair != null) {
                                                    pairCreate = pair;
                                                }
                                            }
                                            g4d g4dVar2 = (g4d) pairCreate.first;
                                            h4d h4dVar = (h4d) pairCreate.second;
                                            if (x3dVar.equals(h4dVar)) {
                                                final w2.b bVarA = g4dVar2.a(new c0d(str), lrcVar2.a());
                                                bVarA.Q(new Runnable() { // from class: iyc
                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        try {
                                                            ti4.i1(bVarA);
                                                        } catch (Exception e) {
                                                            String str2 = mzcVar.c;
                                                            Log.w("FlagStore", w27.a(new StringBuilder(String.valueOf(str2).length() + 73), "Failed to store account on flag read for: ", str2, " which may lead to stale flags."), e);
                                                        }
                                                    }
                                                }, lrcVar2.a());
                                                return;
                                            }
                                            String strA = p2a.a("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", x3dVar.b.getClass().getSimpleName(), x3dVar.a);
                                            xl7.i(x3dVar.a.equals(h4dVar.a()), strA, "uri");
                                            xl7.i(x3dVar.b.equals(h4dVar.b()), strA, "schema");
                                            xl7.i(x3dVar.c.equals(h4dVar.c()), strA, "handler");
                                            xl7.i(x3dVar.d.equals(h4dVar.d()), strA, "migrations");
                                            xl7.i(x3dVar.e.equals(h4dVar.e()), strA, "variantConfig");
                                            xl7.i(x3dVar.f == h4dVar.f(), strA, "useGeneratedExtensionRegistry");
                                            z90.a(p2a.a(strA, "unknown"));
                                        }
                                    });
                                }
                                if (this.h.b()) {
                                    lrcVar.a().execute(new Runnable() { // from class: eyc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ListenableFuture listenableFutureE;
                                            mzc mzcVar = this.t;
                                            final u0d u0dVar = mzcVar.b.i;
                                            boolean z = mzcVar.e;
                                            kyc kycVar = kyc.a;
                                            final z0d z0dVar = (z0d) u0dVar.c.get();
                                            if (z0dVar == null && !z) {
                                                t85 t85Var = t85.u;
                                                return;
                                            }
                                            if ((u0dVar.e & 64) == 0) {
                                                CopyOnWriteArrayList copyOnWriteArrayList = u0dVar.f;
                                                synchronized (copyOnWriteArrayList) {
                                                    try {
                                                        int i3 = u0dVar.e;
                                                        if ((i3 & 64) == 0) {
                                                            copyOnWriteArrayList.add(kycVar);
                                                            u0dVar.e = i3 | 64;
                                                        }
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                            }
                                            if (u0dVar.h == null) {
                                                synchronized (u0dVar.g) {
                                                    try {
                                                        if (u0dVar.h == null) {
                                                            if (z0dVar == null) {
                                                                z0dVar = r0d.a;
                                                            }
                                                            Context context = u0dVar.a;
                                                            if (gqc.b(context)) {
                                                                listenableFutureE = ((mtc) u0dVar.d.get()).e(new t0d(u0dVar, z0dVar));
                                                                u0dVar.h = listenableFutureE;
                                                            } else {
                                                                h0d h0dVar = h0d.t;
                                                                l5a l5aVar = u0dVar.b;
                                                                listenableFutureE = ti4.n1(gqc.a(context, Executors.callable(h0dVar, null), (Executor) l5aVar.get()), new x40() { // from class: q0d
                                                                    @Override // defpackage.x40
                                                                    public final ListenableFuture apply(Object obj) {
                                                                        u0d u0dVar2 = u0dVar;
                                                                        return ((mtc) u0dVar2.d.get()).e(new t0d(u0dVar2, z0dVar));
                                                                    }
                                                                }, (Executor) l5aVar.get());
                                                                u0dVar.h = listenableFutureE;
                                                            }
                                                            listenableFutureE.Q(new Runnable() { // from class: g0d
                                                                @Override // java.lang.Runnable
                                                                public final /* synthetic */ void run() {
                                                                    try {
                                                                        ti4.i1(listenableFutureE);
                                                                    } catch (Exception e) {
                                                                        Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e);
                                                                    }
                                                                }
                                                            }, (Executor) u0dVar.b.get());
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        }
                                    });
                                }
                                f1dVar = f1dVarA;
                            } else {
                                lrcVar.a().execute(new fc3(1, this));
                                f1dVar = new f1d(i1d.E(), f1dVarA.e);
                            }
                        }
                        if (!this.e || f1dVar.e.b != 17) {
                            this.a = f1dVar;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f1dVar;
    }

    public final void b() {
        final g1d g1dVar = this.h;
        lrc lrcVar = g1dVar.a;
        final w2.b bVarM1 = ti4.m1(((mtc) lrcVar.d.get()).a(g1dVar.c), c1d.t, lrcVar.a());
        x40 x40Var = new x40() { // from class: kzc
            @Override // defpackage.x40
            public final ListenableFuture apply(Object obj) {
                final i1d i1dVar = (i1d) obj;
                final g1d g1dVar2 = g1dVar;
                g1dVar2.getClass();
                Callable callable = new Callable() { // from class: d1d
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        i1d i1dVar2 = i1dVar;
                        g1d g1dVar3 = g1dVar2;
                        lrc lrcVar2 = g1dVar3.a;
                        x2d x2dVar = new x2d();
                        try {
                            j2d j2dVar = (j2d) lrcVar2.f.get();
                            Uri uri = g1dVar3.b;
                            xd2 xd2Var = new xd2(i1dVar2);
                            xd2Var.b = new x2d[]{x2dVar};
                            return null;
                        } catch (IOException | RuntimeException e) {
                            nsc.a(Level.WARNING, lrcVar2.a(), e, "Failed to update snapshot for %s flags may be stale.", g1dVar3.c);
                            return null;
                        }
                    }
                };
                ib6 ib6VarA = g1dVar2.a.a();
                kya kyaVar = new kya(callable);
                ib6VarA.execute(kyaVar);
                return kyaVar;
            }
        };
        lrc lrcVar2 = this.b;
        ti4.n1(bVarM1, x40Var, lrcVar2.a()).Q(new Runnable() { // from class: myc
            /* JADX WARN: Code duplicated, block: B:20:0x0039 A[Catch: CancellationException -> 0x001f, ExecutionException -> 0x0021, TryCatch #3 {CancellationException -> 0x001f, ExecutionException -> 0x0021, blocks: (B:3:0x0004, B:5:0x001a, B:18:0x002c, B:20:0x0039, B:22:0x0045, B:28:0x0055, B:30:0x0059, B:12:0x0023, B:33:0x0086, B:14:0x0026, B:17:0x002b, B:26:0x004b, B:27:0x0054), top: B:39:0x0004, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:22:0x0045 A[Catch: CancellationException -> 0x001f, ExecutionException -> 0x0021, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x001f, ExecutionException -> 0x0021, blocks: (B:3:0x0004, B:5:0x001a, B:18:0x002c, B:20:0x0039, B:22:0x0045, B:28:0x0055, B:30:0x0059, B:12:0x0023, B:33:0x0086, B:14:0x0026, B:17:0x002b, B:26:0x004b, B:27:0x0054), top: B:39:0x0004, inners: #1 }] */
            /* JADX WARN: Code duplicated, block: B:36:0x008f  */
            /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            public final void run() {
                f1d f1dVar;
                vl8 vl8Var;
                vl8 vl8Var2;
                z0d z0dVar;
                final mzc mzcVar = this.t;
                try {
                    i1d i1dVar = (i1d) ti4.i1(bVarM1);
                    f1d f1dVar2 = new f1d(i1dVar, new e1d(6, 2));
                    boolean z = mzcVar.e;
                    if (z || (f1dVar = mzcVar.a) == null) {
                        synchronized (mzcVar) {
                            if (!z) {
                                f1dVar = mzcVar.a;
                                if (f1dVar != null) {
                                    vl8Var = f1dVar.d;
                                    vl8Var2 = f1dVar2.d;
                                    vl8Var.getClass();
                                    if (!oi6.a(vl8Var2, vl8Var)) {
                                        z0dVar = (z0d) mzcVar.b.e.get();
                                        if (z0dVar != null) {
                                            z0dVar.a();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            mzcVar.a = f1dVar2;
                            mzcVar.g.a.incrementAndGet();
                        }
                    } else {
                        vl8Var = f1dVar.d;
                        vl8Var2 = f1dVar2.d;
                        vl8Var.getClass();
                        if (!oi6.a(vl8Var2, vl8Var)) {
                            z0dVar = (z0d) mzcVar.b.e.get();
                            if (z0dVar != null) {
                                z0dVar.a();
                                return;
                            }
                            return;
                        }
                    }
                    if (mzcVar.e) {
                        lrc lrcVar3 = mzcVar.b;
                        i0.a aVarC = ((mtc) lrcVar3.d.get()).c(i1dVar.x());
                        yh4 yh4Var = new yh4() { // from class: oyc
                            @Override // defpackage.yh4
                            public final /* synthetic */ Object apply(Object obj) {
                                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(mzcVar.c)), (Throwable) obj);
                                return null;
                            }
                        };
                        ib6 ib6VarA = lrcVar3.a();
                        int i2 = i0.E;
                        i0.b bVar = new i0.b(aVarC, Throwable.class, yh4Var);
                        aVarC.Q(bVar, hy6.a(ib6VarA, bVar));
                    }
                } catch (CancellationException e) {
                    e = e;
                    if (e.getCause() instanceof SecurityException) {
                    }
                    String str = mzcVar.c;
                    Log.w("FlagStore", w27.a(new StringBuilder(String.valueOf(str).length() + 64), "Unable to update local snapshot for ", str, ", may result in stale flags."), e);
                } catch (ExecutionException e2) {
                    e = e2;
                    if (e.getCause() instanceof SecurityException) {
                        String str2 = mzcVar.c;
                        Log.w("FlagStore", w27.a(new StringBuilder(String.valueOf(str2).length() + 64), "Unable to update local snapshot for ", str2, ", may result in stale flags."), e);
                    }
                }
            }
        }, lrcVar2.a());
    }
}
