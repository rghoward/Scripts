package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0d implements Runnable {
    public final /* synthetic */ ListenableFuture t;

    public /* synthetic */ f0d(ListenableFuture listenableFuture) {
        this.t = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        try {
            ti4.i1(this.t);
        } catch (ExecutionException e) {
            kr5.c().post(new Runnable() { // from class: e0d
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    throw new RuntimeException(e.getCause());
                }
            });
        }
    }
}
