package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class owa {
    public static final ad a = new ad(3);

    public static final <S, T, V extends fw> void a(final tva<S> tvaVar, final tva<S>.d<T, V> dVar, final T t, final T t2, final a04<T> a04Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(867041821);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(tvaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bj4VarO.J(t) : bj4VarO.j(t) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bj4VarO.J(t2) : bj4VarO.j(t2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? bj4VarO.J(a04Var) : bj4VarO.j(a04Var) ? 16384 : 8192;
        }
        if (!bj4VarO.A(i2 & 1, (i2 & 9363) != 9362)) {
            bj4VarO.u();
        } else if (tvaVar.g()) {
            dVar.l(t, t2, a04Var);
        } else {
            dVar.m(t2, a04Var);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: fwa
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    owa.a(tvaVar, dVar, t, t2, a04Var, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final tva.a b(final tva tvaVar, dza dzaVar, String str, jt1 jt1Var, int i, int i2) {
        tva.a.C0252a c0252a;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zJ = jt1Var.J(tvaVar);
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (zJ || objF == c0187a) {
            objF = new tva.a(dzaVar, str);
            jt1Var.C(objF);
        }
        final tva.a aVar = (tva.a) objF;
        boolean zJ2 = jt1Var.J(tvaVar) | jt1Var.j(aVar);
        Object objF2 = jt1Var.f();
        if (zJ2 || objF2 == c0187a) {
            objF2 = new oh4() { // from class: cwa
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return new hwa(tvaVar, aVar);
                }
            };
            jt1Var.C(objF2);
        }
        wd3.a(aVar, (oh4) objF2, jt1Var);
        if (tvaVar.g() && (c0252a = (tva.a.C0252a) aVar.b.getValue()) != null) {
            tva<S> tvaVar2 = tva.this;
            c0252a.t.l((T) c0252a.v.invoke((Object) tvaVar2.f().d()), (T) c0252a.v.invoke((Object) tvaVar2.f().f()), (a04<T>) ((a04) c0252a.u.invoke(tvaVar2.f())));
        }
        return aVar;
    }

    public static final tva.d c(final tva tvaVar, Object obj, Object obj2, a04 a04Var, cza czaVar, jt1 jt1Var, int i) {
        boolean zJ = jt1Var.J(tvaVar);
        Object objF = jt1Var.f();
        Object obj3 = jt1.a.a;
        if (zJ || objF == obj3) {
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            try {
                fw fwVar = (fw) czaVar.a().invoke(obj2);
                fwVar.d();
                objF = new tva.d(obj, fwVar, czaVar);
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                jt1Var.C(objF);
            } catch (Throwable th) {
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                throw th;
            }
        }
        final tva.d dVar = (tva.d) objF;
        a(tvaVar, dVar, obj, obj2, a04Var, jt1Var, 0);
        boolean zJ2 = jt1Var.J(tvaVar) | jt1Var.J(dVar);
        Object objF2 = jt1Var.f();
        if (zJ2 || objF2 == obj3) {
            objF2 = new oh4() { // from class: ewa
                @Override // defpackage.oh4
                public final Object invoke(Object obj4) {
                    tva tvaVar2 = tvaVar;
                    fv9<tva<S>.d<?, ?>> fv9Var = tvaVar2.i;
                    tva<S>.d<?, ?> dVar2 = dVar;
                    fv9Var.add(dVar2);
                    return new iwa(tvaVar2, dVar2);
                }
            };
            jt1Var.C(objF2);
        }
        wd3.a(dVar, (oh4) objF2, jt1Var);
        return dVar;
    }

    public static final tva d(l4c l4cVar, String str, jt1 jt1Var, int i) {
        int i2 = (i & 14) ^ 6;
        int i3 = 1;
        boolean z = (i2 > 4 && jt1Var.J(l4cVar)) || (i & 6) == 4;
        Object objF = jt1Var.f();
        Object obj = jt1.a.a;
        if (z || objF == obj) {
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            try {
                Object tvaVar = new tva(l4cVar, null, str);
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                jt1Var.C(tvaVar);
                objF = tvaVar;
            } catch (Throwable th) {
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                throw th;
            }
        }
        tva tvaVar2 = (tva) objF;
        if (l4cVar instanceof w89) {
            jt1Var.K(-1357590553);
            Object objF2 = jt1Var.f();
            if (objF2 == obj) {
                c33 c33Var = wd3.a;
                Object nm8Var = new nm8(jt1Var.x());
                jt1Var.C(nm8Var);
                objF2 = nm8Var;
            }
            Object obj2 = (t72) objF2;
            boolean zJ = jt1Var.j(obj2) | ((i2 > 4 && jt1Var.J(l4cVar)) || (i & 6) == 4);
            Object objF3 = jt1Var.f();
            if (zJ || objF3 == obj) {
                objF3 = new r67(i3, l4cVar, obj2);
                jt1Var.C(objF3);
            }
            wd3.a(obj2, (oh4) objF3, jt1Var);
            w89 w89Var = (w89) l4cVar;
            T value = w89Var.c.getValue();
            T value2 = w89Var.b.getValue();
            if ((i2 <= 4 || !jt1Var.J(l4cVar)) && (i & 6) != 4) {
                i3 = 0;
            }
            Object objF4 = jt1Var.f();
            if (i3 != 0 || objF4 == obj) {
                objF4 = new kwa(l4cVar, null);
                jt1Var.C(objF4);
            }
            wd3.f(value, value2, (ci4) objF4, jt1Var);
            jt1Var.B();
        } else {
            jt1Var.K(-1356604288);
            tvaVar2.a(l4cVar.d(), jt1Var, 0);
            jt1Var.B();
        }
        boolean zJ2 = jt1Var.J(tvaVar2);
        Object objF5 = jt1Var.f();
        if (zJ2 || objF5 == obj) {
            objF5 = new gr3(2, tvaVar2);
            jt1Var.C(objF5);
        }
        wd3.a(tvaVar2, (oh4) objF5, jt1Var);
        return tvaVar2;
    }

    @gy2
    public static final tva e(j37 j37Var, String str, jt1 jt1Var, int i) {
        return d(j37Var, str, jt1Var, i & 126);
    }

    public static final tva f(Object obj, String str, jt1 jt1Var, int i) {
        Object objF = jt1Var.f();
        jt1.a.C0187a c0187a = jt1.a.a;
        if (objF == c0187a) {
            objF = new tva(new j37(obj), null, str);
            jt1Var.C(objF);
        }
        tva tvaVar = (tva) objF;
        tvaVar.a(obj, jt1Var, (i & 8) | 48 | (i & 14));
        Object objF2 = jt1Var.f();
        if (objF2 == c0187a) {
            objF2 = new mb3(1, tvaVar);
            jt1Var.C(objF2);
        }
        wd3.a(tvaVar, (oh4) objF2, jt1Var);
        return tvaVar;
    }
}
