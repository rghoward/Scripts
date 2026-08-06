package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x3c implements Iterator {
    public int t;
    public boolean u;
    public Iterator v;
    public final /* synthetic */ z3c w;

    public /* synthetic */ x3c(z3c z3cVar) {
        Objects.requireNonNull(z3cVar);
        this.w = z3cVar;
        this.t = -1;
    }

    public final Iterator a() {
        if (this.v == null) {
            this.v = this.w.v.entrySet().iterator();
        }
        return this.v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.t + 1;
        z3c z3cVar = this.w;
        if (i >= z3cVar.u) {
            return !z3cVar.v.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.u = true;
        int i = this.t + 1;
        this.t = i;
        z3c z3cVar = this.w;
        return i < z3cVar.u ? (w3c) z3cVar.t[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.u) {
            aa0.c("remove() was called before next()");
            return;
        }
        this.u = false;
        z3c z3cVar = this.w;
        z3cVar.g();
        int i = this.t;
        if (i >= z3cVar.u) {
            a().remove();
        } else {
            this.t = i - 1;
            z3cVar.e(i);
        }
    }
}
