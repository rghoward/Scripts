package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.hwpo_training_app.leaderboards.databinding.ListItemLeaderboardProgramBinding;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g46 implements ci4 {
    public final /* synthetic */ int t;

    public /* synthetic */ g46(int i) {
        this.t = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                ListItemLeaderboardProgramBinding listItemLeaderboardProgramBindingInflate = ListItemLeaderboardProgramBinding.inflate(layoutInflater, viewGroup, false);
                listItemLeaderboardProgramBindingInflate.getClass();
                return listItemLeaderboardProgramBindingInflate;
            default:
                k19 k19Var = (k19) obj;
                qha qhaVar = (qha) obj2;
                bka bkaVar = new bka(qhaVar.a);
                u29 u29Var = t29.x;
                return ws0.c(t29.a(bkaVar, u29Var, k19Var), t29.a(new bka(qhaVar.b), u29Var, k19Var));
        }
    }
}
