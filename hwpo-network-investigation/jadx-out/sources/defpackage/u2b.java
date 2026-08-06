package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u2b extends q2b<s2b, s2b> {
    @Override // defpackage.q2b
    public final void a(int i, int i2, Object obj) {
        ((s2b) obj).c((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // defpackage.q2b
    public final void b(Object obj, long j, int i) {
        ((s2b) obj).c((i << 3) | 1, Long.valueOf(j));
    }

    @Override // defpackage.q2b
    public final void c(int i, Object obj, Object obj2) {
        ((s2b) obj).c((i << 3) | 3, (s2b) obj2);
    }

    @Override // defpackage.q2b
    public final void d(s2b s2bVar, int i, e01 e01Var) {
        s2bVar.c((i << 3) | 2, e01Var);
    }

    @Override // defpackage.q2b
    public final void e(Object obj, long j, int i) {
        ((s2b) obj).c(i << 3, Long.valueOf(j));
    }

    @Override // defpackage.q2b
    public final s2b f(Object obj) {
        ek4 ek4Var = (ek4) obj;
        s2b s2bVar = ek4Var.unknownFields;
        if (s2bVar != s2b.f) {
            return s2bVar;
        }
        s2b s2bVar2 = new s2b();
        ek4Var.unknownFields = s2bVar2;
        return s2bVar2;
    }

    @Override // defpackage.q2b
    public final s2b g(Object obj) {
        return ((ek4) obj).unknownFields;
    }

    @Override // defpackage.q2b
    public final int h(s2b s2bVar) {
        return s2bVar.b();
    }

    @Override // defpackage.q2b
    public final int i(s2b s2bVar) {
        s2b s2bVar2 = s2bVar;
        int i = s2bVar2.d;
        if (i != -1) {
            return i;
        }
        int iH1 = 0;
        for (int i2 = 0; i2 < s2bVar2.a; i2++) {
            int i3 = s2bVar2.b[i2] >>> 3;
            iH1 += sg1.h1(3, (e01) s2bVar2.c[i2]) + sg1.n1(i3) + sg1.m1(2) + (sg1.m1(1) * 2);
        }
        s2bVar2.d = iH1;
        return iH1;
    }

    @Override // defpackage.q2b
    public final void j(Object obj) {
        s2b s2bVar = ((ek4) obj).unknownFields;
        if (s2bVar.e) {
            s2bVar.e = false;
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
    @Override // defpackage.q2b
    public final s2b k(Object obj, Object obj2) {
        s2b s2bVar = (s2b) obj;
        s2b s2bVar2 = (s2b) obj2;
        s2b s2bVar3 = s2b.f;
        if (s2bVar3.equals(s2bVar2)) {
            return s2bVar;
        }
        if (s2bVar3.equals(s2bVar)) {
            int i = s2bVar.a + s2bVar2.a;
            int[] iArrCopyOf = Arrays.copyOf(s2bVar.b, i);
            System.arraycopy(s2bVar2.b, 0, iArrCopyOf, s2bVar.a, s2bVar2.a);
            Object[] objArrCopyOf = Arrays.copyOf(s2bVar.c, i);
            System.arraycopy(s2bVar2.c, 0, objArrCopyOf, s2bVar.a, s2bVar2.a);
            return new s2b(i, iArrCopyOf, objArrCopyOf, true);
        }
        s2bVar.getClass();
        if (s2bVar2.equals(s2bVar3)) {
            return s2bVar;
        }
        if (!s2bVar.e) {
            e44.b();
            return null;
        }
        int i2 = s2bVar.a + s2bVar2.a;
        s2bVar.a(i2);
        System.arraycopy(s2bVar2.b, 0, s2bVar.b, s2bVar.a, s2bVar2.a);
        System.arraycopy(s2bVar2.c, 0, s2bVar.c, s2bVar.a, s2bVar2.a);
        s2bVar.a = i2;
        return s2bVar;
    }

    @Override // defpackage.q2b
    public final s2b m() {
        return new s2b();
    }

    @Override // defpackage.q2b
    public final void n(Object obj, s2b s2bVar) {
        ((ek4) obj).unknownFields = s2bVar;
    }

    @Override // defpackage.q2b
    public final void o(Object obj, s2b s2bVar) {
        ((ek4) obj).unknownFields = s2bVar;
    }

    @Override // defpackage.q2b
    public final s2b p(Object obj) {
        s2b s2bVar = (s2b) obj;
        if (s2bVar.e) {
            s2bVar.e = false;
        }
        return s2bVar;
    }

    @Override // defpackage.q2b
    public final void q(s2b s2bVar, drb drbVar) {
        s2b s2bVar2 = s2bVar;
        s2bVar2.getClass();
        drbVar.getClass();
        for (int i = 0; i < s2bVar2.a; i++) {
            int i2 = s2bVar2.b[i] >>> 3;
            Object obj = s2bVar2.c[i];
            boolean z = obj instanceof e01;
            sg1 sg1Var = ((vg1) drbVar).a;
            if (z) {
                sg1Var.E1(i2, (e01) obj);
            } else {
                sg1Var.D1(i2, (au6) obj);
            }
        }
    }

    @Override // defpackage.q2b
    public final void r(s2b s2bVar, drb drbVar) {
        s2bVar.d(drbVar);
    }
}
