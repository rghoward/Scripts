package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q6a extends vx6<z6a> {
    public final Object t;
    public final Object u;
    public final PointerInputEventHandler v;

    public q6a(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.t = obj;
        this.u = obj2;
        this.v = pointerInputEventHandler;
    }

    @Override // defpackage.vx6
    public final ox6.c a() {
        return new z6a(this.t, this.u, this.v);
    }

    @Override // defpackage.vx6
    public final void b(ox6.c cVar) {
        z6a z6aVar = (z6a) cVar;
        Object obj = z6aVar.H;
        Object obj2 = this.t;
        boolean z = !xj5.a(obj, obj2);
        z6aVar.H = obj2;
        Object obj3 = z6aVar.I;
        Object obj4 = this.u;
        if (!xj5.a(obj3, obj4)) {
            z = true;
        }
        z6aVar.I = obj4;
        Class<?> cls = z6aVar.J.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.v;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            z6aVar.O1();
        }
        z6aVar.J = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6a)) {
            return false;
        }
        q6a q6aVar = (q6a) obj;
        return xj5.a(this.t, q6aVar.t) && xj5.a(this.u, q6aVar.u) && this.v == q6aVar.v;
    }

    public final int hashCode() {
        Object obj = this.t;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.u;
        return this.v.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
