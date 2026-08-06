package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fe5 extends pmb.b implements Runnable, pg7, View.OnAttachStateChangeListener {
    public final t27<h37<Rect>> A;
    public final fv9<yk8> B;
    public boolean v;
    public int w;
    public umb x;
    public final c37 y;
    public final bt7 z;

    public fe5() {
        super(1);
        c37 c37Var = new c37(9);
        jnb.a.getClass();
        c37Var.m(jnb.a.b, new eob("caption bar"));
        c37Var.m(jnb.a.c, new eob("display cutout"));
        c37Var.m(jnb.a.d, new eob("ime"));
        c37Var.m(jnb.a.e, new eob("mandatory system gestures"));
        c37Var.m(jnb.a.f, new eob("navigation bars"));
        c37Var.m(jnb.a.g, new eob("status bars"));
        c37Var.m(jnb.a.h, new eob("system gestures"));
        c37Var.m(jnb.a.i, new eob("tappable element"));
        c37Var.m(jnb.a.j, new eob("waterfall"));
        this.y = c37Var;
        this.z = new bt7(0);
        this.A = new t27<>(4);
        this.B = new fv9<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pmb.b
    public final void a(pmb pmbVar) {
        boolean z = false;
        this.v = false;
        int iD = pmbVar.a.d();
        this.w &= ~iD;
        this.x = null;
        jnb jnbVar = (jnb) lnb.a.b(iD);
        if (jnbVar != null) {
            V vD = this.y.d(jnbVar);
            vD.getClass();
            eob eobVar = (eob) vD;
            eobVar.c.g(0.0f);
            eobVar.e.g(1.0f);
            eobVar.d.o(0L);
            eobVar.c.g(0.0f);
            eobVar.b.setValue(Boolean.FALSE);
            eobVar.j = -1L;
            eobVar.k = -1L;
            bt7 bt7Var = this.z;
            bt7Var.j(bt7Var.k() + 1);
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
    }

    @Override // defpackage.pg7
    public final umb b(View view, umb umbVar) {
        if (this.v) {
            this.x = umbVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return umbVar;
            }
        } else if (this.w == 0) {
            f(umbVar);
        }
        return umbVar;
    }

    @Override // pmb.b
    public final void c(pmb pmbVar) {
        this.v = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pmb.b
    public final umb d(umb umbVar, List<pmb> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pmb pmbVar = list.get(i);
            jnb jnbVar = (jnb) lnb.a.b(pmbVar.a.d());
            if (jnbVar != null) {
                V vD = this.y.d(jnbVar);
                vD.getClass();
                eob eobVar = (eob) vD;
                if (((Boolean) eobVar.b.getValue()).booleanValue()) {
                    pmb.e eVar = pmbVar.a;
                    eobVar.c.g(eVar.c());
                    eobVar.e.g(eVar.a());
                    eobVar.d.o(eVar.b());
                }
            }
        }
        f(umbVar);
        return umbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pmb.b
    public final pmb.a e(pmb pmbVar, pmb.a aVar) {
        umb umbVar = this.x;
        boolean z = false;
        this.v = false;
        this.x = null;
        if (pmbVar.a.b() > 0 && umbVar != null) {
            int iD = pmbVar.a.d();
            this.w |= iD;
            jnb jnbVar = (jnb) lnb.a.b(iD);
            if (jnbVar != null) {
                V vD = this.y.d(jnbVar);
                vD.getClass();
                eob eobVar = (eob) vD;
                xd5 xd5VarI = umbVar.a.i(iD);
                long j = (((long) xd5VarI.a) << 48) | (((long) xd5VarI.b) << 32) | (((long) xd5VarI.c) << 16) | ((long) xd5VarI.d);
                long j2 = eobVar.h;
                if (!b64.b(j, j2)) {
                    eobVar.j = j2;
                    eobVar.k = j;
                    eobVar.b.setValue(Boolean.TRUE);
                    pmb.e eVar = pmbVar.a;
                    eobVar.c.g(eVar.c());
                    eobVar.e.g(eVar.a());
                    eobVar.d.o(eVar.b());
                    bt7 bt7Var = this.z;
                    bt7Var.j(bt7Var.k() + 1);
                    synchronized (qu9.c) {
                        d37<m0a> d37Var = qu9.j.h;
                        if (d37Var != null && d37Var.h()) {
                            z = true;
                        }
                    }
                    if (z) {
                        qu9.a();
                        return aVar;
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(umb umbVar) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        e27 e27Var = lnb.a;
        int[] iArr2 = e27Var.b;
        Object[] objArr3 = e27Var.c;
        long[] jArr2 = e27Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            jnb jnbVar = (jnb) objArr3[i6];
                            xd5 xd5VarI = umbVar.a.i(i7);
                            long j3 = (((long) xd5VarI.a) << 48) | (((long) xd5VarI.b) << 32) | (((long) xd5VarI.c) << 16) | ((long) xd5VarI.d);
                            V vD = this.y.d(jnbVar);
                            vD.getClass();
                            eob eobVar = (eob) vD;
                            if (!b64.b(j3, eobVar.h)) {
                                eobVar.h = j3;
                                z2 = true;
                                if (!b64.b(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                xd5 xd5VarJ = umbVar.a.j(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) xd5VarJ.b) << 32) | (((long) xd5VarJ.a) << 48) | (((long) xd5VarJ.c) << 16) | ((long) xd5VarJ.d);
                                if (!b64.b(eobVar.i, j4)) {
                                    eobVar.i = j4;
                                    z2 = true;
                                    if (!b64.b(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            eobVar.a.setValue(Boolean.valueOf(umbVar.a.u(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        l23 l23VarH = umbVar.a.h();
        if (l23VarH == null) {
            j = 0;
        } else {
            xd5 xd5VarA = l23VarH.a();
            j = (((long) xd5VarA.a) << c3) | (((long) xd5VarA.b) << c2) | (((long) xd5VarA.c) << c) | ((long) xd5VarA.d);
        }
        c37 c37Var = this.y;
        jnb.a.getClass();
        V vD2 = c37Var.d(jnb.a.j);
        vD2.getClass();
        eob eobVar2 = (eob) vD2;
        eobVar2.a.setValue(Boolean.valueOf(!b64.b(j, 0L)));
        if (!b64.b(eobVar2.h, j)) {
            eobVar2.h = j;
            eobVar2.i = j;
            z2 = z;
            if (!b64.b(j, 0L)) {
                z3 = z2;
            }
        }
        if (l23VarH == null) {
            t27<h37<Rect>> t27Var = this.A;
            if (t27Var.b > 0) {
                t27Var.j();
                this.B.clear();
                z2 = z;
            }
        } else {
            List<Rect> listA = Build.VERSION.SDK_INT >= 28 ? l23.a.a(l23VarH.a) : Collections.EMPTY_LIST;
            int size = listA.size();
            t27<h37<Rect>> t27Var2 = this.A;
            if (size < t27Var2.b) {
                t27Var2.m(listA.size(), this.A.b);
                this.B.j(listA.size(), this.B.size());
                z2 = z;
            } else {
                int size2 = listA.size() - this.A.b;
                int i8 = 0;
                while (i8 < size2) {
                    t27<h37<Rect>> t27Var3 = this.A;
                    t27Var3.g(bl7.i(listA.get(t27Var3.b)));
                    this.B.add(new zk8("display cutout rect " + this.A.b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listA.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = listA.get(i9);
                h37<Rect> h37VarB = this.A.b(i9);
                if (!xj5.a(h37VarB.getValue(), rect)) {
                    h37VarB.setValue(rect);
                    z2 = z;
                }
            }
            if (!listA.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.z.k() != 0) && z2) {
            bt7 bt7Var = this.z;
            bt7Var.j(bt7Var.k() + 1);
            synchronized (qu9.c) {
                d37<m0a> d37Var = qu9.j.h;
                z4 = (d37Var == null || d37Var.h() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                qu9.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(view, this);
        egb.q(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap<View, fib> weakHashMap = egb.a;
        egb.d.c(view, null);
        egb.q(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.v) {
            this.w = 0;
            this.v = false;
            umb umbVar = this.x;
            if (umbVar != null) {
                f(umbVar);
                this.x = null;
            }
        }
    }
}
