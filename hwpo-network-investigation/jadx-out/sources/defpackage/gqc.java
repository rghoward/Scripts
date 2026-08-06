package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gqc {
    public static UserManager a = null;
    public static volatile boolean b = false;

    /* JADX WARN: Type inference failed for: r4v0, types: [eqc, w40] */
    public static b1 a(final Context context, final Callable callable, Executor executor) {
        ?? r4 = new w40() { // from class: eqc
            @Override // defpackage.w40
            public final ListenableFuture call() {
                kya kyaVar = new kya(callable);
                y03.t.execute(kyaVar);
                return kyaVar;
            }
        };
        if (b(context)) {
            kya kyaVar = new kya();
            kyaVar.B = new kya.a(r4);
            executor.execute(kyaVar);
            return kyaVar;
        }
        final mk9 mk9Var = new mk9();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final bqc bqcVar = new bqc(atomicBoolean, context, mk9Var, r4, executor);
        context.registerReceiver(bqcVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!b(context) || !atomicBoolean.compareAndSet(false, true)) {
            mk9Var.Q(new Runnable() { // from class: cqc
                @Override // java.lang.Runnable
                public final void run() {
                    mk9 mk9Var2 = mk9Var;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    Context context2 = context;
                    bqc bqcVar2 = bqcVar;
                    if ((mk9Var2.t instanceof b1.b) && atomicBoolean2.compareAndSet(false, true)) {
                        try {
                            context2.unregisterReceiver(bqcVar2);
                        } catch (IllegalArgumentException e) {
                            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
                        }
                    }
                }
            }, y03.t);
            return mk9Var;
        }
        try {
            context.unregisterReceiver(bqcVar);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        kya kyaVar2 = new kya();
        kyaVar2.B = new kya.a(r4);
        executor.execute(kyaVar2);
        mk9Var.n(kyaVar2);
        return mk9Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    public static boolean b(Context context) {
        if (b) {
            return true;
        }
        synchronized (gqc.class) {
            try {
                if (b) {
                    return true;
                }
                int i = 1;
                while (true) {
                    boolean z = false;
                    if (i <= 2) {
                        if (a == null) {
                            a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = a;
                        if (userManager == null) {
                            z = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z = true;
                                }
                            } catch (NullPointerException e) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                a = null;
                                i++;
                            }
                        }
                        if (z) {
                            b = true;
                        }
                        return z;
                    }
                    if (z) {
                        a = null;
                    }
                    if (z) {
                        b = true;
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
