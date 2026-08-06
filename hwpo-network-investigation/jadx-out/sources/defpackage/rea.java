package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rea implements ci4<jt1, Integer, g2b> {
    public final /* synthetic */ xea A;
    public final /* synthetic */ wja t;
    public final /* synthetic */ wja u;
    public final /* synthetic */ yz9<Float> v;
    public final /* synthetic */ yz9<uh1> w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ yz9<uh1> y;
    public final /* synthetic */ ei4<kfa, jt1, Integer, g2b> z;

    public rea(wja wjaVar, wja wjaVar2, tva.d dVar, tva.d dVar2, boolean z, tva.d dVar3, ei4 ei4Var, xea xeaVar) {
        this.t = wjaVar;
        this.u = wjaVar2;
        this.v = dVar;
        this.w = dVar2;
        this.x = z;
        this.y = dVar3;
        this.z = ei4Var;
        this.A = xeaVar;
    }

    @Override // defpackage.ci4
    public final g2b invoke(jt1 jt1Var, Integer num) {
        el9 el9VarA;
        el9 el9Var;
        r18 r18Var;
        h18 h18Var;
        jt1 jt1Var2 = jt1Var;
        int iIntValue = num.intValue();
        if (jt1Var2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            float fFloatValue = this.v.getValue().floatValue();
            wja wjaVar = this.t;
            ww9 ww9Var = wjaVar.a;
            wja wjaVar2 = this.u;
            ww9 ww9Var2 = wjaVar2.a;
            mha mhaVar = yw9.d;
            mha mhaVar2 = ww9Var.a;
            mha mhaVar3 = ww9Var2.a;
            boolean z = mhaVar2 instanceof hx0;
            mha hx0Var = mha.a.a;
            if (!z && !(mhaVar3 instanceof hx0)) {
                long j = u7d.j(fFloatValue, mhaVar2.c(), mhaVar3.c());
                if (j != 16) {
                    hx0Var = new ui1(j);
                }
            } else if (z && (mhaVar3 instanceof hx0)) {
                hx0 hx0Var2 = (hx0) mhaVar2;
                hx0 hx0Var3 = (hx0) mhaVar3;
                fx0 fx0Var = (fx0) yw9.b(fFloatValue, hx0Var2.a, hx0Var3.a);
                float fC = vk6.c(hx0Var2.b, hx0Var3.b, fFloatValue);
                if (fx0Var != null) {
                    if (fx0Var instanceof aw9) {
                        long jD = uy5.d(fC, ((aw9) fx0Var).a);
                        if (jD != 16) {
                            hx0Var = new ui1(jD);
                        }
                    } else {
                        if (!(fx0Var instanceof cl9)) {
                            u.b();
                            return null;
                        }
                        hx0Var = new hx0((cl9) fx0Var, fC);
                    }
                }
            } else {
                hx0Var = (mha) yw9.b(fFloatValue, mhaVar2, mhaVar3);
            }
            mha mhaVar4 = hx0Var;
            qa4 qa4Var = (qa4) yw9.b(fFloatValue, ww9Var.f, ww9Var2.f);
            long jC = yw9.c(fFloatValue, ww9Var.b, ww9Var2.b);
            ob4 ob4Var = ww9Var.c;
            if (ob4Var == null) {
                ob4Var = ob4.y;
            }
            ob4 ob4Var2 = ww9Var2.c;
            if (ob4Var2 == null) {
                ob4Var2 = ob4.y;
            }
            ob4 ob4Var3 = new ob4(uh8.g(vk6.d(ob4Var.t, fFloatValue, ob4Var2.t), 1, 1000));
            mb4 mb4Var = (mb4) yw9.b(fFloatValue, ww9Var.d, ww9Var2.d);
            nb4 nb4Var = (nb4) yw9.b(fFloatValue, ww9Var.e, ww9Var2.e);
            String str = (String) yw9.b(fFloatValue, ww9Var.g, ww9Var2.g);
            long jC2 = yw9.c(fFloatValue, ww9Var.h, ww9Var2.h);
            gl0 gl0Var = ww9Var.i;
            float f = gl0Var != null ? gl0Var.a : 0.0f;
            gl0 gl0Var2 = ww9Var2.i;
            float fC2 = vk6.c(f, gl0Var2 != null ? gl0Var2.a : 0.0f, fFloatValue);
            oha ohaVar = ww9Var.j;
            oha ohaVar2 = oha.c;
            if (ohaVar == null) {
                ohaVar = ohaVar2;
            }
            oha ohaVar3 = ww9Var2.j;
            if (ohaVar3 != null) {
                ohaVar2 = ohaVar3;
            }
            oha ohaVar4 = new oha(vk6.c(ohaVar.a, ohaVar2.a, fFloatValue), vk6.c(ohaVar.b, ohaVar2.b, fFloatValue));
            ad6 ad6Var = (ad6) yw9.b(fFloatValue, ww9Var.k, ww9Var2.k);
            long j2 = u7d.j(fFloatValue, ww9Var.l, ww9Var2.l);
            fda fdaVar = (fda) yw9.b(fFloatValue, ww9Var.m, ww9Var2.m);
            el9 el9Var2 = ww9Var.n;
            el9 el9Var3 = ww9Var2.n;
            if (el9Var2 == null && el9Var3 == null) {
                el9Var = null;
            } else {
                if (el9Var2 == null) {
                    el9Var3.getClass();
                    el9VarA = e75.a(new el9(el9Var3.c, uh1.b(0.0f, el9Var3.a), el9Var3.b), el9Var3, fFloatValue);
                } else if (el9Var3 == null) {
                    el9VarA = e75.a(el9Var2, new el9(el9Var2.c, uh1.b(0.0f, el9Var2.a), el9Var2.b), fFloatValue);
                } else {
                    el9VarA = e75.a(el9Var2, el9Var3, fFloatValue);
                }
                el9Var = el9VarA;
            }
            r18 r18Var2 = ww9Var.o;
            r18 r18Var3 = ww9Var2.o;
            if (r18Var2 == null && r18Var3 == null) {
                r18Var = null;
            } else {
                if (r18Var2 == null) {
                    r18Var2 = r18.a;
                }
                r18Var = r18Var2;
            }
            ww9 ww9Var3 = new ww9(mhaVar4, jC, ob4Var3, mb4Var, nb4Var, qa4Var, str, jC2, new gl0(fC2), ohaVar4, ad6Var, j2, fdaVar, el9Var, r18Var, (e73) yw9.b(fFloatValue, ww9Var.p, ww9Var2.p));
            ss7 ss7Var = wjaVar.b;
            ss7 ss7Var2 = wjaVar2.b;
            int i = ts7.b;
            int i2 = ((vaa) yw9.b(fFloatValue, new vaa(ss7Var.a), new vaa(ss7Var2.a))).a;
            int i3 = ((jda) yw9.b(fFloatValue, new jda(ss7Var.b), new jda(ss7Var2.b))).a;
            long jC3 = yw9.c(fFloatValue, ss7Var.c, ss7Var2.c);
            qha qhaVar = ss7Var.d;
            if (qhaVar == null) {
                qhaVar = qha.c;
            }
            qha qhaVar2 = ss7Var2.d;
            if (qhaVar2 == null) {
                qhaVar2 = qha.c;
            }
            qha qhaVar3 = new qha(yw9.c(fFloatValue, qhaVar.a, qhaVar2.a), yw9.c(fFloatValue, qhaVar.b, qhaVar2.b));
            h18 h18Var2 = ss7Var.e;
            h18 h18Var3 = ss7Var2.e;
            if (h18Var2 == null && h18Var3 == null) {
                h18Var = null;
            } else {
                if (h18Var2 == null) {
                    h18Var2 = h18.c;
                }
                h18 h18Var4 = h18Var2;
                if (h18Var3 == null) {
                    h18Var3 = h18.c;
                }
                h18Var = h18Var4.a == h18Var3.a ? h18Var4 : new h18(((we3) yw9.b(fFloatValue, new we3(h18Var4.b), new we3(h18Var3.b))).a, ((Boolean) yw9.b(fFloatValue, Boolean.valueOf(h18Var4.a), Boolean.valueOf(h18Var3.a))).booleanValue());
            }
            wja wjaVar3 = new wja(ww9Var3, new ss7(i2, i3, jC3, qhaVar3, h18Var, (e86) yw9.b(fFloatValue, ss7Var.f, ss7Var2.f), ((c86) yw9.b(fFloatValue, new c86(ss7Var.g), new c86(ss7Var2.g))).a, ((o55) yw9.b(fFloatValue, new o55(ss7Var.h), new o55(ss7Var2.h))).a, (jja) yw9.b(fFloatValue, ss7Var.i, ss7Var2.i)));
            if (this.x) {
                wjaVar3 = wja.a(wjaVar3, this.y.getValue().a, 0L, null, null, 0L, 0L, null, null, 16777214);
            }
            yea.b(this.w.getValue().a, wjaVar3, gr1.b(1157484991, new qea(this.z, this.A), jt1Var2), jt1Var2, 384);
        } else {
            jt1Var2.u();
        }
        return g2b.a;
    }
}
