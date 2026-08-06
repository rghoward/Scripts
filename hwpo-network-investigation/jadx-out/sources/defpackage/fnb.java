package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.hwpo_training_app.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fnb {
    public static final WeakHashMap<View, fnb> w = new WeakHashMap<>();
    public final mt a;
    public final mt b;
    public final mt c;
    public final mt d;
    public final mt e;
    public final mt f;
    public final mt g;
    public final mt h;
    public final mt i;
    public final vab j;
    public final dt7 k;
    public final d2b l;
    public final vab m;
    public final vab n;
    public final vab o;
    public final vab p;
    public final vab q;
    public final vab r;
    public final vab s;
    public final boolean t;
    public int u;
    public final ge5 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final mt a(int i, String str) {
            WeakHashMap<View, fnb> weakHashMap = fnb.w;
            return new mt(i, str);
        }

        public static final vab b(int i, String str) {
            WeakHashMap<View, fnb> weakHashMap = fnb.w;
            return new vab(new le5(0, 0, 0, 0), str);
        }

        public static fnb c(jt1 jt1Var) {
            View view = (View) jt1Var.F(AndroidCompositionLocals_androidKt.f);
            fnb fnbVarD = d(view);
            boolean zJ = jt1Var.j(fnbVarD) | jt1Var.j(view);
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                objF = new xg8(1, fnbVarD, view);
                jt1Var.C(objF);
            }
            wd3.a(fnbVarD, (oh4) objF, jt1Var);
            return fnbVarD;
        }

        public static fnb d(View view) {
            fnb fnbVar;
            WeakHashMap<View, fnb> weakHashMap = fnb.w;
            synchronized (weakHashMap) {
                try {
                    fnb fnbVar2 = weakHashMap.get(view);
                    if (fnbVar2 == null) {
                        fnbVar2 = new fnb(view);
                        weakHashMap.put(view, fnbVar2);
                    }
                    fnbVar = fnbVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fnbVar;
        }
    }

    public fnb(View view) {
        mt mtVarA = a.a(4, "captionBar");
        this.a = mtVarA;
        mt mtVarA2 = a.a(128, "displayCutout");
        this.b = mtVarA2;
        mt mtVarA3 = a.a(8, "ime");
        this.c = mtVarA3;
        mt mtVarA4 = a.a(32, "mandatorySystemGestures");
        this.d = mtVarA4;
        mt mtVarA5 = a.a(2, "navigationBars");
        this.e = mtVarA5;
        mt mtVarA6 = a.a(1, "statusBars");
        this.f = mtVarA6;
        mt mtVarA7 = a.a(519, "systemBars");
        this.g = mtVarA7;
        mt mtVarA8 = a.a(16, "systemGestures");
        this.h = mtVarA8;
        mt mtVarA9 = a.a(64, "tappableElement");
        this.i = mtVarA9;
        vab vabVar = new vab(new le5(0, 0, 0, 0), "waterfall");
        this.j = vabVar;
        this.k = bl7.i(null);
        d2b d2bVar = new d2b(new d2b(mtVarA7, mtVarA3), mtVarA2);
        this.l = d2bVar;
        new d2b(d2bVar, new d2b(new d2b(new d2b(mtVarA9, mtVarA4), mtVarA8), vabVar));
        this.m = a.b(4, "captionBarIgnoringVisibility");
        this.n = a.b(2, "navigationBarsIgnoringVisibility");
        this.o = a.b(1, "statusBarsIgnoringVisibility");
        this.p = a.b(519, "systemBarsIgnoringVisibility");
        this.q = a.b(64, "tappableElementIgnoringVisibility");
        this.r = new vab(new le5(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new vab(new le5(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new ge5(this);
        WeakHashMap<View, fib> weakHashMap = egb.a;
        umb umbVarA = egb.e.a(view);
        if (umbVarA != null) {
            umb.q qVar = umbVarA.a;
            mtVarA.f(qVar.u(4));
            mtVarA2.f(qVar.u(128));
            mtVarA3.f(qVar.u(8));
            mtVarA4.f(qVar.u(32));
            mtVarA5.f(qVar.u(2));
            mtVarA6.f(qVar.u(1));
            mtVarA7.f(qVar.u(519));
            mtVarA8.f(qVar.u(16));
            mtVarA9.f(qVar.u(64));
        }
    }

    public static void b(fnb fnbVar, umb umbVar) {
        boolean z = false;
        fnbVar.a.g(umbVar, 0);
        fnbVar.c.g(umbVar, 0);
        fnbVar.b.g(umbVar, 0);
        fnbVar.e.g(umbVar, 0);
        fnbVar.f.g(umbVar, 0);
        fnbVar.g.g(umbVar, 0);
        fnbVar.h.g(umbVar, 0);
        fnbVar.i.g(umbVar, 0);
        fnbVar.d.g(umbVar, 0);
        fnbVar.m.f(mnb.a(umbVar.a.j(4)));
        fnbVar.n.f(mnb.a(umbVar.a.j(2)));
        fnbVar.o.f(mnb.a(umbVar.a.j(1)));
        fnbVar.p.f(mnb.a(umbVar.a.j(519)));
        fnbVar.q.f(mnb.a(umbVar.a.j(64)));
        l23 l23VarH = umbVar.a.h();
        fnbVar.j.f(mnb.a(l23VarH != null ? l23VarH.a() : xd5.e));
        vp vpVar = null;
        if (l23VarH != null) {
            Path pathA = Build.VERSION.SDK_INT >= 31 ? l23.c.a(l23VarH.a) : null;
            if (pathA != null) {
                vpVar = new vp(pathA);
            }
        }
        fnbVar.k.setValue(vpVar);
        synchronized (qu9.c) {
            d37<m0a> d37Var = qu9.j.h;
            if (d37Var != null && d37Var.h()) {
                z = true;
            }
        }
        if (z) {
            qu9.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            WeakHashMap<View, fib> weakHashMap = egb.a;
            ge5 ge5Var = this.v;
            egb.d.c(view, ge5Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(ge5Var);
            egb.q(view, ge5Var);
        }
        this.u++;
    }
}
