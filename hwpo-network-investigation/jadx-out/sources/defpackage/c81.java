package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.leaderboards.databinding.ListItemTopAthleteBinding;
import com.hwpo_training_app.leaderboards.list.common.presentation.entity.TopValueUiEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c81 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ ya u;

    public /* synthetic */ c81(ya yaVar, int i) {
        this.t = i;
        this.u = yaVar;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        ya yaVar = this.u;
        List list = (List) obj;
        switch (i) {
            case 0:
                list.getClass();
                MaterialCardView materialCardView = ((r96) yaVar.u).a;
                materialCardView.getClass();
                hv5.b(materialCardView, (wab) yaVar.t());
                ((r96) yaVar.u).b.setText(((z71) yaVar.t()).c);
                break;
            default:
                list.getClass();
                V v = yaVar.u;
                Context context = yaVar.w;
                ListItemTopAthleteBinding listItemTopAthleteBinding = (ListItemTopAthleteBinding) v;
                String str = ((TopValueUiEntity) yaVar.t()).c;
                int i2 = 0;
                boolean z = str == null || z2a.w(str);
                ShapeableImageView shapeableImageView = listItemTopAthleteBinding.f;
                MaterialTextView materialTextView = listItemTopAthleteBinding.g;
                MaterialTextView materialTextView2 = listItemTopAthleteBinding.e;
                MaterialTextView materialTextView3 = listItemTopAthleteBinding.c;
                shapeableImageView.setVisibility(!z ? 0 : 8);
                materialTextView3.setVisibility(z ? 0 : 8);
                materialTextView3.setText(((TopValueUiEntity) yaVar.t()).d);
                if (str != null && !z2a.w(str)) {
                    xgb.f(listItemTopAthleteBinding.f, str, new bi9(1));
                }
                listItemTopAthleteBinding.d.setText(((TopValueUiEntity) yaVar.t()).b);
                listItemTopAthleteBinding.b.setText(((TopValueUiEntity) yaVar.t()).g);
                xx.f(materialTextView2, ((TopValueUiEntity) yaVar.t()).h);
                materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, ((TopValueUiEntity) yaVar.t()).j ? context.getDrawable(R.drawable.ic_arrow_down) : null, (Drawable) null);
                MaterialButton materialButton = listItemTopAthleteBinding.h;
                String str2 = ((TopValueUiEntity) yaVar.t()).h;
                if (str2 != null && str2.length() != 0) {
                    i2 = 8;
                }
                materialButton.setVisibility(i2);
                materialTextView.setText(((TopValueUiEntity) yaVar.t()).e);
                materialTextView.setBackgroundTintList(vz1.b(context, ((TopValueUiEntity) yaVar.t()).f));
                break;
        }
        return g2b.a;
    }
}
