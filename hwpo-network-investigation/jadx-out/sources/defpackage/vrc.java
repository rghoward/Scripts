package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vrc implements l5a {
    public static final /* synthetic */ vrc t = new vrc();

    @Override // defpackage.l5a
    public final Object get() {
        Object obj = lrc.j;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(trc.a);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof ib6 ? (ib6) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new hy6.b(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }
}
