package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.wfb;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ya<T, V extends wfb> extends RecyclerView.e0 {
    public final V u;
    public Object v;
    public final Context w;
    public oh4<? super List<? extends Object>, g2b> x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a a = new a();
    }

    public ya() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ya(wfb wfbVar) {
        View root = wfbVar.getRoot();
        root.getClass();
        wfbVar.getClass();
        super(root);
        this.u = wfbVar;
        this.v = a.a;
        Context context = root.getContext();
        context.getClass();
        this.w = context;
    }

    public final void s(oh4<? super List<? extends Object>, g2b> oh4Var) {
        if (this.x == null) {
            this.x = oh4Var;
        } else {
            aa0.c("bind { ... } is already defined. Only one bind { ... } is allowed.");
        }
    }

    public final T t() {
        T t = (T) this.v;
        if (t != a.a) {
            return t;
        }
        z90.a("Item has not been set yet. That is an internal issue. Please report at https://github.com/sockeqwe/AdapterDelegates");
        return null;
    }
}
