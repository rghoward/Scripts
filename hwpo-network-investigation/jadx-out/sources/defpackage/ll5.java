package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public class ll5 implements el5, ht7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(ll5.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> extends e41<T> {
        public final ll5 D;

        public a(r02<? super T> r02Var, ll5 ll5Var) {
            super(1, r02Var);
            this.D = ll5Var;
        }

        @Override // defpackage.e41
        public final String A() {
            return "AwaitContinuation";
        }

        @Override // defpackage.e41
        public final Throwable p(ll5 ll5Var) {
            Throwable thD;
            Object objS = this.D.S();
            if (!(objS instanceof c) || (thD = ((c) objS).d()) == null) {
                return objS instanceof jp1 ? ((jp1) objS).a : ll5Var.H();
            }
            return thD;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends kl5 {
        public final ll5 A;
        public final c B;
        public final bc1 C;
        public final Object D;

        public b(ll5 ll5Var, c cVar, bc1 bc1Var, Object obj) {
            this.A = ll5Var;
            this.B = cVar;
            this.C = bc1Var;
            this.D = obj;
        }

        @Override // defpackage.kl5
        public final boolean q() {
            return false;
        }

        @Override // defpackage.kl5
        public final void r(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ll5.t;
            ll5 ll5Var = this.A;
            ll5Var.getClass();
            bc1 bc1Var = this.C;
            bc1 bc1VarM0 = ll5.m0(bc1Var);
            c cVar = this.B;
            Object obj = this.D;
            if (bc1VarM0 == null || !ll5Var.A0(cVar, bc1VarM0, obj)) {
                cVar.t.c(new g96(2), 2);
                bc1 bc1VarM1 = ll5.m0(bc1Var);
                if (bc1VarM1 == null || !ll5Var.A0(cVar, bc1VarM1, obj)) {
                    ll5Var.r(ll5Var.K(cVar, obj));
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements ja5 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater w;
        public static final /* synthetic */ long x;
        public static final /* synthetic */ long y;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;
        public final rb7 t;

        static {
            Unsafe unsafe = rxc.a;
            y = unsafe.objectFieldOffset(c.class.getDeclaredField("_rootCause$volatile"));
            w = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
            x = unsafe.objectFieldOffset(c.class.getDeclaredField("_exceptionsHolder$volatile"));
        }

        public c(rb7 rb7Var, Throwable th) {
            this.t = rb7Var;
            this._rootCause$volatile = th;
        }

        public final void a(Throwable th) {
            Throwable thD = d();
            if (thD == null) {
                i(th);
                return;
            }
            if (th == thD) {
                return;
            }
            Object objC = c();
            if (objC == null) {
                g(th);
                return;
            }
            if (!(objC instanceof Throwable)) {
                if (objC instanceof ArrayList) {
                    ((ArrayList) objC).add(th);
                    return;
                } else {
                    tn2.d(objC, "State is ");
                    return;
                }
            }
            if (th == objC) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(objC);
            arrayList.add(th);
            g(arrayList);
        }

        @Override // defpackage.ja5
        public final rb7 b() {
            return this.t;
        }

        public final Object c() {
            w.getClass();
            return rxc.a.getObjectVolatile(this, x);
        }

        public final Throwable d() {
            v.getClass();
            return (Throwable) rxc.a.getObjectVolatile(this, y);
        }

        public final boolean e() {
            return d() != null;
        }

        public final ArrayList f(Throwable th) {
            ArrayList arrayList;
            Object objC = c();
            if (objC == null) {
                arrayList = new ArrayList(4);
            } else if (objC instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(objC);
                arrayList = arrayList2;
            } else {
                if (!(objC instanceof ArrayList)) {
                    tn2.d(objC, "State is ");
                    return null;
                }
                arrayList = (ArrayList) objC;
            }
            Throwable thD = d();
            if (thD != null) {
                arrayList.add(0, thD);
            }
            if (th != null && !th.equals(thD)) {
                arrayList.add(th);
            }
            g(ml5.x);
            return arrayList;
        }

        public final void g(Object obj) {
            w.getClass();
            rxc.a.putObjectVolatile(this, x, obj);
        }

        @Override // defpackage.ja5
        public final boolean h() {
            return d() == null;
        }

        public final void i(Throwable th) {
            v.getClass();
            rxc.a.putObjectVolatile(this, y, th);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(e());
            sb.append(", completing=");
            sb.append(u.get(this) == 1);
            sb.append(", rootCause=");
            sb.append(d());
            sb.append(", exceptions=");
            sb.append(c());
            sb.append(", list=");
            sb.append(this.t);
            sb.append(']');
            return sb.toString();
        }
    }

    static {
        Unsafe unsafe = rxc.a;
        w = unsafe.objectFieldOffset(ll5.class.getDeclaredField("_state$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(ll5.class, Object.class, "_parentHandle$volatile");
        v = unsafe.objectFieldOffset(ll5.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ll5(boolean z) {
        this._state$volatile = z ? ml5.z : ml5.y;
    }

    public static bc1 m0(hd6 hd6Var) {
        while (hd6Var.m()) {
            hd6Var = hd6Var.l();
        }
        while (true) {
            hd6Var = hd6Var.k();
            if (!hd6Var.m()) {
                if (hd6Var instanceof bc1) {
                    return (bc1) hd6Var;
                }
                if (hd6Var instanceof rb7) {
                    return null;
                }
            }
        }
    }

    public static String w0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof ja5) {
                return ((ja5) obj).h() ? "Active" : "New";
            }
            return obj instanceof jp1 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.e()) {
            return "Cancelling";
        }
        return c.u.get(cVar) == 1 ? "Completing" : "Active";
    }

    public void A(CancellationException cancellationException) {
        z(cancellationException);
    }

    public final boolean A0(c cVar, bc1 bc1Var, Object obj) {
        do {
            ll5 ll5Var = bc1Var.A;
            b bVar = new b(this, cVar, bc1Var, obj);
            if ((ll5Var != null ? ll5Var.Y(false, bVar) : ll5Var.E(false, false, new jl5(1, bVar, kl5.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0))) != yb7.t) {
                return true;
            }
            bc1Var = m0(bc1Var);
        } while (bc1Var != null);
        return false;
    }

    public final boolean C(Throwable th) {
        if (!b0()) {
            boolean z = th instanceof CancellationException;
            ac1 ac1VarR = R();
            if (ac1VarR == null || ac1VarR == yb7.t) {
                return z;
            }
            return ac1VarR.a(th) || z;
        }
        return true;
    }

    public String D() {
        return "Job was cancelled";
    }

    @Override // defpackage.el5
    public final e33 E(boolean z, boolean z2, jl5 jl5Var) {
        return Y(z2, z ? new nk5(jl5Var) : new ok5(jl5Var));
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return z(th) && M();
    }

    public final void G(ja5 ja5Var, Object obj) {
        ac1 ac1VarR = R();
        if (ac1VarR != null) {
            ac1VarR.dispose();
            u0(yb7.t);
        }
        kp1 kp1Var = null;
        jp1 jp1Var = obj instanceof jp1 ? (jp1) obj : null;
        Throwable th = jp1Var != null ? jp1Var.a : null;
        if (ja5Var instanceof kl5) {
            try {
                ((kl5) ja5Var).r(th);
                return;
            } catch (Throwable th2) {
                V(new kp1("Exception in completion handler " + ja5Var + " for " + this, th2));
                return;
            }
        }
        rb7 rb7VarB = ja5Var.b();
        if (rb7VarB != null) {
            rb7VarB.c(new g96(1), 1);
            Object objJ = rb7VarB.j();
            objJ.getClass();
            for (hd6 hd6VarK = (hd6) objJ; !hd6VarK.equals(rb7VarB); hd6VarK = hd6VarK.k()) {
                if (hd6VarK instanceof kl5) {
                    try {
                        ((kl5) hd6VarK).r(th);
                    } catch (Throwable th3) {
                        if (kp1Var != null) {
                            fn3.b(kp1Var, th3);
                        } else {
                            kp1Var = new kp1("Exception in completion handler " + hd6VarK + " for " + this, th3);
                            g2b g2bVar = g2b.a;
                        }
                    }
                }
            }
            if (kp1Var != null) {
                V(kp1Var);
            }
        }
    }

    @Override // defpackage.el5
    public final CancellationException H() {
        CancellationException cancellationException;
        Object objS = S();
        if (objS instanceof c) {
            Throwable thD = ((c) objS).d();
            if (thD == null) {
                tn2.d(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
            return cancellationException == null ? new fl5(strConcat, thD, this) : cancellationException;
        }
        if (objS instanceof ja5) {
            tn2.d(this, "Job is still new or active: ");
            return null;
        }
        if (!(objS instanceof jp1)) {
            return new fl5(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((jp1) objS).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new fl5(D(), th, this) : cancellationException;
    }

    public final Throwable I(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new fl5(D(), null, this) : th;
        }
        obj.getClass();
        return ((ht7) obj).f0();
    }

    @Override // defpackage.h72
    public final Object J(ci4 ci4Var, Object obj) {
        return ci4Var.invoke(obj, this);
    }

    public final Object K(c cVar, Object obj) throws Throwable {
        Throwable th;
        ll5 ll5Var;
        c cVar2;
        jp1 jp1Var = obj instanceof jp1 ? (jp1) obj : null;
        Throwable th2 = jp1Var != null ? jp1Var.a : null;
        synchronized (cVar) {
            try {
                cVar.e();
                ArrayList arrayListF = cVar.f(th2);
                Throwable thL = L(cVar, arrayListF);
                if (thL != null) {
                    try {
                        if (arrayListF.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                            int size = arrayListF.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListF.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thL && th3 != thL && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    fn3.b(thL, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thL != null && thL != th2) {
                    obj = new jp1(thL, false);
                }
                if (thL != null && (C(thL) || U(thL))) {
                    obj.getClass();
                    jp1.b.compareAndSet((jp1) obj, 0, 1);
                }
                o0(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
                Object ka5Var = obj instanceof ja5 ? new ka5((ja5) obj) : obj;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = rxc.a;
                    long j = w;
                    ll5Var = this;
                    cVar2 = cVar;
                    if (unsafe.compareAndSwapObject(ll5Var, j, cVar2, ka5Var) || unsafe.getObjectVolatile(ll5Var, j) != cVar2) {
                        break;
                    }
                    this = ll5Var;
                    cVar = cVar2;
                }
                ll5Var.G(cVar2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final Throwable L(c cVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (cVar.e()) {
                return new fl5(D(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof woa) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof woa)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean M() {
        return true;
    }

    @Override // defpackage.h72
    public final h72 N(h72.b<?> bVar) {
        return h72.a.C0100a.b(this, bVar);
    }

    public boolean O() {
        return this instanceof bp1;
    }

    public final rb7 Q(ja5 ja5Var) {
        rb7 rb7VarB = ja5Var.b();
        if (rb7VarB != null) {
            return rb7VarB;
        }
        if (ja5Var instanceof af3) {
            return new rb7();
        }
        if (ja5Var instanceof kl5) {
            s0((kl5) ja5Var);
            return null;
        }
        tn2.d(ja5Var, "State should have list: ");
        return null;
    }

    public final ac1 R() {
        u.getClass();
        return (ac1) rxc.a.getObjectVolatile(this, v);
    }

    public final Object S() {
        t.getClass();
        return rxc.a.getObjectVolatile(this, w);
    }

    public boolean U(Throwable th) {
        return false;
    }

    public final void X(el5 el5Var) {
        yb7 yb7Var = yb7.t;
        if (el5Var == null) {
            u0(yb7Var);
            return;
        }
        el5Var.start();
        ac1 ac1VarY = el5Var.y(this);
        u0(ac1VarY);
        if (a0()) {
            ac1VarY.dispose();
            u0(yb7Var);
        }
    }

    public final e33 Y(boolean z, kl5 kl5Var) {
        ll5 ll5Var;
        kl5 kl5Var2;
        boolean zC;
        kl5Var.z = this;
        loop0: while (true) {
            Object objS = this.S();
            if (!(objS instanceof af3)) {
                ll5Var = this;
                kl5Var2 = kl5Var;
                boolean z2 = objS instanceof ja5;
                yb7 yb7Var = yb7.t;
                if (z2) {
                    ja5 ja5Var = (ja5) objS;
                    rb7 rb7VarB = ja5Var.b();
                    if (rb7VarB == null) {
                        ll5Var.s0((kl5) objS);
                    } else {
                        if (kl5Var2.q()) {
                            c cVar = ja5Var instanceof c ? (c) ja5Var : null;
                            Throwable thD = cVar != null ? cVar.d() : null;
                            if (thD == null) {
                                zC = rb7VarB.c(kl5Var2, 5);
                            } else if (z) {
                                kl5Var2.r(thD);
                                return yb7Var;
                            }
                        } else {
                            zC = rb7VarB.c(kl5Var2, 1);
                        }
                        if (zC) {
                            break;
                        }
                    }
                    this = ll5Var;
                    kl5Var = kl5Var2;
                } else if (z) {
                    Object objS2 = ll5Var.S();
                    jp1 jp1Var = objS2 instanceof jp1 ? (jp1) objS2 : null;
                    kl5Var2.r(jp1Var != null ? jp1Var.a : null);
                }
                return yb7Var;
            }
            af3 af3Var = (af3) objS;
            if (af3Var.t) {
                while (true) {
                    t.getClass();
                    Unsafe unsafe = rxc.a;
                    long j = w;
                    ll5Var = this;
                    kl5Var2 = kl5Var;
                    if (unsafe.compareAndSwapObject(ll5Var, j, objS, kl5Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(ll5Var, j) != objS) {
                        break;
                    }
                    this = ll5Var;
                    kl5Var = kl5Var2;
                }
            } else {
                ll5Var = this;
                kl5Var2 = kl5Var;
                ll5Var.r0(af3Var);
            }
            this = ll5Var;
            kl5Var = kl5Var2;
        }
        return kl5Var2;
    }

    public final boolean a0() {
        return !(S() instanceof ja5);
    }

    public boolean b0() {
        return this instanceof jr0;
    }

    @Override // defpackage.h72
    public final h72 c0(h72 h72Var) {
        return h72.a.C0100a.c(this, h72Var);
    }

    @Override // defpackage.h72
    public final <E extends h72.a> E d0(h72.b<E> bVar) {
        return (E) h72.a.C0100a.a(this, bVar);
    }

    @Override // defpackage.ht7
    public final CancellationException f0() {
        Throwable thD;
        Object objS = S();
        if (objS instanceof c) {
            thD = ((c) objS).d();
        } else if (objS instanceof jp1) {
            thD = ((jp1) objS).a;
        } else {
            if (objS instanceof ja5) {
                tn2.d(objS, "Cannot be cancelling child in this state: ");
                return null;
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new fl5("Parent job is ".concat(w0(objS)), thD, this) : cancellationException;
    }

    public Object g0(r02<Object> r02Var) {
        return w(r02Var);
    }

    @Override // h72.a
    public final h72.b<?> getKey() {
        return el5.a.t;
    }

    @Override // defpackage.el5
    public boolean h() {
        Object objS = S();
        return (objS instanceof ja5) && ((ja5) objS).h();
    }

    public final boolean h0(Object obj) {
        Object objZ0;
        do {
            objZ0 = z0(S(), obj);
            if (objZ0 == ml5.t) {
                return false;
            }
            if (objZ0 == ml5.u) {
                return true;
            }
        } while (objZ0 == ml5.v);
        r(objZ0);
        return true;
    }

    public final Object i0(Object obj) {
        Object objZ0;
        do {
            objZ0 = z0(S(), obj);
            if (objZ0 == ml5.t) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                jp1 jp1Var = obj instanceof jp1 ? (jp1) obj : null;
                throw new IllegalStateException(str, jp1Var != null ? jp1Var.a : null);
            }
        } while (objZ0 == ml5.v);
        return objZ0;
    }

    @Override // defpackage.el5
    public final boolean isCancelled() {
        Object objS = S();
        if (objS instanceof jp1) {
            return true;
        }
        return (objS instanceof c) && ((c) objS).e();
    }

    @Override // defpackage.el5
    public final e33 j0(oh4<? super Throwable, g2b> oh4Var) {
        return Y(true, new ok5(oh4Var));
    }

    @Override // defpackage.el5
    public void k(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new fl5(D(), null, this);
        }
        A(cancellationException);
    }

    public String k0() {
        return getClass().getSimpleName();
    }

    public final void n0(rb7 rb7Var, Throwable th) {
        rb7Var.c(new g96(4), 4);
        Object objJ = rb7Var.j();
        objJ.getClass();
        kp1 kp1Var = null;
        for (hd6 hd6VarK = (hd6) objJ; !hd6VarK.equals(rb7Var); hd6VarK = hd6VarK.k()) {
            if ((hd6VarK instanceof kl5) && ((kl5) hd6VarK).q()) {
                try {
                    ((kl5) hd6VarK).r(th);
                } catch (Throwable th2) {
                    if (kp1Var != null) {
                        fn3.b(kp1Var, th2);
                    } else {
                        kp1Var = new kp1("Exception in completion handler " + hd6VarK + " for " + this, th2);
                        g2b g2bVar = g2b.a;
                    }
                }
            }
        }
        if (kp1Var != null) {
            V(kp1Var);
        }
        C(th);
    }

    @Override // defpackage.el5
    public final Object p0(u02 u02Var) throws Throwable {
        Object objS;
        do {
            objS = S();
            if (!(objS instanceof ja5)) {
                sd.d(u02Var.getContext());
                return g2b.a;
            }
        } while (v0(objS) < 0);
        e41 e41Var = new e41(1, th0.e(u02Var));
        e41Var.t();
        e41Var.w(new k33(sd.g(this, new fv8(e41Var))));
        Object objR = e41Var.r();
        v72 v72Var = v72.t;
        if (objR != v72Var) {
            objR = g2b.a;
        }
        return objR == v72Var ? objR : g2b.a;
    }

    public final void r0(af3 af3Var) {
        rb7 rb7Var = new rb7();
        Object y95Var = af3Var.t ? rb7Var : new y95(rb7Var);
        while (true) {
            t.getClass();
            Unsafe unsafe = rxc.a;
            long j = w;
            ll5 ll5Var = this;
            af3 af3Var2 = af3Var;
            if (unsafe.compareAndSwapObject(ll5Var, j, af3Var2, y95Var) || unsafe.getObjectVolatile(ll5Var, j) != af3Var2) {
                return;
            }
            this = ll5Var;
            af3Var = af3Var2;
        }
    }

    public void s(Object obj) {
        r(obj);
    }

    public final void s0(kl5 kl5Var) {
        kl5Var.e(new rb7());
        hd6 hd6VarK = kl5Var.k();
        while (true) {
            t.getClass();
            Unsafe unsafe = rxc.a;
            long j = w;
            ll5 ll5Var = this;
            kl5 kl5Var2 = kl5Var;
            if (unsafe.compareAndSwapObject(ll5Var, j, kl5Var2, hd6VarK) || unsafe.getObjectVolatile(ll5Var, j) != kl5Var2) {
                return;
            }
            this = ll5Var;
            kl5Var = kl5Var2;
        }
    }

    @Override // defpackage.el5
    public final boolean start() {
        int iV0;
        do {
            iV0 = v0(S());
            if (iV0 == 0) {
                return false;
            }
        } while (iV0 != 1);
        return true;
    }

    public final void t0(kl5 kl5Var) {
        ll5 ll5Var;
        while (true) {
            Object objS = this.S();
            if (!(objS instanceof kl5)) {
                if (!(objS instanceof ja5) || ((ja5) objS).b() == null) {
                    return;
                }
                kl5Var.n();
                return;
            }
            if (objS != kl5Var) {
                return;
            }
            af3 af3Var = ml5.z;
            while (true) {
                t.getClass();
                Unsafe unsafe = rxc.a;
                long j = w;
                ll5Var = this;
                if (unsafe.compareAndSwapObject(ll5Var, j, objS, af3Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(ll5Var, j) != objS) {
                    break;
                } else {
                    this = ll5Var;
                }
            }
            this = ll5Var;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(k0() + '{' + w0(S()) + '}');
        sb.append('@');
        sb.append(ym2.c(this));
        return sb.toString();
    }

    public final void u0(ac1 ac1Var) {
        u.getClass();
        rxc.a.putObjectVolatile(this, v, ac1Var);
    }

    public final int v0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof af3;
        long j = w;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        if (z) {
            if (((af3) obj).t) {
                return 0;
            }
            af3 af3Var = ml5.z;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = rxc.a;
                if (unsafe2.compareAndSwapObject(this, w, obj, af3Var)) {
                    q0();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof y95)) {
            return 0;
        }
        rb7 rb7Var = ((y95) obj).t;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = rxc.a;
            if (unsafe.compareAndSwapObject(this, w, obj, rb7Var)) {
                q0();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final Object w(r02<Object> r02Var) throws Throwable {
        Object objS;
        do {
            objS = S();
            if (!(objS instanceof ja5)) {
                if (objS instanceof jp1) {
                    throw ((jp1) objS).a;
                }
                return ml5.d(objS);
            }
        } while (v0(objS) < 0);
        a aVar = new a(th0.e(r02Var), this);
        aVar.t();
        aVar.w(new k33(sd.g(this, new ev8(aVar))));
        return aVar.r();
    }

    public final boolean x0(ja5 ja5Var, Object obj) {
        Object ka5Var = obj instanceof ja5 ? new ka5((ja5) obj) : obj;
        while (true) {
            t.getClass();
            Unsafe unsafe = rxc.a;
            long j = w;
            ll5 ll5Var = this;
            ja5 ja5Var2 = ja5Var;
            if (unsafe.compareAndSwapObject(ll5Var, j, ja5Var2, ka5Var)) {
                ll5Var.o0(obj);
                ll5Var.G(ja5Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(ll5Var, j) != ja5Var2) {
                return false;
            }
            this = ll5Var;
            ja5Var = ja5Var2;
        }
    }

    @Override // defpackage.el5
    public final ac1 y(ll5 ll5Var) {
        ll5 ll5Var2;
        bc1 bc1Var = new bc1(ll5Var);
        bc1Var.z = this;
        loop0: while (true) {
            Object objS = this.S();
            if (objS instanceof af3) {
                af3 af3Var = (af3) objS;
                if (af3Var.t) {
                    while (true) {
                        t.getClass();
                        Unsafe unsafe = rxc.a;
                        long j = w;
                        ll5Var2 = this;
                        if (unsafe.compareAndSwapObject(ll5Var2, j, objS, bc1Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(ll5Var2, j) != objS) {
                            break;
                        }
                        this = ll5Var2;
                    }
                } else {
                    ll5Var2 = this;
                    ll5Var2.r0(af3Var);
                }
                this = ll5Var2;
            } else {
                ll5Var2 = this;
                boolean z = objS instanceof ja5;
                yb7 yb7Var = yb7.t;
                Throwable thD = null;
                if (!z) {
                    Object objS2 = ll5Var2.S();
                    jp1 jp1Var = objS2 instanceof jp1 ? (jp1) objS2 : null;
                    bc1Var.r(jp1Var != null ? jp1Var.a : null);
                    return yb7Var;
                }
                rb7 rb7VarB = ((ja5) objS).b();
                if (rb7VarB != null) {
                    if (rb7VarB.c(bc1Var, 7)) {
                        break;
                    }
                    boolean zC = rb7VarB.c(bc1Var, 3);
                    Object objS3 = ll5Var2.S();
                    if (objS3 instanceof c) {
                        thD = ((c) objS3).d();
                    } else {
                        jp1 jp1Var2 = objS3 instanceof jp1 ? (jp1) objS3 : null;
                        if (jp1Var2 != null) {
                            thD = jp1Var2.a;
                        }
                    }
                    bc1Var.r(thD);
                    if (zC) {
                        break;
                    }
                    return yb7Var;
                }
                ll5Var2.s0((kl5) objS);
                this = ll5Var2;
            }
        }
        return bc1Var;
    }

    public final boolean y0(ja5 ja5Var, Throwable th) {
        rb7 rb7VarQ = Q(ja5Var);
        if (rb7VarQ == null) {
            return false;
        }
        c cVar = new c(rb7VarQ, th);
        while (true) {
            t.getClass();
            Unsafe unsafe = rxc.a;
            long j = w;
            ll5 ll5Var = this;
            ja5 ja5Var2 = ja5Var;
            if (unsafe.compareAndSwapObject(ll5Var, j, ja5Var2, cVar)) {
                ll5Var.n0(rb7VarQ, th);
                return true;
            }
            if (unsafe.getObjectVolatile(ll5Var, j) != ja5Var2) {
                return false;
            }
            this = ll5Var;
            ja5Var = ja5Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
      0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:37:0x0075, B:35:0x006b, B:36:0x006f), top: B:74:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:37:0x0075, B:35:0x006b, B:36:0x006f), top: B:74:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b A[Catch: all -> 0x005c, TryCatch #0 {, blocks: (B:24:0x004b, B:26:0x0056, B:31:0x005e, B:37:0x0075, B:35:0x006b, B:36:0x006f), top: B:74:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    public final boolean z(Object obj) {
        Throwable thI;
        Object objS;
        Throwable thD;
        k7a k7aVar;
        ja5 ja5Var;
        Object objZ0;
        Object objZ1 = ml5.t;
        if (O()) {
            do {
                Object objS2 = S();
                if (objS2 instanceof ja5) {
                    if (objS2 instanceof c) {
                        if (c.u.get((c) objS2) == 1) {
                        }
                    }
                    objZ1 = z0(objS2, new jp1(I(obj), false));
                }
                objZ1 = ml5.t;
                break;
            } while (objZ1 == ml5.v);
            if (objZ1 != ml5.u) {
                if (objZ1 == ml5.t) {
                    thI = null;
                    while (true) {
                        objS = S();
                        if (objS instanceof c) {
                            synchronized (objS) {
                                if (((c) objS).c() == ml5.x) {
                                    k7aVar = ml5.w;
                                } else {
                                    boolean zE = ((c) objS).e();
                                    if (obj == null || !zE) {
                                        if (thI == null) {
                                            thI = I(obj);
                                        }
                                        ((c) objS).a(thI);
                                    }
                                    thD = zE ? null : ((c) objS).d();
                                    if (thD != null) {
                                        n0(((c) objS).t, thD);
                                    }
                                    k7aVar = ml5.t;
                                }
                            }
                        } else if (objS instanceof ja5) {
                            if (thI == null) {
                                thI = I(obj);
                            }
                            ja5Var = (ja5) objS;
                            if (ja5Var.h()) {
                                objZ0 = z0(objS, new jp1(thI, false));
                                if (objZ0 != ml5.t) {
                                    tn2.d(objS, "Cannot happen in ");
                                    return false;
                                }
                                if (objZ0 != ml5.v) {
                                    objZ1 = objZ0;
                                    break;
                                }
                            } else if (y0(ja5Var, thI)) {
                                k7aVar = ml5.t;
                            }
                        } else {
                            k7aVar = ml5.w;
                        }
                        objZ1 = k7aVar;
                        break;
                    }
                }
                if (objZ1 != ml5.t && objZ1 != ml5.u) {
                    if (objZ1 == ml5.w) {
                        return false;
                    }
                    r(objZ1);
                    return true;
                }
            }
        } else {
            if (objZ1 == ml5.t) {
                thI = null;
                while (true) {
                    objS = S();
                    if (objS instanceof c) {
                        synchronized (objS) {
                            if (((c) objS).c() == ml5.x) {
                                k7aVar = ml5.w;
                            } else {
                                boolean zE2 = ((c) objS).e();
                                if (obj == null) {
                                    if (thI == null) {
                                        thI = I(obj);
                                    }
                                    ((c) objS).a(thI);
                                } else {
                                    if (thI == null) {
                                        thI = I(obj);
                                    }
                                    ((c) objS).a(thI);
                                }
                                if (zE2) {
                                }
                                if (thD != null) {
                                    n0(((c) objS).t, thD);
                                }
                                k7aVar = ml5.t;
                            }
                        }
                    } else if (objS instanceof ja5) {
                        if (thI == null) {
                            thI = I(obj);
                        }
                        ja5Var = (ja5) objS;
                        if (ja5Var.h()) {
                            objZ0 = z0(objS, new jp1(thI, false));
                            if (objZ0 != ml5.t) {
                                tn2.d(objS, "Cannot happen in ");
                                return false;
                            }
                            if (objZ0 != ml5.v) {
                                objZ1 = objZ0;
                                break;
                            }
                        } else if (y0(ja5Var, thI)) {
                            k7aVar = ml5.t;
                        }
                    } else {
                        k7aVar = ml5.w;
                    }
                    objZ1 = k7aVar;
                    break;
                }
            }
            if (objZ1 != ml5.t) {
                if (objZ1 == ml5.w) {
                    return false;
                }
                r(objZ1);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final Object z0(Object obj, Object obj2) {
        if (!(obj instanceof ja5)) {
            return ml5.t;
        }
        if (((obj instanceof af3) || (obj instanceof kl5)) && !(obj instanceof bc1) && !(obj2 instanceof jp1)) {
            return x0((ja5) obj, obj2) ? obj2 : ml5.v;
        }
        ja5 ja5Var = (ja5) obj;
        rb7 rb7VarQ = Q(ja5Var);
        if (rb7VarQ == null) {
            return ml5.v;
        }
        c cVar = ja5Var instanceof c ? (c) ja5Var : null;
        if (cVar == null) {
            cVar = new c(rb7VarQ, null);
        }
        gl8 gl8Var = new gl8();
        synchronized (cVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c.u;
            if (atomicIntegerFieldUpdater.get(cVar) == 1) {
                return ml5.t;
            }
            atomicIntegerFieldUpdater.set(cVar, 1);
            if (cVar != ja5Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, ja5Var, cVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != ja5Var) {
                        return ml5.v;
                    }
                }
            }
            boolean zE = cVar.e();
            jp1 jp1Var = obj2 instanceof jp1 ? (jp1) obj2 : null;
            if (jp1Var != null) {
                cVar.a(jp1Var.a);
            }
            ?? D = zE ? 0 : cVar.d();
            gl8Var.t = D;
            g2b g2bVar = g2b.a;
            if (D != 0) {
                n0(rb7VarQ, D);
            }
            bc1 bc1VarM0 = m0(rb7VarQ);
            if (bc1VarM0 != null && A0(cVar, bc1VarM0, obj2)) {
                return ml5.u;
            }
            rb7VarQ.c(new g96(2), 2);
            bc1 bc1VarM1 = m0(rb7VarQ);
            return (bc1VarM1 == null || !A0(cVar, bc1VarM1, obj2)) ? K(cVar, obj2) : ml5.u;
        }
    }

    public void q0() {
    }

    public void V(kp1 kp1Var) {
        throw kp1Var;
    }

    public void o0(Object obj) {
    }

    public void r(Object obj) {
    }
}
