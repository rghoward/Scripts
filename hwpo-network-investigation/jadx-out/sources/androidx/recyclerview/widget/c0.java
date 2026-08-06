package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final /* synthetic */ RecyclerView a;

    public c0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(a.C0026a c0026a) {
        int i = c0026a.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.G.e0(c0026a.b, c0026a.c);
            return;
        }
        if (i == 2) {
            recyclerView.G.h0(c0026a.b, c0026a.c);
        } else if (i == 4) {
            recyclerView.G.i0(c0026a.b, c0026a.c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.G.g0(c0026a.b, c0026a.c);
        }
    }

    public final RecyclerView.e0 b(int i) {
        RecyclerView recyclerView = this.a;
        RecyclerView.e0 e0VarI = recyclerView.I(i, true);
        if (e0VarI != null) {
            f fVar = recyclerView.y;
            if (!fVar.c.contains(e0VarI.a)) {
                return e0VarI;
            }
            if (RecyclerView.X0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public final void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.y.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iH; i6++) {
            View viewG = recyclerView.y.g(i6);
            RecyclerView.e0 e0VarO = RecyclerView.O(viewG);
            if (e0VarO != null && !e0VarO.q() && (i4 = e0VarO.c) >= i && i4 < i5) {
                e0VarO.a(2);
                e0VarO.a(1024);
                ((RecyclerView.p) viewG.getLayoutParams()).c = true;
            }
        }
        RecyclerView.v vVar = recyclerView.v;
        ArrayList<RecyclerView.e0> arrayList = vVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecyclerView.e0 e0Var = arrayList.get(size);
            if (e0Var != null && (i3 = e0Var.c) >= i && i3 < i5) {
                e0Var.a(2);
                vVar.h(size);
            }
        }
        recyclerView.F0 = true;
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.y.h();
        for (int i3 = 0; i3 < iH; i3++) {
            RecyclerView.e0 e0VarO = RecyclerView.O(recyclerView.y.g(i3));
            if (e0VarO != null && !e0VarO.q() && e0VarO.c >= i) {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + e0VarO + " now at position " + (e0VarO.c + i2));
                }
                e0VarO.n(i2, false);
                recyclerView.B0.f = true;
            }
        }
        ArrayList<RecyclerView.e0> arrayList = recyclerView.v.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.e0 e0Var = arrayList.get(i4);
            if (e0Var != null && e0Var.c >= i) {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + e0Var + " now at position " + (e0Var.c + i2));
                }
                e0Var.n(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.E0 = true;
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.y.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.e0 e0VarO = RecyclerView.O(recyclerView.y.g(i11));
            if (e0VarO != null && (i9 = e0VarO.c) >= i4 && i9 <= i3) {
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + e0VarO);
                }
                if (e0VarO.c == i) {
                    e0VarO.n(i2 - i, false);
                } else {
                    e0VarO.n(i5, false);
                }
                recyclerView.B0.f = true;
            }
        }
        ArrayList<RecyclerView.e0> arrayList = recyclerView.v.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.e0 e0Var = arrayList.get(i12);
            if (e0Var != null && (i8 = e0Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    e0Var.n(i2 - i, false);
                } else {
                    e0Var.n(i10, false);
                }
                if (RecyclerView.X0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + e0Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.E0 = true;
    }
}
