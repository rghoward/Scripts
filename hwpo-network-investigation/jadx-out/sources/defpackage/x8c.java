package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x8c implements Runnable {
    public final /* synthetic */ String t;
    public final /* synthetic */ long u;
    public final /* synthetic */ ecc v;

    public x8c(ecc eccVar, String str, long j) {
        this.t = str;
        this.u = j;
        this.v = eccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ecc eccVar = this.v;
        eccVar.g();
        String str = this.t;
        a78.d(str);
        n30 n30Var = eccVar.c;
        Integer num = (Integer) n30Var.get(str);
        tkc tkcVar = eccVar.a;
        if (num == null) {
            thc thcVar = tkcVar.f;
            tkc.m(thcVar);
            thcVar.f.b(str, "Call to endAdUnitExposure for unknown ad unit id");
            return;
        }
        xsc xscVar = tkcVar.l;
        thc thcVar2 = tkcVar.f;
        tkc.l(xscVar);
        dsc dscVarK = xscVar.k(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            n30Var.put(str, Integer.valueOf(iIntValue));
            return;
        }
        n30Var.remove(str);
        n30 n30Var2 = eccVar.b;
        Long l = (Long) n30Var2.get(str);
        long j = this.u;
        if (l == null) {
            tkc.m(thcVar2);
            thcVar2.f.a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            n30Var2.remove(str);
            eccVar.l(str, jLongValue, dscVarK);
        }
        if (n30Var.isEmpty()) {
            long j2 = eccVar.d;
            if (j2 == 0) {
                tkc.m(thcVar2);
                thcVar2.f.a("First ad exposure time was never set");
            } else {
                eccVar.k(j - j2, dscVarK);
                eccVar.d = 0L;
            }
        }
    }
}
