package com.hwpo_training_app.leaderboards.list.common.presentation.adapter.decorator;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.leaderboards.list.common.presentation.adapter.LeaderboardsListAdapter;
import defpackage.u;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class LeaderboardItemDecorator extends RecyclerView.n {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LeaderboardsListAdapter.ViewType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LeaderboardItemDecorator(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
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
        int iOrdinal = LeaderboardsListAdapter.ViewType.values()[adapter.h(iM)].ordinal();
        if (iOrdinal == 0) {
            i = this.d;
        } else {
            if (iOrdinal != 1) {
                u.b();
                return;
            }
            i = this.e;
        }
        int i2 = this.a;
        int i3 = this.b;
        if (iM == 0) {
            rect.set(i2, this.c, i3, i);
        } else if (iM == adapter.f() - 1) {
            rect.set(i2, 0, i3, i);
        } else {
            rect.set(i2, 0, i3, i);
        }
    }
}
