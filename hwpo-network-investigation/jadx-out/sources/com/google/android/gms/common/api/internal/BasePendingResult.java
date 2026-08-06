package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import defpackage.a78;
import defpackage.bv8;
import defpackage.cv7;
import defpackage.cv8;
import defpackage.d43;
import defpackage.dm8;
import defpackage.rwb;
import defpackage.wwb;
import defpackage.ywb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends bv8> extends cv7<R> {
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public bv8 d;
    public boolean e;
    private ywb resultGuardian;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<R extends bv8> extends rwb {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("BasePendingResult", d43.a(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).b(Status.y);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            cv8 cv8Var = (cv8) pair.first;
            bv8 bv8Var = (bv8) pair.second;
            try {
                cv8Var.a();
            } catch (RuntimeException e) {
                BasePendingResult.e(bv8Var);
                throw e;
            }
        }
    }

    static {
        new wwb();
    }

    @Deprecated
    public BasePendingResult() {
        new AtomicReference();
        new a(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void e(bv8 bv8Var) {
        if (bv8Var instanceof dm8) {
            try {
                ((dm8) bv8Var).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(bv8Var)), e);
            }
        }
    }

    public abstract bv8 a();

    @Deprecated
    public final void b(Status status) {
        synchronized (this.a) {
            try {
                if (!(this.b.getCount() == 0)) {
                    c(a());
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(R r) {
        synchronized (this.a) {
            try {
                if (this.e) {
                    e(r);
                    return;
                }
                this.b.getCount();
                a78.i("Results have already been set", !(this.b.getCount() == 0));
                d(r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(bv8 bv8Var) {
        this.d = bv8Var;
        bv8Var.f();
        this.b.countDown();
        if (this.d instanceof dm8) {
            this.resultGuardian = new ywb(this);
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cv7.a) arrayList.get(i)).onComplete();
        }
        arrayList.clear();
    }
}
