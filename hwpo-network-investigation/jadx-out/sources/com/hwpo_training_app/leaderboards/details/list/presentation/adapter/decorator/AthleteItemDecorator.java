package com.hwpo_training_app.leaderboards.details.list.presentation.adapter.decorator;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.leaderboards.details.list.presentation.adapter.LeaderboardDetailsAthletesAdapter;
import defpackage.u;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AthleteItemDecorator extends RecyclerView.n {
    public final int a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LeaderboardDetailsAthletesAdapter.ViewType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AthleteItemDecorator(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.f adapter;
        int i;
        rect.getClass();
        view.getClass();
        a0Var.getClass();
        super.f(rect, view, recyclerView, a0Var);
        int iM = RecyclerView.M(view);
        if (iM == -1 || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int iOrdinal = LeaderboardDetailsAthletesAdapter.ViewType.values()[adapter.h(iM)].ordinal();
        if (iOrdinal == 0) {
            i = this.a;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                u.b();
                return;
            }
            i = 0;
        }
        int i2 = this.b;
        if (iM == 0) {
            rect.set(i, i2, i, i2);
        } else if (iM == adapter.f() - 1) {
            rect.set(i, 0, i, i2);
        } else {
            rect.set(i, 0, i, i2);
        }
    }
}
