package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kg1 extends BroadcastReceiver {
    public static SoftReference a;
    public static SoftReference b;

    public abstract int a(Context context, jg1 jg1Var);

    public final int c(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (kg1.class) {
            try {
                SoftReference softReference = a;
                ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new i47("firebase-iid-executor")));
                    a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new Runnable() { // from class: kic
            @Override // java.lang.Runnable
            public final void run() {
                Executor executorUnconfigurableExecutorService;
                int iC;
                kg1 kg1Var = this.t;
                Intent intent2 = intent;
                final Context context2 = context;
                boolean z = zIsOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent3 != null) {
                        iC = kg1Var.c(context2, intent3);
                    } else if (intent2.getExtras() == null) {
                        iC = 500;
                    } else {
                        final jg1 jg1Var = new jg1(intent2);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (kg1.class) {
                            try {
                                SoftReference softReference2 = kg1.b;
                                executorUnconfigurableExecutorService = softReference2 != null ? (Executor) softReference2.get() : null;
                                if (executorUnconfigurableExecutorService == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i47("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    kg1.b = new SoftReference(executorUnconfigurableExecutorService);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        executorUnconfigurableExecutorService.execute(new Runnable() { // from class: hgc
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i;
                                q6d q6dVarB;
                                jg1 jg1Var2 = jg1Var;
                                Intent intent4 = jg1Var2.t;
                                String stringExtra = intent4.getStringExtra("google.message_id");
                                if (stringExtra == null) {
                                    stringExtra = intent4.getStringExtra("message_id");
                                }
                                if (TextUtils.isEmpty(stringExtra)) {
                                    q6dVarB = caa.e(null);
                                } else {
                                    Bundle bundle = new Bundle();
                                    Intent intent5 = jg1Var2.t;
                                    String stringExtra2 = intent5.getStringExtra("google.message_id");
                                    if (stringExtra2 == null) {
                                        stringExtra2 = intent5.getStringExtra("message_id");
                                    }
                                    bundle.putString("google.message_id", stringExtra2);
                                    Intent intent6 = jg1Var2.t;
                                    Integer numValueOf = intent6.hasExtra("google.product_id") ? Integer.valueOf(intent6.getIntExtra("google.product_id", 0)) : null;
                                    if (numValueOf != null) {
                                        bundle.putInt("google.product_id", numValueOf.intValue());
                                    }
                                    Context context3 = context2;
                                    bundle.putBoolean("supports_message_handled", true);
                                    q5d q5dVarA = q5d.a(context3);
                                    synchronized (q5dVarA) {
                                        i = q5dVarA.d;
                                        q5dVarA.d = i + 1;
                                    }
                                    q6dVarB = q5dVarA.b(new t1d(i, 2, bundle));
                                }
                                final CountDownLatch countDownLatch2 = countDownLatch;
                                q6dVarB.c(rdc.t, new fh7() { // from class: xec
                                    @Override // defpackage.fh7
                                    public final void b(r9a r9aVar) {
                                        countDownLatch2.countDown();
                                    }
                                });
                            }
                        });
                        int iA = kg1Var.a(context2, jg1Var);
                        try {
                            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                Log.w("CloudMessagingReceiver", "Message ack timed out");
                            }
                        } catch (InterruptedException e) {
                            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                        }
                        iC = iA;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iC);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                } catch (Throwable th3) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th3;
                }
            }
        });
    }

    public void b(Bundle bundle) {
    }
}
