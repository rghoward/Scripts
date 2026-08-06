package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class rl6 extends ln4 {
    public final MeasurementManager x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public /* synthetic */ Object t;

        public a(sw9 sw9Var, r02 r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = rl6.this.new a(null, r02Var);
            aVar.t = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) throws Throwable {
            ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            throw null;
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            throw null;
        }
    }

    public rl6(MeasurementManager measurementManager) {
        super(15);
        this.x = measurementManager;
    }

    public static Object i1(rl6 rl6Var, qx2 qx2Var, r02<? super g2b> r02Var) {
        new e41(1, th0.e(r02Var)).t();
        MeasurementManager measurementManager = rl6Var.x;
        throw null;
    }

    public static Object j1(rl6 rl6Var, r02<? super Integer> r02Var) {
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        rl6Var.x.getMeasurementApiStatus(new ql6(), new w02(e41Var));
        return e41Var.r();
    }

    public static Object k1(rl6 rl6Var, sw9 sw9Var, r02<? super g2b> r02Var) {
        Object objD = u72.d(rl6Var.new a(sw9Var, null), r02Var);
        return objD == v72.t ? objD : g2b.a;
    }

    public static Object l1(rl6 rl6Var, Uri uri, InputEvent inputEvent, r02<? super g2b> r02Var) throws Throwable {
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        rl6Var.x.registerSource(uri, inputEvent, new ql6(), new w02(e41Var));
        Object objR = e41Var.r();
        return objR == v72.t ? objR : g2b.a;
    }

    public static Object m1(rl6 rl6Var, Uri uri, r02<? super g2b> r02Var) throws Throwable {
        e41 e41Var = new e41(1, th0.e(r02Var));
        e41Var.t();
        rl6Var.x.registerTrigger(uri, new ql6(), new w02(e41Var));
        Object objR = e41Var.r();
        return objR == v72.t ? objR : g2b.a;
    }

    public static Object o1(rl6 rl6Var, vkb vkbVar, r02<? super g2b> r02Var) {
        new e41(1, th0.e(r02Var)).t();
        MeasurementManager measurementManager = rl6Var.x;
        throw null;
    }

    public static Object q1(rl6 rl6Var, wkb wkbVar, r02<? super g2b> r02Var) {
        new e41(1, th0.e(r02Var)).t();
        MeasurementManager measurementManager = rl6Var.x;
        throw null;
    }

    @Override // defpackage.ln4
    public Object L0(r02<? super Integer> r02Var) {
        return j1(this, r02Var);
    }

    @Override // defpackage.ln4
    public Object W0(sw9 sw9Var, r02<? super g2b> r02Var) {
        return k1(this, sw9Var, r02Var);
    }

    @Override // defpackage.ln4
    public Object X0(Uri uri, InputEvent inputEvent, r02<? super g2b> r02Var) {
        return l1(this, uri, inputEvent, r02Var);
    }

    @Override // defpackage.ln4
    public Object Y0(Uri uri, r02<? super g2b> r02Var) {
        return m1(this, uri, r02Var);
    }

    public Object h1(qx2 qx2Var, r02<? super g2b> r02Var) {
        return i1(this, qx2Var, r02Var);
    }

    public Object n1(vkb vkbVar, r02<? super g2b> r02Var) {
        return o1(this, vkbVar, r02Var);
    }

    public Object p1(wkb wkbVar, r02<? super g2b> r02Var) {
        return q1(this, wkbVar, r02Var);
    }
}
