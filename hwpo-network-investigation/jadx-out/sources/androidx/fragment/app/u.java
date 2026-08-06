package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.u;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import defpackage.aa;
import defpackage.g2b;
import defpackage.gh0;
import defpackage.pp2;
import defpackage.rh1;
import defpackage.th1;
import defpackage.xj5;
import defpackage.z90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public boolean a;
        public boolean b;

        public boolean a() {
            return this instanceof androidx.fragment.app.c.C0017c;
        }

        public void b(ViewGroup viewGroup) {
            viewGroup.getClass();
        }

        public void c(ViewGroup viewGroup) {
            viewGroup.getClass();
        }

        public void d(gh0 gh0Var, ViewGroup viewGroup) {
            viewGroup.getClass();
        }

        public void e(ViewGroup viewGroup) {
            viewGroup.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends c {
        public final p l;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(c.b bVar, c.a aVar, p pVar) {
            f fVar = pVar.c;
            fVar.getClass();
            super(bVar, aVar, fVar);
            this.l = pVar;
        }

        @Override // androidx.fragment.app.u.c
        public final void b() {
            super.b();
            this.c.mTransitioning = false;
            this.l.k();
        }

        @Override // androidx.fragment.app.u.c
        public final void e() {
            if (this.h) {
                return;
            }
            this.h = true;
            c.a aVar = this.b;
            c.a aVar2 = c.a.u;
            p pVar = this.l;
            if (aVar != aVar2) {
                if (aVar == c.a.v) {
                    f fVar = pVar.c;
                    fVar.getClass();
                    View viewRequireView = fVar.requireView();
                    viewRequireView.getClass();
                    if (l.M(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fVar);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            f fVar2 = pVar.c;
            fVar2.getClass();
            View viewFindFocus = fVar2.mView.findFocus();
            if (viewFindFocus != null) {
                fVar2.setFocusedView(viewFindFocus);
                if (l.M(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fVar2);
                }
            }
            View viewRequireView2 = this.c.requireView();
            viewRequireView2.getClass();
            if (viewRequireView2.getParent() == null) {
                if (l.M(2)) {
                    Log.v("FragmentManager", "Adding fragment " + fVar2 + " view " + viewRequireView2 + " to container in onStart");
                }
                pVar.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                if (l.M(2)) {
                    Log.v("FragmentManager", "Making view " + viewRequireView2 + " INVISIBLE in onStart");
                }
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fVar2.getPostOnViewCreatedAlpha());
            if (l.M(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + fVar2.getPostOnViewCreatedAlpha() + " in onStart");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c {
        public b a;
        public a b;
        public final f c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public final ArrayList j;
        public final ArrayList k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a {
            public static final a t;
            public static final a u;
            public static final a v;
            public static final /* synthetic */ a[] w;

            static {
                a aVar = new a("NONE", 0);
                t = aVar;
                a aVar2 = new a("ADDING", 1);
                u = aVar2;
                a aVar3 = new a("REMOVING", 2);
                v = aVar3;
                w = new a[]{aVar, aVar2, aVar3};
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) w.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b {
            public static final b t;
            public static final b u;
            public static final b v;
            public static final b w;
            public static final /* synthetic */ b[] x;

            static {
                b bVar = new b("REMOVED", 0);
                t = bVar;
                b bVar2 = new b("VISIBLE", 1);
                u = bVar2;
                b bVar3 = new b("GONE", 2);
                v = bVar3;
                b bVar4 = new b("INVISIBLE", 3);
                w = bVar4;
                x = new b[]{bVar, bVar2, bVar3, bVar4};
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) x.clone();
            }

            public final void a(View view, ViewGroup viewGroup) {
                view.getClass();
                viewGroup.getClass();
                if (l.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (l.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (l.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (l.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (iOrdinal == 2) {
                    if (l.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (iOrdinal != 3) {
                    return;
                }
                if (l.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public c(b bVar, a aVar, f fVar) {
            fVar.getClass();
            this.a = bVar;
            this.b = aVar;
            this.c = fVar;
            this.d = new ArrayList();
            this.i = true;
            ArrayList arrayList = new ArrayList();
            this.j = arrayList;
            this.k = arrayList;
        }

        public final void a(ViewGroup viewGroup) {
            viewGroup.getClass();
            this.h = false;
            if (this.e) {
                return;
            }
            this.e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (a aVar : th1.T(this.k)) {
                aVar.getClass();
                if (!aVar.b) {
                    aVar.b(viewGroup);
                }
                aVar.b = true;
            }
        }

        public void b() {
            int i = 0;
            this.h = false;
            if (this.f) {
                return;
            }
            if (l.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }

        public final void c(a aVar) {
            aVar.getClass();
            ArrayList arrayList = this.j;
            if (arrayList.remove(aVar) && arrayList.isEmpty()) {
                b();
            }
        }

        public final void d(b bVar, a aVar) {
            int iOrdinal = aVar.ordinal();
            f fVar = this.c;
            b bVar2 = b.t;
            if (iOrdinal == 0) {
                if (this.a != bVar2) {
                    if (l.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fVar + " mFinalState = " + this.a + " -> " + bVar + '.');
                    }
                    this.a = bVar;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.a == bVar2) {
                    if (l.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                    }
                    this.a = b.u;
                    this.b = a.u;
                    this.i = true;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (l.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fVar + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
            }
            this.a = bVar2;
            this.b = a.v;
            this.i = true;
        }

        public void e() {
            this.h = true;
        }

        public final String toString() {
            StringBuilder sbA = aa.a("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbA.append(this.a);
            sbA.append(" lifecycleImpact = ");
            sbA.append(this.b);
            sbA.append(" fragment = ");
            sbA.append(this.c);
            sbA.append('}');
            return sbA.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public u(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final u i(ViewGroup viewGroup, l lVar) {
        viewGroup.getClass();
        lVar.getClass();
        lVar.K().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof u) {
            return (u) tag;
        }
        androidx.fragment.app.c cVar = new androidx.fragment.app.c(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
        return cVar;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z;
        Object obj;
        int size = arrayList.size();
        int i = 0;
        loop0: while (true) {
            z = true;
            while (true) {
                if (i >= size) {
                    break loop0;
                }
                Object obj2 = arrayList.get(i);
                i++;
                c cVar = (c) obj2;
                if (!cVar.k.isEmpty()) {
                    ArrayList arrayList2 = cVar.k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    do {
                        if (i2 >= size2) {
                            break;
                        }
                        obj = arrayList2.get(i2);
                        i2++;
                    } while (((a) obj).a());
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList.get(i3);
                i3++;
                rh1.o(((c) obj3).k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(c cVar) {
        cVar.getClass();
        if (cVar.i) {
            c.b bVar = cVar.a;
            View viewRequireView = cVar.c.requireView();
            viewRequireView.getClass();
            bVar.a(viewRequireView, this.a);
            cVar.i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z);

    public final void c(List<c> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            rh1.o(((c) it.next()).k, arrayList);
        }
        List listT = th1.T(th1.X(arrayList));
        int size = listT.size();
        for (int i = 0; i < size; i++) {
            ((a) listT.get(i)).c(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a(list.get(i2));
        }
        List listT2 = th1.T(list);
        int size3 = listT2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            c cVar = (c) listT2.get(i3);
            if (cVar.k.isEmpty()) {
                cVar.b();
            }
        }
    }

    public final void d(c.b bVar, c.a aVar, p pVar) {
        synchronized (this.b) {
            try {
                f fVar = pVar.c;
                fVar.getClass();
                c cVarF = f(fVar);
                if (cVarF == null) {
                    f fVar2 = pVar.c;
                    cVarF = (fVar2.mTransitioning || fVar2.mRemoving) ? g(fVar2) : null;
                }
                if (cVarF != null) {
                    cVarF.d(bVar, aVar);
                    return;
                }
                final b bVar2 = new b(bVar, aVar, pVar);
                this.b.add(bVar2);
                bVar2.d.add(new Runnable() { // from class: androidx.fragment.app.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        u uVar = this.t;
                        ArrayList arrayList = uVar.b;
                        u.b bVar3 = bVar2;
                        if (arrayList.contains(bVar3)) {
                            u.c.b bVar4 = bVar3.a;
                            View view = bVar3.c.mView;
                            view.getClass();
                            bVar4.a(view, uVar.a);
                        }
                    }
                });
                bVar2.d.add(new Runnable() { // from class: kx9
                    @Override // java.lang.Runnable
                    public final void run() {
                        u uVar = this.t;
                        ArrayList arrayList = uVar.b;
                        u.b bVar3 = bVar2;
                        arrayList.remove(bVar3);
                        uVar.c.remove(bVar3);
                    }
                });
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            h();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList arrayListU = th1.U(this.c);
                this.c.clear();
                int size = arrayListU.size();
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= size) {
                        break;
                    }
                    Object obj = arrayListU.get(i);
                    i++;
                    c cVar = (c) obj;
                    if (this.b.isEmpty() || !cVar.c.mTransitioning) {
                        z = false;
                    }
                    cVar.g = z;
                }
                int size2 = arrayListU.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListU.get(i2);
                    i2++;
                    c cVar2 = (c) obj2;
                    if (this.d) {
                        if (l.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + cVar2);
                        }
                        cVar2.b();
                    } else {
                        if (l.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cVar2);
                        }
                        cVar2.a(this.a);
                    }
                    this.d = false;
                    if (!cVar2.f) {
                        this.c.add(cVar2);
                    }
                }
                if (!this.b.isEmpty()) {
                    m();
                    ArrayList arrayListU2 = th1.U(this.b);
                    if (arrayListU2.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayListU2);
                    if (l.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListU2, this.e);
                    boolean zJ = j(arrayListU2);
                    int size3 = arrayListU2.size();
                    int i3 = 0;
                    boolean z2 = true;
                    while (i3 < size3) {
                        Object obj3 = arrayListU2.get(i3);
                        i3++;
                        if (!((c) obj3).c.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zJ) {
                        z = false;
                    }
                    this.d = z;
                    if (l.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zJ + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        l(arrayListU2);
                        c(arrayListU2);
                    } else if (zJ) {
                        l(arrayListU2);
                        int size4 = arrayListU2.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            a((c) arrayListU2.get(i4));
                        }
                    }
                    this.e = false;
                    if (l.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c f(f fVar) {
        Object obj;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if (xj5.a(cVar.c, fVar) && !cVar.e) {
                return (c) obj;
            }
        }
        obj = null;
        return (c) obj;
    }

    public final c g(f fVar) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if (xj5.a(cVar.c, fVar) && !cVar.e) {
                return (c) obj;
            }
        }
        obj = null;
        return (c) obj;
    }

    public final void h() {
        String str;
        String str2;
        if (l.M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                m();
                l(this.b);
                ArrayList arrayListU = th1.U(this.c);
                int size = arrayListU.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListU.get(i2);
                    i2++;
                    ((c) obj).g = false;
                }
                int size2 = arrayListU.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayListU.get(i3);
                    i3++;
                    c cVar = (c) obj2;
                    if (l.M(2)) {
                        if (zIsAttachedToWindow) {
                            str2 = BuildConfig.FLAVOR;
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + cVar);
                    }
                    cVar.a(this.a);
                }
                ArrayList arrayListU2 = th1.U(this.b);
                int size3 = arrayListU2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayListU2.get(i4);
                    i4++;
                    ((c) obj3).g = false;
                }
                int size4 = arrayListU2.size();
                while (i < size4) {
                    Object obj4 = arrayListU2.get(i);
                    i++;
                    c cVar2 = (c) obj4;
                    if (l.M(2)) {
                        if (zIsAttachedToWindow) {
                            str = BuildConfig.FLAVOR;
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + cVar2);
                    }
                    cVar2.a(this.a);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        Object objPrevious;
        c.b bVar;
        synchronized (this.b) {
            try {
                m();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    c cVar = (c) objPrevious;
                    View view = cVar.c.mView;
                    view.getClass();
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        bVar = c.b.w;
                    } else {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            bVar = c.b.u;
                        } else if (visibility == 4) {
                            bVar = c.b.w;
                        } else {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            bVar = c.b.v;
                        }
                    }
                    c.b bVar2 = cVar.a;
                    c.b bVar3 = c.b.u;
                    if (bVar2 == bVar3 && bVar != bVar3) {
                        break;
                    }
                }
                c cVar2 = (c) objPrevious;
                f fVar = cVar2 != null ? cVar2.c : null;
                this.f = fVar != null ? fVar.isPostponed() : false;
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(List<c> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).e();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            rh1.o(((c) it.next()).k, arrayList);
        }
        List listT = th1.T(th1.X(arrayList));
        int size2 = listT.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a aVar = (a) listT.get(i2);
            aVar.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!aVar.a) {
                aVar.e(viewGroup);
            }
            aVar.a = true;
        }
    }

    public final void m() {
        c.b bVar;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c cVar = (c) obj;
            if (cVar.b == c.a.u) {
                View viewRequireView = cVar.c.requireView();
                viewRequireView.getClass();
                int visibility = viewRequireView.getVisibility();
                if (visibility == 0) {
                    bVar = c.b.u;
                } else if (visibility == 4) {
                    bVar = c.b.w;
                } else {
                    if (visibility != 8) {
                        z90.a(pp2.a(visibility, "Unknown visibility "));
                        return;
                    }
                    bVar = c.b.v;
                }
                cVar.d(bVar, c.a.t);
            }
        }
    }
}
