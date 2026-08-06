package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.hwpo_training_app.leaderboards.databinding.ListItemTopAthleteBinding;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a81 implements ci4 {
    public final /* synthetic */ int t;

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        switch (this.t) {
            case 0:
                layoutInflater.getClass();
                viewGroup.getClass();
                r96 r96VarInflate = r96.inflate(layoutInflater, viewGroup, false);
                r96VarInflate.getClass();
                return r96VarInflate;
            default:
                layoutInflater.getClass();
                viewGroup.getClass();
                ListItemTopAthleteBinding listItemTopAthleteBindingInflate = ListItemTopAthleteBinding.inflate(layoutInflater, viewGroup, false);
                listItemTopAthleteBindingInflate.getClass();
                return listItemTopAthleteBindingInflate;
        }
    }
}
