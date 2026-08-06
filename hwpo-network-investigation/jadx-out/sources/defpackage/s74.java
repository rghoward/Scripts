package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s74 {
    public static final /* synthetic */ int a = 0;

    static {
        new nb2.b(di.a.j);
        new nb2.a(di.a.m);
    }

    public static final void a(final ox6 ox6Var, final c30.e eVar, final c30.l lVar, di.c cVar, int i, int i2, final fr1 fr1Var, jt1 jt1Var, final int i3) {
        final di.c cVar2;
        final int i4;
        final int i5;
        bj4 bj4VarO = jt1Var.o(-1303174015);
        int i6 = i3 | (bj4VarO.J(ox6Var) ? 4 : 2) | 224256;
        if (bj4VarO.A(i6 & 1, (599187 & i6) != 599186)) {
            b(ox6Var, eVar, lVar, b84.b, fr1Var, bj4VarO, (i6 & 14) | 14380464);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            cVar2 = di.a.j;
        } else {
            bj4VarO.u();
            cVar2 = cVar;
            i4 = i;
            i5 = i2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(eVar, lVar, cVar2, i4, i5, fr1Var, i3) { // from class: p74
                public final /* synthetic */ c30.e u;
                public final /* synthetic */ c30.l v;
                public final /* synthetic */ di.c w;
                public final /* synthetic */ int x;
                public final /* synthetic */ int y;
                public final /* synthetic */ fr1 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1573297);
                    s74.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    @gy2
    public static final void b(final ox6 ox6Var, final c30.e eVar, final c30.l lVar, final b84 b84Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(-1956591841);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(lVar) ? 256 : 128;
        }
        int i3 = i & 3072;
        sp0.b bVar = di.a.j;
        if (i3 == 0) {
            i2 |= bj4VarO.J(bVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.h(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.h(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bj4VarO.J(b84Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (bj4VarO.A(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z = i5 == 1048576;
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (z || objF == c0187a) {
                objF = new w74(b84Var.a);
                bj4VarO.C(objF);
            }
            w74 w74Var = (w74) objF;
            int i6 = i4 >> 3;
            boolean zJ = ((((i6 & 14) ^ 6) > 4 && bj4VarO.J(eVar)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && bj4VarO.J(lVar)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && bj4VarO.J(bVar)) || (i6 & 384) == 256) | ((((i6 & 7168) ^ 3072) > 2048 && bj4VarO.h(Integer.MAX_VALUE)) || (i6 & 3072) == 2048) | ((((57344 & i6) ^ 24576) > 16384 && bj4VarO.h(Integer.MAX_VALUE)) || (i6 & 24576) == 16384) | bj4VarO.J(w74Var);
            Object objF2 = bj4VarO.f();
            if (zJ || objF2 == c0187a) {
                a84 a84Var = new a84(eVar, lVar, eVar.mo1getSpacingD9Ej5fM(), new nb2.b(bVar), lVar.mo1getSpacingD9Ej5fM(), w74Var);
                bj4VarO.C(a84Var);
                objF2 = a84Var;
            }
            a84 a84Var2 = (a84) objF2;
            boolean z2 = (i5 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & 458752) == 131072);
            Object objF3 = bj4VarO.f();
            Object obj = objF3;
            if (z2 || objF3 == c0187a) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new fr1(true, -1192950673, new ci4() { // from class: q74
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        jt1 jt1Var2 = (jt1) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
                            fr1Var.invoke(d84.a, jt1Var2, 6);
                        } else {
                            jt1Var2.u();
                        }
                        return g2b.a;
                    }
                }));
                b84Var.getClass();
                b84Var.a.ordinal();
                bj4VarO.C(arrayList);
                obj = arrayList;
            }
            fr1 fr1Var2 = new fr1(true, 1271844412, new fr5((List) obj));
            boolean zJ2 = bj4VarO.J(a84Var2);
            Object objF4 = bj4VarO.f();
            if (zJ2 || objF4 == c0187a) {
                objF4 = new g07(a84Var2);
                bj4VarO.C(objF4);
            }
            fl6 fl6Var = (fl6) objF4;
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6Var);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            fr1Var2.invoke(bj4VarO, 0);
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: r74
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    s74.b(ox6Var, eVar, lVar, b84Var, fr1Var, (jt1) obj2, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    public static final void c(cl6 cl6Var, a84 a84Var, long j, oh4 oh4Var) {
        if (zv.f(zv.e(cl6Var)) != 0.0f) {
            cl6Var.c0(cl6Var.A(Integer.MAX_VALUE));
            return;
        }
        zv.e(cl6Var);
        jz7 jz7VarE = cl6Var.E(j);
        oh4Var.invoke(jz7VarE);
        a84Var.j(jz7VarE);
        a84Var.h(jz7VarE);
    }
}
