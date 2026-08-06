package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zn4 implements Handler.Callback {
    public static final Status H = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status I = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object J = new Object();
    public static zn4 K;
    public final rwb F;
    public volatile boolean G;
    public oaa v;
    public zwb w;
    public final Context x;
    public final wn4 y;
    public final pwb z;
    public long t = 10000;
    public boolean u = false;
    public final AtomicInteger A = new AtomicInteger(1);
    public final AtomicInteger B = new AtomicInteger(0);
    public final ConcurrentHashMap C = new ConcurrentHashMap(5, 0.75f, 1);
    public final r30 D = new r30(0);
    public final r30 E = new r30(0);

    public zn4(Context context, Looper looper, wn4 wn4Var) {
        this.G = true;
        this.x = context;
        rwb rwbVar = new rwb(looper, this);
        Looper.getMainLooper();
        this.F = rwbVar;
        this.y = wn4Var;
        this.z = new pwb(wn4Var);
        PackageManager packageManager = context.getPackageManager();
        if (zd6.A == null) {
            zd6.A = Boolean.valueOf(f28.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (zd6.A.booleanValue()) {
            this.G = false;
        }
        rwbVar.sendMessage(rwbVar.obtainMessage(6));
    }

    public static Status b(ux uxVar, ax1 ax1Var) {
        String str = uxVar.b.b;
        String strValueOf = String.valueOf(ax1Var);
        return new Status(17, ao2.a(new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), ax1Var.v, ax1Var);
    }

    public static zn4 c(Context context) {
        zn4 zn4Var;
        HandlerThread handlerThread;
        synchronized (J) {
            if (K == null) {
                synchronized (ln4.u) {
                    try {
                        handlerThread = ln4.w;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            ln4.w = handlerThread2;
                            handlerThread2.start();
                            handlerThread = ln4.w;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                K = new zn4(context.getApplicationContext(), handlerThread.getLooper(), wn4.e);
            }
            zn4Var = K;
        }
        return zn4Var;
    }

    public final rub a(vn4 vn4Var) {
        ux uxVar = vn4Var.f;
        ConcurrentHashMap concurrentHashMap = this.C;
        rub rubVar = (rub) concurrentHashMap.get(uxVar);
        if (rubVar == null) {
            rubVar = new rub(this, vn4Var);
            concurrentHashMap.put(uxVar, rubVar);
        }
        if (rubVar.c.o()) {
            this.E.add(uxVar);
        }
        rubVar.s();
        return rubVar;
    }

    public final boolean d() {
        int i;
        if (this.u) {
            return false;
        }
        qx8.a().getClass();
        SparseIntArray sparseIntArray = this.z.a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final boolean e(ax1 ax1Var, int i) {
        wn4 wn4Var = this.y;
        wn4Var.getClass();
        Context context = this.x;
        if (!ye5.a(context)) {
            int i2 = ax1Var.u;
            PendingIntent activity = ax1Var.v;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = wn4Var.a(context, null, i2);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.u;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                wn4Var.f(context, i2, PendingIntent.getActivity(context, 0, intent, jwb.a | 134217728));
                Integer num = ax1Var.x;
                int iIntValue = num == null ? -1 : num.intValue();
                hub hubVar = new hub(iIntValue, ax1Var.u, System.currentTimeMillis(), context.getPackageName(), false);
                if (wn4Var.c == null) {
                    wn4Var.c = new vwb(context, vwb.k, zw.c.a, vn4.a.c);
                }
                vwb vwbVar = wn4Var.c;
                vwbVar.getClass();
                s9a.a aVarA = s9a.a();
                aVarA.c = new fu3[]{ovb.b};
                aVarA.b = false;
                aVarA.a = new qib(hubVar);
                vwbVar.b(2, aVarA.a());
                return true;
            }
        }
        return false;
    }

    public final void f(ax1 ax1Var, int i) {
        if (e(ax1Var, i)) {
            return;
        }
        rwb rwbVar = this.F;
        rwbVar.sendMessage(rwbVar.obtainMessage(5, i, 0, ax1Var));
    }

    /* JADX WARN: Code duplicated, block: B:149:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:153:0x032c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0336  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v11 rub, still in use, count: 2, list:
          (r2v11 rub) from 0x02ea: IGET (r2v11 rub) A[WRAPPED] (LINE:747) rub.h int
          (r2v11 rub) from 0x02f0: PHI (r2 I:??) = (r2v8 rub), (r2v11 rub) binds: [B:147:0x02ef, B:200:0x02f0] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn4.handleMessage(android.os.Message):boolean");
    }
}
