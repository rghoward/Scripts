package defpackage;

import androidx.fragment.app.f;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class aj9 extends xf4 {
    public sh9 m;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int f() {
        sh9 sh9Var = this.m;
        sh9Var.getClass();
        int i = sh9Var.a != null ? 2 : 1;
        return sh9Var.c != null ? i + 1 : i;
    }

    @Override // defpackage.xf4, androidx.recyclerview.widget.RecyclerView.f
    public final long g(int i) {
        LocalDate localDateA;
        sh9.a aVarA = th9.a(this.m, i);
        if (aVarA == null || (localDateA = aVarA.a.a()) == null) {
            return -1L;
        }
        return yk2.y(localDateA);
    }

    @Override // defpackage.xf4
    public final boolean v(long j) {
        sh9 sh9Var = this.m;
        LocalDate localDateP = yk2.p(j);
        localDateP.getClass();
        sh9Var.getClass();
        sh9.a aVar = sh9Var.a;
        if (xj5.a(aVar != null ? aVar.a.a() : null, localDateP) || xj5.a(sh9Var.b.a.a(), localDateP)) {
            return true;
        }
        sh9.a aVar2 = sh9Var.c;
        return xj5.a(aVar2 != null ? aVar2.a.a() : null, localDateP);
    }

    @Override // defpackage.xf4
    public final f w(int i) {
        sh9.a aVarA = th9.a(this.m, i);
        if (aVarA == null) {
            throw new IllegalArgumentException("Can't create fragment for required position: " + i + ", items: " + this.m);
        }
        hi9.a aVar = hi9.Companion;
        xi9 xi9Var = aVarA.a;
        String str = aVarA.b;
        qi9 qi9Var = aVarA.c;
        boolean z = aVarA.d;
        aVar.getClass();
        hi9 hi9Var = new hi9();
        hi9Var.setArguments(uy0.c(new js7("com.fitr_training.client.ui.sessions.SessionsFragment.DATASOURCE", xi9Var), new js7("com.fitr_training.client.ui.sessions.SessionsFragment.ARG_TITLE", str), new js7("com.fitr_training.client.ui.sessions.SessionsFragment.ARG_SUBTITLE", qi9Var), new js7("com.fitr_training.client.ui.sessions.SessionsFragment.ARG_CAN_RESCHEDULE", Boolean.valueOf(z))));
        return hi9Var;
    }
}
