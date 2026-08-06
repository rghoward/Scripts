package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn3 implements of8 {
    @Override // defpackage.of8
    public final Object get() {
        ts5<ScheduledExecutorService> ts5Var = ExecutorsRegistrar.a;
        return new tw2(Executors.newCachedThreadPool(new sd2("Firebase Blocking", 11, null)), ExecutorsRegistrar.d.get());
    }
}
