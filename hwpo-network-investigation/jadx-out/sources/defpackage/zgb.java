package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zgb<T extends View> extends bt {
    public final T T;
    public final c97 U;
    public final m09 V;
    public m09.a W;
    public oh4<? super T, g2b> a0;
    public oh4<? super T, g2b> b0;
    public oh4<? super T, g2b> c0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends wp5 implements mh4<g2b> {
        public final /* synthetic */ zgb<T> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zgb<T> zgbVar) {
            super(0);
            this.u = zgbVar;
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            zgb<T> zgbVar = this.u;
            zgbVar.getReleaseBlock().invoke(zgbVar.T);
            zgb.h(zgbVar);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends wp5 implements mh4<g2b> {
        public final /* synthetic */ zgb<T> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zgb<T> zgbVar) {
            super(0);
            this.u = zgbVar;
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            zgb<T> zgbVar = this.u;
            zgbVar.getResetBlock().invoke(zgbVar.T);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends wp5 implements mh4<g2b> {
        public final /* synthetic */ zgb<T> u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zgb<T> zgbVar) {
            super(0);
            this.u = zgbVar;
        }

        @Override // defpackage.mh4
        public final g2b invoke() {
            zgb<T> zgbVar = this.u;
            zgbVar.getUpdateBlock().invoke(zgbVar.T);
            return g2b.a;
        }
    }

    public zgb(Context context, oh4<? super Context, ? extends T> oh4Var, yt1 yt1Var, m09 m09Var, int i, mn7 mn7Var) {
        T tInvoke = oh4Var.invoke(context);
        c97 c97Var = new c97();
        super(context, yt1Var, i, c97Var, tInvoke, mn7Var);
        this.T = tInvoke;
        this.U = c97Var;
        this.V = m09Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objD = m09Var != null ? m09Var.d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objD instanceof SparseArray ? (SparseArray) objD : null;
        if (sparseArray != null) {
            tInvoke.restoreHierarchyState(sparseArray);
        }
        if (m09Var != null) {
            setSavableRegistryEntry(m09Var.b(new ygb(this), strValueOf));
        }
        ft.b bVar = ft.b.u;
        this.a0 = bVar;
        this.b0 = bVar;
        this.c0 = bVar;
    }

    public static final void h(zgb zgbVar) {
        zgbVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(m09.a aVar) {
        m09.a aVar2 = this.W;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.W = aVar;
    }

    public final c97 getDispatcher() {
        return this.U;
    }

    public final oh4<T, g2b> getReleaseBlock() {
        return this.c0;
    }

    public final oh4<T, g2b> getResetBlock() {
        return this.b0;
    }

    public /* bridge */ /* synthetic */ v0 getSubCompositionView() {
        return null;
    }

    public final oh4<T, g2b> getUpdateBlock() {
        return this.a0;
    }

    public final void setReleaseBlock(oh4<? super T, g2b> oh4Var) {
        this.c0 = oh4Var;
        setRelease(new a(this));
    }

    public final void setResetBlock(oh4<? super T, g2b> oh4Var) {
        this.b0 = oh4Var;
        setReset(new b(this));
    }

    public final void setUpdateBlock(oh4<? super T, g2b> oh4Var) {
        this.a0 = oh4Var;
        setUpdate(new c(this));
    }

    public View getViewRoot() {
        return this;
    }
}
