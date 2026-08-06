package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wxa<T> implements Iterator<T>, zn5 {
    public final ArrayList t = new ArrayList();
    public Iterator<? extends T> u;

    public wxa(chb chbVar) {
        this.u = chbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.u.hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final T next() {
        T next = this.u.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        chb chbVar = viewGroup != null ? new chb(viewGroup) : null;
        ArrayList arrayList = this.t;
        if (chbVar != null && chbVar.hasNext()) {
            arrayList.add(this.u);
            this.u = chbVar;
            return next;
        }
        while (!this.u.hasNext() && !arrayList.isEmpty()) {
            this.u = (Iterator) th1.G(arrayList);
            rh1.r(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
