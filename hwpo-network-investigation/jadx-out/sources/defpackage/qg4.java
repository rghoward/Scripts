package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f;
import com.hwpo_training_app.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class qg4 extends og4 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends wva.c {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c extends wva.c {
    }

    @Override // defpackage.og4
    public final void a(View view, Object obj) {
        ((wva) obj).b(view);
    }

    @Override // defpackage.og4
    public final void b(Object obj, ArrayList<View> arrayList) {
        wva wvaVar = (wva) obj;
        if (wvaVar == null) {
            return;
        }
        int i = 0;
        if (wvaVar instanceof twa) {
            twa twaVar = (twa) wvaVar;
            int size = twaVar.Y.size();
            while (i < size) {
                b(twaVar.P(i), arrayList);
                i++;
            }
            return;
        }
        if (og4.k(wvaVar.x) && og4.k(wvaVar.y)) {
            int size2 = arrayList.size();
            while (i < size2) {
                wvaVar.b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.og4
    public final void c(Object obj) {
        ((swa) obj).h();
    }

    @Override // defpackage.og4
    public final void d(Object obj, xt2 xt2Var) {
        ((swa) obj).i(xt2Var);
    }

    @Override // defpackage.og4
    public final void e(ViewGroup viewGroup, Object obj) {
        qwa.a(viewGroup, (wva) obj);
    }

    @Override // defpackage.og4
    public final boolean g(Object obj) {
        return obj instanceof wva;
    }

    @Override // defpackage.og4
    public final Object h(Object obj) {
        if (obj != null) {
            return ((wva) obj).clone();
        }
        return null;
    }

    @Override // defpackage.og4
    public final Object i(ViewGroup viewGroup, Object obj) {
        wva wvaVar = (wva) obj;
        ArrayList<ViewGroup> arrayList = qwa.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (wvaVar.v()) {
                arrayList.add(viewGroup);
                wva wvaVarClone = wvaVar.clone();
                twa twaVar = new twa();
                twaVar.O(wvaVarClone);
                qwa.c(viewGroup, twaVar);
                viewGroup.setTag(R.id.transition_current_scene, null);
                qwa.a aVar = new qwa.a();
                aVar.t = twaVar;
                aVar.u = viewGroup;
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                viewGroup.invalidate();
                wva.e eVar = new wva.e(twaVar);
                twaVar.S = eVar;
                twaVar.a(eVar);
                return twaVar.S;
            }
            z90.a("The Transition must support seeking.");
        }
        return null;
    }

    @Override // defpackage.og4
    public final boolean l() {
        return true;
    }

    @Override // defpackage.og4
    public final boolean m(Object obj) {
        boolean zV = ((wva) obj).v();
        if (!zV) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zV;
    }

    @Override // defpackage.og4
    public final Object n(Object obj, Object obj2, Object obj3) {
        wva wvaVar = (wva) obj;
        wva wvaVar2 = (wva) obj2;
        wva wvaVar3 = (wva) obj3;
        if (wvaVar != null && wvaVar2 != null) {
            twa twaVar = new twa();
            twaVar.O(wvaVar);
            twaVar.O(wvaVar2);
            twaVar.S(1);
            wvaVar = twaVar;
        } else if (wvaVar == null) {
            wvaVar = wvaVar2 != null ? wvaVar2 : null;
        }
        if (wvaVar3 == null) {
            return wvaVar;
        }
        twa twaVar2 = new twa();
        if (wvaVar != null) {
            twaVar2.O(wvaVar);
        }
        twaVar2.O(wvaVar3);
        return twaVar2;
    }

    @Override // defpackage.og4
    public final Object o(Object obj, Object obj2) {
        twa twaVar = new twa();
        if (obj != null) {
            twaVar.O((wva) obj);
        }
        twaVar.O((wva) obj2);
        return twaVar;
    }

    @Override // defpackage.og4
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        ((wva) obj).a(new b(view, arrayList));
    }

    @Override // defpackage.og4
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((wva) obj).a(new rg4(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.og4
    public final void r(Object obj, float f) {
        swa swaVar = (swa) obj;
        if (swaVar.b()) {
            long jC = (long) (f * swaVar.c());
            if (jC == 0) {
                jC = 1;
            }
            if (jC == swaVar.c()) {
                jC = swaVar.c() - 1;
            }
            swaVar.f(jC);
        }
    }

    @Override // defpackage.og4
    public final void s(View view, Object obj) {
        if (view != null) {
            og4.j(new Rect(), view);
            ((wva) obj).H(new a());
        }
    }

    @Override // defpackage.og4
    public final void t(Object obj, Rect rect) {
        ((wva) obj).H(new c());
    }

    @Override // defpackage.og4
    public final void u(f fVar, Object obj, j41 j41Var, Runnable runnable) {
        v(obj, j41Var, null, runnable);
    }

    @Override // defpackage.og4
    public final void v(Object obj, j41 j41Var, rt2 rt2Var, Runnable runnable) {
        wva wvaVar = (wva) obj;
        pg4 pg4Var = new pg4(rt2Var, wvaVar, runnable);
        synchronized (j41Var) {
            while (j41Var.c) {
                try {
                    try {
                        j41Var.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (j41Var.b != pg4Var) {
                j41Var.b = pg4Var;
                if (j41Var.a) {
                    Runnable runnable2 = pg4Var.a;
                    wva wvaVar2 = pg4Var.b;
                    Runnable runnable3 = pg4Var.c;
                    if (runnable2 == null) {
                        wvaVar2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        wvaVar.a(new sg4(runnable));
    }

    @Override // defpackage.og4
    public final void w(Object obj, View view, ArrayList<View> arrayList) {
        twa twaVar = (twa) obj;
        ArrayList<View> arrayList2 = twaVar.y;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            og4.f(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(twaVar, arrayList);
    }

    @Override // defpackage.og4
    public final void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        twa twaVar = (twa) obj;
        if (twaVar != null) {
            ArrayList<View> arrayList3 = twaVar.y;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(twaVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.og4
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        twa twaVar = new twa();
        twaVar.O((wva) obj);
        return twaVar;
    }

    public final void z(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        wva wvaVar = (wva) obj;
        int i = 0;
        if (wvaVar instanceof twa) {
            twa twaVar = (twa) wvaVar;
            int size = twaVar.Y.size();
            while (i < size) {
                z(twaVar.P(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (og4.k(wvaVar.x)) {
            ArrayList<View> arrayList3 = wvaVar.y;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    wvaVar.b(arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    wvaVar.C(arrayList.get(size3));
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements wva.f {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // wva.f
        public final void a(wva wvaVar) {
            wvaVar.B(this);
            this.a.setVisibility(8);
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }

        @Override // wva.f
        public final void e(wva wvaVar) {
            wvaVar.B(this);
            wvaVar.a(this);
        }

        @Override // wva.f
        public final void d() {
        }

        @Override // wva.f
        public final void k() {
        }

        @Override // wva.f
        public final void l(wva wvaVar) {
        }
    }
}
