package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class chb implements Iterator<View>, zn5 {
    public int t;
    public final /* synthetic */ ViewGroup u;

    public chb(ViewGroup viewGroup) {
        this.u = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.t < this.u.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i = this.t;
        this.t = i + 1;
        View childAt = this.u.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.t - 1;
        this.t = i;
        this.u.removeViewAt(i);
    }
}
