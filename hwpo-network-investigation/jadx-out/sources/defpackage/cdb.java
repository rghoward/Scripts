package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cdb implements jac {
    public static final /* synthetic */ cdb t = new cdb();

    public static final void b(ap4 ap4Var, ycb ycbVar) {
        List<adb> list = ycbVar.C;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            adb adbVar = list.get(i);
            if (adbVar instanceof ddb) {
                gu7 gu7Var = new gu7();
                ddb ddbVar = (ddb) adbVar;
                gu7Var.d = ddbVar.u;
                gu7Var.n = true;
                gu7Var.c();
                gu7Var.s.f(ddbVar.v);
                gu7Var.c();
                gu7Var.c();
                gu7Var.b = ddbVar.w;
                gu7Var.c();
                gu7Var.c = ddbVar.x;
                gu7Var.c();
                gu7Var.g = ddbVar.y;
                gu7Var.c();
                gu7Var.e = ddbVar.z;
                gu7Var.c();
                gu7Var.f = ddbVar.A;
                gu7Var.o = true;
                gu7Var.c();
                gu7Var.h = ddbVar.B;
                gu7Var.o = true;
                gu7Var.c();
                gu7Var.i = ddbVar.C;
                gu7Var.o = true;
                gu7Var.c();
                gu7Var.j = ddbVar.D;
                gu7Var.o = true;
                gu7Var.c();
                gu7Var.k = ddbVar.E;
                gu7Var.p = true;
                gu7Var.c();
                gu7Var.l = ddbVar.F;
                gu7Var.p = true;
                gu7Var.c();
                gu7Var.m = ddbVar.G;
                gu7Var.p = true;
                gu7Var.c();
                ap4Var.e(i, gu7Var);
            } else if (adbVar instanceof ycb) {
                ap4 ap4Var2 = new ap4();
                ycb ycbVar2 = (ycb) adbVar;
                ap4Var2.k = ycbVar2.t;
                ap4Var2.c();
                ap4Var2.l = ycbVar2.u;
                ap4Var2.s = true;
                ap4Var2.c();
                ap4Var2.o = ycbVar2.x;
                ap4Var2.s = true;
                ap4Var2.c();
                ap4Var2.p = ycbVar2.y;
                ap4Var2.s = true;
                ap4Var2.c();
                ap4Var2.q = ycbVar2.z;
                ap4Var2.s = true;
                ap4Var2.c();
                ap4Var2.r = ycbVar2.A;
                ap4Var2.s = true;
                ap4Var2.c();
                ap4Var2.m = ycbVar2.v;
                ap4Var2.s = true;
                ap4Var2.c();
                ap4Var2.n = ycbVar2.w;
                ap4Var2.s = true;
                ap4Var2.c();
                ap4Var2.f = ycbVar2.B;
                ap4Var2.g = true;
                ap4Var2.c();
                b(ap4Var2, ycbVar2);
                ap4Var.e(i, ap4Var2);
            }
        }
    }

    public static final bdb c(n85 n85Var, jt1 jt1Var) {
        tx2 tx2Var = (tx2) jt1Var.F(qu1.h);
        boolean zI = jt1Var.i((((long) Float.floatToRawIntBits(tx2Var.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(n85Var.j)) << 32));
        Object objF = jt1Var.f();
        if (zI || objF == jt1.a.a) {
            ap4 ap4Var = new ap4();
            b(ap4Var, n85Var.f);
            g2b g2bVar = g2b.a;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(tx2Var.U0(n85Var.b))) << 32) | (((long) Float.floatToRawIntBits(tx2Var.U0(n85Var.c))) & 4294967295L);
            float fIntBitsToFloat = n85Var.d;
            float fIntBitsToFloat2 = n85Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            bdb bdbVar = new bdb(ap4Var);
            String str = n85Var.a;
            long j = n85Var.g;
            wq0 wq0Var = j != 16 ? new wq0(n85Var.h, j) : null;
            boolean z = n85Var.i;
            bdbVar.y.setValue(new cr9(jFloatToRawIntBits));
            bdbVar.z.setValue(Boolean.valueOf(z));
            ocb ocbVar = bdbVar.A;
            ocbVar.g.setValue(wq0Var);
            ocbVar.i.setValue(new cr9(jFloatToRawIntBits2));
            ocbVar.c = str;
            jt1Var.C(bdbVar);
            objF = bdbVar;
        }
        return (bdb) objF;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().t());
    }
}
