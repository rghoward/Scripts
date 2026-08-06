package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bx8 extends ox6.c implements ju1, a73, nq5 {
    public final h27 H;
    public final boolean I;
    public final float J;
    public final yw2 K;
    public final b22 L;
    public f0a M;
    public float N;
    public boolean P;
    public long O = 0;
    public final t27<n88> Q = new t27<>((Object) null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;

        /* JADX INFO: renamed from: bx8$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0035a<T> implements s54 {
            public final /* synthetic */ bx8 t;
            public final /* synthetic */ t72 u;

            public C0035a(bx8 bx8Var, t72 t72Var) {
                this.t = bx8Var;
                this.u = t72Var;
            }

            @Override // defpackage.s54
            public final Object emit(Object obj, r02 r02Var) {
                float f;
                qg5 qg5Var = (qg5) obj;
                boolean z = qg5Var instanceof n88;
                bx8 bx8Var = this.t;
                if (!z) {
                    f0a f0aVar = bx8Var.M;
                    if (f0aVar == null) {
                        f0aVar = new f0a(bx8Var.I, bx8Var.L);
                        b73.a(bx8Var);
                        bx8Var.M = f0aVar;
                    }
                    ArrayList arrayList = f0aVar.d;
                    if (qg5Var instanceof l35) {
                        arrayList.add(qg5Var);
                    } else if (qg5Var instanceof m35) {
                        arrayList.remove(((m35) qg5Var).a);
                    } else if (qg5Var instanceof v84) {
                        arrayList.add(qg5Var);
                    } else if (qg5Var instanceof w84) {
                        arrayList.remove(((w84) qg5Var).a);
                    } else if (qg5Var instanceof d63) {
                        arrayList.add(qg5Var);
                    } else if (qg5Var instanceof e63) {
                        arrayList.remove(((e63) qg5Var).a);
                    } else if (qg5Var instanceof c63) {
                        arrayList.remove(((c63) qg5Var).a);
                    }
                    qg5 qg5Var2 = (qg5) th1.H(arrayList);
                    if (!xj5.a(f0aVar.e, qg5Var2)) {
                        t72 t72Var = this.u;
                        if (qg5Var2 != null) {
                            qw8 qw8VarInvoke = f0aVar.b.invoke();
                            boolean z2 = qg5Var2 instanceof l35;
                            if (z2) {
                                qw8VarInvoke.getClass();
                                f = 0.08f;
                            } else if (qg5Var2 instanceof v84) {
                                qw8VarInvoke.getClass();
                                f = 0.1f;
                            } else if (qg5Var2 instanceof d63) {
                                qw8VarInvoke.getClass();
                                f = 0.16f;
                            } else {
                                f = 0.0f;
                            }
                            xya<Float> xyaVar = ax8.a;
                            if (!z2 && ((qg5Var2 instanceof v84) || (qg5Var2 instanceof d63))) {
                                xyaVar = new xya<>(45, ca3.c, 2);
                            }
                            oy0.d(t72Var, null, null, new d0a(f0aVar, f, xyaVar, null), 3);
                        } else {
                            qg5 qg5Var3 = f0aVar.e;
                            xya<Float> xyaVar2 = ax8.a;
                            if (!(qg5Var3 instanceof l35) && !(qg5Var3 instanceof v84) && (qg5Var3 instanceof d63)) {
                                xyaVar2 = new xya<>(150, ca3.c, 2);
                            }
                            oy0.d(t72Var, null, null, new e0a(f0aVar, xyaVar2, null), 3);
                        }
                        f0aVar.e = qg5Var2;
                    }
                } else if (bx8Var.P) {
                    bx8Var.c2((n88) qg5Var);
                } else {
                    bx8Var.Q.g(qg5Var);
                }
                return g2b.a;
            }
        }

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = bx8.this.new a(r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return g2b.a;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            t72 t72Var = (t72) this.u;
            bx8 bx8Var = bx8.this;
            am9 am9VarA = bx8Var.H.a();
            C0035a c0035a = new C0035a(bx8Var, t72Var);
            this.t = 1;
            am9VarA.collect(c0035a, this);
            return v72.t;
        }
    }

    public bx8(h27 h27Var, boolean z, float f, yw2 yw2Var, b22 b22Var) {
        this.H = h27Var;
        this.I = z;
        this.J = f;
        this.K = yw2Var;
        this.L = b22Var;
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // ox6.c
    public final void U1() {
        oy0.d(Q1(), null, null, new a(null), 3);
    }

    public final void c2(n88 n88Var) {
        xw8 xw8Var;
        if (!(n88Var instanceof n88.b)) {
            if (n88Var instanceof n88.c) {
                xw8 xw8Var2 = ((ar) this).S;
                if (xw8Var2 != null) {
                    xw8Var2.d();
                    return;
                }
                return;
            }
            if (!(n88Var instanceof n88.a) || (xw8Var = ((ar) this).S) == null) {
                return;
            }
            xw8Var.d();
            return;
        }
        n88.b bVar = (n88.b) n88Var;
        long j = this.O;
        float f = this.N;
        ar arVar = (ar) this;
        sw8 sw8Var = arVar.R;
        int i = 0;
        if (sw8Var == null) {
            Object obj = (View) ku1.a(arVar, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    ca0.c(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    sw8 sw8Var2 = new sw8(viewGroup.getContext());
                    viewGroup.addView(sw8Var2);
                    sw8Var = sw8Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof sw8) {
                        sw8Var = (sw8) childAt;
                        break;
                    }
                    i2++;
                }
            }
            arVar.R = sw8Var;
        }
        ArrayList arrayList = sw8Var.u;
        vw8 vw8Var = sw8Var.w;
        LinkedHashMap linkedHashMap = vw8Var.a;
        LinkedHashMap linkedHashMap2 = vw8Var.a;
        LinkedHashMap linkedHashMap3 = vw8Var.b;
        xw8 xw8Var3 = (xw8) linkedHashMap.get(arVar);
        if (xw8Var3 == null) {
            ArrayList arrayList2 = sw8Var.v;
            arrayList2.getClass();
            xw8Var3 = (xw8) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (xw8Var3 == null) {
                if (sw8Var.x > ws0.g(arrayList)) {
                    xw8Var3 = new xw8(sw8Var.getContext());
                    sw8Var.addView(xw8Var3);
                    arrayList.add(xw8Var3);
                } else {
                    xw8Var3 = (xw8) arrayList.get(sw8Var.x);
                    uw8 uw8Var = (uw8) linkedHashMap3.get(xw8Var3);
                    if (uw8Var != null) {
                        uw8Var.z0();
                        xw8 xw8Var4 = (xw8) linkedHashMap2.get(uw8Var);
                        if (xw8Var4 != null) {
                        }
                        linkedHashMap2.remove(uw8Var);
                        xw8Var3.c();
                    }
                }
                int i3 = sw8Var.x;
                if (i3 < sw8Var.t - 1) {
                    sw8Var.x = i3 + 1;
                } else {
                    sw8Var.x = 0;
                }
            }
            linkedHashMap2.put(arVar, xw8Var3);
            linkedHashMap3.put(xw8Var3, arVar);
        }
        int iB = wk6.b(f);
        long jA = arVar.K.a();
        arVar.L.invoke();
        xw8 xw8Var5 = xw8Var3;
        xw8Var5.b(bVar, arVar.I, j, iB, jA, new zq(i, arVar));
        arVar.S = xw8Var5;
        b73.a(arVar);
    }

    @Override // defpackage.nq5, defpackage.ml6
    public final void g(long j) {
        float fU0;
        this.P = true;
        tx2 tx2Var = ew2.f(this).R;
        this.O = c43.c(j);
        float f = this.J;
        if (Float.isNaN(f)) {
            long j2 = this.O;
            float fD = cr9.d(j2);
            fU0 = vf7.c((((long) Float.floatToRawIntBits(cr9.b(j2))) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32)) / 2.0f;
            if (this.I) {
                fU0 += tx2Var.U0(10.0f);
            }
        } else {
            fU0 = tx2Var.U0(f);
        }
        this.N = fU0;
        t27<n88> t27Var = this.Q;
        Object[] objArr = t27Var.a;
        int i = t27Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            c2((n88) objArr[i2]);
        }
        t27Var.j();
    }

    @Override // defpackage.a73
    public final void t(tr5 tr5Var) {
        s41 s41Var = tr5Var.t;
        tr5Var.K1();
        f0a f0aVar = this.M;
        if (f0aVar != null) {
            float f = this.N;
            long jA = this.K.a();
            float fFloatValue = f0aVar.c.d().floatValue();
            if (fFloatValue > 0.0f) {
                long jB = uh1.b(fFloatValue, jA);
                if (f0aVar.a) {
                    float fD = cr9.d(s41Var.c());
                    float fB = cr9.b(s41Var.c());
                    s41.b bVar = s41Var.u;
                    long jD = bVar.d();
                    bVar.a().f();
                    try {
                        bVar.a.b(0.0f, 0.0f, fD, fB, 1);
                        d73.N(tr5Var, jB, f, 0L, 0, 124);
                        x3.b(bVar, jD);
                    } catch (Throwable th) {
                        x3.b(bVar, jD);
                        throw th;
                    }
                } else {
                    d73.N(tr5Var, jB, f, 0L, 0, 124);
                }
            }
        }
        ar arVar = (ar) this;
        n41 n41VarA = s41Var.u.a();
        xw8 xw8Var = arVar.S;
        if (xw8Var != null) {
            long j = arVar.O;
            int iB = wk6.b(arVar.N);
            long jA2 = arVar.K.a();
            arVar.L.invoke();
            xw8Var.e(j, iB, jA2);
            xw8Var.draw(pl.a(n41VarA));
        }
    }
}
