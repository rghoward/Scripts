package defpackage;

import androidx.fragment.app.i;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class bpb implements spb {
    public final hy8 a;

    public bpb(hy8 hy8Var) {
        hy8Var.getClass();
        this.a = hy8Var;
    }

    @Override // defpackage.spb
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.spb
    public final void b(final LocalDate localDate, final int i, final Integer num, final String str, final Integer num2, final boolean z) {
        str.getClass();
        this.a.c(new rf4(cj9.class.getName(), new mb2() { // from class: apb
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                cj9.a aVar = cj9.Companion;
                qi9.Companion.getClass();
                LocalDate localDate2 = localDate;
                Integer num3 = num2;
                Object cVar = num3 != null ? new qi9.c(num3.intValue()) : new qi9.b(localDate2);
                aVar.getClass();
                String str2 = str;
                str2.getClass();
                cj9 cj9Var = new cj9();
                cj9Var.setArguments(uy0.c(new js7("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_PROGRAM_ID", Integer.valueOf(i)), new js7("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_PLAN_ID", num), new js7("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_TITLE", str2), new js7("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_SUBTITLE", cVar), new js7("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_PROGRAM_DATE", Long.valueOf(yk2.y(localDate2))), new js7("com.hwpo_training_app.client.ui.swipe_container.SessionsSwipeContainerFragment.ARG_CAN_RESCHEDULE", Boolean.valueOf(z))));
                return cj9Var;
            }
        }, true));
    }
}
