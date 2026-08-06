package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lu {
    public static final void a(n23 n23Var, ox6 ox6Var, oh4 oh4Var, di diVar, String str, oh4 oh4Var2, fr1 fr1Var, jt1 jt1Var, int i) {
        int i2;
        di diVar2;
        oh4 oh4Var3;
        bj4 bj4VarO = jt1Var.o(1501828832);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(n23Var) : bj4VarO.j(n23Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= bj4VarO.J(str) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= bj4VarO.j(fr1Var) ? 1048576 : 524288;
        }
        if (bj4VarO.A(i4 & 1, (599187 & i4) != 599186)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = zt.u;
                bj4VarO.C(objF);
            }
            oh4 oh4Var4 = (oh4) objF;
            tva tvaVarF = owa.f(n23Var, str, bj4VarO, (i4 & 14) | ((i4 >> 9) & 112));
            int i5 = i4 & 8176;
            int i6 = i4 >> 3;
            sp0 sp0Var = di.a.a;
            b(tvaVarF, ox6Var, oh4Var, sp0Var, oh4Var4, fr1Var, bj4VarO, i5 | (57344 & i6) | (i6 & 458752));
            diVar2 = sp0Var;
            oh4Var3 = oh4Var4;
        } else {
            bj4VarO.u();
            diVar2 = diVar;
            oh4Var3 = oh4Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new au(n23Var, ox6Var, oh4Var, diVar2, str, oh4Var3, fr1Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(tva tvaVar, ox6 ox6Var, oh4 oh4Var, di diVar, oh4 oh4Var2, fr1 fr1Var, jt1 jt1Var, int i) {
        int i2;
        bj4 bj4Var;
        l4c l4cVar;
        oh4 oh4Var3;
        su suVar;
        su suVar2;
        fv9 fv9Var;
        Throwable th;
        bj4 bj4Var2;
        boolean z;
        oh4 oh4Var4 = oh4Var;
        bj4 bj4VarO = jt1Var.o(511725103);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(tvaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(diVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(oh4Var2) ? 16384 : 8192;
        }
        fr1 fr1Var2 = fr1Var;
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.j(fr1Var2) ? 131072 : 65536;
        }
        if (bj4VarO.A(i2 & 1, (74899 & i2) != 74898)) {
            tq5 tq5Var = (tq5) bj4VarO.F(qu1.n);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z2 || objF == c0187a) {
                objF = new su(tvaVar, diVar, tq5Var);
                bj4VarO.C(objF);
            }
            su suVar3 = (su) objF;
            boolean z3 = i3 == 4;
            Object objF2 = bj4VarO.f();
            Object obj = objF2;
            if (z3 || objF2 == c0187a) {
                Object[] objArr = {tvaVar.a.b()};
                fv9 fv9Var2 = new fv9();
                fv9Var2.addAll(u30.E(objArr));
                bj4VarO.C(fv9Var2);
                obj = fv9Var2;
            }
            fv9 fv9Var3 = (fv9) obj;
            boolean z4 = i3 == 4;
            Object objF3 = bj4VarO.f();
            if (z4 || objF3 == c0187a) {
                objF3 = z39.b();
                bj4VarO.C(objF3);
            }
            c37 c37Var = (c37) objF3;
            l4c l4cVar2 = tvaVar.a;
            dt7 dt7Var = tvaVar.d;
            if (!fv9Var3.contains(l4cVar2.b())) {
                fv9Var3.clear();
                fv9Var3.add(l4cVar2.b());
            }
            if (xj5.a(l4cVar2.b(), dt7Var.getValue())) {
                if (fv9Var3.size() != 1 || !xj5.a(fv9Var3.get(0), l4cVar2.b())) {
                    fv9Var3.clear();
                    fv9Var3.add(l4cVar2.b());
                }
                if (c37Var.e != 1 || c37Var.b(l4cVar2.b())) {
                    c37Var.g();
                }
                suVar3.b = diVar;
            }
            if (xj5.a(l4cVar2.b(), dt7Var.getValue()) || fv9Var3.contains(dt7Var.getValue())) {
                l4cVar = l4cVar2;
            } else {
                ListIterator listIterator = fv9Var3.listIterator();
                int i4 = 0;
                while (true) {
                    h0a h0aVar = (h0a) listIterator;
                    l4cVar = l4cVar2;
                    if (!h0aVar.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (xj5.a(oh4Var2.invoke(h0aVar.next()), oh4Var2.invoke(dt7Var.getValue()))) {
                            break;
                        }
                        i4++;
                        l4cVar2 = l4cVar;
                    }
                }
                if (i4 == -1) {
                    fv9Var3.add(dt7Var.getValue());
                } else {
                    fv9Var3.set(i4, dt7Var.getValue());
                }
            }
            if (c37Var.b(dt7Var.getValue()) && c37Var.b(l4cVar.b())) {
                bj4VarO.K(1968995539);
                bj4VarO.U(false);
                oh4Var3 = oh4Var4;
                suVar = suVar3;
            } else {
                bj4VarO.K(1966410449);
                c37Var.g();
                int size = fv9Var3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = fv9Var3.get(i5);
                    c37Var.m(obj2, gr1.b(-23915175, new iu(tvaVar, obj2, oh4Var4, suVar3, fv9Var3, fr1Var2), bj4VarO));
                    i5++;
                    fr1Var2 = fr1Var;
                    oh4Var4 = oh4Var4;
                    suVar3 = suVar3;
                }
                oh4Var3 = oh4Var4;
                suVar = suVar3;
                bj4VarO.U(false);
            }
            boolean zJ = bj4VarO.J(tvaVar.f()) | bj4VarO.J(suVar);
            Object objF4 = bj4VarO.f();
            if (zJ || objF4 == c0187a) {
                objF4 = (oz1) oh4Var3.invoke(suVar);
                bj4VarO.C(objF4);
            }
            oz1 oz1Var = (oz1) objF4;
            tva<S> tvaVar2 = suVar.a;
            boolean zJ2 = bj4VarO.J(suVar);
            Object objF5 = bj4VarO.f();
            if (zJ2 || objF5 == c0187a) {
                objF5 = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF5);
            }
            h37 h37Var = (h37) objF5;
            h37 h37VarJ = bl7.j(oz1Var.d, bj4VarO);
            if (xj5.a(tvaVar2.a.b(), tvaVar2.d.getValue())) {
                h37Var.setValue(Boolean.FALSE);
            } else if (h37VarJ.getValue() != 0) {
                h37Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) h37Var.getValue()).booleanValue();
            ox6 ox6VarB = ox6.a.t;
            tva.a aVarB = null;
            if (zBooleanValue) {
                bj4VarO.K(1353077497);
                su suVar4 = suVar;
                fv9Var = fv9Var3;
                suVar2 = suVar4;
                bj4 bj4Var3 = bj4VarO;
                th = null;
                aVarB = owa.b(suVar4.a, b0a.C, null, bj4Var3, 0, 2);
                boolean zJ3 = bj4Var3.J(aVarB);
                Object objF6 = bj4Var3.f();
                if (zJ3 || objF6 == c0187a) {
                    mr9 mr9Var = (mr9) h37VarJ.getValue();
                    if (mr9Var == null || mr9Var.b()) {
                        ox6VarB = uma.b(ox6VarB);
                    }
                    bj4Var3.C(ox6VarB);
                    objF6 = ox6VarB;
                }
                ox6VarB = (ox6) objF6;
                bj4Var3.U(false);
                bj4Var2 = bj4Var3;
            } else {
                suVar2 = suVar;
                fv9Var = fv9Var3;
                bj4 bj4Var4 = bj4VarO;
                th = null;
                bj4Var4.K(1353343539);
                bj4Var4.U(false);
                suVar2.e = null;
                bj4Var2 = bj4Var4;
            }
            ox6 ox6VarH = ox6Var.H(ox6VarB.H(new su.b(aVarB, h37VarJ, suVar2)));
            Object objF7 = bj4Var2.f();
            if (objF7 == c0187a) {
                objF7 = new mu(suVar2);
                bj4Var2.C(objF7);
            }
            mu muVar = (mu) objF7;
            int iHashCode = Long.hashCode(bj4Var2.T);
            kw7 kw7VarP = bj4Var2.P();
            ox6 ox6VarC = it1.c(bj4Var2, ox6VarH);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4Var2.a == null) {
                ml5.c();
                throw th;
            }
            bj4Var2.q();
            if (bj4Var2.S) {
                bj4Var2.k(aVar);
            } else {
                bj4Var2.z();
            }
            rd7.d(bj4Var2, bt1.a.f, muVar);
            rd7.d(bj4Var2, bt1.a.e, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar = bt1.a.g;
            if (bj4Var2.l()) {
                bj4Var2.b(bVar, numValueOf);
            }
            rd7.c(bj4Var2, bt1.a.h);
            rd7.d(bj4Var2, bt1.a.d, ox6VarC);
            bj4Var2.K(-860173498);
            int size2 = fv9Var.size();
            int i6 = 0;
            while (i6 < size2) {
                fv9 fv9Var4 = fv9Var;
                Object obj3 = fv9Var4.get(i6);
                bj4Var2.p(-2026002954, oh4Var2.invoke(obj3));
                ci4 ci4Var = (ci4) c37Var.d(obj3);
                if (ci4Var == null) {
                    bj4Var2.K(1618454323);
                    z = false;
                } else {
                    z = false;
                    bj4Var2.K(-2026001778);
                    ci4Var.invoke(bj4Var2, 0);
                }
                bj4Var2.U(z);
                bj4Var2.U(z);
                i6++;
                fv9Var = fv9Var4;
            }
            bj4Var2.U(false);
            bj4Var2.U(true);
            bj4Var = bj4Var2;
        } else {
            bj4 bj4Var5 = bj4VarO;
            bj4Var5.u();
            bj4Var = bj4Var5;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ju(tvaVar, ox6Var, oh4Var, diVar, oh4Var2, fr1Var, i);
        }
    }

    public static final oz1 c(th3 th3Var, jo3 jo3Var) {
        return new oz1(th3Var, jo3Var, 0.0f, new nr9(ku.u));
    }
}
