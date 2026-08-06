package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class hv5 implements qq1 {
    public static final /* synthetic */ hv5 t = new hv5();

    public static void b(MaterialCardView materialCardView, wab wabVar) {
        materialCardView.getClass();
        wabVar.getClass();
        ((MaterialTextView) materialCardView.findViewById(R.id.valueTitle)).setText(wabVar.e());
        ((MaterialTextView) materialCardView.findViewById(R.id.valueText)).setText(wabVar.f());
        ((MaterialTextView) materialCardView.findViewById(R.id.valuePercentage)).setText(wabVar.d());
        ((MaterialTextView) materialCardView.findViewById(R.id.valuePercentage)).setTextColor(wabVar.b());
        ImageView imageView = (ImageView) materialCardView.findViewById(R.id.valuePercentageBg);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorStateList.valueOf(wabVar.a()));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(materialCardView.getResources().getDimension(R.dimen.m_radius));
        imageView.setBackground(gradientDrawable);
    }

    public static ss5 c(j26 j26Var, mh4 mh4Var) {
        b1b b1bVar = b1b.a;
        int iOrdinal = j26Var.ordinal();
        if (iOrdinal == 0) {
            return new o7a(mh4Var);
        }
        if (iOrdinal == 1) {
            tz8 tz8Var = new tz8();
            tz8Var.t = mh4Var;
            tz8Var.u = b1bVar;
            return tz8Var;
        }
        if (iOrdinal != 2) {
            u.b();
            return null;
        }
        g3b g3bVar = new g3b();
        g3bVar.t = mh4Var;
        g3bVar.u = b1bVar;
        return g3bVar;
    }

    public static o7a d(mh4 mh4Var) {
        mh4Var.getClass();
        return new o7a(mh4Var);
    }

    @Override // defpackage.qq1
    public /* synthetic */ Object a(xu8 xu8Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(xu8Var);
    }
}
