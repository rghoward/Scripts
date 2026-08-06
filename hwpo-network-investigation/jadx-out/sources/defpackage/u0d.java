package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u0d {
    public final Context a;
    public final l5a b;
    public final l5a c;
    public final l5a d;
    public volatile int e = 0;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Object g = new Object();
    public volatile ListenableFuture h = null;

    public u0d(Context context, l5a l5aVar, l5a l5aVar2, l5a l5aVar3) {
        this.a = context;
        this.b = l5aVar;
        this.c = l5aVar2;
        this.d = l5aVar3;
    }
}
