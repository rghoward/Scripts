package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o16 implements rw5 {
    public final /* synthetic */ c26 a;
    public final /* synthetic */ ru5 b;
    public final /* synthetic */ mh4<x06> c;
    public final /* synthetic */ ko7 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ t72 f;
    public final /* synthetic */ jo4 g;

    public o16(c26 c26Var, ru5 ru5Var, eo5 eo5Var, ko7 ko7Var, float f, t72 t72Var, jo4 jo4Var) {
        this.a = c26Var;
        this.b = ru5Var;
        this.c = eo5Var;
        this.d = ko7Var;
        this.e = f;
        this.f = t72Var;
        this.g = jo4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v20, types: [h16] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.rw5
    public final gl6 a(tw5 tw5Var, long j) {
        boolean z;
        Integer numValueOf;
        ?? r8;
        ?? C;
        g4a g4aVar = tw5Var.u;
        ko7 ko7Var = this.d;
        float f = ko7Var.d;
        float f2 = ko7Var.b;
        c26 c26Var = this.a;
        c26Var.v.getValue();
        boolean z2 = c26Var.a || g4aVar.P0();
        hnb.a(j, fl7.t);
        x16 x16VarA = this.b.a(tw5Var, j);
        x06 x06VarInvoke = this.c.invoke();
        g4aVar.getLayoutDirection();
        int iN1 = g4aVar.n1(f2);
        g4aVar.getLayoutDirection();
        int iN2 = g4aVar.n1(f);
        int iN3 = g4aVar.n1(eo7.e(ko7Var, g4aVar.getLayoutDirection()));
        int iG = (xx1.g(j) - iN1) - iN2;
        long j2 = (((long) iN3) << 32) | (((long) iN1) & 4294967295L);
        int iN4 = g4aVar.n1(eo7.d(ko7Var, g4aVar.getLayoutDirection()) + eo7.e(ko7Var, g4aVar.getLayoutDirection()));
        int iN5 = g4aVar.n1(f + f2);
        List<Integer> listA = qv5.a(x06VarInvoke, c26Var.s, c26Var.k);
        long jA = xx1.a(zx1.g(iN4, j), 0, zx1.f(iN5, j), 0, 10, j);
        int iN6 = g4aVar.n1(this.e);
        boolean zP0 = g4aVar.P0();
        q16 q16Var = c26Var.b;
        k16 k16Var = new k16(c26Var, listA, x06VarInvoke, x16VarA, jA, true, tw5Var, iG, j2, iN1, iN2, iN6, this.f, z2, q16Var != null ? q16Var.m : null, this.g);
        u16 u16Var = c26Var.c;
        int[] iArr = u16Var.b;
        Object obj = u16Var.g;
        iArr.getClass();
        if (iArr.length > 0) {
            z = false;
            numValueOf = Integer.valueOf(iArr[0]);
        } else {
            z = false;
            numValueOf = null;
        }
        int iB = iw5.b(numValueOf != null ? numValueOf.intValue() : z, x06VarInvoke, obj);
        boolean zU = u30.u(iArr, iB);
        ?? r4 = iArr;
        if (!zU) {
            u16Var.h.d(iB);
            hu9 hu9VarA = hu9.a.a();
            oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
            hu9 hu9VarB = hu9.a.b(hu9VarA);
            try {
                int[] iArr2 = (int[]) u16Var.a.invoke(Integer.valueOf(iB), Integer.valueOf(iArr.length));
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                u16Var.b = iArr2;
                u16Var.c.j(u16.a(iArr2));
                r4 = iArr2;
            } catch (Throwable th) {
                hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                throw th;
            }
        }
        ?? r2 = u16Var.d;
        int length = r4.length;
        int i = k16Var.s;
        ?? r5 = r4;
        if (length != i) {
            ?? r3 = k16Var.r;
            r3.g();
            ?? r9 = new int[i];
            ?? r11 = z;
            while (r11 < i) {
                if (r11 >= r4.length || (C = r4[r11]) == -1) {
                    C = r11 == 0 ? z : n16.c(r9, ((long) r11) & 4294967295L) + 1;
                }
                r9[r11] = C;
                r3.i(C, r11);
                r11++;
            }
            r5 = r9;
        }
        int length2 = r2.length;
        ?? r6 = r2;
        if (length2 != i) {
            ?? r7 = new int[i];
            ?? r12 = z;
            while (r12 < i) {
                if (r12 < r2.length) {
                    r8 = r2[r12];
                } else {
                    r8 = r12 == 0 ? z : r7[r12 - 1];
                }
                r7[r12] = r8;
                r12++;
            }
            r6 = r7;
        }
        q16 q16VarD = n16.d(k16Var, Math.round((zP0 || !c26Var.a) ? c26Var.o : ((Number) c26Var.w.b.u.getValue()).floatValue()), r5, r6, true);
        c26Var.f(q16VarD, g4aVar.P0(), z);
        return q16VarD;
    }
}
