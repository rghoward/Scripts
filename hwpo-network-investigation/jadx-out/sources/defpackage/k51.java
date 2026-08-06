package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k51 extends s {
    public final /* synthetic */ CarouselLayoutManager q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k51(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.q = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public final PointF a(int i) {
        return this.q.a(i);
    }

    @Override // androidx.recyclerview.widget.s
    public final int h(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.q;
        if (carouselLayoutManager.u == null || !carouselLayoutManager.X0()) {
            return 0;
        }
        int iM = RecyclerView.o.M(view);
        return (int) (carouselLayoutManager.p - carouselLayoutManager.U0(iM, carouselLayoutManager.T0(iM)));
    }

    @Override // androidx.recyclerview.widget.s
    public final int i(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.q;
        if (carouselLayoutManager.u == null || carouselLayoutManager.X0()) {
            return 0;
        }
        int iM = RecyclerView.o.M(view);
        return (int) (carouselLayoutManager.p - carouselLayoutManager.U0(iM, carouselLayoutManager.T0(iM)));
    }
}
