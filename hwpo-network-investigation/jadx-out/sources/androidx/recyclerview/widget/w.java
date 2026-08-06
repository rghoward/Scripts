package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends x {
    @Override // androidx.recyclerview.widget.x
    public final int b(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.A(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.x
    public final int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.D(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.x
    public final int d(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.E(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.x
    public final int e(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        this.a.getClass();
        return RecyclerView.o.G(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin;
    }

    @Override // androidx.recyclerview.widget.x
    public final int f() {
        return this.a.o;
    }

    @Override // androidx.recyclerview.widget.x
    public final int g() {
        RecyclerView.o oVar = this.a;
        return oVar.o - oVar.I();
    }

    @Override // androidx.recyclerview.widget.x
    public final int h() {
        return this.a.I();
    }

    @Override // androidx.recyclerview.widget.x
    public final int i() {
        return this.a.m;
    }

    @Override // androidx.recyclerview.widget.x
    public final int j() {
        return this.a.l;
    }

    @Override // androidx.recyclerview.widget.x
    public final int k() {
        return this.a.L();
    }

    @Override // androidx.recyclerview.widget.x
    public final int l() {
        RecyclerView.o oVar = this.a;
        return (oVar.o - oVar.L()) - oVar.I();
    }

    @Override // androidx.recyclerview.widget.x
    public final int m(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.P(rect, view);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.x
    public final int n(View view) {
        RecyclerView.o oVar = this.a;
        Rect rect = this.c;
        oVar.P(rect, view);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.x
    public final void o(int i) {
        this.a.V(i);
    }
}
