package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ihb extends View {
    public static final a D = new a();
    public tq5 A;
    public oh4<? super d73, g2b> B;
    public ko4 C;
    public final w63 t;
    public final u41 u;
    public final s41 v;
    public boolean w;
    public Outline x;
    public boolean y;
    public tx2 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof ihb) || (outline2 = ((ihb) view).x) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public ihb(w63 w63Var, u41 u41Var, s41 s41Var) {
        super(w63Var.getContext());
        this.t = w63Var;
        this.u = u41Var;
        this.v = s41Var;
        setOutlineProvider(D);
        this.y = true;
        this.z = x63.a;
        this.A = tq5.t;
        no4.a.getClass();
        this.B = no4.a.C0206a.u;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        u41 u41Var = this.u;
        ol olVar = u41Var.a;
        Canvas canvas2 = olVar.a;
        olVar.a = canvas;
        tx2 tx2Var = this.z;
        tq5 tq5Var = this.A;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        ko4 ko4Var = this.C;
        oh4<? super d73, g2b> oh4Var = this.B;
        s41 s41Var = this.v;
        tx2 tx2VarB = s41Var.u.b();
        s41.b bVar = s41Var.u;
        tq5 tq5VarC = bVar.c();
        n41 n41VarA = bVar.a();
        long jD = bVar.d();
        ko4 ko4Var2 = bVar.b;
        bVar.f(tx2Var);
        bVar.g(tq5Var);
        bVar.e(olVar);
        bVar.h(jFloatToRawIntBits);
        bVar.b = ko4Var;
        olVar.f();
        try {
            oh4Var.invoke(s41Var);
            olVar.o();
            bVar.f(tx2VarB);
            bVar.g(tq5VarC);
            bVar.e(n41VarA);
            bVar.h(jD);
            bVar.b = ko4Var2;
            u41Var.a.a = canvas2;
            this.w = false;
        } catch (Throwable th) {
            olVar.o();
            bVar.f(tx2VarB);
            bVar.g(tq5VarC);
            bVar.e(n41VarA);
            bVar.h(jD);
            bVar.b = ko4Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.y;
    }

    public final u41 getCanvasHolder() {
        return this.u;
    }

    public final View getOwnerView() {
        return this.t;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.y;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.w) {
            return;
        }
        this.w = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.y != z) {
            this.y = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.w = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
