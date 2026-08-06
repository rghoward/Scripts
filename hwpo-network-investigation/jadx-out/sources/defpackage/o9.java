package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o9<I, O> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> {
        public final Serializable a;

        public a(Serializable serializable) {
            this.a = serializable;
        }
    }

    public abstract Intent createIntent(Context context, I i);

    public a<O> getSynchronousResult(Context context, I i) {
        context.getClass();
        return null;
    }

    public abstract O parseResult(int i, Intent intent);
}
