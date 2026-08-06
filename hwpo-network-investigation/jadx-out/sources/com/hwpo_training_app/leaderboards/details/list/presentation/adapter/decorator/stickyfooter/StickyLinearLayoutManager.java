package com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListFragment$initAthletesRecycleView$1$1;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.LeaderboardDetailsAthletesAdapter;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator.stickyfooter.StickyHeaderHandler.AnonymousClass5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class StickyLinearLayoutManager extends LinearLayoutManager {
    public final AdapterDataProvider E;
    public final ArrayList F;
    public StickyHeaderHandler G;
    public ViewHolderFactory H;
    public int I;
    public AthletesListFragment$initAthletesRecycleView$1$1 J;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface StickyHeaderListener {
    }

    public StickyLinearLayoutManager(Context context, LeaderboardDetailsAthletesAdapter leaderboardDetailsAthletesAdapter) {
        super(context, 1, false);
        this.F = new ArrayList();
        this.I = -1;
        this.E = leaderboardDetailsAthletesAdapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void X(RecyclerView recyclerView) {
        this.H = new ViewHolderFactory(recyclerView);
        StickyHeaderHandler stickyHeaderHandler = new StickyHeaderHandler(recyclerView);
        this.G = stickyHeaderHandler;
        int i = this.I;
        if (i != -1) {
            stickyHeaderHandler.k = i;
        } else {
            stickyHeaderHandler.j = -1.0f;
            stickyHeaderHandler.k = -1;
        }
        stickyHeaderHandler.l = this.J;
        r1();
        this.G.f = this.F;
        t1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void Y(RecyclerView recyclerView) {
        StickyHeaderHandler stickyHeaderHandler = this.G;
        if (stickyHeaderHandler != null) {
            stickyHeaderHandler.a.getViewTreeObserver().removeOnGlobalLayoutListener(stickyHeaderHandler.e);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void j0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        super.j0(vVar, a0Var);
        r1();
        if (this.G != null) {
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void q0(RecyclerView.v vVar) {
        super.q0(vVar);
        StickyHeaderHandler stickyHeaderHandler = this.G;
        if (stickyHeaderHandler != null) {
            stickyHeaderHandler.c(stickyHeaderHandler.i);
        }
    }

    public final void r1() {
        ArrayList arrayList = this.F;
        arrayList.clear();
        List<?> listC = this.E.c();
        for (int i = 0; i < listC.size(); i++) {
            if (listC.get(i) instanceof StickyHeaderModel) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        StickyHeaderHandler stickyHeaderHandler = this.G;
        if (stickyHeaderHandler != null) {
            stickyHeaderHandler.f = arrayList;
        }
    }

    public final LinkedHashMap s1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < w(); i++) {
            View viewV = v(i);
            int iM = RecyclerView.o.M(viewV);
            if (this.F.contains(Integer.valueOf(iM))) {
                linkedHashMap.put(Integer.valueOf(iM), viewV);
            }
        }
        return linkedHashMap;
    }

    public final void t1() {
        StickyHeaderHandler stickyHeaderHandler = this.G;
        stickyHeaderHandler.g = this.p;
        stickyHeaderHandler.i = -1;
        stickyHeaderHandler.h = true;
        ((ViewGroup) stickyHeaderHandler.a.getParent()).post(stickyHeaderHandler.new AnonymousClass5(-1));
        this.G.d(W0(), s1(), this.H, V0() == this.E.c().size() - 1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int w0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int iW0 = super.w0(i, vVar, a0Var);
        if (Math.abs(iW0) > 0 && this.G != null) {
            this.G.d(W0(), s1(), this.H, V0() == this.E.c().size() - 1);
        }
        return iW0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void x0(int i) {
        l1(i, 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int y0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        StickyHeaderHandler stickyHeaderHandler;
        int iY0 = super.y0(i, vVar, a0Var);
        boolean z = V0() == this.E.c().size() - 1;
        if (Math.abs(iY0) > 0 && (stickyHeaderHandler = this.G) != null) {
            stickyHeaderHandler.d(W0(), s1(), this.H, z);
        }
        return iY0;
    }
}
