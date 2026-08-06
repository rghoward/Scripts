package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.g7a;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {
    public final /* synthetic */ p.c t;
    public final /* synthetic */ a0 u;

    public z(p.c cVar, a0 a0Var, int i) {
        this.t = cVar;
        this.u = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.c cVar = this.t;
        final RecyclerView.e0 e0Var = cVar.e;
        boolean z = e0Var.b() != -1;
        a0 a0Var = this.u;
        RecyclerView recyclerView = a0Var.r;
        if (recyclerView == null || !recyclerView.M || cVar.k || !z) {
            return;
        }
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.k()) {
            ArrayList arrayList = a0Var.p;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((p.f) arrayList.get(i)).l) {
                }
            }
            final g7a g7aVar = a0Var.m;
            g7aVar.getClass();
            e0Var.getClass();
            int i2 = g7aVar.k;
            if (i2 != -1 && i2 != e0Var.c()) {
                g7aVar.e.a(g7aVar.k);
            }
            Object parent = e0Var.a.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: f7a
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        view2.getClass();
                        motionEvent.getClass();
                        g7a g7aVar2 = g7aVar;
                        Rect rect = g7aVar2.f;
                        if (rect == null) {
                            xj5.e("bgRect");
                            throw null;
                        }
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            return false;
                        }
                        new GestureDetector(view2.getContext(), new h7a(g7aVar2, e0Var)).onTouchEvent(motionEvent);
                        return false;
                    }
                });
            }
            g7aVar.k = e0Var.c();
            return;
        }
        a0Var.r.post(this);
    }
}
