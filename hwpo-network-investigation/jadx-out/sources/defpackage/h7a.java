package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class h7a extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ RecyclerView.e0 t;
    public final /* synthetic */ g7a u;

    public h7a(g7a g7aVar, RecyclerView.e0 e0Var) {
        this.t = e0Var;
        this.u = g7aVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        int iC = this.t.c();
        Integer numValueOf = Integer.valueOf(iC);
        if (iC == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return false;
        }
        this.u.e.b(numValueOf.intValue());
        return false;
    }
}
