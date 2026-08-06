package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q92 implements n92 {
    public static final a c = new a();
    public final tv2<n92> a;
    public final AtomicReference<n92> b = new AtomicReference<>(null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements l47 {
    }

    public q92(tv2<n92> tv2Var) {
        this.a = tv2Var;
        ((wk7) tv2Var).a(new tv2.a() { // from class: o92
            @Override // tv2.a
            public final void a(of8 of8Var) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                this.a.b.set((n92) of8Var.get());
            }
        });
    }

    @Override // defpackage.n92
    public final l47 a(String str) {
        n92 n92Var = this.b.get();
        return n92Var == null ? c : n92Var.a(str);
    }

    @Override // defpackage.n92
    public final boolean b() {
        n92 n92Var = this.b.get();
        return n92Var != null && n92Var.b();
    }

    @Override // defpackage.n92
    public final boolean c(String str) {
        n92 n92Var = this.b.get();
        return n92Var != null && n92Var.c(str);
    }

    @Override // defpackage.n92
    public final void d(final String str, final long j, final ze0 ze0Var) {
        String strA = ct1.a("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strA, null);
        }
        ((wk7) this.a).a(new tv2.a() { // from class: p92
            @Override // tv2.a
            public final void a(of8 of8Var) {
                ((n92) of8Var.get()).d(str, j, ze0Var);
            }
        });
    }
}
