package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import ea7.d;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ea7 {
    public static ea7 f;
    public final Executor a;
    public final CopyOnWriteArrayList<c> b;
    public final Object c;
    public int d;
    public boolean e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {

        /* JADX INFO: renamed from: ea7$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0080a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            public final ea7 a;

            public C0080a(ea7 ea7Var) {
                this.a = ea7Var;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.a.c(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(ea7 ea7Var, Context context) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(AttributeType.PHONE);
                telephonyManager.getClass();
                C0080a c0080a = new C0080a(ea7Var);
                telephonyManager.registerTelephonyCallback(ea7Var.a, c0080a);
                telephonyManager.unregisterTelephonyCallback(c0080a);
            } catch (RuntimeException unused) {
                ea7Var.c(5);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        void a(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c {
        public final WeakReference<b> a;
        public final Executor b;

        public c(gq2 gq2Var, Executor executor) {
            this.a = new WeakReference<>(gq2Var);
            this.b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, Intent intent) {
            ea7.this.a.execute(new Runnable() { // from class: ga7
                /* JADX WARN: Code duplicated, block: B:20:0x003b  */
                /* JADX WARN: Code duplicated, block: B:21:0x003d  */
                /* JADX WARN: Code duplicated, block: B:22:0x003f  */
                /* JADX WARN: Code duplicated, block: B:24:0x0046  */
                /* JADX WARN: Code duplicated, block: B:25:0x0048  */
                /* JADX WARN: Code duplicated, block: B:27:0x004e  */
                /* JADX WARN: Code duplicated, block: B:28:0x0050  */
                /* JADX WARN: Code duplicated, block: B:29:0x0052  */
                @Override // java.lang.Runnable
                public final void run() {
                    ea7 ea7Var = ea7.this;
                    Context context2 = context;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                    int i = 0;
                    if (connectivityManager != null) {
                        try {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                                i = 1;
                            } else {
                                int type = activeNetworkInfo.getType();
                                if (type == 0) {
                                    switch (activeNetworkInfo.getSubtype()) {
                                        case 1:
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                        case 12:
                                        case 14:
                                        case h4c.e /* 15 */:
                                        case 17:
                                            i = 4;
                                            break;
                                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            i = 5;
                                            break;
                                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                                        case 19:
                                        default:
                                            i = 6;
                                            break;
                                        case 18:
                                            i = 2;
                                            break;
                                        case InboxPagingSource.PAGE_SIZE /* 20 */:
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                i = 9;
                                            }
                                            break;
                                    }
                                } else if (type == 1) {
                                    i = 2;
                                } else if (type == 4 || type == 5) {
                                    switch (activeNetworkInfo.getSubtype()) {
                                        case 1:
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                        case 12:
                                        case 14:
                                        case h4c.e /* 15 */:
                                        case 17:
                                            i = 4;
                                            break;
                                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            i = 5;
                                            break;
                                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                                        case 19:
                                        default:
                                            i = 6;
                                            break;
                                        case 18:
                                            i = 2;
                                            break;
                                        case InboxPagingSource.PAGE_SIZE /* 20 */:
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                i = 9;
                                            }
                                            break;
                                    }
                                } else if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                } else {
                                    i = 5;
                                }
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    if (Build.VERSION.SDK_INT < 31 || i != 5) {
                        ea7Var.c(i);
                    } else {
                        ea7.a.a(ea7Var, context2);
                    }
                }
            });
        }
    }

    public ea7(final Context context) {
        Executor executorA = fi0.a();
        this.a = executorA;
        this.b = new CopyOnWriteArrayList<>();
        this.c = new Object();
        this.d = 0;
        executorA.execute(new Runnable() { // from class: da7
            @Override // java.lang.Runnable
            public final void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(this.t.new d(), intentFilter);
            }
        });
    }

    public static synchronized ea7 a(Context context) {
        try {
            if (f == null) {
                f = new ea7(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.b;
        for (c cVar : copyOnWriteArrayList) {
            if (cVar.a.get() == null) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (c cVar2 : this.b) {
                    cVar2.b.execute(new fa7(cVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
