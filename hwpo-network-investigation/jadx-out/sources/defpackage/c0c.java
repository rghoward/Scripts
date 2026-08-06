package defpackage;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c0c extends azb {
    public final lfc g;
    public final /* synthetic */ z0c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0c(z0c z0cVar, String str, int i, lfc lfcVar) {
        super(str, i);
        this.h = z0cVar;
        this.g = lfcVar;
    }

    @Override // defpackage.azb
    public final int a() {
        return this.g.y();
    }

    @Override // defpackage.azb
    public final boolean b() {
        return true;
    }

    @Override // defpackage.azb
    public final boolean c() {
        return false;
    }

    public final boolean g(Long l, Long l2, bmc bmcVar, boolean z) {
        boolean z2;
        Boolean boolD;
        Boolean boolF;
        Boolean boolF2;
        Boolean boolF3;
        t5c.a();
        tkc tkcVar = this.h.a;
        t7c t7cVar = tkcVar.d;
        fhc fhcVar = tkcVar.j;
        thc thcVar = tkcVar.f;
        boolean zR = t7cVar.r(this.a, wfc.D0);
        lfc lfcVar = this.g;
        boolean zB = lfcVar.B();
        boolean zC = lfcVar.C();
        boolean zE = lfcVar.E();
        boolean z3 = zB || zC || zE;
        if (z && !z3) {
            tkc.m(thcVar);
            thcVar.n.c(Integer.valueOf(this.b), lfcVar.x() ? Integer.valueOf(lfcVar.y()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        gfc gfcVarA = lfcVar.A();
        boolean zC2 = gfcVarA.C();
        if (!bmcVar.C()) {
            z2 = zE;
            if (!bmcVar.G()) {
                if (!bmcVar.A()) {
                    tkc.m(thcVar);
                    thcVar.i.b(fhcVar.c(bmcVar.z()), "User property has no value, property");
                } else if (gfcVarA.x()) {
                    String strB = bmcVar.B();
                    ofc ofcVarY = gfcVarA.y();
                    tkc.m(thcVar);
                    boolD = azb.d(azb.e(strB, ofcVarY, thcVar), zC2);
                } else if (!gfcVarA.z()) {
                    tkc.m(thcVar);
                    thcVar.i.b(fhcVar.c(bmcVar.z()), "No string or number filter defined. property");
                } else if (qzc.K(bmcVar.B())) {
                    String strB2 = bmcVar.B();
                    jfc jfcVarA = gfcVarA.A();
                    if (qzc.K(strB2)) {
                        try {
                            boolF = azb.f(new BigDecimal(strB2), jfcVarA, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolF = null;
                        }
                    } else {
                        boolF = null;
                    }
                    boolD = azb.d(boolF, zC2);
                } else {
                    tkc.m(thcVar);
                    thcVar.i.c(fhcVar.c(bmcVar.z()), bmcVar.B(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolD = null;
            } else if (gfcVarA.z()) {
                double dH = bmcVar.H();
                try {
                    boolF2 = azb.f(new BigDecimal(dH), gfcVarA.A(), Math.ulp(dH));
                } catch (NumberFormatException unused2) {
                    boolF2 = null;
                }
                boolD = azb.d(boolF2, zC2);
            } else {
                tkc.m(thcVar);
                thcVar.i.b(fhcVar.c(bmcVar.z()), "No number filter for double property. property");
                boolD = null;
            }
        } else if (gfcVarA.z()) {
            z2 = zE;
            try {
                boolF3 = azb.f(new BigDecimal(bmcVar.D()), gfcVarA.A(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolF3 = null;
            }
            boolD = azb.d(boolF3, zC2);
        } else {
            tkc.m(thcVar);
            thcVar.i.b(fhcVar.c(bmcVar.z()), "No number filter for long property. property");
            z2 = zE;
            boolD = null;
        }
        tkc.m(thcVar);
        thcVar.n.b(boolD == null ? "null" : boolD, "Property filter result");
        if (boolD == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolD.booleanValue()) {
            if (!z || lfcVar.B()) {
                this.d = boolD;
            }
            if (boolD.booleanValue() && z3 && bmcVar.x()) {
                long jY = bmcVar.y();
                if (l != null) {
                    jY = l.longValue();
                }
                if (zR && lfcVar.B() && !lfcVar.C() && l2 != null) {
                    jY = l2.longValue();
                }
                if (lfcVar.C()) {
                    this.f = Long.valueOf(jY);
                } else {
                    this.e = Long.valueOf(jY);
                }
            }
        }
        return true;
    }
}
