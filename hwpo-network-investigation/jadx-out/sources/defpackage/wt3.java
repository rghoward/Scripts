package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wt3 {
    public static final Object c = new Object();
    public static nob d;
    public final Context a;
    public final ql6 b = new ql6();

    public wt3(Context context) {
        this.a = context;
    }

    public static r9a<Integer> a(Context context, final Intent intent, boolean z) {
        nob nobVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new nob(context);
                }
                nobVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return nobVar.b(intent).g(new ql6(), new vp2());
        }
        if (be9.a().c(context)) {
            synchronized (zjb.a) {
                try {
                    zjb.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        zjb.b.a();
                    }
                    nobVar.b(intent).b(new fh7() { // from class: yjb
                        @Override // defpackage.fh7
                        public final void b(r9a r9aVar) {
                            zjb.b(intent);
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            nobVar.b(intent);
        }
        return caa.e(-1);
    }

    public final r9a<Integer> b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zA = f28.a();
        final Context context = this.a;
        boolean z = zA && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return a(context, intent, z2);
        }
        Callable callable = new Callable() { // from class: ut3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                be9 be9VarA = be9.a();
                be9VarA.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                be9VarA.d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (be9VarA) {
                    try {
                        str = be9VarA.a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + AgentHeaderCreator.AGENT_DIVIDER + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    be9VarA.a = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    be9VarA.a = serviceInfo.name;
                                }
                                str = be9VarA.a;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (be9VarA.c(context2)) {
                        componentNameStartService = zjb.c(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        };
        ql6 ql6Var = this.b;
        return caa.c(ql6Var, callable).h(ql6Var, new s02() { // from class: vt3
            @Override // defpackage.s02
            public final Object a(r9a r9aVar) {
                return (f28.a() && ((Integer) r9aVar.j()).intValue() == 402) ? wt3.a(context, intent, z2).g(new ql6(), new sk0()) : r9aVar;
            }
        });
    }
}
