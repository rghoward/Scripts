package defpackage;

import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gs4 implements is4 {
    public final hy8 a;

    public gs4(hy8 hy8Var) {
        hy8Var.getClass();
        this.a = hy8Var;
    }

    @Override // defpackage.is4
    public final void a() {
        this.a.b();
    }

    @Override // defpackage.is4
    public final void b() {
        this.a.c(new rf4(qf.class.getName(), new h4(), true));
    }

    @Override // defpackage.is4
    public final void c(String str, String str2, Integer num) {
        final oq4.a aVar = null;
        final oq4.b bVar = str != null ? new oq4.b(str) : null;
        if (num != null) {
            int iIntValue = num.intValue();
            if (str2 != null) {
                aVar = new oq4.a(iIntValue, str2);
            }
        }
        this.a.c(new rf4(ke.class.getName(), new mb2() { // from class: fs4
            @Override // defpackage.mb2
            public final Object c(i iVar) {
                iVar.getClass();
                ke.Companion.getClass();
                ke keVar = new ke();
                keVar.setArguments(uy0.c(new js7("com.hwpo_training_app.affilated_gym.filters.screen.AffilatedGymFilterFragment.PRESELECTED_COUNTRY_KEY", bVar), new js7("com.hwpo_training_app.affilated_gym.filters.screen.AffilatedGymFilterFragment.PRESELECTED_CITY_KEY", aVar)));
                return keVar;
            }
        }, true));
    }
}
