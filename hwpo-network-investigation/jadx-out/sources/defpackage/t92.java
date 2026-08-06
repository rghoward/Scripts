package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t92 implements jx8 {
    public final u5b a;

    public t92(u5b u5bVar) {
        this.a = u5bVar;
    }

    @Override // defpackage.jx8
    public final void a(ue0 ue0Var) {
        final u5b u5bVar = this.a;
        HashSet<fx8> hashSet = ue0Var.a;
        hashSet.getClass();
        ArrayList arrayList = new ArrayList(ph1.n(hashSet, 10));
        for (fx8 fx8Var : hashSet) {
            String strC = fx8Var.c();
            String strA = fx8Var.a();
            String strB = fx8Var.b();
            String strE = fx8Var.e();
            long jD = fx8Var.d();
            cm5 cm5Var = gx8.a;
            if (strB.length() > 256) {
                strB = strB.substring(0, 256);
            }
            arrayList.add(new te0(strC, strA, strB, strE, jD));
        }
        synchronized (u5bVar.f) {
            try {
                if (u5bVar.f.b(arrayList)) {
                    final List<gx8> listA = u5bVar.f.a();
                    u5bVar.b.b.a(new Runnable() { // from class: t5b
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            u5b u5bVar2 = u5bVar;
                            u5bVar2.a.i(u5bVar2.c, listA);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
