package defpackage;

import dja.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dja {
    public final dt7 a = bl7.i(null);
    public iw b;
    public final fv9<oh4<cba, g2b>> c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ r86 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r86 r86Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = r86Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, r02Var);
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
            this.t = 1;
            r86 r86Var = this.u;
            r86Var.getClass();
            r86Var.a.a().collect(new q86(new t27((Object) null), r86Var), this);
            return v72.t;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements b33 {
        public final /* synthetic */ oh4 b;

        public b(oh4 oh4Var) {
            this.b = oh4Var;
        }

        @Override // defpackage.b33
        public final void dispose() {
            dja.this.c.remove(this.b);
        }
    }

    public dja(iw iwVar) {
        hp6 hp6Var = new hp6(1);
        iwVar.getClass();
        iw.b bVar = new iw.b(iwVar);
        ArrayList arrayList = bVar.v;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) hp6Var.invoke(((iw.b.a) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                iw.c cVar = (iw.c) list.get(i2);
                arrayList3.add(new iw.b.a(cVar.a, cVar.b, cVar.c, cVar.d));
            }
            rh1.o(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = bVar.i();
        this.c = new fv9<>();
    }

    public static iw.c c(iw.c cVar, ria riaVar) {
        l07 l07Var = riaVar.b;
        int iC = l07Var.c(l07Var.f - 1, false);
        if (cVar.b < iC) {
            return iw.c.a(cVar, null, Math.min(cVar.c, iC), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(1154651354);
        char c = 2;
        int i3 = (bj4VarO.j(this) ? 4 : 2) | i;
        int i4 = 1;
        if (bj4VarO.A(i3 & 1, (i3 & 3) != 2)) {
            final x4b x4bVar = (x4b) bj4VarO.F(qu1.s);
            iw iwVar = this.b;
            List listA = iwVar.a(iwVar.u.length());
            int size = listA.size();
            int i5 = 0;
            while (i5 < size) {
                final iw.c cVar = (iw.c) listA.get(i5);
                int i6 = cVar.b;
                T t = cVar.a;
                if (i6 != cVar.c) {
                    bj4VarO.K(725478935);
                    Object objF = bj4VarO.f();
                    jt1.a.C0187a c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = new i27();
                        bj4VarO.C(objF);
                    }
                    h27 h27Var = (h27) objF;
                    ox6 ox6VarA = po4.a(ox6.a.t, new h25(i4, this, cVar));
                    Object objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new w36(i4);
                        bj4VarO.C(objF2);
                    }
                    i2 = i4;
                    ox6 ox6VarH = pb9.b(ox6VarA, false, (oh4) objF2).H(new nja(new cja(this, cVar))).H(new n35(h27Var));
                    w48.a.getClass();
                    ox6 ox6VarC = by5.c(ox6VarH, y48.v);
                    boolean zJ = bj4VarO.j(this) | bj4VarO.J(cVar) | bj4VarO.j(x4bVar);
                    Object objF3 = bj4VarO.f();
                    if (zJ || objF3 == c0187a) {
                        objF3 = new mh4(this) { // from class: wia
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                m86 m86Var;
                                x4b x4bVar2 = x4bVar;
                                l86 l86Var = (l86) cVar.a;
                                if (l86Var instanceof l86.b) {
                                    m86 m86Var2 = ((l86.b) l86Var).c;
                                    if (m86Var2 != null) {
                                        m86Var2.a(l86Var);
                                    } else {
                                        try {
                                            x4bVar2.a(((l86.b) l86Var).a);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }
                                } else if ((l86Var instanceof l86.a) && (m86Var = ((l86.a) l86Var).c) != null) {
                                    m86Var.a(l86Var);
                                }
                                return g2b.a;
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    dv0.a(ox6VarC.H(new ej1(h27Var, (mh4) objF3)), bj4VarO, 0);
                    l86 l86Var = (l86) t;
                    fja fjaVarB = l86Var.b();
                    if (fjaVarB == null || (fjaVarB.a == null && fjaVarB.b == null && fjaVarB.c == null && fjaVarB.d == null)) {
                        bj4VarO.K(728331710);
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(726303039);
                        Object objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new r86(h27Var);
                            bj4VarO.C(objF4);
                        }
                        final r86 r86Var = (r86) objF4;
                        g2b g2bVar = g2b.a;
                        Object objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new a(r86Var, null);
                            bj4VarO.C(objF5);
                        }
                        wd3.d(bj4VarO, (ci4) objF5, g2bVar);
                        bt7 bt7Var = r86Var.b;
                        bt7 bt7Var2 = r86Var.b;
                        Boolean boolValueOf = Boolean.valueOf((bt7Var.k() & 2) != 0 ? i2 : 0);
                        Boolean boolValueOf2 = Boolean.valueOf((bt7Var2.k() & 1) != 0 ? i2 : 0);
                        Boolean boolValueOf3 = Boolean.valueOf((bt7Var2.k() & 4) != 0 ? i2 : 0);
                        fja fjaVarB2 = l86Var.b();
                        ww9 ww9Var = fjaVarB2 != null ? fjaVarB2.a : null;
                        fja fjaVarB3 = l86Var.b();
                        ww9 ww9Var2 = fjaVarB3 != null ? fjaVarB3.b : null;
                        fja fjaVarB4 = l86Var.b();
                        ww9 ww9Var3 = fjaVarB4 != null ? fjaVarB4.c : null;
                        fja fjaVarB5 = l86Var.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, ww9Var, ww9Var2, ww9Var3, fjaVarB5 != null ? fjaVarB5.d : null};
                        boolean zJ2 = bj4VarO.j(this) | bj4VarO.J(cVar);
                        Object objF6 = bj4VarO.f();
                        if (zJ2 || objF6 == c0187a) {
                            objF6 = new oh4(this) { // from class: xia
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    fja fjaVarB6;
                                    fja fjaVarB7;
                                    fja fjaVarB8;
                                    bt7 bt7Var3 = r86Var.b;
                                    cba cbaVar = (cba) obj;
                                    final iw.c cVar2 = cVar;
                                    l86 l86Var2 = (l86) cVar2.a;
                                    fja fjaVarB9 = l86Var2.b();
                                    final ww9 ww9VarC = null;
                                    ww9 ww9Var4 = fjaVarB9 != null ? fjaVarB9.a : null;
                                    ww9 ww9VarC2 = ((bt7Var3.k() & 1) == 0 || (fjaVarB8 = l86Var2.b()) == null) ? null : fjaVarB8.b;
                                    if (ww9Var4 != null) {
                                        ww9VarC2 = ww9Var4.c(ww9VarC2);
                                    }
                                    ww9 ww9VarC3 = ((bt7Var3.k() & 2) == 0 || (fjaVarB7 = l86Var2.b()) == null) ? null : fjaVarB7.c;
                                    if (ww9VarC2 != null) {
                                        ww9VarC3 = ww9VarC2.c(ww9VarC3);
                                    }
                                    if ((bt7Var3.k() & 4) != 0 && (fjaVarB6 = l86Var2.b()) != null) {
                                        ww9VarC = fjaVarB6.d;
                                    }
                                    if (ww9VarC3 != null) {
                                        ww9VarC = ww9VarC3.c(ww9VarC);
                                    }
                                    cbaVar.getClass();
                                    final cl8 cl8Var = new cl8();
                                    cbaVar.b = cbaVar.a.b(new oh4() { // from class: bba
                                        /* JADX WARN: Code duplicated, block: B:14:0x004b  */
                                        @Override // defpackage.oh4
                                        public final Object invoke(Object obj2) {
                                            iw.c cVar3;
                                            iw.c cVar4 = (iw.c) obj2;
                                            cl8 cl8Var2 = cl8Var;
                                            boolean z = cl8Var2.t;
                                            iw.c cVar5 = cVar2;
                                            if (z) {
                                                T t2 = cVar4.a;
                                                int i7 = cVar4.c;
                                                int i8 = cVar4.b;
                                                if ((t2 instanceof ww9) && i8 == cVar5.b && i7 == cVar5.c) {
                                                    ww9 ww9Var5 = ww9VarC;
                                                    if (ww9Var5 == null) {
                                                        ww9Var5 = new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                                                    }
                                                    cVar3 = new iw.c(i8, i7, ww9Var5);
                                                } else {
                                                    cVar3 = cVar4;
                                                }
                                            } else {
                                                cVar3 = cVar4;
                                            }
                                            cl8Var2.t = cVar5.equals(cVar4);
                                            return cVar3;
                                        }
                                    });
                                    return g2b.a;
                                }
                            };
                            bj4VarO.C(objF6);
                        }
                        b(objArr, (oh4) objF6, bj4VarO, (i3 << 6) & 896);
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(false);
                } else {
                    i2 = i4;
                    bj4VarO.K(728345598);
                    bj4VarO.U(false);
                }
                i5++;
                c = c;
                i4 = i2;
            }
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(i) { // from class: yia
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    this.t.a((jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public final void b(final Object[] objArr, final oh4<? super cba, g2b> oh4Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-2083052099);
        int i2 = (i & 48) == 0 ? (bj4VarO.j(oh4Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(this) ? 256 : 128;
        }
        bj4VarO.p(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (bj4VarO.h(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= bj4VarO.j(obj) ? 4 : 0;
        }
        bj4VarO.U(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (bj4VarO.A(i3 & 1, (i3 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(oh4Var);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zJ = bj4VarO.j(this) | ((i3 & 112) == 32);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: aja
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        dja djaVar = this.t;
                        fv9<oh4<cba, g2b>> fv9Var = djaVar.c;
                        oh4<cba, g2b> oh4Var2 = oh4Var;
                        fv9Var.add(oh4Var2);
                        return djaVar.new b(oh4Var2);
                    }
                };
                bj4VarO.C(objF);
            }
            wd3.c(array, (oh4) objF, bj4VarO);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bja
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iS = gz3.s(i | 1);
                    this.t.b(objArr, oh4Var, (jt1) obj2, iS);
                    return g2b.a;
                }
            };
        }
    }
}
