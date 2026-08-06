package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fr1 implements ci4, ei4, fi4, gi4, hi4, ii4, ji4, ki4, nh4, ph4, rh4, sh4, th4, uh4, vh4, wh4, xh4, zh4, ai4 {
    public final int t;
    public final boolean u;
    public Object v;
    public vj8 w;
    public ArrayList x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<jt1, Integer, g2b> {
        @Override // defpackage.ci4
        public final g2b invoke(jt1 jt1Var, Integer num) {
            int iIntValue = num.intValue();
            ((fr1) this.receiver).c(jt1Var, iIntValue);
            return g2b.a;
        }
    }

    public fr1(boolean z, int i, Object obj) {
        this.t = i;
        this.u = z;
        this.v = obj;
    }

    @Override // defpackage.ji4
    public final /* bridge */ /* synthetic */ Object a(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, jt1 jt1Var, Integer num) {
        return e(obj, bool, obj2, obj3, obj4, jt1Var, num.intValue());
    }

    public final Object c(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(this.t);
        i(bj4VarO);
        int iA = i | (bj4VarO.J(this) ? gr1.a(2, 0) : gr1.a(1, 0));
        Object obj = this.v;
        obj.getClass();
        fza.b(2, obj);
        Object objInvoke = ((ci4) obj).invoke(bj4VarO, Integer.valueOf(iA));
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new a(2, this, fr1.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    public final Object d(final Object obj, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(this.t);
        i(bj4VarO);
        int iA = bj4VarO.J(this) ? gr1.a(2, 1) : gr1.a(1, 1);
        Object obj2 = this.v;
        obj2.getClass();
        fza.b(3, obj2);
        Object objInvoke = ((ei4) obj2).invoke(obj, bj4VarO, Integer.valueOf(iA | i));
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: br1
                @Override // defpackage.ci4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iS = gz3.s(i) | 1;
                    this.t.d(obj, (jt1) obj3, iS);
                    return g2b.a;
                }
            };
        }
        return objInvoke;
    }

    public final Object e(final Object obj, final Boolean bool, final Object obj2, final Object obj3, final Object obj4, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(this.t);
        i(bj4VarO);
        int iA = bj4VarO.J(this) ? gr1.a(2, 6) : gr1.a(1, 6);
        Object obj5 = this.v;
        obj5.getClass();
        fza.b(8, obj5);
        Object objA = ((ji4) obj5).a(obj, bool, obj2, obj3, obj4, bj4VarO, Integer.valueOf(i | iA));
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: cr1
                @Override // defpackage.ci4
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    this.t.e(obj, bool, obj2, obj3, obj4, (jt1) obj6, gz3.s(i) | 1);
                    return g2b.a;
                }
            };
        }
        return objA;
    }

    public final Object f(final Object obj, final Object obj2, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(this.t);
        i(bj4VarO);
        int iA = bj4VarO.J(this) ? gr1.a(2, 2) : gr1.a(1, 2);
        Object obj3 = this.v;
        obj3.getClass();
        fza.b(4, obj3);
        Object objInvoke = ((fi4) obj3).invoke(obj, obj2, bj4VarO, Integer.valueOf(iA | i));
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: dr1
                @Override // defpackage.ci4
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iS = gz3.s(i) | 1;
                    this.t.f(obj, obj2, (jt1) obj4, iS);
                    return g2b.a;
                }
            };
        }
        return objInvoke;
    }

    public final Object g(final Object obj, final Object obj2, final Object obj3, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(this.t);
        i(bj4VarO);
        int iA = bj4VarO.J(this) ? gr1.a(2, 3) : gr1.a(1, 3);
        Object obj4 = this.v;
        obj4.getClass();
        fza.b(5, obj4);
        Object objInvoke = ((gi4) obj4).invoke(obj, obj2, obj3, bj4VarO, Integer.valueOf(iA | i));
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: er1
                @Override // defpackage.ci4
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    this.t.g(obj, obj2, obj3, (jt1) obj5, gz3.s(i) | 1);
                    return g2b.a;
                }
            };
        }
        return objInvoke;
    }

    public final void i(jt1 jt1Var) {
        xj8 xj8VarA;
        if (!this.u || (xj8VarA = jt1Var.a()) == null) {
            return;
        }
        jt1Var.t(xj8VarA);
        if (gr1.c(this.w, xj8VarA)) {
            this.w = xj8VarA;
            return;
        }
        ArrayList arrayList = this.x;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.x = arrayList2;
            arrayList2.add(xj8VarA);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (gr1.c((vj8) arrayList.get(i), xj8VarA)) {
                arrayList.set(i, xj8VarA);
                return;
            }
        }
        arrayList.add(xj8VarA);
    }

    @Override // defpackage.ci4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return c((jt1) obj, ((Number) obj2).intValue());
    }

    public final void j(di4 di4Var) {
        if (xj5.a(this.v, di4Var)) {
            return;
        }
        boolean z = this.v == null;
        this.v = di4Var;
        if (z || !this.u) {
            return;
        }
        vj8 vj8Var = this.w;
        if (vj8Var != null) {
            vj8Var.invalidate();
            this.w = null;
        }
        ArrayList arrayList = this.x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((vj8) arrayList.get(i)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // defpackage.ei4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return d(obj, (jt1) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.fi4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return f(obj, obj2, (jt1) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.gi4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return g(obj, obj2, obj3, (jt1) obj4, ((Number) obj5).intValue());
    }
}
