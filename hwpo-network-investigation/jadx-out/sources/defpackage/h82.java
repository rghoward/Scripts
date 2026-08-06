package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h82 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ h82(int i, Object obj) {
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
                MaterialRadioButton materialRadioButton = ((s96) yaVar.u).b;
                materialRadioButton.setChecked(((m82) yaVar.t()).c);
                materialRadioButton.setText(((m82) yaVar.t()).b);
                break;
            default:
                ya yaVar2 = (ya) obj;
                yaVar2.getClass();
                ja6 ja6Var = (ja6) yaVar2.u;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ja6Var.a, "scaleX", 1.0f, 0.98f);
                MaterialCardView materialCardView = ja6Var.a;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(materialCardView, "scaleY", 1.0f, 0.98f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(materialCardView, "scaleX", 0.98f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(materialCardView, "scaleY", 0.98f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(animatorSet, animatorSet2);
                animatorSet3.setDuration(200L);
                animatorSet3.addListener(new jc8(yaVar2));
                animatorSet3.addListener(new hc8(yaVar2));
                animatorSet3.addListener(new ic8((ql2.b) obj2, yaVar2));
                materialCardView.getClass();
                xgb.a(materialCardView, new gc8(animatorSet3, null));
                yaVar2.s(new v87(1, yaVar2));
                break;
        }
        return g2b.a;
    }
}
