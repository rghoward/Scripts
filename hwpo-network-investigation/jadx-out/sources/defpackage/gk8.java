package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gk8 extends yt1 {
    public final tw0 a;
    public final wa7 b;
    public final Object c;
    public el5 d;
    public Throwable e;
    public final ArrayList f;
    public List<? extends x02> g;
    public d37<Object> h;
    public final k37<x02> i;
    public final ArrayList j;
    public final ArrayList k;
    public final c37<Object, Object> l;
    public final w87 m;
    public final c37<mz6, lz6> n;
    public final c37<Object, Object> o;
    public ArrayList p;
    public d37<x02> q;
    public e41 r;
    public final a0a s;
    public boolean t;
    public final a0a u;
    public final kv9<d37<xj8>> v;
    public final gl5 w;
    public final h72 x;
    public final c y;
    public static final a0a z = b0a.b(gx7.w);
    public static final AtomicReference<Boolean> A = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public static final d t;
        public static final d u;
        public static final d v;
        public static final d w;
        public static final d x;
        public static final d y;
        public static final /* synthetic */ d[] z;

        static {
            d dVar = new d("ShutDown", 0);
            t = dVar;
            d dVar2 = new d("ShuttingDown", 1);
            u = dVar2;
            d dVar3 = new d("Inactive", 2);
            v = dVar3;
            d dVar4 = new d("InactivePendingWork", 3);
            w = dVar4;
            d dVar5 = new d("Idle", 4);
            x = dVar5;
            d dVar6 = new d("PendingWork", 5);
            y = dVar6;
            z = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) z.clone();
        }
    }

    public gk8(h72 h72Var) {
        tw0 tw0Var = new tw0(new ak8(0, this));
        this.a = tw0Var;
        this.b = new wa7(new bk8(this));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new d37<>((Object) null);
        this.i = new k37<>(new x02[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = y07.b();
        this.m = new w87();
        this.n = z39.b();
        this.o = y07.b();
        this.s = b0a.b(null);
        this.u = b0a.b(d.v);
        this.v = new kv9<>();
        gl5 gl5Var = new gl5((el5) h72Var.d0(el5.a.t));
        gl5Var.j0(new oh4() { // from class: ck8
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                final gk8 gk8Var = this.t;
                final Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (gk8Var.c) {
                    try {
                        el5 el5Var = gk8Var.d;
                        if (el5Var != null) {
                            a0a a0aVar = gk8Var.u;
                            gk8.d dVar = gk8.d.u;
                            a0aVar.getClass();
                            a0aVar.l(null, dVar);
                            el5Var.k(cancellationException);
                            gk8Var.r = null;
                            el5Var.j0(new oh4() { // from class: ek8
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj2) {
                                    gk8 gk8Var2 = gk8Var;
                                    Throwable th2 = th;
                                    Throwable th3 = (Throwable) obj2;
                                    synchronized (gk8Var2.c) {
                                        if (th2 == null) {
                                            th2 = null;
                                        } else if (th3 != null) {
                                            try {
                                                if (th3 instanceof CancellationException) {
                                                    th3 = null;
                                                }
                                                if (th3 != null) {
                                                    fn3.b(th2, th3);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        gk8Var2.e = th2;
                                        a0a a0aVar2 = gk8Var2.u;
                                        gk8.d dVar2 = gk8.d.t;
                                        a0aVar2.getClass();
                                        a0aVar2.l(null, dVar2);
                                    }
                                    return g2b.a;
                                }
                            });
                        } else {
                            gk8Var.e = cancellationException;
                            a0a a0aVar2 = gk8Var.u;
                            gk8.d dVar2 = gk8.d.t;
                            a0aVar2.getClass();
                            a0aVar2.l(null, dVar2);
                            g2b g2bVar = g2b.a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return g2b.a;
            }
        });
        this.w = gl5Var;
        this.x = h72Var.c0(tw0Var).c0(gl5Var);
        this.y = new c();
    }

    public static final void A(gk8 gk8Var, mz6 mz6Var, mz6 mz6Var2) {
        List<mz6> list = mz6Var2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mz6 mz6Var3 = list.get(i);
                w87 w87Var = gk8Var.m;
                kz6<Object> kz6Var = mz6Var3.a;
                y07.a(w87Var.a, kz6Var, new x87(mz6Var3, mz6Var));
                y07.a(w87Var.b, mz6Var, kz6Var);
                A(gk8Var, mz6Var, mz6Var3);
            }
        }
    }

    public static final void J(ArrayList arrayList, gk8 gk8Var, x02 x02Var) {
        arrayList.clear();
        synchronized (gk8Var.c) {
            try {
                Iterator it = gk8Var.k.iterator();
                while (it.hasNext()) {
                    mz6 mz6Var = (mz6) it.next();
                    if (xj5.a(mz6Var.c, x02Var)) {
                        arrayList.add(mz6Var);
                        it.remove();
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void y(g37 g37Var) {
        try {
            if (g37Var.w() instanceof ju9.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            g37Var.c();
        } catch (Throwable th) {
            g37Var.c();
            throw th;
        }
    }

    public final c41<g2b> B() {
        a0a a0aVar = this.u;
        int iCompareTo = ((d) a0aVar.getValue()).compareTo(d.u);
        a0a a0aVar2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        k37<x02> k37Var = this.i;
        if (iCompareTo > 0) {
            Object value = a0aVar2.getValue();
            d dVar = d.y;
            d dVar2 = d.v;
            if (value == null) {
                if (this.d == null) {
                    this.h = new d37<>((Object) null);
                    k37Var.k();
                    if (C() || E()) {
                        dVar2 = d.w;
                    }
                } else {
                    dVar2 = (k37Var.v != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || C() || E() || this.l.f()) ? dVar : d.x;
                }
            }
            a0aVar.getClass();
            a0aVar.l(null, dVar2);
            if (dVar2 != dVar) {
                return null;
            }
            e41 e41Var = this.r;
            this.r = null;
            return e41Var;
        }
        List<x02> listG = G();
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            listG.get(i);
        }
        this.f.clear();
        this.g = hf3.t;
        this.h = new d37<>((Object) null);
        k37Var.k();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        e41 e41Var2 = this.r;
        if (e41Var2 != null) {
            e41Var2.l(null);
        }
        this.r = null;
        a0aVar2.setValue(null);
        return null;
    }

    public final boolean C() {
        return !this.t && (this.a.u.c.get() & 134217727) > 0;
    }

    public final boolean D() {
        return this.i.v != 0 || C() || E() || this.l.f();
    }

    public final boolean E() {
        return !this.t && (this.b.b.c.get() & 134217727) > 0;
    }

    public final boolean F() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.v != 0 || C() || E();
        }
        return z2;
    }

    public final List<x02> G() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List<x02> arrayList2 = arrayList.isEmpty() ? hf3.t : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void H() {
        c41<g2b> c41VarB;
        synchronized (this.c) {
            c41VarB = B();
            if (((d) this.u.getValue()).compareTo(d.u) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (c41VarB != null) {
            ((e41) c41VarB).resumeWith(g2b.a);
        }
    }

    public final void I(x02 x02Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (xj5.a(((mz6) arrayList.get(i)).c, x02Var)) {
                    g2b g2bVar = g2b.a;
                    ArrayList arrayList2 = new ArrayList();
                    J(arrayList2, this, x02Var);
                    while (!arrayList2.isEmpty()) {
                        K(arrayList2, null);
                        J(arrayList2, this, x02Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<x02> K(List<mz6> list, d37<Object> d37Var) {
        g37 g37VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mz6 mz6Var = list.get(i);
            x02 x02Var = mz6Var.c;
            Object arrayList2 = map.get(x02Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(x02Var, arrayList2);
            }
            ((ArrayList) arrayList2).add(mz6Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            x02 x02Var2 = (x02) entry.getKey();
            List list2 = (List) entry.getValue();
            if (x02Var2.n()) {
                pt1.a("Check failed");
            }
            zj8 zj8Var = new zj8(x02Var2);
            dk8 dk8Var = new dk8(x02Var2, d37Var);
            hu9 hu9VarJ = qu9.j();
            g37 g37Var = hu9VarJ instanceof g37 ? (g37) hu9VarJ : null;
            if (g37Var == null || (g37VarC = g37Var.C(zj8Var, dk8Var)) == null) {
                aa0.c("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                hu9 hu9VarJ2 = g37VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                mz6 mz6Var2 = (mz6) list2.get(i2);
                                Object objC = y07.c(this.l, mz6Var2.a);
                                mz6 mz6Var3 = (mz6) objC;
                                if (mz6Var3 != null) {
                                    this.m.a(mz6Var3);
                                }
                                arrayList.add(new js7(mz6Var2, objC));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                js7 js7Var = (js7) arrayList.get(i3);
                                if (js7Var.u == 0) {
                                    if (this.m.a.a(((mz6) js7Var.t).a)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            js7 js7Var2 = (js7) arrayList.get(i4);
                                            if (js7Var2.u == 0) {
                                                w87 w87Var = this.m;
                                                kz6<Object> kz6Var = ((mz6) js7Var2.t).a;
                                                c37<Object, Object> c37Var = w87Var.a;
                                                x87 x87Var = (x87) y07.c(c37Var, kz6Var);
                                                if (c37Var.e()) {
                                                    w87Var.b.g();
                                                }
                                                if (x87Var != null) {
                                                    mz6 mz6Var4 = x87Var.a;
                                                    y07.a(this.o, x87Var.b, mz6Var4);
                                                    js7Var2 = new js7(js7Var2.t, mz6Var4);
                                                }
                                            }
                                            arrayList3.add(js7Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((js7) arrayList.get(i5)).u != 0) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((js7) arrayList.get(i6)).u == 0) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        js7 js7Var3 = (js7) arrayList.get(i7);
                                        mz6 mz6Var5 = js7Var3.u == 0 ? (mz6) js7Var3.t : null;
                                        if (mz6Var5 != null) {
                                            arrayList4.add(mz6Var5);
                                        }
                                    }
                                    synchronized (this.c) {
                                        rh1.o(arrayList4, this.k);
                                        g2b g2bVar = g2b.a;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj = arrayList.get(i8);
                                        if (((js7) obj).u != 0) {
                                            arrayList5.add(obj);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    x02Var2.g(arrayList);
                    g2b g2bVar2 = g2b.a;
                    hu9.q(hu9VarJ2);
                    y(g37VarC);
                } catch (Throwable th2) {
                    hu9.q(hu9VarJ2);
                    throw th2;
                }
            } catch (Throwable th3) {
                y(g37VarC);
                throw th3;
            }
        }
        return th1.T(map.keySet());
    }

    public final x02 L(x02 x02Var, d37<Object> d37Var) {
        d37<x02> d37Var2;
        g37 g37VarC;
        if (!x02Var.n() && !x02Var.k() && ((d37Var2 = this.q) == null || !d37Var2.c(x02Var))) {
            zj8 zj8Var = new zj8(x02Var);
            dk8 dk8Var = new dk8(x02Var, d37Var);
            hu9 hu9VarJ = qu9.j();
            g37 g37Var = hu9VarJ instanceof g37 ? (g37) hu9VarJ : null;
            if (g37Var == null || (g37VarC = g37Var.C(zj8Var, dk8Var)) == null) {
                aa0.c("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    hu9 hu9VarJ2 = g37VarC.j();
                    if (d37Var != null) {
                        try {
                            if (d37Var.h()) {
                                x02Var.o(new fk8(0, d37Var, x02Var));
                            }
                        } catch (Throwable th) {
                            hu9.q(hu9VarJ2);
                            throw th;
                        }
                    }
                    boolean zA = x02Var.A();
                    hu9.q(hu9VarJ2);
                    y(g37VarC);
                    if (zA) {
                        return x02Var;
                    }
                } catch (Throwable th2) {
                    y(g37VarC);
                    throw th2;
                }
            }
        }
        return null;
    }

    public final void M(Throwable th, x02 x02Var) throws Throwable {
        if (!A.get().booleanValue() || (th instanceof qs1)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                b bVar = (b) this.s.getValue();
                if (bVar != null) {
                    throw bVar.a;
                }
                a0a a0aVar = this.s;
                b bVar2 = new b(th);
                a0aVar.getClass();
                a0aVar.l(null, bVar2);
                g2b g2bVar = g2b.a;
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.k();
                this.h = new d37<>((Object) null);
                this.k.clear();
                this.l.g();
                this.n.g();
                a0a a0aVar2 = this.s;
                b bVar3 = new b(th);
                a0aVar2.getClass();
                a0aVar2.l(null, bVar3);
                if (x02Var != null) {
                    O(x02Var);
                }
                if (B() != null) {
                    pt1.a("expected to go to inactive state due to composition error");
                }
                g2b g2bVar2 = g2b.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean N() {
        boolean zD;
        synchronized (this.c) {
            if (this.h.g()) {
                return D();
            }
            List<x02> listG = G();
            b49 b49Var = new b49(this.h);
            this.h = new d37<>((Object) null);
            try {
                int size = listG.size();
                for (int i = 0; i < size; i++) {
                    listG.get(i).c(b49Var);
                    if (((d) this.u.getValue()).compareTo(d.u) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (B() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zD = D();
                }
                return zD;
            } catch (Throwable th) {
                synchronized (this.c) {
                    d37<Object> d37Var = this.h;
                    d37Var.getClass();
                    Iterator<T> it = b49Var.iterator();
                    while (it.hasNext()) {
                        d37Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void O(x02 x02Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(x02Var)) {
            arrayList.add(x02Var);
        }
        if (this.f.remove(x02Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.yt1
    public final void a(x02 x02Var, ci4<? super jt1, ? super Integer, g2b> ci4Var) throws Throwable {
        d dVar;
        boolean zContains;
        g37 g37VarC;
        boolean zN = x02Var.n();
        synchronized (this.c) {
            d dVar2 = (d) this.u.getValue();
            dVar = d.u;
            zContains = dVar2.compareTo(dVar) > 0 ? true ^ G().contains(x02Var) : true;
        }
        try {
            zj8 zj8Var = new zj8(x02Var);
            dk8 dk8Var = new dk8(x02Var, null);
            hu9 hu9VarJ = qu9.j();
            g37 g37Var = hu9VarJ instanceof g37 ? (g37) hu9VarJ : null;
            if (g37Var == null || (g37VarC = g37Var.C(zj8Var, dk8Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                hu9 hu9VarJ2 = g37VarC.j();
                try {
                    x02Var.b(ci4Var);
                    g2b g2bVar = g2b.a;
                    hu9.q(hu9VarJ2);
                    y(g37VarC);
                    synchronized (this.c) {
                        if (((d) this.u.getValue()).compareTo(dVar) > 0 && !G().contains(x02Var)) {
                            this.f.add(x02Var);
                            this.g = null;
                        }
                    }
                    if (!zN) {
                        qu9.j().m();
                    }
                    try {
                        I(x02Var);
                        try {
                            x02Var.m();
                            x02Var.j();
                            if (zN) {
                                return;
                            }
                            qu9.j().m();
                        } catch (Throwable th) {
                            M(th, null);
                        }
                    } catch (Throwable th2) {
                        M(th2, x02Var);
                    }
                } catch (Throwable th3) {
                    hu9.q(hu9VarJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                y(g37VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.c) {
                    g2b g2bVar2 = g2b.a;
                }
            }
            M(th5, x02Var);
        }
    }

    @Override // defpackage.yt1
    public final d37 b(x02 x02Var, yn9 yn9Var, ci4<? super jt1, ? super Integer, g2b> ci4Var) {
        kv9<d37<xj8>> kv9Var = this.v;
        try {
            yn9 yn9VarE = x02Var.e(yn9Var);
            try {
                a(x02Var, ci4Var);
                d37<Object> d37VarA = kv9Var.a();
                if (d37VarA == null) {
                    d37VarA = a49.a;
                    d37VarA.getClass();
                }
                x02Var.e(yn9VarE);
                kv9Var.b(null);
                return d37VarA;
            } catch (Throwable th) {
                x02Var.e(yn9VarE);
                throw th;
            }
        } catch (Throwable th2) {
            kv9Var.b(null);
            throw th2;
        }
    }

    @Override // defpackage.yt1
    public final void c(mz6 mz6Var) {
        c41<g2b> c41VarB;
        synchronized (this.c) {
            try {
                y07.a(this.l, mz6Var.a, mz6Var);
                if (mz6Var.h != null) {
                    A(this, mz6Var, mz6Var);
                }
                c41VarB = B();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c41VarB != null) {
            ((e41) c41VarB).resumeWith(g2b.a);
        }
    }

    @Override // defpackage.yt1
    public final boolean e() {
        return A.get().booleanValue();
    }

    @Override // defpackage.yt1
    public final boolean f() {
        return false;
    }

    @Override // defpackage.yt1
    public final boolean g() {
        return false;
    }

    @Override // defpackage.yt1
    public final long h() {
        return 1000L;
    }

    @Override // defpackage.yt1
    public final xt1 i() {
        return null;
    }

    @Override // defpackage.yt1
    public final h72 k() {
        return this.x;
    }

    @Override // defpackage.yt1
    public final boolean l() {
        return false;
    }

    @Override // defpackage.yt1
    public final void m(x02 x02Var) {
        c41<g2b> c41VarB;
        synchronized (this.c) {
            if (this.i.l(x02Var)) {
                c41VarB = null;
            } else {
                this.i.d(x02Var);
                c41VarB = B();
            }
        }
        if (c41VarB != null) {
            ((e41) c41VarB).resumeWith(g2b.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a A[Catch: all -> 0x0080, LOOP:0: B:16:0x004a->B:28:0x008a, LOOP_END, TryCatch #0 {all -> 0x0080, blocks: (B:4:0x0009, B:6:0x0016, B:11:0x002f, B:13:0x0035, B:16:0x004a, B:18:0x005a, B:20:0x0066, B:22:0x006f, B:25:0x0082, B:28:0x008a, B:29:0x008d, B:7:0x001c, B:9:0x0020, B:10:0x0023), top: B:34:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[EDGE_INSN: B:37:0x008d->B:29:0x008d BREAK  A[LOOP:0: B:16:0x004a->B:28:0x008a], SYNTHETIC] */
    @Override // defpackage.yt1
    public final void n(mz6 mz6Var, lz6 lz6Var, p20<?> p20Var) {
        le7 le7Var;
        synchronized (this.c) {
            try {
                this.n.m(mz6Var, lz6Var);
                Object objD = this.o.d(mz6Var);
                if (objD == null) {
                    le7Var = me7.b;
                    le7Var.getClass();
                } else if (objD instanceof t27) {
                    le7Var = (le7) objD;
                } else {
                    Object[] objArr = me7.a;
                    t27 t27Var = new t27(1);
                    t27Var.g(objD);
                    le7Var = t27Var;
                }
                if (le7Var.e()) {
                    c37 c37VarJ1 = lz6Var.a.j1(p20Var, le7Var);
                    Object[] objArr2 = c37VarJ1.b;
                    Object[] objArr3 = c37VarJ1.c;
                    long[] jArr = c37VarJ1.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        int i4 = (i << 3) + i3;
                                        Object obj = objArr2[i4];
                                        this.n.m((mz6) obj, (lz6) objArr3[i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                } else if (i != length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yt1
    public final lz6 o(mz6 mz6Var) {
        lz6 lz6VarK;
        synchronized (this.c) {
            lz6VarK = this.n.k(mz6Var);
        }
        return lz6VarK;
    }

    @Override // defpackage.yt1
    public final d37 p(x02 x02Var, yn9 yn9Var, d37 d37Var) {
        kv9<d37<xj8>> kv9Var = this.v;
        try {
            N();
            x02Var.c(new b49(d37Var));
            yn9 yn9VarE = x02Var.e(yn9Var);
            try {
                x02 x02VarL = L(x02Var, null);
                if (x02VarL != null) {
                    I(x02Var);
                    x02VarL.m();
                    x02VarL.j();
                }
                d37<Object> d37VarA = kv9Var.a();
                if (d37VarA == null) {
                    d37VarA = a49.a;
                    d37VarA.getClass();
                }
                x02Var.e(yn9VarE);
                kv9Var.b(null);
                return d37VarA;
            } catch (Throwable th) {
                x02Var.e(yn9VarE);
                throw th;
            }
        } catch (Throwable th2) {
            kv9Var.b(null);
            throw th2;
        }
    }

    @Override // defpackage.yt1
    public final void s(xj8 xj8Var) {
        kv9<d37<xj8>> kv9Var = this.v;
        d37<xj8> d37VarA = kv9Var.a();
        if (d37VarA == null) {
            d37VarA = a49.a();
            kv9Var.b(d37VarA);
        }
        d37VarA.a(xj8Var);
    }

    @Override // defpackage.yt1
    public final void t(x02 x02Var) {
        synchronized (this.c) {
            try {
                d37<x02> d37VarA = this.q;
                if (d37VarA == null) {
                    d37VarA = a49.a();
                    this.q = d37VarA;
                }
                d37VarA.a(x02Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yt1
    public final i41 u(t76 t76Var) {
        wa7 wa7Var = this.b;
        ah0<wa7.a> ah0Var = wa7Var.b;
        wa7.a aVar = new wa7.a();
        aVar.a = t76Var;
        return ah0Var.a(aVar, wa7Var.c);
    }

    @Override // defpackage.yt1
    public final void x(gu1 gu1Var) {
        synchronized (this.c) {
            if (this.f.remove(gu1Var)) {
                this.g = null;
            }
            this.i.n(gu1Var);
            this.j.remove(gu1Var);
            g2b g2bVar = g2b.a;
        }
    }

    public final void z() {
        synchronized (this.c) {
            try {
                if (((d) this.u.getValue()).compareTo(d.x) >= 0) {
                    a0a a0aVar = this.u;
                    d dVar = d.u;
                    a0aVar.getClass();
                    a0aVar.l(null, dVar);
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w.k(null);
    }

    @Override // defpackage.yt1
    public final void q(Set<au1> set) {
    }
}
