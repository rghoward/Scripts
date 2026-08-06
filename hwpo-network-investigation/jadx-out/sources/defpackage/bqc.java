package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bqc extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ mk9 c;
    public final /* synthetic */ eqc d;
    public final /* synthetic */ Executor e;

    public bqc(AtomicBoolean atomicBoolean, Context context, mk9 mk9Var, eqc eqcVar, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = mk9Var;
        this.d = eqcVar;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            mk9 mk9Var = this.c;
            eqc eqcVar = this.d;
            Executor executor = this.e;
            kya kyaVar = new kya();
            kyaVar.B = new kya.a(eqcVar);
            executor.execute(kyaVar);
            mk9Var.n(kyaVar);
        }
    }
}
