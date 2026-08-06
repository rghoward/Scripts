package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import defpackage.aa0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends RecyclerView.r {
    public RecyclerView a;
    public Scroller b;
    public final a c = new a();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends RecyclerView.t {
        public boolean a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.a) {
                this.a = false;
                g0.this.f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.a = true;
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.c;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.D0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                aa0.c("An instance of OnFlingListener already set.");
                return;
            }
            this.a.i(aVar);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            f();
        }
    }

    public abstract int[] b(RecyclerView.o oVar, View view);

    public RecyclerView.z c(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.z.b) {
            return new h0(this, this.a.getContext());
        }
        return null;
    }

    public abstract View d(RecyclerView.o oVar);

    public abstract int e(RecyclerView.o oVar, int i, int i2);

    public final void f() {
        RecyclerView.o layoutManager;
        View viewD;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewD = d(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewD);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.a.l0(i, false, iArrB[1]);
    }
}
