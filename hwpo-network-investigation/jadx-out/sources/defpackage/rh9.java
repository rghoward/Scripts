package defpackage;

import android.os.Bundle;
import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rh9 implements ri9, tp6 {
    public final hy8 a;
    public final hy8 b;
    public final qn6 c;

    public rh9(hy8 hy8Var, hy8 hy8Var2, qn6 qn6Var) {
        hy8Var2.getClass();
        this.a = hy8Var;
        this.b = hy8Var2;
        this.c = qn6Var;
    }

    @Override // defpackage.ri9
    public final void a() {
        hy8 hy8Var = this.a;
        if (hy8Var == null) {
            hy8Var = this.b;
        }
        hy8Var.b();
    }

    @Override // defpackage.tp6
    public final void f(String[] strArr, int i) {
        strArr.getClass();
        this.c.f(strArr, i);
    }

    @Override // defpackage.ri9
    public final void k(ipa ipaVar) {
        this.b.c(new rf4(opa.class.getName(), new lk0(ipaVar), true));
    }

    @Override // defpackage.ri9
    public final void n(final int i) {
        this.b.c(new rf4(gs8.class.getName(), new mb2() { // from class: ph9
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                gs8.Companion.getClass();
                Bundle bundleC = uy0.c(new js7("com.hwpo_training_app.reschedule.presentation.RescheduleFragment.PLAN_ID", Integer.valueOf(i)));
                gs8 gs8Var = new gs8();
                gs8Var.setArguments(bundleC);
                return gs8Var;
            }
        }, true));
    }

    @Override // defpackage.ri9
    public final void s(final int i, final int i2, final String str) {
        this.b.c(new rf4(bf9.class.getName(), new mb2() { // from class: qh9
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                bf9.Companion.getClass();
                bf9 bf9Var = new bf9();
                bf9Var.setArguments(uy0.c(new js7("PROGRAM_ID_KEY", Integer.valueOf(i)), new js7("SESSION_ID_KEY", Integer.valueOf(i2)), new js7("SESSION_TITLE_KEY", str)));
                return bf9Var;
            }
        }, true));
    }

    @Override // defpackage.tp6
    public final void u(String str) {
        str.getClass();
        this.c.u(str);
    }
}
