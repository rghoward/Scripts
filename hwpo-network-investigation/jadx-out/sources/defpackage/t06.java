package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t06 {
    public static final void a(final az9.a aVar, final ox6 ox6Var, c26 c26Var, final ko7 ko7Var, final float f, c30.e eVar, g44 g44Var, boolean z, in7 in7Var, final oh4 oh4Var, jt1 jt1Var, final int i) {
        c30.e eVar2;
        final c26 c26Var2;
        final g44 g44Var2;
        final boolean z2;
        final in7 in7Var2;
        c26 c26Var3;
        g44 g44Var3;
        int i2;
        boolean z3;
        in7 in7VarA;
        boolean z4;
        ko7 ko7Var2;
        bj4 bj4VarO = jt1Var.o(-578931208);
        int i3 = i | (bj4VarO.J(aVar) ? 4 : 2) | (bj4VarO.J(ox6Var) ? 32 : 16) | 373317760;
        int i4 = bj4VarO.j(oh4Var) ? 4 : 2;
        int i5 = 1;
        if (bj4VarO.A(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            bj4VarO.v0();
            int i6 = i & 1;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (i6 == 0 || bj4VarO.c0()) {
                Object[] objArr = new Object[0];
                au3 au3Var = c26.x;
                boolean zH = bj4VarO.h(0) | bj4VarO.h(0);
                Object objF = bj4VarO.f();
                if (zH || objF == c0187a) {
                    objF = new tz4(i5);
                    bj4VarO.C(objF);
                }
                c26Var3 = (c26) mm8.e(objArr, au3Var, (mh4) objF, bj4VarO, 0);
                an2 an2VarA = ky9.a(bj4VarO);
                boolean zJ = bj4VarO.J(an2VarA);
                Object objF2 = bj4VarO.f();
                if (zJ || objF2 == c0187a) {
                    objF2 = new fr2(an2VarA);
                    bj4VarO.C(objF2);
                }
                g44Var3 = (fr2) objF2;
                i2 = i3 & (-1908409217);
                z3 = true;
                in7VarA = kn7.a(bj4VarO);
                z4 = true;
            } else {
                bj4VarO.u();
                c26Var3 = c26Var;
                g44Var3 = g44Var;
                i2 = i3 & (-1908409217);
                z4 = true;
                z3 = z;
                in7VarA = in7Var;
            }
            bj4VarO.V();
            float fMo1getSpacingD9Ej5fM = eVar.mo1getSpacingD9Ej5fM();
            int i7 = (i2 & 14) | 432;
            boolean z5 = ((((i7 & 14) ^ 6) > 4 && bj4VarO.J(aVar)) || (i7 & 6) == 4) ? z4 : false;
            Object objF3 = bj4VarO.f();
            if (z5 || objF3 == c0187a) {
                ko7Var2 = ko7Var;
                eVar2 = eVar;
                objF3 = new w16(new s06(ko7Var2, aVar, eVar2));
                bj4VarO.C(objF3);
            } else {
                ko7Var2 = ko7Var;
                eVar2 = eVar;
            }
            boolean z6 = z3;
            g16.a(c26Var3, (ru5) objF3, ox6Var, ko7Var2, g44Var3, z6, in7VarA, f, fMo1getSpacingD9Ej5fM, oh4Var, bj4VarO, ((i2 << 6) & 7168) | 818110512, (i4 << 3) & 112);
            c26Var2 = c26Var3;
            in7Var2 = in7VarA;
            z2 = z6;
            g44Var2 = g44Var3;
        } else {
            eVar2 = eVar;
            bj4VarO.u();
            c26Var2 = c26Var;
            g44Var2 = g44Var;
            z2 = z;
            in7Var2 = in7Var;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final c30.e eVar3 = eVar2;
            xj8VarW.d = new ci4(ox6Var, c26Var2, ko7Var, f, eVar3, g44Var2, z2, in7Var2, oh4Var, i) { // from class: r06
                public final /* synthetic */ boolean A;
                public final /* synthetic */ in7 B;
                public final /* synthetic */ oh4 C;
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ c26 v;
                public final /* synthetic */ ko7 w;
                public final /* synthetic */ float x;
                public final /* synthetic */ c30.e y;
                public final /* synthetic */ g44 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1772545);
                    t06.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
