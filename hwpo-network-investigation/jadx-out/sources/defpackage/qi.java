package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qi implements ioa {
    public final ioa a;
    public final hl8<Boolean> b;
    public float d;
    public float e;
    public qt<Float, bw> f;
    public final dt7 c = bl7.i(new y43(0.0f));
    public final w37 g = new w37();

    public qi(ioa ioaVar, hl8<Boolean> hl8Var) {
        this.a = ioaVar;
        this.b = hl8Var;
        this.d = ((ioaVar.g() % 12) * 0.5235988f) - 1.5707964f;
        this.e = (ioaVar.c() * 0.10471976f) - 1.5707964f;
        this.f = ut.a(this.d);
    }

    public static float j(float f) {
        double d = ((double) f) % 6.283185307179586d;
        if (d < 0.0d) {
            d += 6.283185307179586d;
        }
        return (float) d;
    }

    @Override // defpackage.ioa
    public final void a(int i) {
        this.d = ((i % 12) * 0.5235988f) - 1.5707964f;
        ioa ioaVar = this.a;
        ioaVar.a(i);
        if (ioaVar.e() == 0) {
            this.f = ut.a(this.d);
        }
    }

    @Override // defpackage.ioa
    public final void b(int i) {
        this.e = (i * 0.10471976f) - 1.5707964f;
        ioa ioaVar = this.a;
        ioaVar.b(i);
        if (ioaVar.e() == 1) {
            this.f = ut.a(this.e);
        }
        hu9 hu9VarA = hu9.a.a();
        oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
        hu9 hu9VarB = hu9.a.b(hu9VarA);
        try {
            ioaVar.b(ioaVar.c());
            g2b g2bVar = g2b.a;
        } finally {
            hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
        }
    }

    @Override // defpackage.ioa
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.ioa
    public final void d(int i) {
        this.a.d(i);
    }

    @Override // defpackage.ioa
    public final int e() {
        return this.a.e();
    }

    @Override // defpackage.ioa
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.ioa
    public final int g() {
        return this.a.g();
    }

    public final float h(float f) {
        float fFloatValue = this.f.d().floatValue() - f;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return this.f.d().floatValue() - fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float i() {
        return ((y43) this.c.getValue()).t;
    }
}
