package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zn implements View.OnDragListener, f53 {
    public final i53 a = new i53(null);
    public final r30<k53> b = new r30<>(0);
    public final yn c = new yn(this);

    public zn(cm.h hVar) {
    }

    @Override // defpackage.f53
    public final boolean a(i53 i53Var) {
        return this.b.contains(i53Var);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        e53 e53Var = new e53(dragEvent);
        int action = dragEvent.getAction();
        r30<k53> r30Var = this.b;
        i53 i53Var = this.a;
        switch (action) {
            case 1:
                i53Var.getClass();
                cl8 cl8Var = new cl8();
                h53 h53Var = new h53(e53Var, i53Var, cl8Var);
                if (h53Var.invoke(i53Var) == sxa.t) {
                    yx.h(i53Var, h53Var);
                }
                boolean z = cl8Var.t;
                r30Var.getClass();
                r30.a aVar = new r30.a();
                while (aVar.hasNext()) {
                    ((k53) aVar.next()).f1(e53Var);
                }
                return z;
            case 2:
                i53Var.g1(e53Var);
                return false;
            case 3:
                return i53Var.I1(e53Var);
            case 4:
                i53Var.i0(e53Var);
                r30Var.clear();
                return false;
            case 5:
                i53Var.T(e53Var);
                return false;
            case 6:
                i53Var.V0(e53Var);
                return false;
            default:
                return false;
        }
    }
}
