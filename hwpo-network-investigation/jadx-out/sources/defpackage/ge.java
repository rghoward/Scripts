package defpackage;

import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.fragment.app.l;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ge(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ke keVar = (ke) obj2;
                gm3 gm3Var = (gm3) obj;
                ke.a aVar = ke.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof fe) {
                    wq4.a aVar2 = wq4.Companion;
                    ed6 ed6Var = ((fe) gm3Var).b;
                    aVar2.getClass();
                    wq4 wq4Var = new wq4();
                    wq4Var.setArguments(uy0.c(new js7("com.hwpo_training_app.affilated_gym.filters.location_filter.GymLocationFilterFragment.LOCATION_FILTER_MODE_ARG", ed6Var)));
                    l childFragmentManager = keVar.getChildFragmentManager();
                    childFragmentManager.getClass();
                    wq4Var.o(childFragmentManager, wq4.class.getName());
                } else if (gm3Var instanceof ee) {
                    keVar.getParentFragmentManager().e0(uy0.c(new js7("com.hwpo_training_app.affilated_gym.filters.screen.AffilatedGymFilterFragment.GYM_FILTER_RESULT_KEY", ((ee) gm3Var).b)), "com.hwpo_training_app.affilated_gym.filters.screen.AffilatedGymFilterFragment.GYM_FILTER_REQUEST_KEY");
                }
                break;
            default:
                final ey7.b bVar = (ey7.b) obj2;
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                s96 s96Var = (s96) yaVar.u;
                FrameLayout frameLayout = s96Var.a;
                frameLayout.getClass();
                xgb.a(frameLayout, new k82(bVar, yaVar, null));
                s96Var.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: g82
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        compoundButton.getClass();
                        if (z) {
                            bVar.invoke(m82.a((m82) yaVar.t(), z));
                        }
                    }
                });
                yaVar.s(new h82(0, yaVar));
                break;
        }
        return g2b.a;
    }
}
