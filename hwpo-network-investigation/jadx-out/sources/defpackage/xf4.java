package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.f;
import androidx.fragment.app.k;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xf4 extends RecyclerView.f<wg4> implements q0a {
    public final s66 d;
    public final l e;
    public final we6<f> f;
    public final we6<f.n> g;
    public final we6<Integer> h;
    public d i;
    public final c j;
    public boolean k;
    public boolean l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements g76 {
        public final /* synthetic */ wg4 t;

        public a(wg4 wg4Var) {
            this.t = wg4Var;
        }

        @Override // defpackage.g76
        public final void t(m76 m76Var, s66.a aVar) {
            xf4 xf4Var = xf4.this;
            if (xf4Var.e.Q()) {
                return;
            }
            m76Var.getLifecycle().c(this);
            wg4 wg4Var = this.t;
            if (((FrameLayout) wg4Var.a).isAttachedToWindow()) {
                xf4Var.z(wg4Var);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b extends RecyclerView.h {
        @Override // androidx.recyclerview.widget.RecyclerView.h
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void c(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void e(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void f(int i, int i2) {
            a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public CopyOnWriteArrayList a;

        public static void b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e.b) it.next()).getClass();
            }
        }

        public final ArrayList a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(e.a);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class d {
        public bg4 a;
        public cg4 b;
        public dg4 c;
        public ViewPager2 d;
        public long e = -1;

        public d() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            p51.c(parent, "Expected ViewPager2 instance. Got: ");
            return null;
        }

        public final void b(boolean z) {
            int currentItem;
            f fVarB;
            xf4 xf4Var = xf4.this;
            c cVar = xf4Var.j;
            we6<f> we6Var = xf4Var.f;
            l lVar = xf4Var.e;
            if (lVar.Q() || this.d.getScrollState() != 0 || we6Var.d() || xf4Var.f() == 0 || (currentItem = this.d.getCurrentItem()) >= xf4Var.f()) {
                return;
            }
            long jG = xf4Var.g(currentItem);
            if ((jG != this.e || z) && (fVarB = we6Var.b(jG)) != null && fVarB.isAdded()) {
                this.e = jG;
                lVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(lVar);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                f fVar = null;
                for (int i2 = 0; i2 < we6Var.h(); i2++) {
                    long jE = we6Var.e(i2);
                    f fVarI = we6Var.i(i2);
                    if (fVarI.isAdded()) {
                        if (jE != this.e) {
                            aVar.e(fVarI, s66.b.w);
                            arrayList.add(cVar.a());
                        } else {
                            fVar = fVarI;
                        }
                        fVarI.setMenuVisibility(jE == this.e);
                    }
                }
                if (fVar != null) {
                    aVar.e(fVar, s66.b.x);
                    arrayList.add(cVar.a());
                }
                if (aVar.a.isEmpty()) {
                    return;
                }
                aVar.i();
                Collections.reverse(arrayList);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    cVar.getClass();
                    c.b((List) obj);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class e {
        public static final a a = new a();

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements b {
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public interface b {
        }
    }

    public xf4(l lVar, s66 s66Var) {
        this.f = new we6<>();
        this.g = new we6<>();
        this.h = new we6<>();
        c cVar = new c();
        cVar.a = new CopyOnWriteArrayList();
        this.j = cVar;
        this.k = false;
        this.l = false;
        this.e = lVar;
        this.d = s66Var;
        s();
    }

    public static void u(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            aa0.c("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final void A(long j) {
        ViewParent parent;
        we6<f> we6Var = this.f;
        f fVarB = we6Var.b(j);
        if (fVarB == null) {
            return;
        }
        if (fVarB.getView() != null && (parent = fVarB.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zV = v(j);
        we6<f.n> we6Var2 = this.g;
        if (!zV) {
            we6Var2.g(j);
        }
        if (!fVarB.isAdded()) {
            we6Var.g(j);
            return;
        }
        l lVar = this.e;
        if (lVar.Q()) {
            this.l = true;
            return;
        }
        boolean zIsAdded = fVarB.isAdded();
        e.a aVar = e.a;
        c cVar = this.j;
        if (zIsAdded && v(j)) {
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).getClass();
                arrayList.add(aVar);
            }
            f.n nVarB0 = lVar.b0(fVarB);
            c.b(arrayList);
            we6Var2.f(j, nVarB0);
        }
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = cVar.a.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).getClass();
            arrayList2.add(aVar);
        }
        try {
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(lVar);
            aVar2.k(fVarB);
            aVar2.i();
            we6Var.g(j);
        } finally {
            c.b(arrayList2);
        }
    }

    @Override // defpackage.q0a
    public final Bundle a() {
        we6<f> we6Var = this.f;
        int iH = we6Var.h();
        we6<f.n> we6Var2 = this.g;
        Bundle bundle = new Bundle(we6Var2.h() + iH);
        for (int i = 0; i < we6Var.h(); i++) {
            long jE = we6Var.e(i);
            f fVarB = we6Var.b(jE);
            if (fVarB != null && fVarB.isAdded()) {
                this.e.W(bundle, d43.b(jE, "f#"), fVarB);
            }
        }
        for (int i2 = 0; i2 < we6Var2.h(); i2++) {
            long jE2 = we6Var2.e(i2);
            if (v(jE2)) {
                bundle.putParcelable(d43.b(jE2, "s#"), we6Var2.b(jE2));
            }
        }
        return bundle;
    }

    @Override // defpackage.q0a
    public final void b(Parcelable parcelable) {
        we6<f.n> we6Var = this.g;
        if (we6Var.d()) {
            we6<f> we6Var2 = this.f;
            if (we6Var2.d()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        long j = Long.parseLong(str.substring(2));
                        l lVar = this.e;
                        lVar.getClass();
                        String string = bundle.getString(str);
                        f fVar = null;
                        if (string != null) {
                            f fVarB = lVar.c.b(string);
                            if (fVarB == null) {
                                lVar.k0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                throw null;
                            }
                            fVar = fVarB;
                        }
                        we6Var2.f(j, fVar);
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            z90.a("Unexpected key in savedState: ".concat(str));
                            return;
                        }
                        long j2 = Long.parseLong(str.substring(2));
                        f.n nVar = (f.n) bundle.getParcelable(str);
                        if (v(j2)) {
                            we6Var.f(j2, nVar);
                        }
                    }
                }
                if (we6Var2.d()) {
                    return;
                }
                this.l = true;
                this.k = true;
                x();
                Handler handler = new Handler(Looper.getMainLooper());
                zf4 zf4Var = new zf4(0, this);
                this.d.a(new ag4(handler, zf4Var));
                handler.postDelayed(zf4Var, 10000L);
                return;
            }
        }
        aa0.c("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public long g(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void i(RecyclerView recyclerView) {
        if (this.i != null) {
            zn3.b();
            return;
        }
        d dVar = new d();
        this.i = dVar;
        dVar.d = d.a(recyclerView);
        bg4 bg4Var = new bg4(dVar);
        dVar.a = bg4Var;
        dVar.d.v.a.add(bg4Var);
        cg4 cg4Var = new cg4(dVar);
        dVar.b = cg4Var;
        r(cg4Var);
        dg4 dg4Var = new dg4(dVar);
        dVar.c = dg4Var;
        this.d.a(dg4Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void j(RecyclerView.e0 e0Var, int i) {
        wg4 wg4Var = (wg4) e0Var;
        long j = wg4Var.e;
        FrameLayout frameLayout = (FrameLayout) wg4Var.a;
        int id = frameLayout.getId();
        Long lY = y(id);
        we6<Integer> we6Var = this.h;
        if (lY != null && lY.longValue() != j) {
            A(lY.longValue());
            we6Var.g(lY.longValue());
        }
        we6Var.f(j, Integer.valueOf(id));
        long jG = g(i);
        we6<f> we6Var2 = this.f;
        if (we6Var2.c(jG) < 0) {
            f fVarW = w(i);
            fVarW.setInitialSavedState(this.g.b(jG));
            we6Var2.f(jG, fVarW);
        }
        if (frameLayout.isAttachedToWindow()) {
            z(wg4Var);
        }
        x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.e0 l(ViewGroup viewGroup, int i) {
        int i2 = wg4.u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new wg4(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void m(RecyclerView recyclerView) {
        d dVar = this.i;
        dVar.getClass();
        ViewPager2 viewPager2A = d.a(recyclerView);
        viewPager2A.v.a.remove(dVar.a);
        xf4 xf4Var = xf4.this;
        xf4Var.t(dVar.b);
        xf4Var.d.c(dVar.c);
        dVar.d = null;
        this.i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final /* bridge */ /* synthetic */ boolean n(RecyclerView.e0 e0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void o(RecyclerView.e0 e0Var) {
        z((wg4) e0Var);
        x();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void q(RecyclerView.e0 e0Var) {
        Long lY = y(((FrameLayout) ((wg4) e0Var).a).getId());
        if (lY != null) {
            A(lY.longValue());
            this.h.g(lY.longValue());
        }
    }

    public boolean v(long j) {
        return j >= 0 && j < ((long) f());
    }

    public abstract f w(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        we6<f> we6Var;
        we6<Integer> we6Var2;
        f fVarB;
        View view;
        if (!this.l || this.e.Q()) {
            return;
        }
        r30 r30Var = new r30(0);
        int i = 0;
        while (true) {
            we6Var = this.f;
            int iH = we6Var.h();
            we6Var2 = this.h;
            if (i >= iH) {
                break;
            }
            long jE = we6Var.e(i);
            if (!v(jE)) {
                r30Var.add(Long.valueOf(jE));
                we6Var2.g(jE);
            }
            i++;
        }
        if (!this.k) {
            this.l = false;
            for (int i2 = 0; i2 < we6Var.h(); i2++) {
                long jE2 = we6Var.e(i2);
                if (we6Var2.c(jE2) < 0 && ((fVarB = we6Var.b(jE2)) == null || (view = fVarB.getView()) == null || view.getParent() == null)) {
                    r30Var.add(Long.valueOf(jE2));
                }
            }
        }
        r30.a aVar = new r30.a();
        while (aVar.hasNext()) {
            A(((Long) aVar.next()).longValue());
        }
    }

    public final Long y(int i) {
        int i2 = 0;
        Long lValueOf = null;
        while (true) {
            we6<Integer> we6Var = this.h;
            if (i2 >= we6Var.h()) {
                return lValueOf;
            }
            if (we6Var.i(i2).intValue() == i) {
                if (lValueOf != null) {
                    aa0.c("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    return null;
                }
                lValueOf = Long.valueOf(we6Var.e(i2));
            }
            i2++;
        }
    }

    public final void z(wg4 wg4Var) {
        f fVarB = this.f.b(wg4Var.e);
        if (fVarB == null) {
            aa0.c("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) wg4Var.a;
        View view = fVarB.getView();
        if (!fVarB.isAdded() && view != null) {
            aa0.c("Design assumption violated.");
            return;
        }
        boolean zIsAdded = fVarB.isAdded();
        l lVar = this.e;
        if (zIsAdded && view == null) {
            yf4 yf4Var = new yf4(this, fVarB, frameLayout);
            k kVar = lVar.p;
            kVar.getClass();
            kVar.b.add(new k.a(yf4Var, false));
            return;
        }
        if (fVarB.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                u(view, frameLayout);
                return;
            }
            return;
        }
        if (fVarB.isAdded()) {
            u(view, frameLayout);
            return;
        }
        if (lVar.Q()) {
            if (lVar.K) {
                return;
            }
            this.d.a(new a(wg4Var));
            return;
        }
        yf4 yf4Var2 = new yf4(this, fVarB, frameLayout);
        k kVar2 = lVar.p;
        kVar2.getClass();
        kVar2.b.add(new k.a(yf4Var2, false));
        c cVar = this.j;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
            arrayList.add(e.a);
        }
        try {
            fVarB.setMenuVisibility(false);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(lVar);
            aVar.d(0, fVarB, "f" + wg4Var.e, 1);
            aVar.e(fVarB, s66.b.w);
            aVar.i();
            this.i.b(false);
        } finally {
            c.b(arrayList);
        }
    }

    public xf4(hk0 hk0Var) {
        this(hk0Var.getChildFragmentManager(), hk0Var.getLifecycle());
    }
}
