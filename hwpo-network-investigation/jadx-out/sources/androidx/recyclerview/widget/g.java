package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import defpackage.e44;
import defpackage.egb;
import defpackage.fib;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends f0 {
    public static TimeInterpolator s;
    public final ArrayList<RecyclerView.e0> h = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> i = new ArrayList<>();
    public final ArrayList<e> j = new ArrayList<>();
    public final ArrayList<d> k = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.e0>> l = new ArrayList<>();
    public final ArrayList<ArrayList<e>> m = new ArrayList<>();
    public final ArrayList<ArrayList<d>> n = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> o = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> p = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> q = new ArrayList<>();
    public final ArrayList<RecyclerView.e0> r = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public final /* synthetic */ ArrayList t;

        public a(ArrayList arrayList) {
            this.t = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.t;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                g gVar = g.this;
                if (i >= size) {
                    arrayList.clear();
                    gVar.m.remove(arrayList);
                    return;
                }
                Object obj = arrayList.get(i);
                i++;
                e eVar = (e) obj;
                RecyclerView.e0 e0Var = eVar.a;
                int i2 = eVar.b;
                int i3 = eVar.c;
                int i4 = eVar.d;
                int i5 = eVar.e;
                View view = e0Var.a;
                int i6 = i4 - i2;
                int i7 = i5 - i3;
                if (i6 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i7 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                gVar.p.add(e0Var);
                viewPropertyAnimatorAnimate.setDuration(gVar.e).setListener(new j(gVar, e0Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList t;

        public b(ArrayList arrayList) {
            this.t = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.t;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                g gVar = g.this;
                if (i >= size) {
                    arrayList.clear();
                    gVar.n.remove(arrayList);
                    return;
                }
                Object obj = arrayList.get(i);
                i++;
                d dVar = (d) obj;
                ArrayList<RecyclerView.e0> arrayList2 = gVar.r;
                long j = gVar.f;
                RecyclerView.e0 e0Var = dVar.a;
                View view = e0Var == null ? null : e0Var.a;
                RecyclerView.e0 e0Var2 = dVar.b;
                View view2 = e0Var2 != null ? e0Var2.a : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(j);
                    arrayList2.add(dVar.a);
                    duration.translationX(dVar.e - dVar.c);
                    duration.translationY(dVar.f - dVar.d);
                    duration.alpha(0.0f).setListener(new k(gVar, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    arrayList2.add(dVar.b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new l(gVar, dVar, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class c implements Runnable {
        public final /* synthetic */ ArrayList t;

        public c(ArrayList arrayList) {
            this.t = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.t;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                g gVar = g.this;
                if (i >= size) {
                    arrayList.clear();
                    gVar.l.remove(arrayList);
                    return;
                }
                Object obj = arrayList.get(i);
                i++;
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                View view = e0Var.a;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                gVar.o.add(e0Var);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(gVar.c).setListener(new i(view, viewPropertyAnimatorAnimate, gVar, e0Var)).start();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public RecyclerView.e0 a;
        public RecyclerView.e0 b;
        public int c;
        public int d;
        public int e;
        public int f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            return e44.a(sb, this.f, '}');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e {
        public RecyclerView.e0 a;
        public int b;
        public int c;
        public int d;
        public int e;
    }

    public static void q(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.e0) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean g(RecyclerView.e0 e0Var, List<Object> list) {
        return !list.isEmpty() || f(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void i(RecyclerView.e0 e0Var) {
        View view = e0Var.a;
        view.animate().cancel();
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(e0Var);
                arrayList.remove(size);
            }
        }
        s(this.k, e0Var);
        if (this.h.remove(e0Var)) {
            view.setAlpha(1.0f);
            h(e0Var);
        }
        if (this.i.remove(e0Var)) {
            view.setAlpha(1.0f);
            h(e0Var);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            s(arrayList3, e0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (arrayList5.get(size4).a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(e0Var);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.e0>> arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.e0> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(e0Var)) {
                view.setAlpha(1.0f);
                h(e0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(e0Var);
        this.o.remove(e0Var);
        this.r.remove(e0Var);
        this.p.remove(e0Var);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void j() {
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(eVar.a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.e0> arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.e0> arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var = arrayList3.get(size3);
            e0Var.a.setAlpha(1.0f);
            h(e0Var);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d dVar = arrayList4.get(size4);
            RecyclerView.e0 e0Var2 = dVar.a;
            if (e0Var2 != null) {
                t(dVar, e0Var2);
            }
            RecyclerView.e0 e0Var3 = dVar.b;
            if (e0Var3 != null) {
                t(dVar, e0Var3);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList<ArrayList<e>> arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<e> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    e eVar2 = arrayList6.get(size6);
                    View view2 = eVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(eVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.e0>> arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.e0> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var4 = arrayList8.get(size8);
                    e0Var4.a.setAlpha(1.0f);
                    h(e0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<d>> arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<d> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.e0 e0Var5 = dVar2.a;
                    if (e0Var5 != null) {
                        t(dVar2, e0Var5);
                    }
                    RecyclerView.e0 e0Var6 = dVar2.b;
                    if (e0Var6 != null) {
                        t(dVar2, e0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            q(this.q);
            q(this.p);
            q(this.o);
            q(this.r);
            ArrayList<RecyclerView.l.a> arrayList11 = this.b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                arrayList11.get(i).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean k() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void l() {
        long j;
        ArrayList<RecyclerView.e0> arrayList = this.h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.e0> arrayList4 = this.i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            j = this.d;
            if (i >= size) {
                break;
            }
            RecyclerView.e0 e0Var = arrayList.get(i);
            i++;
            RecyclerView.e0 e0Var2 = e0Var;
            View view = e0Var2.a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.q.add(e0Var2);
            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new h(view, viewPropertyAnimatorAnimate, this, e0Var2)).start();
            arrayList = arrayList;
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList<e> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            a aVar = new a(arrayList5);
            if (zIsEmpty) {
                aVar.run();
            } else {
                View view2 = arrayList5.get(0).a.a;
                WeakHashMap<View, fib> weakHashMap = egb.a;
                view2.postOnAnimationDelayed(aVar, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList<d> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            b bVar = new b(arrayList6);
            if (zIsEmpty) {
                bVar.run();
            } else {
                View view3 = arrayList6.get(0).a.a;
                WeakHashMap<View, fib> weakHashMap2 = egb.a;
                view3.postOnAnimationDelayed(bVar, j);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.e0> arrayList7 = new ArrayList<>();
        arrayList7.addAll(arrayList4);
        this.l.add(arrayList7);
        arrayList4.clear();
        c cVar = new c(arrayList7);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
            return;
        }
        if (zIsEmpty) {
            j = 0;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.e : 0L, zIsEmpty3 ? 0L : this.f) + j;
        View view4 = arrayList7.get(0).a;
        WeakHashMap<View, fib> weakHashMap3 = egb.a;
        view4.postOnAnimationDelayed(cVar, jMax);
    }

    @Override // androidx.recyclerview.widget.f0
    public final boolean m(RecyclerView.e0 e0Var) {
        u(e0Var);
        e0Var.a.setAlpha(0.0f);
        this.i.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.f0
    public final boolean n(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
        if (e0Var == e0Var2) {
            return o(e0Var, i, i2, i3, i4);
        }
        View view = e0Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        u(e0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = e0Var2.a;
        u(e0Var2);
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        d dVar = new d();
        dVar.a = e0Var;
        dVar.b = e0Var2;
        dVar.c = i;
        dVar.d = i2;
        dVar.e = i3;
        dVar.f = i4;
        this.k.add(dVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.f0
    public final boolean o(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
        View view = e0Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) e0Var.a.getTranslationY());
        u(e0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            h(e0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        e eVar = new e();
        eVar.a = e0Var;
        eVar.b = translationX;
        eVar.c = translationY;
        eVar.d = i3;
        eVar.e = i4;
        this.j.add(eVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.f0
    public final boolean p(RecyclerView.e0 e0Var) {
        u(e0Var);
        this.h.add(e0Var);
        return true;
    }

    public final void r() {
        if (k()) {
            return;
        }
        ArrayList<RecyclerView.l.a> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        arrayList.clear();
    }

    public final void s(ArrayList arrayList, RecyclerView.e0 e0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (t(dVar, e0Var) && dVar.a == null && dVar.b == null) {
                arrayList.remove(dVar);
            }
        }
    }

    public final boolean t(d dVar, RecyclerView.e0 e0Var) {
        if (dVar.b == e0Var) {
            dVar.b = null;
        } else {
            if (dVar.a != e0Var) {
                return false;
            }
            dVar.a = null;
        }
        View view = e0Var.a;
        View view2 = e0Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        h(e0Var);
        return true;
    }

    public final void u(RecyclerView.e0 e0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        e0Var.a.animate().setInterpolator(s);
        i(e0Var);
    }
}
