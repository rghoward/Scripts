package defpackage;

import com.hwpo_training_app.leaderboards.common.presentation.entity.SimpleAthleteResultUiEntity;
import com.hwpo_training_app.leaderboards.databinding.ListItemResultBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rp9 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ rp9(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                ListItemResultBinding listItemResultBinding = (ListItemResultBinding) yaVar.u;
                listItemResultBinding.b.setText(((SimpleAthleteResultUiEntity) yaVar.t()).t);
                listItemResultBinding.c.setText(((SimpleAthleteResultUiEntity) yaVar.t()).u);
                return g2b.a;
            case 1:
                aba abaVar = (aba) obj2;
                iw iwVar = (iw) obj;
                aba.a aVar = abaVar.W;
                hf3 hf3Var = hf3.t;
                if (aVar == null) {
                    aba.a aVar2 = new aba.a(abaVar.H, iwVar);
                    n07 n07Var = new n07(iwVar, abaVar.I, abaVar.J, abaVar.L, abaVar.M, abaVar.N, abaVar.O, hf3Var);
                    n07Var.d(abaVar.d2().j);
                    aVar2.d = n07Var;
                    abaVar.W = aVar2;
                } else if (!xj5.a(iwVar, aVar.b)) {
                    aVar.b = iwVar;
                    n07 n07Var2 = aVar.d;
                    if (n07Var2 != null) {
                        n07Var2.g(iwVar, abaVar.I, abaVar.J, abaVar.L, abaVar.M, abaVar.N, abaVar.O, hf3Var);
                    }
                }
                ew2.f(abaVar).R();
                ew2.f(abaVar).Q();
                b73.a(abaVar);
                return Boolean.TRUE;
            default:
                wpb wpbVar = (wpb) obj2;
                Map map = (Map) obj;
                wpb.a aVar3 = wpb.Companion;
                rlb rlbVar = (rlb) th1.B(1, wpbVar.b().i);
                if (rlbVar == null) {
                    return g2b.a;
                }
                List<zl2> list = rlbVar.b;
                ArrayList arrayList = new ArrayList(ph1.n(list, 10));
                for (zl2 zl2Var : list) {
                    m21 m21Var = (m21) map.get(zl2Var.a);
                    arrayList.add(zl2.a(zl2Var, m21Var != null ? m21Var.a : null, false, 13));
                }
                ArrayList arrayListU = th1.U(wpbVar.b().i);
                arrayListU.set(1, rlb.a((rlb) arrayListU.get(1), arrayList));
                vpb.d dVar = new vpb.d(wpbVar.b().e, arrayListU);
                wpbVar.e(dVar);
                return dVar;
        }
    }
}
