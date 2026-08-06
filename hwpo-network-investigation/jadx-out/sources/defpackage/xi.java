package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xi {
    public volatile yi a;
    public volatile uv0 b;
    public final ArrayList c;

    public xi(tv2<si> tv2Var) {
        f13 f13Var = new f13();
        u00 u00Var = new u00();
        this.b = f13Var;
        this.c = new ArrayList();
        this.a = u00Var;
        ((wk7) tv2Var).a(new tv2.a() { // from class: wi
            @Override // tv2.a
            public final void a(of8 of8Var) {
                xi xiVar = this.a;
                zd6 zd6Var = zd6.t;
                zd6Var.c("AnalyticsConnector now available.");
                si siVar = (si) of8Var.get();
                r92 r92Var = new r92(siVar);
                r82 r82Var = new r82();
                er5 er5VarC = siVar.c("clx", r82Var);
                if (er5VarC == null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
                    }
                    er5VarC = siVar.c("crash", r82Var);
                    if (er5VarC != null) {
                        Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
                    }
                }
                if (er5VarC == null) {
                    zd6Var.f("Could not register Firebase Analytics listener; a listener is already registered.", null);
                    return;
                }
                zd6Var.c("Registered Firebase Analytics listener.");
                sv0 sv0Var = new sv0();
                ir0 ir0Var = new ir0(r92Var);
                synchronized (xiVar) {
                    try {
                        ArrayList arrayList = xiVar.c;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            sv0Var.a((tv0) obj);
                        }
                        r82Var.b = sv0Var;
                        r82Var.a = ir0Var;
                        xiVar.b = sv0Var;
                        xiVar.a = ir0Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }
}
