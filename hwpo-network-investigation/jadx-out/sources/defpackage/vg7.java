package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vg7 {
    private boolean isEnabled;
    private final List<a> eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends g87<i87> {
        public final vg7 f;
        public boolean g;

        public a(vg7 vg7Var, i87 i87Var) {
            super(i87Var, vg7Var.isEnabled());
            this.f = vg7Var;
            this.g = true;
        }

        @Override // defpackage.g87
        public final void a() {
            this.f.handleOnBackCancelled();
        }

        @Override // defpackage.g87
        public final void b() {
            this.f.handleOnBackPressed();
        }

        @Override // defpackage.g87
        public final void c(d87 d87Var) {
            this.f.handleOnBackProgressed(new gh0(d87Var));
        }

        @Override // defpackage.g87
        public final void d(d87 d87Var) {
            d87Var.getClass();
            this.f.handleOnBackStarted(new gh0(d87Var));
        }

        public final void g(boolean z) {
            this.g = z;
            f(z && this.f.isEnabled());
        }
    }

    public vg7(boolean z) {
        this.isEnabled = z;
    }

    public final void addCloseable$activity(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        this.closeables.add(autoCloseable);
    }

    public final a createNavigationEventHandler$activity(i87 i87Var) {
        i87Var.getClass();
        a aVar = new a(this, i87Var);
        this.eventHandlers.add(aVar);
        return aVar;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(gh0 gh0Var) {
        gh0Var.getClass();
    }

    public void handleOnBackStarted(gh0 gh0Var) {
        gh0Var.getClass();
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() throws Exception {
        boolean zIsTerminated;
        Iterator<AutoCloseable> it = this.closeables.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable next = it.next();
            if (next instanceof AutoCloseable) {
                next.close();
            } else if (next instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) next;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (next instanceof TypedArray) {
                ((TypedArray) next).recycle();
            } else if (next instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) next).release();
            } else {
                if (!(next instanceof MediaDrm)) {
                    zn3.b();
                    return;
                }
                ((MediaDrm) next).release();
            }
        }
        this.closeables.clear();
        Iterator<a> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().e();
        }
        this.eventHandlers.clear();
    }

    public final void removeCloseable$activity(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        this.closeables.remove(autoCloseable);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        for (a aVar : this.eventHandlers) {
            aVar.f(aVar.g && z);
        }
    }

    public void handleOnBackCancelled() {
    }
}
