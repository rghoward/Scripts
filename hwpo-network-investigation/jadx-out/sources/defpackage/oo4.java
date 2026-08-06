package defpackage;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class oo4 {
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
    public static final void a(d73 d73Var, ko4 ko4Var) {
        boolean z;
        float f;
        n41 n41VarA = d73Var.Y0().a();
        ko4 ko4Var2 = d73Var.Y0().b;
        no4 no4Var = ko4Var.a;
        if (ko4Var.s) {
            return;
        }
        ko4Var.a();
        if (!no4Var.D()) {
            try {
                ko4Var.a.M(ko4Var.b, ko4Var.c, ko4Var, ko4Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = no4Var.T() > 0.0f;
        if (z2) {
            n41VarA.t();
        }
        Canvas canvasA = pl.a(n41VarA);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = ko4Var.t;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = ko4Var.u;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float fA = no4Var.a();
            wh1 wh1VarJ = no4Var.j();
            int iV = no4Var.V();
            if (fA < 1.0f || iV != 3 || wh1VarJ != null || no4Var.B() == 1) {
                np npVar = ko4Var.p;
                if (npVar == null) {
                    npVar = new np();
                    ko4Var.p = npVar;
                }
                npVar.b(fA);
                npVar.i(iV);
                npVar.j(wh1VarJ);
                canvasA = canvasA;
                f = f2;
                canvasA.saveLayer(f, f3, f4, f5, op.a(npVar));
            } else {
                canvasA.save();
                canvasA = canvasA;
                f = f2;
            }
            canvasA.translate(f, f3);
            canvasA.concat(no4Var.S());
        }
        boolean z3 = !zIsHardwareAccelerated && ko4Var.w;
        if (z3) {
            n41VarA.f();
            dm7 dm7VarD = ko4Var.d();
            if (dm7VarD instanceof dm7.b) {
                n41VarA.r(((dm7.b) dm7VarD).a);
            } else if (dm7VarD instanceof dm7.c) {
                vp vpVarA = ko4Var.m;
                if (vpVarA != null) {
                    vpVarA.k();
                } else {
                    vpVarA = xp.a();
                    ko4Var.m = vpVarA;
                }
                vpVarA.q(((dm7.c) dm7VarD).a);
                n41VarA.i(vpVarA);
            } else {
                if (!(dm7VarD instanceof dm7.a)) {
                    u.b();
                    return;
                }
                n41VarA.i(((dm7.a) dm7VarD).a);
            }
        }
        if (ko4Var2 != null) {
            cc1 cc1Var = ko4Var2.r;
            if (!cc1Var.e) {
                tc5.a("Only add dependencies during a tracking");
            }
            d37<ko4> d37Var = cc1Var.c;
            if (d37Var != null) {
                d37Var.a(ko4Var);
            } else if (cc1Var.a != null) {
                d37<ko4> d37VarA = a49.a();
                ko4 ko4Var3 = cc1Var.a;
                ko4Var3.getClass();
                d37VarA.a(ko4Var3);
                d37VarA.a(ko4Var);
                cc1Var.c = d37VarA;
                cc1Var.a = null;
            } else {
                cc1Var.a = ko4Var;
            }
            d37<ko4> d37Var2 = cc1Var.d;
            if (d37Var2 != null) {
                z = !d37Var2.l(ko4Var);
            } else if (cc1Var.b != ko4Var) {
                z = true;
            } else {
                cc1Var.b = null;
                z = false;
            }
            if (z) {
                ko4Var.q++;
            }
        }
        if (((ol) n41VarA).a.isHardwareAccelerated()) {
            no4Var.A(n41VarA);
        } else {
            s41 s41Var = ko4Var.o;
            if (s41Var == null) {
                s41Var = new s41();
                ko4Var.o = s41Var;
            }
            s41.b bVar = s41Var.u;
            tx2 tx2Var = ko4Var.b;
            tq5 tq5Var = ko4Var.c;
            long jC = c43.c(ko4Var.u);
            tx2 tx2VarB = bVar.b();
            tq5 tq5VarC = bVar.c();
            n41 n41VarA2 = bVar.a();
            long jD = bVar.d();
            ko4 ko4Var4 = bVar.b;
            bVar.f(tx2Var);
            bVar.g(tq5Var);
            bVar.e(n41VarA);
            bVar.h(jC);
            bVar.b = ko4Var;
            n41VarA.f();
            try {
                ko4Var.c(s41Var);
                n41VarA.o();
                bVar.f(tx2VarB);
                bVar.g(tq5VarC);
                bVar.e(n41VarA2);
                bVar.h(jD);
                bVar.b = ko4Var4;
            } catch (Throwable th) {
                n41VarA.o();
                bVar.f(tx2VarB);
                bVar.g(tq5VarC);
                bVar.e(n41VarA2);
                bVar.h(jD);
                bVar.b = ko4Var4;
                throw th;
            }
        }
        if (z3) {
            n41VarA.o();
        }
        if (z2) {
            n41VarA.h();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }
}
