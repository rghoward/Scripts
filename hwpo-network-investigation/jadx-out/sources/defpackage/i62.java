package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i62 implements fl6 {
    public final /* synthetic */ u56 a;
    public final /* synthetic */ oh4<ria, g2b> b;
    public final /* synthetic */ kha c;
    public final /* synthetic */ ag7 d;
    public final /* synthetic */ tx2 e;
    public final /* synthetic */ int f;

    /* JADX WARN: Multi-variable type inference failed */
    public i62(u56 u56Var, oh4<? super ria, g2b> oh4Var, kha khaVar, ag7 ag7Var, tx2 tx2Var, int i) {
        this.a = u56Var;
        this.b = oh4Var;
        this.c = khaVar;
        this.d = ag7Var;
        this.e = tx2Var;
        this.f = i;
    }

    @Override // defpackage.fl6
    public final int a(qj5 qj5Var, List<? extends pj5> list, int i) {
        u56 u56Var = this.a;
        u56Var.a.a(qj5Var.getLayoutDirection());
        m07 m07Var = u56Var.a.j;
        if (m07Var != null) {
            return ida.a(m07Var.c());
        }
        aa0.c("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [qq5] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // defpackage.fl6
    public final gl6 d(hl6 hl6Var, List<? extends cl6> list, long j) {
        ria riaVar;
        tq5 tq5Var;
        gl6 gl6Var;
        ria riaVar2;
        i62 i62Var;
        int i;
        int iA;
        ?? r14;
        u56 u56Var = this.a;
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            sia siaVarD = u56Var.d();
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            ria riaVar3 = siaVarD != null ? siaVarD.a : null;
            hda hdaVar = u56Var.a;
            tq5 layoutDirection = hl6Var.getLayoutDirection();
            int i2 = hdaVar.f;
            boolean z = hdaVar.e;
            int i3 = hdaVar.c;
            if (riaVar3 != null) {
                l07 l07Var = riaVar3.b;
                qia qiaVar = riaVar3.a;
                iw iwVar = hdaVar.a;
                wja wjaVar = hdaVar.b;
                List<iw.c<mz7>> list2 = hdaVar.i;
                gl6Var = null;
                tx2 tx2Var = hdaVar.g;
                qa4.a aVar = hdaVar.h;
                ria riaVar4 = riaVar3;
                if (!l07Var.a.a()) {
                    iw iwVar2 = qiaVar.a;
                    long j2 = qiaVar.j;
                    if (xj5.a(iwVar2, iwVar) && qiaVar.b.c(wjaVar) && xj5.a(qiaVar.c, list2) && qiaVar.d == i3 && qiaVar.e == z && qiaVar.f == i2 && xj5.a(qiaVar.g, tx2Var)) {
                        tq5Var = layoutDirection;
                        if (qiaVar.h == tq5Var && xj5.a(qiaVar.i, aVar) && xx1.j(j) == xx1.j(j2) && ((!z && i2 != 2) || (xx1.h(j) == xx1.h(j2) && xx1.g(j) == xx1.g(j2)))) {
                            riaVar = riaVar4;
                            riaVar2 = new ria(new qia(qiaVar.a, hdaVar.b, qiaVar.c, qiaVar.d, qiaVar.e, qiaVar.f, qiaVar.g, qiaVar.h, qiaVar.i, j), l07Var, zx1.d(j, (((long) ida.a(l07Var.e)) & 4294967295L) | (((long) ida.a(l07Var.d)) << 32)));
                        }
                    } else {
                        j = j;
                        riaVar = riaVar4;
                        tq5Var = layoutDirection;
                    }
                    long j3 = riaVar2.c;
                    Integer numValueOf = Integer.valueOf((int) (j3 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j3 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (xj5.a(riaVar, riaVar2)) {
                        i62Var = this;
                        i = 0;
                    } else {
                        if (siaVarD != null) {
                            r14 = siaVarD.c;
                        } else {
                            r14 = gl6Var;
                        }
                        u56Var.i.setValue(new sia(r14, riaVar2));
                        i = 0;
                        u56Var.p = false;
                        i62Var = this;
                        i62Var.b.invoke(riaVar2);
                        m62.f(u56Var, i62Var.c, i62Var.d);
                    }
                    if (i62Var.f == 1) {
                        iA = ida.a(riaVar2.b.b(i));
                    } else {
                        iA = 0;
                    }
                    u56Var.g.setValue(new y43(i62Var.e.F0(iA)));
                    return hl6Var.y0(iIntValue, iIntValue2, qi6.i(new js7(fi.a, Integer.valueOf(Math.round(riaVar2.d))), new js7(fi.b, Integer.valueOf(Math.round(riaVar2.e)))), new h62(0));
                }
                tq5Var = layoutDirection;
                riaVar = riaVar4;
            } else {
                j = j;
                riaVar = riaVar3;
                tq5Var = layoutDirection;
                gl6Var = null;
            }
            hdaVar.a(tq5Var);
            int iJ = xx1.j(j);
            int iH = ((z || i2 == 2) && xx1.d(j)) ? xx1.h(j) : Integer.MAX_VALUE;
            int i4 = (z || i2 != 2) ? i3 : 1;
            if (iJ != iH) {
                m07 m07Var = hdaVar.j;
                if (m07Var == null) {
                    aa0.c("layoutIntrinsics must be called first");
                    return gl6Var;
                }
                iH = uh8.g(ida.a(m07Var.c()), iJ, iH);
            }
            m07 m07Var2 = hdaVar.j;
            if (m07Var2 == null) {
                aa0.c("layoutIntrinsics must be called first");
                return gl6Var;
            }
            l07 l07Var2 = new l07(m07Var2, xx1.a.b(0, iH, 0, xx1.g(j)), i4, hdaVar.f);
            riaVar2 = new ria(new qia(hdaVar.a, hdaVar.b, hdaVar.i, hdaVar.c, hdaVar.e, hdaVar.f, hdaVar.g, tq5Var, hdaVar.h, j), l07Var2, zx1.d(j, (((long) ida.a(l07Var2.d)) << 32) | (((long) ida.a(l07Var2.e)) & 4294967295L)));
            long j4 = riaVar2.c;
            Integer numValueOf3 = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (xj5.a(riaVar, riaVar2)) {
                if (siaVarD != null) {
                    r14 = siaVarD.c;
                } else {
                    r14 = gl6Var;
                }
                u56Var.i.setValue(new sia(r14, riaVar2));
                i = 0;
                u56Var.p = false;
                i62Var = this;
                i62Var.b.invoke(riaVar2);
                m62.f(u56Var, i62Var.c, i62Var.d);
            } else {
                i62Var = this;
                i = 0;
            }
            if (i62Var.f == 1) {
                iA = ida.a(riaVar2.b.b(i));
            } else {
                iA = 0;
            }
            u56Var.g.setValue(new y43(i62Var.e.F0(iA)));
            return hl6Var.y0(iIntValue3, iIntValue4, qi6.i(new js7(fi.a, Integer.valueOf(Math.round(riaVar2.d))), new js7(fi.b, Integer.valueOf(Math.round(riaVar2.e)))), new h62(0));
        } catch (Throwable th) {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
            throw th;
        }
    }
}
