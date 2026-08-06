package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uw2<V> extends o2<V> implements ScheduledFuture<V> {
    public final ScheduledFuture<?> A;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a {
        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<T> {
        ScheduledFuture a(a aVar);
    }

    public uw2(b<V> bVar) {
        this.A = bVar.a(new a());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.A.compareTo(delayed);
    }

    @Override // defpackage.o2
    public final void e() {
        ScheduledFuture<?> scheduledFuture = this.A;
        Object obj = this.t;
        scheduledFuture.cancel((obj instanceof o2.b) && ((o2.b) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.A.getDelay(timeUnit);
    }
}
