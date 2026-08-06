package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t2b extends p2b<r2b, r2b> {
    @Override // defpackage.p2b
    public final r2b a(Object obj) {
        return ((fk4) obj).unknownFields;
    }

    @Override // defpackage.p2b
    public final int b(r2b r2bVar) {
        return r2bVar.a();
    }

    @Override // defpackage.p2b
    public final int c(r2b r2bVar) {
        r2b r2bVar2 = r2bVar;
        int i = r2bVar2.d;
        if (i != -1) {
            return i;
        }
        int iL1 = 0;
        for (int i2 = 0; i2 < r2bVar2.a; i2++) {
            int i3 = r2bVar2.b[i2] >>> 3;
            f01 f01Var = (f01) r2bVar2.c[i2];
            int iL2 = tg1.l1(i3) + tg1.k1(2) + (tg1.k1(1) * 2);
            int iK1 = tg1.k1(3);
            int size = f01Var.size();
            iL1 += tg1.l1(size) + size + iK1 + iL2;
        }
        r2bVar2.d = iL1;
        return iL1;
    }

    @Override // defpackage.p2b
    public final void d(Object obj) {
        r2b r2bVar = ((fk4) obj).unknownFields;
        if (r2bVar.e) {
            r2bVar.e = false;
        }
    }

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
    @Override // defpackage.p2b
    public final r2b e(Object obj, Object obj2) {
        r2b r2bVar = (r2b) obj;
        r2b r2bVar2 = (r2b) obj2;
        r2b r2bVar3 = r2b.f;
        if (r2bVar3.equals(r2bVar2)) {
            return r2bVar;
        }
        if (r2bVar3.equals(r2bVar)) {
            int i = r2bVar.a + r2bVar2.a;
            int[] iArrCopyOf = Arrays.copyOf(r2bVar.b, i);
            System.arraycopy(r2bVar2.b, 0, iArrCopyOf, r2bVar.a, r2bVar2.a);
            Object[] objArrCopyOf = Arrays.copyOf(r2bVar.c, i);
            System.arraycopy(r2bVar2.c, 0, objArrCopyOf, r2bVar.a, r2bVar2.a);
            return new r2b(i, iArrCopyOf, objArrCopyOf, true);
        }
        r2bVar.getClass();
        if (r2bVar2.equals(r2bVar3)) {
            return r2bVar;
        }
        if (!r2bVar.e) {
            e44.b();
            return null;
        }
        int i2 = r2bVar.a + r2bVar2.a;
        int[] iArr = r2bVar.b;
        if (i2 > iArr.length) {
            int i3 = r2bVar.a;
            int i4 = (i3 / 2) + i3;
            if (i4 < i2) {
                i4 = i2;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            r2bVar.b = Arrays.copyOf(iArr, i4);
            r2bVar.c = Arrays.copyOf(r2bVar.c, i4);
        }
        System.arraycopy(r2bVar2.b, 0, r2bVar.b, r2bVar.a, r2bVar2.a);
        System.arraycopy(r2bVar2.c, 0, r2bVar.c, r2bVar.a, r2bVar2.a);
        r2bVar.a = i2;
        return r2bVar;
    }

    @Override // defpackage.p2b
    public final void f(Object obj, r2b r2bVar) {
        ((fk4) obj).unknownFields = r2bVar;
    }

    @Override // defpackage.p2b
    public final void g(r2b r2bVar, crb crbVar) {
        r2b r2bVar2 = r2bVar;
        r2bVar2.getClass();
        crbVar.getClass();
        for (int i = 0; i < r2bVar2.a; i++) {
            int i2 = r2bVar2.b[i] >>> 3;
            Object obj = r2bVar2.c[i];
            boolean z = obj instanceof f01;
            tg1 tg1Var = ((ug1) crbVar).a;
            if (z) {
                tg1Var.B1(i2, (f01) obj);
            } else {
                tg1Var.A1(i2, (zt6) obj);
            }
        }
    }

    @Override // defpackage.p2b
    public final void h(r2b r2bVar, crb crbVar) {
        r2bVar.b(crbVar);
    }
}
