package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gt5 {
    public static final void a(final wo4.a aVar, final ox6 ox6Var, final zu5 zu5Var, go7 go7Var, final c30.l lVar, final c30.e eVar, g44 g44Var, boolean z, in7 in7Var, final oh4 oh4Var, jt1 jt1Var, final int i) {
        final go7 go7Var2;
        final g44 g44Var2;
        final boolean z2;
        final in7 in7Var2;
        go7 ko7Var;
        in7 in7VarA;
        g44 g44Var3;
        int i2;
        boolean z3;
        c30.e eVar2;
        bj4 bj4VarO = jt1Var.o(-2072102870);
        int i3 = i | (bj4VarO.J(aVar) ? 4 : 2) | (bj4VarO.J(ox6Var) ? 32 : 16) | (bj4VarO.J(zu5Var) ? 256 : 128) | 373320704;
        int i4 = bj4VarO.j(oh4Var) ? 4 : 2;
        if (bj4VarO.A(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            bj4VarO.v0();
            int i5 = i & 1;
            jt1.a.C0187a c0187a = jt1.a.a;
            if (i5 == 0 || bj4VarO.c0()) {
                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                an2 an2VarA = ky9.a(bj4VarO);
                boolean zJ = bj4VarO.J(an2VarA);
                Object objF = bj4VarO.f();
                if (zJ || objF == c0187a) {
                    objF = new fr2(an2VarA);
                    bj4VarO.C(objF);
                }
                in7VarA = kn7.a(bj4VarO);
                g44Var3 = (fr2) objF;
                i2 = i3 & (-1908408321);
                z3 = true;
            } else {
                bj4VarO.u();
                ko7Var = go7Var;
                in7VarA = in7Var;
                i2 = i3 & (-1908408321);
                g44Var3 = g44Var;
                z3 = z;
            }
            bj4VarO.V();
            int i6 = (i2 & 14) | 48;
            boolean z4 = (((i6 & 14) ^ 6) > 4 && bj4VarO.J(aVar)) || (i6 & 6) == 4;
            Object objF2 = bj4VarO.f();
            if (z4 || objF2 == c0187a) {
                eVar2 = eVar;
                objF2 = new zo4(new ft5(0, aVar, eVar2));
                bj4VarO.C(objF2);
            } else {
                eVar2 = eVar;
            }
            int i7 = i2 >> 3;
            go7 go7Var3 = ko7Var;
            boolean z5 = z3;
            bu5.a(ox6Var, zu5Var, (ou5) objF2, go7Var3, g44Var3, z5, in7VarA, lVar, eVar2, oh4Var, bj4VarO, (i7 & 112) | (i7 & 14) | 196608 | 817916928, 6 | ((i4 << 3) & 112));
            go7Var2 = go7Var3;
            in7Var2 = in7VarA;
            z2 = z5;
            g44Var2 = g44Var3;
        } else {
            bj4VarO.u();
            go7Var2 = go7Var;
            g44Var2 = g44Var;
            z2 = z;
            in7Var2 = in7Var;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(ox6Var, zu5Var, go7Var2, lVar, eVar, g44Var2, z2, in7Var2, oh4Var, i) { // from class: et5
                public final /* synthetic */ boolean A;
                public final /* synthetic */ in7 B;
                public final /* synthetic */ oh4 C;
                public final /* synthetic */ ox6 u;
                public final /* synthetic */ zu5 v;
                public final /* synthetic */ go7 w;
                public final /* synthetic */ c30.l x;
                public final /* synthetic */ c30.e y;
                public final /* synthetic */ g44 z;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1769473);
                    gt5.a(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
