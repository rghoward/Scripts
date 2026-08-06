package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s41 implements d73 {
    public final a t;
    public final b u;
    public np v;
    public np w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public tx2 a;
        public tq5 b;
        public n41 c;
        public long d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return xj5.a(this.a, aVar.a) && this.b == aVar.b && xj5.a(this.c, aVar.c) && cr9.a(this.d, aVar.d);
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) cr9.f(this.d)) + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final t41 a = new t41(this);
        public ko4 b;

        public b() {
        }

        public final n41 a() {
            return s41.this.t.c;
        }

        public final tx2 b() {
            return s41.this.t.a;
        }

        public final tq5 c() {
            return s41.this.t.b;
        }

        public final long d() {
            return s41.this.t.d;
        }

        public final void e(n41 n41Var) {
            s41.this.t.c = n41Var;
        }

        public final void f(tx2 tx2Var) {
            s41.this.t.a = tx2Var;
        }

        public final void g(tq5 tq5Var) {
            s41.this.t.b = tq5Var;
        }

        public final void h(long j) {
            s41.this.t.d = j;
        }
    }

    public s41() {
        a aVar = new a();
        aVar.a = x63.a;
        aVar.b = tq5.t;
        aVar.c = ef3.a;
        aVar.d = 0L;
        this.t = aVar;
        this.u = new b();
    }

    public static cs7 e(s41 s41Var, long j, e73 e73Var, float f, wh1 wh1Var, int i) {
        cs7 cs7VarG = s41Var.g(e73Var);
        if (f != 1.0f) {
            j = uh1.b(uh1.d(j) * f, j);
        }
        np npVar = (np) cs7VarG;
        if (!uh1.c(npVar.c(), j)) {
            npVar.f(j);
        }
        if (npVar.c != null) {
            npVar.d(null);
        }
        if (!xj5.a(npVar.d, wh1Var)) {
            npVar.j(wh1Var);
        }
        if (npVar.b != i) {
            npVar.i(i);
        }
        if (npVar.a.isFilterBitmap()) {
            return cs7VarG;
        }
        npVar.k(1);
        return cs7VarG;
    }

    @Override // defpackage.d73
    public final void D(cu7 cu7Var, long j, e73 e73Var, wh1 wh1Var) {
        this.t.c.c(cu7Var, e(this, j, e73Var, 1.0f, wh1Var, 3));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.d73
    public final void H1(long j, long j2, long j3, float f, int i, int i2) {
        n41 n41Var = this.t.c;
        np npVar = this.w;
        if (npVar == null) {
            npVar = new np();
            npVar.p(1);
            this.w = npVar;
        }
        Paint paint = npVar.a;
        if (!uh1.c(npVar.c(), j)) {
            npVar.f(j);
        }
        if (npVar.c != null) {
            npVar.d(null);
        }
        if (!xj5.a(npVar.d, null)) {
            npVar.j(null);
        }
        if (npVar.b != i2) {
            npVar.i(i2);
        }
        if (paint.getStrokeWidth() != f) {
            npVar.o(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            npVar.n(4.0f);
        }
        if (npVar.g() != i) {
            npVar.l(i);
        }
        if (npVar.h() != 0) {
            npVar.m(0);
        }
        if (!paint.isFilterBitmap()) {
            npVar.k(1);
        }
        n41Var.a(j2, j3, npVar);
    }

    @Override // defpackage.d73
    public final void J1(fx0 fx0Var, long j, long j2, float f, e73 e73Var, wh1 wh1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.t.c.s(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), f(fx0Var, e73Var, f, wh1Var, i, 1));
    }

    @Override // defpackage.d73
    public final void M1(long j, float f, float f2, long j2, long j3, e73 e73Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.t.c.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, e(this, j, e73Var, 1.0f, null, 3));
    }

    @Override // defpackage.tx2
    public final float N0() {
        return this.t.a.N0();
    }

    @Override // defpackage.d73
    public final void S0(long j, long j2, long j3, long j4, e73 e73Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.t.c.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), e(this, j, e73Var, 1.0f, null, 3));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.d73
    public final void T0(fx0 fx0Var, long j, long j2, float f, float f2) {
        n41 n41Var = this.t.c;
        np npVar = this.w;
        if (npVar == null) {
            npVar = new np();
            npVar.p(1);
            this.w = npVar;
        }
        Paint paint = npVar.a;
        if (fx0Var != null) {
            fx0Var.a(f2, c(), npVar);
        } else if (npVar.a() != f2) {
            npVar.b(f2);
        }
        if (!xj5.a(npVar.d, null)) {
            npVar.j(null);
        }
        if (npVar.b != 3) {
            npVar.i(3);
        }
        if (paint.getStrokeWidth() != f) {
            npVar.o(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            npVar.n(4.0f);
        }
        if (npVar.g() != 0) {
            npVar.l(0);
        }
        if (npVar.h() != 0) {
            npVar.m(0);
        }
        if (!paint.isFilterBitmap()) {
            npVar.k(1);
        }
        n41Var.a(j, j2, npVar);
    }

    @Override // defpackage.d73
    public final void X(long j, long j2, long j3, float f, e73 e73Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.t.c.s(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), e(this, j, e73Var, f, null, i));
    }

    @Override // defpackage.d73
    public final void Y(l75 l75Var, long j, long j2, long j3, long j4, float f, e73 e73Var, wh1 wh1Var, int i, int i2) {
        this.t.c.j(l75Var, j, j2, j3, j4, f(null, e73Var, f, wh1Var, i, i2));
    }

    @Override // defpackage.d73
    public final b Y0() {
        return this.u;
    }

    public final cs7 f(fx0 fx0Var, e73 e73Var, float f, wh1 wh1Var, int i, int i2) {
        cs7 cs7VarG = g(e73Var);
        if (fx0Var != null) {
            fx0Var.a(f, c(), cs7VarG);
        } else {
            np npVar = (np) cs7VarG;
            if (npVar.c != null) {
                npVar.d(null);
            }
            long jC = npVar.c();
            long j = uh1.b;
            if (!uh1.c(jC, j)) {
                npVar.f(j);
            }
            if (npVar.a() != f) {
                npVar.b(f);
            }
        }
        np npVar2 = (np) cs7VarG;
        if (!xj5.a(npVar2.d, wh1Var)) {
            npVar2.j(wh1Var);
        }
        if (npVar2.b != i) {
            npVar2.i(i);
        }
        if (npVar2.a.isFilterBitmap() == i2) {
            return cs7VarG;
        }
        npVar2.k(i2);
        return cs7VarG;
    }

    public final cs7 g(e73 e73Var) {
        if (xj5.a(e73Var, zy3.a)) {
            np npVar = this.v;
            if (npVar != null) {
                return npVar;
            }
            np npVar2 = new np();
            npVar2.p(0);
            this.v = npVar2;
            return npVar2;
        }
        if (!(e73Var instanceof b3a)) {
            u.b();
            return null;
        }
        np npVar3 = this.w;
        if (npVar3 == null) {
            npVar3 = new np();
            npVar3.p(1);
            this.w = npVar3;
        }
        Paint paint = npVar3.a;
        float strokeWidth = paint.getStrokeWidth();
        b3a b3aVar = (b3a) e73Var;
        float f = b3aVar.a;
        if (strokeWidth != f) {
            npVar3.o(f);
        }
        int iG = npVar3.g();
        int i = b3aVar.c;
        if (iG != i) {
            npVar3.l(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = b3aVar.b;
        if (strokeMiter != f2) {
            npVar3.n(f2);
        }
        int iH = npVar3.h();
        int i2 = b3aVar.d;
        if (iH != i2) {
            npVar3.m(i2);
        }
        return npVar3;
    }

    @Override // defpackage.tx2
    public final float getDensity() {
        return this.t.a.getDensity();
    }

    @Override // defpackage.d73
    public final tq5 getLayoutDirection() {
        return this.t.b;
    }

    @Override // defpackage.d73
    public final void l1(l75 l75Var, long j, float f, e73 e73Var, wh1 wh1Var, int i) {
        this.t.c.q(l75Var, j, f(null, e73Var, f, wh1Var, i, 1));
    }

    @Override // defpackage.d73
    public final void m1(cu7 cu7Var, fx0 fx0Var, float f, e73 e73Var, wh1 wh1Var, int i) {
        this.t.c.c(cu7Var, f(fx0Var, e73Var, f, wh1Var, i, 1));
    }

    @Override // defpackage.d73
    public final void r1(long j, float f, long j2, e73 e73Var, int i) {
        this.t.c.p(f, j2, e(this, j, e73Var, 1.0f, null, i));
    }

    @Override // defpackage.d73
    public final void y1(fx0 fx0Var, long j, long j2, long j3, float f, e73 e73Var, wh1 wh1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.t.c.b(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f(fx0Var, e73Var, f, wh1Var, i, 1));
    }
}
