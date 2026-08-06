package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ixb implements Runnable {
    public final /* synthetic */ String t;
    public final /* synthetic */ long u;
    public final /* synthetic */ ecc v;

    public ixb(ecc eccVar, String str, long j) {
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
        boolean zIsEmpty = n30Var.isEmpty();
        long j = this.u;
        if (zIsEmpty) {
            eccVar.d = j;
        }
        Integer num = (Integer) n30Var.get(str);
        if (num != null) {
            n30Var.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        if (n30Var.v < 100) {
            n30Var.put(str, 1);
            eccVar.b.put(str, Long.valueOf(j));
        } else {
            thc thcVar = eccVar.a.f;
            tkc.m(thcVar);
            thcVar.i.a("Too many ads visible");
        }
    }
}
